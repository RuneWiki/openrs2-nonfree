import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static595 {

	@OriginalMember(owner = "client!ww", name = "S", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray17 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ww", name = "V", descriptor = "[I")
	public static final int[] anIntArray557 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ww", name = "X", descriptor = "I")
	public static int anInt10298 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ZI)V")
	public static void method8398(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static224.anInt4124 = arg0;
		Static437.aClass1_Sub2Array1 = new Class1_Sub2[Static231.anIntArray204[Static224.anInt4124] + 1];
		Static249.anInt4563 = 0;
		Static216.anInt7428 = 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method8399(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class4_Sub5_Sub16 local10 = Static219.method3587(arg1, 3);
		local10.method7133();
		local10.aString84 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method8400(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(15) int local15 = arg2.length();
		for (@Pc(17) int local17 = 0; local17 < local15; local17 += 4) {
			@Pc(25) int local25 = Static46.method588(arg2.charAt(local17));
			@Pc(40) int local40 = local15 <= local17 + 1 ? -1 : Static46.method588(arg2.charAt(local17 + 1));
			@Pc(59) int local59 = local15 <= local17 + 2 ? -1 : Static46.method588(arg2.charAt(local17 + 2));
			@Pc(76) int local76 = local15 > local17 + 3 ? Static46.method588(arg2.charAt(local17 + 3)) : -1;
			arg0[arg1++] = (byte) (local25 << 2 | local40 >>> 4);
			if (local59 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local40 & 0xF) << 4 | local59 >>> 2);
			if (local76 == -1) {
				break;
			}
			arg0[arg1++] = (byte) ((local59 & 0x3) << 6 | local76);
		}
		return arg1;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIB)Z")
	public static boolean method8401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x580) != 0;
	}
}
