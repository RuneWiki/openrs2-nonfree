import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "Z")
	public static boolean aBoolean492;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "[I")
	public static final int[] anIntArray637 = new int[1];

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "Z")
	public static boolean aBoolean493 = true;

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "I")
	public static int anInt7211 = 0;

	@OriginalMember(owner = "client!qda", name = "g", descriptor = "I")
	public static int anInt7212 = 0;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "([SIZ)[S")
	public static short[] method5991(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static559.method5956(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
