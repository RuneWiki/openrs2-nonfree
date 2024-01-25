import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "Lclient!wq;")
	public static Class249 aClass249_1;

	@OriginalMember(owner = "client!pt", name = "v", descriptor = "Lclient!aq;")
	public static Class5 aClass5_7;

	@OriginalMember(owner = "client!pt", name = "w", descriptor = "Lclient!aq;")
	public static Class5 aClass5_8;

	@OriginalMember(owner = "client!pt", name = "y", descriptor = "I")
	public static int anInt5039;

	@OriginalMember(owner = "client!pt", name = "z", descriptor = "I")
	public static int anInt5040;

	@OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
	public static int anInt5038 = 0;

	@OriginalMember(owner = "client!pt", name = "x", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_134 = new Class77(37, 5);

	@OriginalMember(owner = "client!pt", name = "A", descriptor = "I")
	public static int anInt5041 = 2;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIILclient!wm;)V")
	public static void method4381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12_Sub3 arg4) {
		@Pc(4) Class227 local4 = Static115.method2162(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1403 = (arg1 << Static315.anInt5584) + Static365.anInt2303;
		arg4.anInt1404 = arg3;
		arg4.anInt1407 = (arg2 << Static315.anInt5584) + Static365.anInt2303;
		for (@Pc(28) Class164 local28 = local4.aClass164_25; local28 != null; local28 = local28.aClass164_19) {
			if (local28.aClass12_Sub1_2.aBoolean474) {
				@Pc(38) int local38 = local28.aClass12_Sub1_2.method5459();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1404 += local8;
			arg4.aBoolean122 = true;
		}
		local4.aClass12_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BI)Lclient!ni;")
	public static Class2_Sub1_Sub11 method4382(@OriginalArg(1) int arg0) {
		@Pc(15) Class2_Sub1_Sub11 local15 = (Class2_Sub1_Sub11) Static282.aClass55_6.method1250((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static15.aClass71_2.method1555(arg0, 0);
		if (local25 == null || local25.length <= 1) {
			return null;
		} else {
			local15 = Static367.method5544(local25);
			Static282.aClass55_6.method1248((long) arg0, local15);
			return local15;
		}
	}
}
