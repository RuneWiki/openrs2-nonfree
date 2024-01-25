import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIBII)I")
	public static int method4869(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static289.aClass12Array3 == null) {
			return 0;
		} else if (arg0 < 3) {
			@Pc(21) int local21 = arg2 >> 9;
			@Pc(25) int local25 = arg1 >> 9;
			if (arg3 < 0 || arg4 < 0 || Static491.anInt9856 - 1 < arg3 || Static393.anInt6574 - 1 < arg4) {
				return 0;
			} else if (local21 >= 1 && local25 >= 1 && Static491.anInt9856 - 1 >= local21 && local25 <= Static393.anInt6574 - 1) {
				@Pc(90) boolean local90 = (Static90.aByteArrayArrayArray2[1][arg2 >> 9][arg1 >> 9] & 0x2) != 0;
				@Pc(115) boolean local115;
				@Pc(131) boolean local131;
				if ((arg2 & 0x1FF) == 0) {
					local115 = (Static90.aByteArrayArrayArray2[1][local21 - 1][arg1 >> 9] & 0x2) != 0;
					local131 = (Static90.aByteArrayArrayArray2[1][local21][arg1 >> 9] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static90.aByteArrayArrayArray2[1][arg3][arg4] & 0x2) != 0;
					}
				}
				if ((arg1 & 0x1FF) == 0) {
					local115 = (Static90.aByteArrayArrayArray2[1][arg2 >> 9][local25 - 1] & 0x2) != 0;
					local131 = (Static90.aByteArrayArrayArray2[1][arg2 >> 9][local25] & 0x2) != 0;
					if (local115 != local131) {
						local90 = (Static90.aByteArrayArrayArray2[1][arg3][arg4] & 0x2) != 0;
					}
				}
				if (local90) {
					arg0++;
				}
				return Static289.aClass12Array3[arg0].method7854(arg1, arg2);
			} else {
				return 0;
			}
		} else {
			return Static289.aClass12Array3[arg0].method7854(arg1, arg2);
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZIIBII)V")
	public static void method4870(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static289.aFrame1 != null && (arg4 != 3 || Static666.anInt10646 != arg1 || Static387.anInt6519 != arg2)) {
			Static179.method2534(Static569.aClass380_6, Static289.aFrame1);
			Static289.aFrame1 = null;
		}
		if (arg4 == 3 && Static289.aFrame1 == null) {
			Static289.aFrame1 = Static660.method8979(arg2, arg1, Static569.aClass380_6, 0);
			if (Static289.aFrame1 != null) {
				Static387.anInt6519 = arg2;
				Static666.anInt10646 = arg1;
				Static633.method8698();
			}
		}
		if (arg4 == 3 && Static289.aFrame1 == null) {
			method4870(true, -1, -1, arg3, Static96.aClass6_Sub22_7.aClass29_Sub18_2.method6277());
			return;
		}
		@Pc(86) Container local86;
		@Pc(103) Insets local103;
		if (Static289.aFrame1 != null) {
			local86 = Static289.aFrame1;
			Static13.anInt10825 = arg2;
			Static338.anInt5825 = arg1;
		} else if (Static293.aFrame3 == null) {
			if (Static180.anApplet6 == null) {
				local86 = Static131.anApplet_Sub1_1;
			} else {
				local86 = Static180.anApplet6;
			}
			Static338.anInt5825 = local86.getSize().width;
			Static13.anInt10825 = local86.getSize().height;
		} else {
			local103 = Static293.aFrame3.getInsets();
			@Pc(109) int local109 = -local103.right;
			Static338.anInt5825 = Static293.aFrame3.getSize().width + local109 - local103.left;
			@Pc(123) int local123 = local103.bottom + local103.top;
			Static13.anInt10825 = Static293.aFrame3.getSize().height - local123;
			local86 = Static293.aFrame3;
		}
		if (arg4 == 1) {
			Static348.anInt5935 = Static335.anInt5755;
			Static114.anInt2051 = 0;
			Static449.anInt7506 = Static365.anInt6242;
			Static314.anInt5339 = (Static338.anInt5825 - Static365.anInt6242) / 2;
		} else {
			Static649.method8842();
		}
		if (Static74.aClass104_2 != Static648.aClass104_9) {
			@Pc(165) boolean local165;
			if (Static449.anInt7506 < 1024 && Static348.anInt5935 < 768) {
				local165 = true;
			} else {
				local165 = false;
			}
		}
		if (arg0) {
			Static154.method2171();
		} else {
			Static140.aCanvas1.setSize(Static449.anInt7506, Static348.anInt5935);
			if (Static594.aBoolean693) {
				Static556.method7865(Static140.aCanvas1);
			} else {
				Static546.aClass132_13.method7510(Static140.aCanvas1, Static449.anInt7506, Static348.anInt5935);
			}
			if (Static293.aFrame3 == local86) {
				local103 = Static293.aFrame3.getInsets();
				Static140.aCanvas1.setLocation(Static314.anInt5339 + local103.left, Static114.anInt2051 + local103.top);
			} else {
				Static140.aCanvas1.setLocation(Static314.anInt5339, Static114.anInt2051);
			}
		}
		if (arg4 >= 2) {
			Static534.aBoolean621 = true;
		} else {
			Static534.aBoolean621 = false;
		}
		if (Static561.anInt9357 != -1) {
			Static420.method6263(true);
		}
		if (Static163.aClass170_1 != null && Static126.method8985(Static556.anInt9319)) {
			Static483.method7040();
		}
		for (@Pc(240) int local240 = 0; local240 < 100; local240++) {
			Static224.aBooleanArray12[local240] = true;
		}
		Static312.aBoolean579 = true;
	}
}
