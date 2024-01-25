import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "[S")
	public static short[] aShortArray59;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public static void method4359() {
		Static93.anIntArray139 = Static426.method5366(0.4F);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!mg;IILclient!za;I)V")
	public static void method4360(@OriginalArg(0) Class156 arg0, @OriginalArg(3) Class163 arg1) {
		Static144.aClass156_14.method3161();
		if (Static199.aBoolean204) {
			return;
		}
		for (@Pc(21) Class2_Sub40 local21 = (Class2_Sub40) arg0.method3155(); local21 != null; local21 = (Class2_Sub40) arg0.method3150()) {
			@Pc(29) Class78 local29 = Static282.aClass120_4.method2512(local21.anInt6352);
			if (Static308.method4222(local29)) {
				@Pc(41) boolean local41 = Static158.method2006(arg1, local21, local29);
				if (local41) {
					Static383.method4934(arg1, local21, local29);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public static void method4361(@OriginalArg(0) int arg0) {
		@Pc(8) Class2_Sub5_Sub11 local8 = Static316.method4316(16, arg0);
		local8.method3101();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZZLjava/lang/String;Lclient!dk;)Lclient!ek;")
	public static Class67 method4362(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class54 arg2) {
		@Pc(10) int local10 = arg2.method1102(arg1);
		if (local10 == -1) {
			return new Class67(0);
		}
		@Pc(23) int[] local23 = arg2.method1113(local10);
		@Pc(29) Class67 local29 = new Class67(local23.length);
		@Pc(31) int local31 = 0;
		@Pc(38) int local38 = 0;
		while (true) {
			while (local29.anInt1860 > local31) {
				@Pc(52) Class2_Sub13 local52 = new Class2_Sub13(arg2.method1126(local10, local23[local38++]));
				@Pc(56) int local56 = local52.method3574();
				@Pc(60) int local60 = local52.method3555();
				@Pc(64) int local64 = local52.method3580();
				if (!arg0 && local64 == 1) {
					local29.anInt1860--;
				} else {
					local29.anIntArray144[local31] = local56;
					local29.anIntArray143[local31] = local60;
					local31++;
				}
			}
			return local29;
		}
	}
}
