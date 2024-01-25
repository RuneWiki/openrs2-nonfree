import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
	public static int anInt1126;

	@OriginalMember(owner = "client!dm", name = "p", descriptor = "I")
	public static int anInt1127;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "Z")
	public static boolean aBoolean81 = true;

	@OriginalMember(owner = "client!dm", name = "l", descriptor = "S")
	public static short aShort10 = 32767;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!dp;I)Lclient!bs;")
	public static Class26 method994(@OriginalArg(1) int arg0, @OriginalArg(2) Class53 arg1) {
		@Pc(9) byte[] local9 = arg1.method1033(0, arg0);
		return local9 == null ? null : new Class26(local9);
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public static boolean method995(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static57.anInt1094; local11++) {
			if (arg0.equalsIgnoreCase(Static86.aStringArray11[local11])) {
				return true;
			}
		}
		return arg0.equalsIgnoreCase(Static253.aClass44_Sub4_Sub4_Sub1_1.aString207);
	}

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)I")
	public static int method996() {
		@Pc(7) Class81 local7 = Static289.aClass81_7;
		@Pc(9) boolean local9 = false;
		if (Static13.anInt232 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static220.method3909(null, local18, null, 0, 0);
			local9 = true;
		}
		@Pc(40) long local40 = Static245.method4300();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method3020();
		}
		@Pc(70) int local70 = (int) (Static245.method4300() - local40);
		local7.method3017(100, -16777216, 100, 0, 0);
		if (local9) {
			local7.method2966();
		}
		return local70;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "([[II)V")
	public static void method997(@OriginalArg(0) int[][] arg0) {
		Static11.anIntArrayArray11 = arg0;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)Lclient!fp;")
	public static Class44_Sub2 method998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class187 local7 = Static39.aClass187ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class44_Sub2 local14 = local7.aClass44_Sub2_1;
			local7.aClass44_Sub2_1 = null;
			return local14;
		}
	}
}
