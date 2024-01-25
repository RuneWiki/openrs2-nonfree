import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vga", name = "h", descriptor = "Lclient!oj;")
	public static Class5_Sub5_Sub15 aClass5_Sub5_Sub15_4;

	@OriginalMember(owner = "client!vga", name = "q", descriptor = "Lclient!tm;")
	public static final Class337 aClass337_154 = new Class337(67, 0);

	@OriginalMember(owner = "client!vga", name = "E", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray14 = new int[2][][];

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "([BBI)[B")
	public static byte[] method8557(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		@Pc(6) byte[] local6 = new byte[arg1];
		Static652.method4548(arg0, 0, local6, 0, arg1);
		return local6;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(II)I")
	public static int method8558(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!vga", name = "b", descriptor = "(II)Lclient!ln;")
	public static Class216 method8559(@OriginalArg(0) int arg0) {
		@Pc(8) Class216[] local8 = Static47.method824();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].anInt5434 == arg0) {
				return local8[local10];
			}
		}
		return null;
	}
}
