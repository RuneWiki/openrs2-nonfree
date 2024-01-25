import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public static int anInt5205;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
	public static int anInt5203 = 0;

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "I")
	public static int anInt5204 = -1;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "Lclient!jg;")
	public static final Class107 aClass107_30 = new Class107(8);

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	public static int anInt5206 = 0;

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "Lclient!pf;")
	public static final Class157 aClass157_156 = new Class157(37, 7);

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)V")
	public static void method4398(@OriginalArg(0) int arg0) {
		Static170.anInt5083 = arg0;
		@Pc(7) Class107 local7 = Static338.aClass107_54;
		synchronized (Static338.aClass107_54) {
			Static338.aClass107_54.method3015();
		}
		local7 = Static257.aClass107_35;
		synchronized (Static257.aClass107_35) {
			Static257.aClass107_35.method3015();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
	public static void method4399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) Class175 local3 = new Class175();
		local3.anInt5759 = arg1 >> Static325.anInt6336;
		local3.anInt5771 = arg2 >> Static325.anInt6336;
		local3.anInt5764 = arg3 >> Static325.anInt6336;
		local3.anInt5763 = arg4 >> Static325.anInt6336;
		local3.anInt5772 = arg0;
		local3.anInt5770 = arg1;
		local3.anInt5765 = arg2;
		local3.anInt5773 = arg3;
		local3.anInt5775 = arg4;
		local3.anInt5757 = arg5;
		local3.anInt5758 = arg6;
		Static133.aClass175Array2[Static336.anInt6523++] = local3;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
	public static void method4400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) Class41 local18 = new Class41(16);
		for (@Pc(23) Class2_Sub20 local23 = (Class2_Sub20) Static198.aClass41_24.method896(); local23 != null; local23 = (Class2_Sub20) Static198.aClass41_24.method904()) {
			local23.method5723();
			@Pc(34) int local34 = (int) (local23.aLong219 >> 28);
			@Pc(44) int local44 = (int) (local23.aLong219 >> 14 & 0x3FFFL) - arg1;
			@Pc(53) int local53 = (int) (local23.aLong219 & 0x3FFFL) - arg0;
			if (local53 >= 0 && local44 >= 0 && Static66.anInt1177 > local53 && local44 < Static12.anInt213) {
				local18.method901(local23, (long) (local53 | local34 << 28 | local44 << 14));
			}
		}
		Static198.aClass41_24 = local18;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BJ)V")
	public static void method4401(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static87.method1737(arg0 - 1L);
			Static87.method1737(1L);
		} else {
			Static87.method1737(arg0);
		}
	}
}
