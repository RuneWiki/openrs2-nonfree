import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
	public static int anInt997;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "F")
	public static float aFloat9;

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "Lclient!cc;")
	public static final Class31 aClass31_1 = new Class31();

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "Z")
	public static boolean aBoolean72 = false;

	@OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
	public static int anInt1000 = 0;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
	public static int anInt1001 = 0;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!bf;IZIII)V")
	public static void method857(@OriginalArg(0) Class5_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.anInt438 == -1 && arg0.anIntArray55 == null) {
			return;
		}
		@Pc(16) int local16 = 0;
		@Pc(27) int local27 = arg0.anInt440 * Static263.anInt5208 >> 8;
		if (arg3 > arg0.anInt435) {
			local16 = arg3 - arg0.anInt435;
		} else if (arg0.anInt442 > arg3) {
			local16 = arg0.anInt442 - arg3;
		}
		if (arg2 > arg0.anInt439) {
			local16 += arg2 - arg0.anInt439;
		} else if (arg0.anInt443 > arg2) {
			local16 += arg0.anInt443 - arg2;
		}
		if (arg0.anInt445 == 0 || arg0.anInt445 < local16 - 64 || Static263.anInt5208 == 0 || arg0.anInt432 != arg4) {
			if (arg0.aClass5_Sub16_Sub3_1 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(arg0.aClass5_Sub16_Sub3_1);
				arg0.aClass5_Sub16_Sub3_1 = null;
			}
			if (arg0.aClass5_Sub16_Sub3_2 != null) {
				Static114.aClass5_Sub16_Sub4_1.method5798(arg0.aClass5_Sub16_Sub3_2);
				arg0.aClass5_Sub16_Sub3_2 = null;
			}
			return;
		}
		local16 -= 64;
		if (local16 < 0) {
			local16 = 0;
		}
		@Pc(160) int local160 = (arg0.anInt445 - local16) * local27 / arg0.anInt445;
		if (arg0.aClass5_Sub16_Sub3_1 != null) {
			arg0.aClass5_Sub16_Sub3_1.method4580(local160);
		} else if (arg0.anInt438 >= 0) {
			@Pc(181) Class50 local181 = Static359.method926(Static186.aClass93_72, arg0.anInt438, 0);
			if (local181 != null) {
				@Pc(188) Class5_Sub10_Sub1 local188 = local181.method925().method896(Static146.aClass101_1);
				@Pc(193) Class5_Sub16_Sub3 local193 = Static365.method4582(local188, local160);
				local193.method4592(-1);
				Static114.aClass5_Sub16_Sub4_1.method5797(local193);
				arg0.aClass5_Sub16_Sub3_1 = local193;
			}
		}
		if (arg0.aClass5_Sub16_Sub3_2 != null) {
			arg0.aClass5_Sub16_Sub3_2.method4580(local160);
			if (!arg0.aClass5_Sub16_Sub3_2.method6008()) {
				arg0.aClass5_Sub16_Sub3_2 = null;
			}
		} else if (arg0.anIntArray55 != null && (arg0.anInt441 -= arg1) <= 0) {
			@Pc(237) int local237 = (int) (Math.random() * (double) arg0.anIntArray55.length);
			@Pc(245) Class50 local245 = Static359.method926(Static186.aClass93_72, arg0.anIntArray55[local237], 0);
			if (local245 != null) {
				@Pc(252) Class5_Sub10_Sub1 local252 = local245.method925().method896(Static146.aClass101_1);
				@Pc(257) Class5_Sub16_Sub3 local257 = Static365.method4582(local252, local160);
				local257.method4592(0);
				Static114.aClass5_Sub16_Sub4_1.method5797(local257);
				arg0.aClass5_Sub16_Sub3_2 = local257;
				arg0.anInt441 = arg0.anInt446 + (int) ((double) (arg0.anInt434 - arg0.anInt446) * Math.random());
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
	public static void method858() {
		if (Static163.aString20.length() == 0) {
			return;
		}
		Static219.method4009("--> " + Static163.aString20);
		Static122.method2146(false, Static163.aString20);
		Static229.anInt4634 = 0;
		Static93.anInt1788 = 0;
		Static163.aString20 = "";
	}
}
