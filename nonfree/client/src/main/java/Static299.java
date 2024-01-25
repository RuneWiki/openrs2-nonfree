import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!re", name = "q", descriptor = "I")
	public static int anInt5583;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "[Lclient!mn;")
	public static Class153[] aClass153Array1;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "[I")
	public static final int[] anIntArray474 = new int[200];

	@OriginalMember(owner = "client!re", name = "e", descriptor = "Lclient!pf;")
	public static final Class179 aClass179_6 = new Class179();

	@OriginalMember(owner = "client!re", name = "o", descriptor = "I")
	public static int anInt5582 = 0;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_84 = new Class183(30, 15);

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IBIZII)V")
	public static void method4901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(24) long local24 = (long) (arg3 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(32) Class2_Sub32 local32 = (Class2_Sub32) Static19.aClass243_1.method5967(local24);
		if (local32 == null) {
			local32 = new Class2_Sub32();
			Static19.aClass243_1.method5968(local24, local32);
		}
		if (local32.anIntArray470.length <= arg0) {
			@Pc(55) int[] local55 = new int[arg0 + 1];
			@Pc(60) int[] local60 = new int[arg0 + 1];
			for (@Pc(62) int local62 = 0; local62 < local32.anIntArray470.length; local62++) {
				local55[local62] = local32.anIntArray470[local62];
				local60[local62] = local32.anIntArray471[local62];
			}
			for (@Pc(88) int local88 = local32.anIntArray470.length; local88 < arg0; local88++) {
				local55[local88] = -1;
				local60[local88] = 0;
			}
			local32.anIntArray471 = local60;
			local32.anIntArray470 = local55;
		}
		local32.anIntArray470[arg0] = arg4;
		local32.anIntArray471[arg0] = arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZILjava/lang/String;)V")
	public static void method4903(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(2, arg0);
		local8.method1198();
		local8.aString16 = arg1;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)V")
	public static void method4904(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub7_Sub2 local8 = Static328.method5290(11, arg0);
		local8.method1197();
	}
}
