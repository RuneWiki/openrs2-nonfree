import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
	public static int anInt7399;

	@OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
	public static int anInt7396 = 0;

	@OriginalMember(owner = "client!qaa", name = "f", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_92 = new Class316(10, 3);

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)Z")
	public static boolean method5908() {
		return Static560.method7781("jaclib") ? Static560.method7781("hw3d") : false;
	}

	@OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I[FZ)[F")
	public static float[] method5909(@OriginalArg(0) int arg0, @OriginalArg(1) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static596.method7720(arg1, 0, local11, 0, arg0);
		return local11;
	}
}
