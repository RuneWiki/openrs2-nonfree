import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static267 {

	@OriginalMember(owner = "client!lba", name = "q", descriptor = "Lclient!m;")
	public static Class181 aClass181_14;

	@OriginalMember(owner = "client!lba", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray19;

	@OriginalMember(owner = "client!lba", name = "o", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_9 = new CRC32();

	@OriginalMember(owner = "client!lba", name = "r", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_212 = new Class202("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(IIIBLclient!qa;IIIIIII[[[B)V")
	public static void method6431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class39 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11) {
		if (arg5 == 0 || arg7 == 0) {
			return;
		}
		if (arg5 == 9) {
			arg1 = arg1 + 1 & 0x3;
			arg5 = 1;
		}
		if (arg5 == 10) {
			arg5 = 1;
			arg1 = arg1 + 3 & 0x3;
		}
		if (arg5 == 11) {
			arg5 = 8;
			arg1 = arg1 + 3 & 0x3;
		}
		arg3.za(arg2, arg8, arg4, arg6, arg0, arg10, arg11[arg5 - 1][arg1], arg7, arg9);
	}
}
