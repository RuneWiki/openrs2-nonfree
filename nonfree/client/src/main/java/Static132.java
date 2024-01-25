import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!fh", name = "s", descriptor = "[I")
	public static int[] anIntArray233;

	@OriginalMember(owner = "client!fh", name = "v", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!fh", name = "f", descriptor = "(I)I")
	public static int method2517() {
		return Static124.anInt2528++;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)Z")
	public static boolean method2520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "([BZI)[B")
	public static byte[] method2522(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = new byte[arg1];
		Static556.method7044(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!fh", name = "h", descriptor = "(I)[Lclient!lc;")
	public static Class174[] method2523() {
		return new Class174[] { Static151.aClass174_7, Static233.aClass174_6, Static483.aClass174_10 };
	}
}
