import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!in;")
	public static final Class169 aClass169_233 = new Class169(98, 3);

	@OriginalMember(owner = "client!sm", name = "w", descriptor = "Lclient!mca;")
	public static Class229 aClass229_15 = null;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!ol;)V")
	public static void method8454(@OriginalArg(1) Class2_Sub8 arg0) {
		@Pc(14) byte[] local14 = new byte[24];
		if (Static274.aClass141_3 != null) {
			@Pc(26) int local26;
			try {
				Static274.aClass141_3.method4074(0L);
				Static274.aClass141_3.method4077(local14);
				for (local26 = 0; local26 < 24 && local14[local26] == 0; local26++) {
				}
				if (local26 >= 24) {
					throw new IOException();
				}
			} catch (@Pc(50) Exception local50) {
				for (local26 = 0; local26 < 24; local26++) {
					local14[local26] = -1;
				}
			}
		}
		arg0.method5160(local14, 24, 0);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	public static void method8456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static331.aFloat188 > Static331.aFloat187) {
			Static331.aFloat187 = (float) ((double) Static331.aFloat187 + (double) Static331.aFloat187 / 30.0D);
			if (Static331.aFloat187 > Static331.aFloat188) {
				Static331.aFloat187 = Static331.aFloat188;
			}
			Static366.method6212();
			Static331.anInt10581 = (int) Static331.aFloat187 >> 1;
			Static331.aByteArrayArrayArray19 = Static349.method6050(Static331.anInt10581);
		} else if (Static331.aFloat187 > Static331.aFloat188) {
			Static331.aFloat187 = (float) ((double) Static331.aFloat187 - (double) Static331.aFloat187 / 30.0D);
			if (Static331.aFloat188 > Static331.aFloat187) {
				Static331.aFloat187 = Static331.aFloat188;
			}
			Static366.method6212();
			Static331.anInt10581 = (int) Static331.aFloat187 >> 1;
			Static331.aByteArrayArrayArray19 = Static349.method6050(Static331.anInt10581);
		}
		if (Static22.anInt389 != -1 && Static69.anInt1350 != -1) {
			@Pc(88) int local88 = Static22.anInt389 - Static43.anInt8888;
			if (local88 < 2 || local88 > 2) {
				local88 /= 8;
			}
			@Pc(103) int local103 = Static69.anInt1350 - Static609.anInt10718;
			Static43.anInt8888 += local88;
			if (local103 < 2 || local103 > 2) {
				local103 /= 8;
			}
			if (local88 == 0 && local103 == 0) {
				Static22.anInt389 = -1;
				Static69.anInt1350 = -1;
			}
			Static609.anInt10718 += local103;
			Static366.method6212();
		}
		if (Static240.anInt4759 > 0) {
			Static542.anInt9479--;
			if (Static542.anInt9479 == 0) {
				Static240.anInt4759--;
				Static542.anInt9479 = 100;
			}
		} else {
			Static58.anInt1135 = -1;
			Static36.anInt626 = -1;
		}
		if (!Static178.aBoolean292 || Class15_Sub3_Sub3_Sub2.lb == null) {
			return;
		}
		for (@Pc(168) Class2_Sub53 local168 = (Class2_Sub53) Class15_Sub3_Sub3_Sub2.lb.method7177(); local168 != null; local168 = (Class2_Sub53) Class15_Sub3_Sub3_Sub2.lb.method7175()) {
			@Pc(177) Class218 local177 = Static331.aClass5_4.method94(local168.aClass2_Sub33_1.anInt5215);
			if (local168.method9393(arg1, arg0)) {
				if (local177.aStringArray35 != null) {
					if (local177.aStringArray35[4] != null) {
						Static335.method5521(-1, false, (long) local168.aClass2_Sub33_1.anInt5215, local177.aString77, 0, local177.anInt6683, false, true, -1, (long) local168.aClass2_Sub33_1.anInt5215, 1010, local177.aStringArray35[4]);
					}
					if (local177.aStringArray35[3] != null) {
						Static335.method5521(-1, false, (long) local168.aClass2_Sub33_1.anInt5215, local177.aString77, 0, local177.anInt6683, false, true, -1, (long) local168.aClass2_Sub33_1.anInt5215, 1004, local177.aStringArray35[3]);
					}
					if (local177.aStringArray35[2] != null) {
						Static335.method5521(-1, false, (long) local168.aClass2_Sub33_1.anInt5215, local177.aString77, 0, local177.anInt6683, false, true, -1, (long) local168.aClass2_Sub33_1.anInt5215, 1012, local177.aStringArray35[2]);
					}
					if (local177.aStringArray35[1] != null) {
						Static335.method5521(-1, false, (long) local168.aClass2_Sub33_1.anInt5215, local177.aString77, 0, local177.anInt6683, false, true, -1, (long) local168.aClass2_Sub33_1.anInt5215, 1003, local177.aStringArray35[1]);
					}
					if (local177.aStringArray35[0] != null) {
						Static335.method5521(-1, false, (long) local168.aClass2_Sub33_1.anInt5215, local177.aString77, 0, local177.anInt6683, false, true, -1, (long) local168.aClass2_Sub33_1.anInt5215, 1011, local177.aStringArray35[0]);
					}
				}
				if (!local168.aClass2_Sub33_1.aBoolean393) {
					local168.aClass2_Sub33_1.aBoolean393 = true;
					Static518.method8030(Static13.aClass340_9, local168.aClass2_Sub33_1.anInt5215, local177.anInt6683);
				}
				if (local168.aClass2_Sub33_1.aBoolean393) {
					Static518.method8030(Static145.aClass340_4, local168.aClass2_Sub33_1.anInt5215, local177.anInt6683);
				}
			} else if (local168.aClass2_Sub33_1.aBoolean393) {
				local168.aClass2_Sub33_1.aBoolean393 = false;
				Static518.method8030(Static9.aClass340_1, local168.aClass2_Sub33_1.anInt5215, local177.anInt6683);
			}
		}
	}
}
