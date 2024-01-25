import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!k;")
	public static final Class128 aClass128_26 = new Class128(1);

	@OriginalMember(owner = "client!in", name = "b", descriptor = "I")
	public static int anInt6085 = 0;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(BIZIZ)Lclient!b;")
	public static Class20 method5409(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(15) Class204 local15 = null;
		if (Static23.aClass246_2 != null) {
			local15 = new Class204(arg1, Static23.aClass246_2, Static207.aClass246Array2[arg1], 1000000);
		}
		Static95.aClass135_Sub1Array4[arg1] = Static267.aClass165_2.method3843(Static251.aClass204_4, local15, arg1);
		if (arg2) {
			Static95.aClass135_Sub1Array4[arg1].method2987();
		}
		return new Class20(Static95.aClass135_Sub1Array4[arg1], arg0, 1);
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(IIIILclient!vg;)V")
	public static void method5414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class28_Sub5 arg4) {
		@Pc(4) Class48 local4 = Static382.method5674(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt4869 = (arg1 << Static187.anInt3390) + Static132.anInt2502;
		arg4.anInt4867 = arg3;
		arg4.anInt4860 = (arg2 << Static187.anInt3390) + Static132.anInt2502;
		for (@Pc(28) Class50 local28 = local4.aClass50_1; local28 != null; local28 = local28.aClass50_2) {
			if (local28.aClass28_Sub1_1.aBoolean440) {
				@Pc(38) int local38 = local28.aClass28_Sub1_1.method5191();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt4867 += local8;
			arg4.aBoolean372 = true;
		}
		local4.aClass28_Sub5_1 = arg4;
	}
}
