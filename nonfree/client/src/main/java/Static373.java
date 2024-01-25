import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BIZIII)V")
	public static void method5922(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static345.aFrame2 != null && (arg2 != 3 || Static104.aClass6_Sub6_Sub1_4.anInt1160 != arg3 || Static104.aClass6_Sub6_Sub1_4.anInt1169 != arg4)) {
			Static529.method7714(Static345.aFrame2, Static414.aClass246_5);
			Static345.aFrame2 = null;
		}
		if (arg2 == 3 && Static345.aFrame2 == null) {
			Static345.aFrame2 = Static500.method7470(Static414.aClass246_5, arg4, 0, arg3);
			if (Static345.aFrame2 != null) {
				Static104.aClass6_Sub6_Sub1_4.anInt1169 = arg4;
				Static104.aClass6_Sub6_Sub1_4.anInt1160 = arg3;
				Static104.aClass6_Sub6_Sub1_4.method1081(Static414.aClass246_5);
			}
		}
		if (arg2 == 3 && Static345.aFrame2 == null) {
			method5922(arg0, true, Static104.aClass6_Sub6_Sub1_4.anInt1173, -1, -1);
			return;
		}
		@Pc(79) Container local79;
		@Pc(96) Insets local96;
		if (Static345.aFrame2 != null) {
			Static171.anInt3912 = arg3;
			Static345.anInt6685 = arg4;
			local79 = Static345.aFrame2;
		} else if (Static138.aFrame1 == null) {
			if (Static87.anApplet1 == null) {
				local79 = Static3.anApplet_Sub1_2;
			} else {
				local79 = Static87.anApplet1;
			}
			Static171.anInt3912 = local79.getSize().width;
			Static345.anInt6685 = local79.getSize().height;
		} else {
			local96 = Static138.aFrame1.getInsets();
			@Pc(102) int local102 = -local96.right;
			Static171.anInt3912 = Static138.aFrame1.getSize().width + local102 - local96.left;
			@Pc(116) int local116 = local96.top + local96.bottom;
			Static345.anInt6685 = Static138.aFrame1.getSize().height - local116;
			local79 = Static138.aFrame1;
		}
		if (arg2 == 1) {
			Static423.anInt7841 = 0;
			Static341.anInt6334 = (Static171.anInt3912 - Static419.anInt7811) / 2;
			Static180.anInt4051 = Static79.anInt9888;
			Static228.anInt4744 = Static419.anInt7811;
		} else {
			Static320.method5182();
		}
		if (Static230.aClass123_8 != Static186.aClass123_6) {
			@Pc(158) boolean local158;
			if (Static228.anInt4744 < 1024 && Static180.anInt4051 < 768) {
				local158 = true;
			} else {
				local158 = false;
			}
		}
		if (arg1) {
			Static519.method7595();
		} else {
			Static38.aCanvas4.setSize(Static228.anInt4744, Static180.anInt4051);
			Static323.aClass9_8.method5403(Static38.aCanvas4);
			if (Static138.aFrame1 == local79) {
				local96 = Static138.aFrame1.getInsets();
				Static38.aCanvas4.setLocation(local96.left + Static341.anInt6334, local96.top - -Static423.anInt7841);
			} else {
				Static38.aCanvas4.setLocation(Static341.anInt6334, Static423.anInt7841);
			}
		}
		if (arg2 >= 2) {
			Static155.aBoolean541 = true;
		} else {
			Static155.aBoolean541 = false;
		}
		if (Static6.anInt302 != -1) {
			Static171.method3490(true);
		}
		if (Static52.aClass64_1 != null && Static343.method5603(Static325.anInt6149)) {
			Static382.method6025();
		}
		for (@Pc(223) int local223 = 0; local223 < 100; local223++) {
			Static429.aBooleanArray27[local223] = true;
		}
		Static475.aBoolean646 = true;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IZIFIZII)[I")
	public static int[] method5923(@OriginalArg(3) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class6_Sub1_Sub37 local10 = new Class6_Sub1_Sub37();
		local10.anInt9475 = (int) (arg0 * 4096.0F);
		local10.aBoolean704 = true;
		local10.anInt9473 = 35;
		local10.anInt9482 = 8;
		local10.anInt9481 = 8;
		local10.anInt9483 = 4;
		local10.method8160();
		Static8.method612(2048, 1);
		local10.method7929(local6, 0);
		return local6;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(BFFF)F")
	public static float method5924(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg2 * (arg1 - arg0) + arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!rt;B)I")
	public static int method5925(@OriginalArg(0) Class6_Sub42 arg0) {
		@Pc(7) String local7 = Static84.method1839(arg0);
		@Pc(14) int[] local14 = null;
		if (Static394.method6227(arg0.anInt8285)) {
			local14 = Static98.aClass203_1.method4899((int) arg0.aLong200).anIntArray288;
		} else if (arg0.anInt8289 != -1) {
			local14 = Static98.aClass203_1.method4899(arg0.anInt8289).anIntArray288;
		} else if (Static390.method6168(arg0.anInt8285)) {
			@Pc(90) Class6_Sub33 local90 = (Class6_Sub33) Static506.aClass305_36.method7447((long) arg0.aLong200);
			if (local90 != null) {
				@Pc(95) Class11_Sub1_Sub1_Sub1 local95 = local90.aClass11_Sub1_Sub1_Sub1_2;
				@Pc(98) Class222 local98 = local95.aClass222_1;
				if (local98.anIntArray464 != null) {
					local98 = local98.method5329(Static435.aClass234_1);
				}
				if (local98 != null) {
					local14 = local98.anIntArray463;
				}
			}
		} else if (Static472.method5255(arg0.anInt8285)) {
			@Pc(55) Class31 local55;
			if (arg0.anInt8285 == 1009) {
				local55 = Static480.aClass57_11.method1469((int) arg0.aLong200);
			} else {
				local55 = Static480.aClass57_11.method1469((int) (arg0.aLong200 >>> 32 & 0x7FFFFFFFL));
			}
			if (local55.anIntArray69 != null) {
				local55 = local55.method1029(Static435.aClass234_1);
			}
			if (local55 != null) {
				local14 = local55.anIntArray72;
			}
		}
		if (local14 != null) {
			local7 = local7 + Static506.method7533(local14);
		}
		@Pc(141) int local141 = Static1.aClass82_1.method2294(local7, Static451.aClass66Array11);
		if (arg0.aBoolean607) {
			local141 += Static270.aClass66_24.QA() + 4;
		}
		return local141;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)Lclient!av;")
	public static Class21 method5926() {
		return new Class21(1, false);
	}
}
