import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "[Lclient!ts;")
	public static Class239[] aClass239Array1;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "Lclient!he;")
	public static Class100 aClass100_4;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_41 = new Class123(101, 20);

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_11 = new Class267("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "Lclient!gn;")
	public static final Class92 aClass92_9 = new Class92(55, 4);

	@OriginalMember(owner = "client!bc", name = "S", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray3 = new String[100];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIBZI)V")
	public static void method648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) ((arg3 ? Integer.MIN_VALUE : 0) | arg4);
		@Pc(20) Class6_Sub37 local20 = (Class6_Sub37) Static79.aClass74_9.method1883(local14);
		if (local20 == null) {
			local20 = new Class6_Sub37();
			Static79.aClass74_9.method1890(local14, local20);
		}
		if (local20.anIntArray408.length <= arg2) {
			@Pc(41) int[] local41 = new int[arg2 + 1];
			@Pc(46) int[] local46 = new int[arg2 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray408.length; local48++) {
				local41[local48] = local20.anIntArray408[local48];
				local46[local48] = local20.anIntArray409[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray408.length; local74 < arg2; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray409 = local46;
			local20.anIntArray408 = local41;
		}
		local20.anIntArray408[arg2] = arg0;
		local20.anIntArray409[arg2] = arg1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static88.method4151(arg3)) {
			return;
		}
		if (Static373.aClass239ArrayArray2[arg3] == null) {
			Static50.method1143(Static35.aClass239ArrayArray1[arg3], -1, arg4, arg1, arg0, arg7, arg6, arg5, arg8, arg2);
		} else {
			Static50.method1143(Static373.aClass239ArrayArray2[arg3], -1, arg4, arg1, arg0, arg7, arg6, arg5, arg8, arg2);
		}
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(III)Z")
	public static boolean method651(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)Z")
	public static boolean method653(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZII)Z")
	public static boolean method654(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
