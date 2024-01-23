import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "[Z")
	public static boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString96 = "Opened title screen";

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString97 = "Loaded update list";

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!tk;)V")
	public static void method2075(@OriginalArg(1) Class159 arg0) {
		if (Static34.anInt771 == arg0.anInt5180) {
			aBooleanArray7[arg0.anInt5202] = true;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIBII)V")
	public static void method2076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static235.anInt4759; local3++) {
			if (Static57.anIntArray84[local3] + Static78.anIntArray113[local3] > arg0 && Static78.anIntArray113[local3] < arg0 + arg3 && Static250.anIntArray374[local3] + Static295.anIntArray277[local3] > arg1 && Static295.anIntArray277[local3] < arg2 + arg1) {
				Static44.aBooleanArray3[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	public static void method2077() {
		Static222.aClass61_42.method1378();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)I")
	public static int method2078(@OriginalArg(1) int arg0) {
		@Pc(15) int local15 = arg0 & 0x3F;
		@Pc(21) int local21 = arg0 >> 6 & 0x3;
		if (local15 == 18) {
			if (local21 == 0) {
				return 1;
			}
			if (local21 == 1) {
				return 2;
			}
			if (local21 == 2) {
				return 4;
			}
			if (local21 == 3) {
				return 8;
			}
		} else if (local15 == 19 || local15 == 21) {
			if (local21 == 0) {
				return 16;
			}
			if (local21 == 1) {
				return 32;
			}
			if (local21 == 2) {
				return 64;
			}
			if (local21 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(II)V")
	public static void method2079() {
		Static170.aClass61_29.method1381(5);
	}
}
