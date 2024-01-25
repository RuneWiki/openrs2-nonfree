import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
	public static int anInt3564;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	public static int anInt3566;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "[S")
	public static final short[] aShortArray62 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[BIIFLclient!cc;FFIFFII)V")
	public static void method2825(@OriginalArg(1) byte[] arg0, @OriginalArg(4) float arg1, @OriginalArg(5) Class3 arg2, @OriginalArg(6) float arg3, @OriginalArg(7) float arg4, @OriginalArg(8) int arg5, @OriginalArg(9) float arg6, @OriginalArg(10) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static205.method2728(arg6, arg5, arg2, arg1, arg4, local3, arg7, arg0, arg3);
			arg5 += 16384;
		}
	}
}
