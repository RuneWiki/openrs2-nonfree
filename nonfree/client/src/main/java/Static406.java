import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!u", name = "X", descriptor = "Lclient!uu;")
	public static Class250 aClass250_97;

	@OriginalMember(owner = "client!u", name = "B", descriptor = "[S")
	public static short[] aShortArray112 = new short[256];

	@OriginalMember(owner = "client!u", name = "O", descriptor = "Lclient!la;")
	public static final Class136 aClass136_185 = new Class136(13, 8);

	@OriginalMember(owner = "client!u", name = "R", descriptor = "Lclient!la;")
	public static final Class136 aClass136_186 = new Class136(44, 14);

	@OriginalMember(owner = "client!u", name = "S", descriptor = "[I")
	public static final int[] anIntArray424 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILclient!ik;)I")
	public static int method5558(@OriginalArg(1) Class3_Sub25_Sub1 arg0) {
		@Pc(12) int local12 = arg0.method2783(2);
		@Pc(16) int local16;
		if (local12 == 0) {
			local16 = 0;
		} else if (local12 == 1) {
			local16 = arg0.method2783(5);
		} else if (local12 == 2) {
			local16 = arg0.method2783(8);
		} else {
			local16 = arg0.method2783(11);
		}
		return local16;
	}
}
