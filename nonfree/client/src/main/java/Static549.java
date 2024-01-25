import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
	public static int anInt8993 = 0;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "Lclient!mga;")
	public static final Class218 aClass218_130 = new Class218(17, 8);

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V")
	public static void method7860() {
		Static661.anInt10551 = -1;
		Static184.anInt3729 = 0;
		Static514.anInt8261 = -1;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIZ)Z")
	public static boolean method7861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static623.method8760(arg1, arg0) | (arg1 & 0x70000) != 0 || Static81.method1578(arg0, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7862(@OriginalArg(1) byte[] arg0) {
		@Pc(11) int local11 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local11];
		Static684.method5324(arg0, 0, local14, 0, local11);
		return local14;
	}
}
