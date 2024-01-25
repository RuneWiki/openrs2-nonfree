import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Lclient!l;")
	public static Class11 aClass11_14;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Lclient!dp;")
	public static final Class55 aClass55_91 = new Class55("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "[B")
	public static final byte[] aByteArray57 = new byte[2048];

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IBIII)I")
	public static int method3299(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class22_Sub7.anIntArray410[arg3 * 8192 / arg2] >> 1;
		return (local24 * arg1 >> 16) + ((65536 - local24) * arg0 >> 16);
	}
}
