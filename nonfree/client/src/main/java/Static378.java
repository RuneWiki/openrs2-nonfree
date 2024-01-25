import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
	public static int anInt6496;

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "J")
	public static long aLong175 = 0L;

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "[B")
	public static final byte[] aByteArray81 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)Z")
	public static boolean method5524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
