import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/Object;")
	public static Object anObject20;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V")
	public static void method7913() {
		Static349.anInt6239 = -1;
		Static249.anInt8899 = -1;
		Static262.anInt5041 = -1;
		Static298.anInt5561 = 0;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(B[I[I)V")
	public static void method7916(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg0 == null || arg1 == null) {
			Static81.aByteArrayArrayArray1 = null;
			Static192.anIntArray177 = null;
			Static205.anIntArray198 = null;
			return;
		}
		Static205.anIntArray198 = arg0;
		Static192.anIntArray177 = new int[arg0.length];
		Static81.aByteArrayArrayArray1 = new byte[arg0.length][][];
		for (@Pc(32) int local32 = 0; local32 < Static205.anIntArray198.length; local32++) {
			Static81.aByteArrayArrayArray1[local32] = new byte[arg1[local32]][];
		}
	}
}
