import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "S")
	public static short aShort119 = 256;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "I")
	public static int anInt10663 = 0;

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(B)I")
	public static int method9137() {
		return Static131.method2332(false);
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(III)Z")
	public static boolean method9141(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(Lclient!gga;IZ)Lclient!kia;")
	public static Class2_Sub36 method9143(@OriginalArg(0) Class124 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method3610(arg1);
		return local16 == null ? null : new Class2_Sub36(local16);
	}
}
