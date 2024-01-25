import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!bq", name = "D", descriptor = "[Lclient!no;")
	public static final Interface20[] anInterface20Array2 = new Interface20[75];

	@OriginalMember(owner = "client!bq", name = "J", descriptor = "Lclient!al;")
	public static Class17 aClass17_2 = null;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IIIIIIII)V")
	public static void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg0 < 0 || arg6 >= Static456.anInt7428 - 1 || arg0 >= Static5.anInt112 - 1) {
			return;
		}
		if (Static348.aClass84ArrayArrayArray5 == null) {
			return;
		}
		@Pc(44) Interface25 local44;
		if (arg3 == 0) {
			local44 = (Interface25) Static587.method8331(arg4, arg6, arg0);
			@Pc(50) Interface25 local50 = (Interface25) Static442.method6332(arg4, arg6, arg0);
			if (local44 != null && arg5 != 2) {
				if (local44 instanceof Class16_Sub1_Sub2_Sub1) {
					((Class16_Sub1_Sub2_Sub1) local44).aClass178_1.method4329(arg2);
				} else {
					Static108.method1985(arg4, arg0, arg3, local44.method6207(), arg1, arg5, arg2, arg6);
				}
			}
			if (local50 != null) {
				if (!(local50 instanceof Class16_Sub1_Sub2_Sub1)) {
					Static108.method1985(arg4, arg0, arg3, local50.method6207(), arg1, arg5, arg2, arg6);
					return;
				}
				((Class16_Sub1_Sub2_Sub1) local50).aClass178_1.method4329(arg2);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local44 = (Interface25) Static22.method567(arg4, arg6, arg0, rca.class);
				if (local44 == null) {
					return;
				}
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (!(local44 instanceof Class16_Sub1_Sub1_Sub4)) {
					Static108.method1985(arg4, arg0, arg3, local44.method6207(), arg1, arg5, arg2, arg6);
					return;
				}
				((Class16_Sub1_Sub1_Sub4) local44).aClass178_2.method4329(arg2);
			} else if (arg3 == 3) {
				local44 = (Interface25) Static366.method5446(arg4, arg6, arg0);
				if (local44 != null) {
					if (!(local44 instanceof Class16_Sub1_Sub3_Sub2)) {
						Static108.method1985(arg4, arg0, arg3, local44.method6207(), arg1, arg5, arg2, arg6);
						return;
					}
					((Class16_Sub1_Sub3_Sub2) local44).aClass178_3.method4329(arg2);
					return;
				}
			}
			return;
		}
		local44 = (Interface25) Static212.method3540(arg4, arg6, arg0);
		if (local44 == null) {
			return;
		}
		if (local44 instanceof Class16_Sub1_Sub4_Sub2) {
			((Class16_Sub1_Sub4_Sub2) local44).aClass178_4.method4329(arg2);
			return;
		}
		@Pc(217) int local217 = local44.method6207();
		if (arg5 == 4 || arg5 == 5) {
			Static108.method1985(arg4, arg0, arg3, local217, arg1, 4, arg2, arg6);
			return;
		}
		if (arg5 == 6) {
			Static108.method1985(arg4, arg0, arg3, local217, arg1 + 4, 4, arg2, arg6);
			return;
		}
		if (arg5 == 7) {
			Static108.method1985(arg4, arg0, arg3, local217, (arg1 + 2 & 0x3) + 4, 4, arg2, arg6);
		} else if (arg5 == 8) {
			Static108.method1985(arg4, arg0, arg3, local217, arg1 + 4, 4, arg2, arg6);
			Static108.method1985(arg4, arg0, arg3, local217, (arg1 + 2 & 0x3) + 4, 4, arg2, arg6);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!bq", name = "h", descriptor = "(I)Lclient!lk;")
	public static Class2_Sub31 method726() {
		@Pc(8) Class2_Sub31 local8 = Static477.method6770();
		local8.aClass145_100 = null;
		local8.anInt5736 = 0;
		local8.aClass2_Sub17_Sub1_2 = new Class2_Sub17_Sub1(5000);
		return local8;
	}
}
