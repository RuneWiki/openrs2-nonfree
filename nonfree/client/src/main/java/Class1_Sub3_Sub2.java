import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public class Class1_Sub3_Sub2 extends Class1_Sub3 {

	@OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
	public static int[] anIntArray153;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	public static int anInt367;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
	public static int anInt368;

	@OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
	public static int anInt369;

	@OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
	public static int anInt370;

	@OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
	public static int anInt371;

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
	public static int anInt372;

	@OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
	public static int anInt373;

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public static int anInt374;

	@OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
	public static int anInt375;

	@OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
	private static int anInt366 = 837;

	@OriginalMember(owner = "client!eb", name = "i", descriptor = "B")
	private static byte aByte19 = 5;

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZI[II)V")
	public static void method266(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		anIntArray153 = arg2;
		if (!arg0) {
			anInt366 = 256;
		}
		anInt367 = arg1;
		anInt368 = arg3;
		method268(arg1, aByte19, 0, 0, arg3);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method267() {
		anInt371 = 0;
		anInt369 = 0;
		anInt372 = anInt367;
		anInt370 = anInt368;
		anInt373 = anInt372 - 1;
		anInt374 = anInt372 / 2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IBIII)V")
	public static void method268(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (arg0 > anInt367) {
			arg0 = anInt367;
		}
		if (arg4 > anInt368) {
			arg4 = anInt368;
		}
		anInt371 = arg2;
		anInt369 = arg3;
		anInt372 = arg0;
		if (arg1 != 5) {
			for (@Pc(28) int local28 = 1; local28 > 0; local28++) {
			}
		}
		anInt370 = arg4;
		anInt373 = anInt372 - 1;
		anInt374 = anInt372 / 2;
		anInt375 = anInt370 / 2;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	public static void method269() {
		@Pc(3) int local3 = anInt367 * anInt368;
		for (@Pc(10) int local10 = 0; local10 < local3; local10++) {
			anIntArray153[local10] = 0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIZII)V")
	public static void method270(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < anInt371) {
			arg1 -= anInt371 - arg4;
			arg4 = anInt371;
		}
		if (arg2 < anInt369) {
			arg3 -= anInt369 - arg2;
			arg2 = anInt369;
		}
		if (arg4 + arg1 > anInt372) {
			arg1 = anInt372 - arg4;
		}
		if (arg2 + arg3 > anInt370) {
			arg3 = anInt370 - arg2;
		}
		@Pc(45) int local45 = anInt367 - arg1;
		@Pc(51) int local51 = arg4 + arg2 * anInt367;
		for (@Pc(54) int local54 = -arg3; local54 < 0; local54++) {
			for (@Pc(59) int local59 = -arg1; local59 < 0; local59++) {
				anIntArray153[local51++] = arg0;
			}
			local51 += local45;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIIZI)V")
	public static void method271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		method272(arg4, arg3, arg0, arg2);
		method272(arg4, arg3 + arg1 - 1, arg0, arg2);
		method273(arg3, arg2, arg1, arg4);
		method273(arg3, arg2 + arg0 - 1, arg1, arg4);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIIII)V")
	public static void method272(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < anInt369 || arg1 >= anInt370) {
			return;
		}
		if (arg3 < anInt371) {
			arg2 -= anInt371 - arg3;
			arg3 = anInt371;
		}
		if (arg3 + arg2 > anInt372) {
			arg2 = anInt372 - arg3;
		}
		@Pc(35) int local35 = arg3 + arg1 * anInt367;
		for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
			anIntArray153[local35 + local37] = arg0;
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIIZI)V")
	public static void method273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 < anInt371 || arg1 >= anInt372) {
			return;
		}
		if (arg0 < anInt369) {
			arg2 -= anInt369 - arg0;
			arg0 = anInt369;
		}
		if (arg0 + arg2 > anInt370) {
			arg2 = anInt370 - arg0;
		}
		@Pc(32) int local32 = arg1 + arg0 * anInt367;
		for (@Pc(37) int local37 = 0; local37 < arg2; local37++) {
			anIntArray153[local32 + local37 * anInt367] = arg3;
		}
	}

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	protected Class1_Sub3_Sub2() {
	}
}
