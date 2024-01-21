import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ba", name = "E", descriptor = "[I")
	public static int[] anIntArray22;

	@OriginalMember(owner = "client!ba", name = "t", descriptor = "Lclient!vf;")
	public static Class78 aClass78_1 = new Class78();

	@OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
	public static int[] anIntArray21 = new int[25];

	@OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
	public static int anInt164 = 0;

	@OriginalMember(owner = "client!ba", name = "A", descriptor = "Lclient!v;")
	public static Class76 aClass76_69 = Static134.method2017("(Y<)4col>");

	@OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
	public static int anInt165 = 0;

	@OriginalMember(owner = "client!ba", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_70 = Static134.method2017("Lade Schrifts-=tze )2 ");

	@OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
	public static int anInt167 = 0;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZI[Lclient!v;)Lclient!v;")
	public static Class76 method106(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class76[] arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg0; local9++) {
			if (arg2[arg1 + local9] == null) {
				arg2[arg1 + local9] = Static79.aClass76_361;
			}
			local7 += arg2[local9 + arg1].anInt2668;
		}
		@Pc(44) byte[] local44 = new byte[local7];
		@Pc(46) int local46 = 0;
		@Pc(56) Class76 local56;
		for (@Pc(48) int local48 = 0; local48 < arg0; local48++) {
			local56 = arg2[local48 + arg1];
			Static135.method111(local56.aByteArray71, 0, local44, local46, local56.anInt2668);
			local46 += local56.anInt2668;
		}
		local56 = new Class76();
		local56.anInt2668 = local7;
		local56.aByteArray71 = local44;
		return local56;
	}

	@OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V")
	public static void method107() {
		aClass78_1 = null;
		anIntArray21 = null;
		aClass76_69 = null;
		anIntArray22 = null;
		aClass76_70 = null;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IZZ)Lclient!v;")
	public static Class76 method108(@OriginalArg(0) int arg0) {
		return Static59.method1016(arg0, true);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)V")
	public static void method109() {
		Static107.aClass72_25.method1786();
		Static3.aClass72_22.method1786();
		Static60.aClass72_17.method1786();
	}
}
