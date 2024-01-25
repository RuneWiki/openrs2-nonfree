import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!qr", name = "f", descriptor = "[B")
	public static final byte[] aByteArray94 = new byte[2048];

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "(BII)I")
	public static int method6556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static108.method2209(arg1 - 1, arg0 + -1) + Static108.method2209(arg1 + 1, arg0 - 1) + Static108.method2209(arg1 - 1, arg0 - -1) + Static108.method2209(arg1 - -1, arg0 + 1);
		@Pc(76) int local76 = Static108.method2209(arg1 - 1, arg0) + Static108.method2209(arg1 + 1, arg0) + Static108.method2209(arg1, arg0 + -1) + Static108.method2209(arg1, arg0 + 1);
		@Pc(81) int local81 = Static108.method2209(arg1, arg0);
		return local81 / 4 + local76 / 8 + local48 / 16;
	}
}
