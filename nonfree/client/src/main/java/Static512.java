import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static512 {

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	public static int anInt10668;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Z")
	public static boolean aBoolean721 = false;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "Lclient!ula;")
	public static final Class379 aClass379_12 = new Class379("INTBETA", "office", "_intbeta", 6);

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public static int anInt10673 = -1;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[I[I)V")
	public static void method9063(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1) {
		if (arg1 == null || arg0 == null) {
			Static574.anIntArray632 = null;
			Static77.anIntArray96 = null;
			Static591.aByteArrayArrayArray12 = null;
			return;
		}
		Static574.anIntArray632 = arg1;
		Static77.anIntArray96 = new int[arg1.length];
		Static591.aByteArrayArrayArray12 = new byte[arg1.length][][];
		for (@Pc(31) int local31 = 0; local31 < Static574.anIntArray632.length; local31++) {
			Static591.aByteArrayArrayArray12[local31] = new byte[arg0[local31]][];
		}
	}
}
