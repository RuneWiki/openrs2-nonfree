import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public static int anInt1464;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Z")
	public static boolean aBoolean130 = false;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "[I")
	public static final int[] anIntArray154 = new int[8];

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Z")
	public static boolean method1382(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x220) == 544 | (arg0 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "([BB)[B")
	public static byte[] method1386(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(19) byte[] local19 = new byte[arg0.length];
			Static459.method5354(arg0, 0, local19, 0, arg0.length);
			return local19;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!lt;II)Lclient!jv;")
	public static Class6_Sub19 method1388(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method3691(arg1);
		return local8 == null ? null : new Class6_Sub19(local8);
	}
}
