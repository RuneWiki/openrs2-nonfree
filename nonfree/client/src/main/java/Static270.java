import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!nt", name = "f", descriptor = "I")
	public static int anInt4969;

	@OriginalMember(owner = "client!nt", name = "m", descriptor = "I")
	public static int anInt4971;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!nt", name = "k", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray12 = new int[2][][];

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIII)V")
	public static void method4018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) Class68 local14 = Static404.aClass68ArrayArray1[arg0][arg2];
		Static243.method3670(arg1, local14 == null ? Static221.aClass68_1 : local14);
	}
}
