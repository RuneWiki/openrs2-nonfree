import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!la", name = "l", descriptor = "I")
	public static int anInt5160;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!fp;")
	public static final Class91 aClass91_18 = new Class91(2);

	@OriginalMember(owner = "client!la", name = "k", descriptor = "I")
	public static int anInt5159 = 0;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IBII)I")
	public static int method4403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 1023 - arg0;
		} else {
			return 1023 - arg2;
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Lclient!ai;IIII)V")
	public static void method4408(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) long local18 = (long) (arg2 << 28 | arg1 << 14 | arg3);
		@Pc(24) Class1_Sub11 local24 = (Class1_Sub11) Static528.aClass174_40.method4422(local18);
		if (local24 == null) {
			local24 = new Class1_Sub11();
			Static528.aClass174_40.method4420(local24, local18);
			local24.aClass38_21.method1426(arg0);
			return;
		}
		@Pc(49) Class192 local49 = Static454.aClass153_2.method4007(arg0.anInt719);
		@Pc(52) int local52 = local49.anInt5806;
		if (local49.anInt5781 == 1) {
			local52 *= arg0.anInt716 + 1;
		}
		for (@Pc(71) Class1_Sub2 local71 = (Class1_Sub2) local24.aClass38_21.method1419(); local71 != null; local71 = (Class1_Sub2) local24.aClass38_21.method1415()) {
			local49 = Static454.aClass153_2.method4007(local71.anInt719);
			@Pc(81) int local81 = local49.anInt5806;
			if (local49.anInt5781 == 1) {
				local81 *= local71.anInt716 + 1;
			}
			if (local52 > local81) {
				Static157.method3128(local71, arg0);
				return;
			}
		}
		local24.aClass38_21.method1426(arg0);
	}
}
