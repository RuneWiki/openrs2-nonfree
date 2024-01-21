import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_38;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
	public static int anInt999;

	@OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_652 = Static118.method2249(")3)3)3");

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_653 = Static118.method2249("hint_headicons");

	@OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lclient!uc;")
	public static final Class87 aClass87_17 = new Class87(64);

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lclient!tg;")
	public static final Class85 aClass85_1 = new Class85();

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "I")
	public static int anInt998 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[BLclient!gd;Z)V")
	public static void method653(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class32 arg2) {
		@Pc(11) Class1_Sub25 local11 = new Class1_Sub25();
		local11.aLong150 = arg0;
		local11.aClass32_4 = arg2;
		local11.anInt4184 = 0;
		local11.aByteArray49 = arg1;
		@Pc(26) Class91 local26 = Static124.aClass91_11;
		synchronized (Static124.aClass91_11) {
			Static124.aClass91_11.method3151(local11);
		}
		Static164.method2816();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!sd;I)V")
	public static void method659(@OriginalArg(0) Class60 arg0) {
		Static142.aClass60_29 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!wd;IIIII)V")
	public static void method660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class97 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static176.aBoolean158) {
			Static48.anInt1264 = 32;
		} else {
			Static48.anInt1264 = 0;
		}
		Static176.aBoolean158 = false;
		@Pc(137) int local137;
		if (Static122.anInt3456 != 0) {
			if (arg5 >= arg3 && arg5 < arg3 + 16 && arg0 >= arg6 && arg6 + 16 > arg0) {
				arg2.anInt4342 -= 4;
				Static25.method448(arg2);
			} else if (arg3 <= arg5 && arg3 + 16 > arg5 && arg0 >= arg1 + arg6 - 16 && arg0 < arg6 + arg1) {
				arg2.anInt4342 += 4;
				Static25.method448(arg2);
			} else if (arg5 >= arg3 - Static48.anInt1264 && arg3 + Static48.anInt1264 + 16 > arg5 && arg0 >= arg6 + 16 && arg6 + arg1 - 16 > arg0) {
				local137 = arg1 * (arg1 - 32) / arg4;
				if (local137 < 8) {
					local137 = 8;
				}
				@Pc(149) int local149 = arg1 - local137 - 32;
				@Pc(161) int local161 = arg0 - local137 / 2 - arg6 - 16;
				arg2.anInt4342 = (arg4 - arg1) * local161 / local149;
				Static25.method448(arg2);
				Static176.aBoolean158 = true;
			}
		}
		if (Static11.anInt261 == 0) {
			return;
		}
		local137 = arg2.anInt4353;
		if (arg5 >= arg3 - local137 && arg0 >= arg6 && arg3 + 16 > arg5 && arg0 <= arg6 + arg1) {
			arg2.anInt4342 += Static11.anInt261 * 45;
			Static25.method448(arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)I")
	public static int method661(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
