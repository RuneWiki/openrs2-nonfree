import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_16 = new Class44(97, 0);

	@OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
	public static int anInt779 = -1;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Lclient!vk;")
	public static Class372 method691(@OriginalArg(1) int arg0) {
		@Pc(15) Class372[] local15 = Static278.method4036();
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(23) Class372 local23 = local15[local17];
			if (local23.anInt10652 == arg0) {
				return local23;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBII[BI)V")
	public static void method692(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(16) int local16 = arg3 - arg0 >> 2;
		arg1 += arg0;
		while (true) {
			local16--;
			if (local16 < 0) {
				local16 = arg3 - arg0 & 0x3;
				while (true) {
					local16--;
					if (local16 < 0) {
						return;
					}
					arg2[arg1++] = 1;
				}
			}
			@Pc(25) int local25 = arg1 + 1;
			arg2[arg1] = 1;
			@Pc(30) int local30 = local25 + 1;
			arg2[local25] = 1;
			@Pc(35) int local35 = local30 + 1;
			arg2[local30] = 1;
			arg1 = local35 + 1;
			arg2[local35] = 1;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIILclient!nu;)V")
	public static void method693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class12_Sub2_Sub5 arg4) {
		@Pc(4) Class58 local4 = Static125.method2096(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10998 = (arg1 << Static579.anInt9935) + Static96.anInt2065;
		arg4.anInt10997 = arg3;
		arg4.anInt11002 = (arg2 << Static579.anInt9935) + Static96.anInt2065;
		local4.aClass12_Sub2_Sub5_1 = arg4;
		@Pc(33) int local33 = Static576.aClass51Array3 == Static473.aClass51Array2 ? 1 : 0;
		if (arg4.method9161()) {
			if (arg4.method9150()) {
				arg4.aClass12_Sub2_22 = Static154.aClass12_Sub2Array1[local33];
				Static154.aClass12_Sub2Array1[local33] = arg4;
				return;
			}
			arg4.aClass12_Sub2_22 = Static447.aClass12_Sub2Array8[local33];
			Static447.aClass12_Sub2Array8[local33] = arg4;
			Static17.aBoolean15 = true;
			return;
		}
		arg4.aClass12_Sub2_22 = Static177.aClass12_Sub2Array2[local33];
		Static177.aClass12_Sub2Array2[local33] = arg4;
	}
}
