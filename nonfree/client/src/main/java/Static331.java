import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	public static int anInt10704;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray176;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I[BII)[B")
	public static byte[] method8641(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[32768];
		Static649.method5532(arg0, arg1, local11, 0, 32768);
		return local11;
	}
}
