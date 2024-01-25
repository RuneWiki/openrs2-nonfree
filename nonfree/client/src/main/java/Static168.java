import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!kn", name = "R", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_114 = new Class18(12, 8);

	@OriginalMember(owner = "client!kn", name = "X", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_97 = new Class21(30);

	@OriginalMember(owner = "client!kn", name = "Y", descriptor = "[I")
	public static final int[] anIntArray260 = new int[2048];

	@OriginalMember(owner = "client!kn", name = "ab", descriptor = "[I")
	public static final int[] anIntArray261 = new int[3];

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
	public static void method3166(@OriginalArg(0) int arg0) {
		Static40.anIntArray70 = new int[arg0];
		Static198.anIntArray309 = new int[arg0];
		Static271.anIntArray43 = new int[arg0];
		Static260.anIntArray406 = new int[arg0];
		Static127.anIntArray207 = new int[arg0];
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method3167(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(16) String local16 = arg0[arg1];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(27) int local27 = arg2 + arg1;
			@Pc(29) int local29 = 0;
			for (@Pc(31) int local31 = arg1; local31 < local27; local31++) {
				@Pc(37) String local37 = arg0[local31];
				if (local37 == null) {
					local29 += 4;
				} else {
					local29 += local37.length();
				}
			}
			@Pc(60) StringBuffer local60 = new StringBuffer(local29);
			for (@Pc(62) int local62 = arg1; local62 < local27; local62++) {
				@Pc(73) String local73 = arg0[local62];
				if (local73 == null) {
					local60.append("null");
				} else {
					local60.append(local73);
				}
			}
			return local60.toString();
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIILclient!hl;)V")
	public static void method3169(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class11_Sub3 arg4) {
		@Pc(4) Class155 local4 = Static94.method2043(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		@Pc(8) int local8 = 0;
		arg4.anInt1351 = (arg1 << Static153.anInt3177) + Static145.anInt3090;
		arg4.anInt1352 = arg3;
		arg4.anInt1359 = (arg2 << Static153.anInt3177) + Static145.anInt3090;
		for (@Pc(28) Class187 local28 = local4.aClass187_2; local28 != null; local28 = local28.aClass187_3) {
			if (local28.aClass11_Sub2_2.aBoolean497) {
				@Pc(38) int local38 = local28.aClass11_Sub2_2.method5877();
				if (local38 != -32768 && local38 < local8) {
					local8 = local38;
				}
			}
		}
		if (local8 < 0) {
			arg4.anInt1352 += local8;
			arg4.aBoolean97 = true;
		}
		local4.aClass11_Sub3_1 = arg4;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILclient!wc;)V")
	public static void method3170(@OriginalArg(1) Class11_Sub2_Sub6_Sub1 arg0) {
		@Pc(20) Class1_Sub40 local20 = (Class1_Sub40) Static367.aClass38_33.method1475((long) arg0.anInt6792);
		if (local20 == null) {
			Static286.method5275(0, arg0, null, arg0.anIntArray504[0], arg0.aByte79, null, arg0.anIntArray505[0]);
		} else {
			local20.method5482();
		}
	}
}
