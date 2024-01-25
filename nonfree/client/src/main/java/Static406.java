import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "I")
	public static int anInt6527;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
	public static final int anInt6511 = 1337;

	@OriginalMember(owner = "client!ug", name = "q", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_199 = new Class107(109, -1);

	@OriginalMember(owner = "client!ug", name = "u", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_146 = new Class7("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)I")
	public static int method5434(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(15) int local15 = local0 | local0 >>> 1;
		@Pc(21) int local21 = local15 | local15 >>> 2;
		@Pc(27) int local27 = local21 | local21 >>> 4;
		@Pc(33) int local33 = local27 | local27 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V")
	public static void method5438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static173.anInt3208 < arg1 || Static108.anInt2276 > arg2) {
			return;
		}
		@Pc(36) boolean local36;
		if (arg4 < Static28.anInt644) {
			local36 = false;
			arg4 = Static28.anInt644;
		} else if (arg4 > Static125.anInt2545) {
			arg4 = Static125.anInt2545;
			local36 = false;
		} else {
			local36 = true;
		}
		@Pc(56) boolean local56;
		if (arg3 < Static28.anInt644) {
			arg3 = Static28.anInt644;
			local56 = false;
		} else if (Static125.anInt2545 >= arg3) {
			local56 = true;
		} else {
			local56 = false;
			arg3 = Static125.anInt2545;
		}
		if (Static108.anInt2276 > arg1) {
			arg1 = Static108.anInt2276;
		} else {
			Static59.method1261(Static163.anIntArrayArray35[arg1++], arg3, arg4, arg0);
		}
		if (Static173.anInt3208 < arg2) {
			arg2 = Static173.anInt3208;
		} else {
			Static59.method1261(Static163.anIntArrayArray35[arg2--], arg3, arg4, arg0);
		}
		@Pc(110) int local110;
		if (local36 && local56) {
			for (local110 = arg1; local110 <= arg2; local110++) {
				@Pc(151) int[] local151 = Static163.anIntArrayArray35[local110];
				local151[arg4] = local151[arg3] = arg0;
			}
		} else if (local36) {
			for (local110 = arg1; local110 <= arg2; local110++) {
				Static163.anIntArrayArray35[local110][arg4] = arg0;
			}
		} else if (local56) {
			for (local110 = arg1; local110 <= arg2; local110++) {
				Static163.anIntArrayArray35[local110][arg3] = arg0;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method5441(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(3, arg0);
		local8.method1778();
		local8.aString18 = arg1;
	}
}
