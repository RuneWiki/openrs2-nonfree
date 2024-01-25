import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!d", name = "hb", descriptor = "I")
	public static int anInt1031;

	@OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
	public static int anInt1033;

	@OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
	public static int anInt1027 = 0;

	@OriginalMember(owner = "client!d", name = "db", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!d", name = "ib", descriptor = "[I")
	public static final int[] anIntArray141 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
	public static int anInt1032 = 0;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I")
	public static int method976() {
		return 2;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIII)I")
	public static int method978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class104.anIntArray706[arg1 * 8192 / arg2] >> 1;
		return (arg0 * (65536 - local21) >> 16) + (local21 * arg3 >> 16);
	}
}
