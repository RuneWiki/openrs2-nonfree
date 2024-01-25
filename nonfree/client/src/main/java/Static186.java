import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!gs", name = "m", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_44 = new Class71(84, 6);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)V")
	public static void method3529() {
		if (Static171.aClass16_5 == null) {
			return;
		}
		if (Static513.aBoolean642) {
			Static437.method6741();
		}
		Static40.aClass194_2.method5081();
		Static465.method6989();
		Static551.method7733();
		Static351.method5558();
		Static76.method1968();
		Static375.method4949();
		if (Static328.aClass203_5 != null) {
			Static328.aClass203_5.method5426();
		}
		Static633.method8186();
		Static593.method8194();
		Static297.method4906();
		Static36.method1262();
		Static590.method8160(false);
		for (@Pc(37) int local37 = 0; local37 < 2048; local37++) {
			@Pc(43) Class15_Sub1_Sub2_Sub2_Sub1 local43 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local37];
			if (local43 != null) {
				for (@Pc(47) int local47 = 0; local47 < local43.aClass83Array3.length; local47++) {
					local43.aClass83Array3[local47] = null;
				}
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static438.anInt8226; local66++) {
			@Pc(73) Class15_Sub1_Sub2_Sub2_Sub2 local73 = Static537.aClass8_Sub50Array1[local66].aClass15_Sub1_Sub2_Sub2_Sub2_2;
			if (local73 != null) {
				for (@Pc(77) int local77 = 0; local77 < local73.aClass83Array3.length; local77++) {
					local73.aClass83Array3[local77] = null;
				}
			}
		}
		Static3.aClass54_1 = null;
		Static141.aClass54_3 = null;
		Static171.aClass16_5.method6063();
		Static171.aClass16_5 = null;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public static void method3532() {
		@Pc(20) Class8_Sub31 local20 = Static51.method1418(Static153.aClass257_32, Static608.aClass336_1);
		local20.aClass8_Sub8_Sub2_1.method8548(Static48.anInt4222);
		Static262.method4604(local20);
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIIILjava/lang/String;I)V")
	public static void method3533(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) String arg6) {
		@Pc(7) Class15_Sub9 local7 = new Class15_Sub9();
		local7.anInt9012 = arg3;
		local7.anInt9007 = arg4;
		local7.anInt9011 = arg1;
		local7.aString92 = arg6;
		local7.anInt9014 = arg0 + Static435.anInt8192;
		local7.anInt9010 = arg2;
		local7.anInt9006 = arg5;
		Static330.aClass123_6.method3539(local7);
	}
}
