import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	public static int anInt5037 = -1;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([Lclient!tb;B)V")
	public static void method4563(@OriginalArg(0) Class49[] arg0) {
		Static382.anInt6638 = arg0.length;
		Static317.anIntArray318 = new int[Static382.anInt6638 + 10];
		Static532.aClass49Array14 = new Class49[Static382.anInt6638 + 10];
		Static695.method5647(arg0, 0, Static532.aClass49Array14, 0, Static382.anInt6638);
		for (@Pc(26) int local26 = 0; local26 < Static382.anInt6638; local26++) {
			Static317.anIntArray318[local26] = Static532.aClass49Array14[local26].method8987();
		}
		@Pc(47) int local47 = Static382.anInt6638;
		if (-24 != -24) {
			method4564(10);
		}
		while (Static532.aClass49Array14.length > local47) {
			Static317.anIntArray318[local47] = 12;
			local47++;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
	public static void method4564(@OriginalArg(0) int arg0) {
		if (arg0 > -20) {
			aBoolean380 = false;
		}
		Static194.method3669(Static687.aClass6_Sub44_33.aClass7_Sub15_1.method4771() == 1);
		Static240.aClass150_2 = Static620.method8526(Static651.aClass122_38, Static4.aCanvas1, 22050, 0);
		Static638.method8616(Static462.method7026((Class6_Sub17_Sub4) null));
		Static35.aClass150_1 = Static620.method8526(Static651.aClass122_38, Static4.aCanvas1, 2048, 1);
		Static544.aClass6_Sub17_Sub3_2 = new Class6_Sub17_Sub3();
		Static35.aClass150_1.method5493(Static544.aClass6_Sub17_Sub3_2);
		Static39.aClass397_1 = new Class397(22050, Static90.anInt9479);
		Static666.method8844();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BI)[B")
	public static byte[] method4566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(12) byte[] local12;
		if (arg1 <= 0) {
			local12 = arg2;
		} else {
			local12 = new byte[arg0];
			for (@Pc(19) int local19 = 0; local19 < arg0; local19++) {
				local12[local19] = arg2[arg1 + local19];
			}
		}
		@Pc(43) Class175 local43 = new Class175();
		local43.method4512((byte) -32);
		local43.method4510((long) (arg0 * 8), local12);
		@Pc(64) byte[] local64 = new byte[64];
		local43.method4508(local64);
		return local64;
	}
}
