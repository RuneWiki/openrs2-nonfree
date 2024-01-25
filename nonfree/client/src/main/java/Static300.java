import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
	public static int anInt5540;

	@OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
	public static int anInt5541;

	@OriginalMember(owner = "client!lw", name = "i", descriptor = "[I")
	public static int[] anIntArray410;

	@OriginalMember(owner = "client!lw", name = "j", descriptor = "[Lclient!vea;")
	public static Class341[] aClass341Array1;

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[6][];

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "[I")
	public static final int[] anIntArray409 = new int[200];

	@OriginalMember(owner = "client!lw", name = "h", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_104 = new Class73(61, 12);

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "I")
	public static int anInt5542 = 0;

	@OriginalMember(owner = "client!lw", name = "l", descriptor = "Z")
	public static boolean aBoolean390 = true;

	@OriginalMember(owner = "client!lw", name = "m", descriptor = "[I")
	public static final int[] anIntArray411 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)Lclient!ap;")
	public static Class4_Sub3 method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub3_2 == null ? null : local7.aClass4_Sub3_2;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	public static void method4759() {
		if (Static5.aClass194_1 != Static542.aClass194_5) {
			try {
				Static608.method4639(Static111.aClient1, "tbrefresh");
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
	public static void method4760() {
		Static449.method6350(11);
		Static68.method6772();
		System.gc();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!qf;I)I")
	public static int method4761(@OriginalArg(0) Class6_Sub21_Sub2 arg0) {
		@Pc(15) int local15 = arg0.method6078(2);
		@Pc(22) int local22;
		if (local15 == 0) {
			local22 = 0;
		} else if (local15 == 1) {
			local22 = arg0.method6078(5);
		} else if (local15 == 2) {
			local22 = arg0.method6078(8);
		} else {
			local22 = arg0.method6078(11);
		}
		return local22;
	}
}
