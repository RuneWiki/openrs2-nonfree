import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "[I")
	public static final int[] anIntArray149 = new int[14];

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
	public static int anInt2212 = 2;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)V")
	public static void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static15.anInt239 = arg1;
		Static456.anInt7760 = arg0;
		if (Static424.anInt7715 == 0) {
			Static646.anInt4677 = Static456.anInt7760 + Static50.anInt989 * 2;
			Static606.anInt9796 = Static15.anInt239 + Static374.anInt6012 * 2;
		} else if (Static424.anInt7715 == 1) {
			Static492.anInt8358 = Static605.anInt9788 + Static456.anInt7760 / Static557.anInt9256 + 2;
			Static515.anInt8713 = Static15.anInt239 / Static126.anInt2688 + Static370.anInt6779 + 2;
			Static606.anInt9796 = Static515.anInt8713 * Static126.anInt2688;
			Static646.anInt4677 = Static492.anInt8358 * Static557.anInt9256;
			Static374.anInt6012 = Static606.anInt9796 - Static15.anInt239 >> 1;
			Static50.anInt989 = Static646.anInt4677 - Static456.anInt7760 >> 1;
		} else if (Static424.anInt7715 == 2) {
			Static646.anInt4677 = Static456.anInt7760;
			Static606.anInt9796 = Static15.anInt239;
			return;
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method1831(@OriginalArg(0) String arg0) {
		@Pc(7) String local7 = null;
		@Pc(11) int local11 = arg0.indexOf("--> ");
		if (local11 >= 0) {
			local7 = arg0.substring(0, local11 + 4);
			arg0 = arg0.substring(local11 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(39) int local39 = arg0.indexOf(" ", "directlogin ".length());
			if (local39 >= 0) {
				@Pc(47) int local47 = arg0.length();
				arg0 = arg0.substring(0, local39) + " ";
				for (@Pc(63) int local63 = local39 + 1; local63 < local47; local63++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local7 == null ? arg0 : local7 + arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	public static void method1833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static108.anInt2182 = arg0 - Static598.anInt2995;
		Static433.anInt7555 = arg1 - Static598.anInt2992;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZ)I")
	public static int method1835(@OriginalArg(0) int arg0) {
		@Pc(14) Class3_Sub52 local14 = Static504.method7331(false, arg0);
		if (local14 == null) {
			return Static543.aClass115_1.method2800(arg0).anInt8969;
		}
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < local14.anIntArray653.length; local31++) {
			if (local14.anIntArray653[local31] == -1) {
				local29++;
			}
		}
		return local29 + Static543.aClass115_1.method2800(arg0).anInt8969 - local14.anIntArray653.length;
	}
}
