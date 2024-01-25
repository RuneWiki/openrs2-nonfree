import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!bk;")
	public static Class6_Sub4_Sub2 aClass6_Sub4_Sub2_3;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!qg;")
	public static Class87 aClass87_28;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!he;")
	public static Class100 aClass100_85;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt6869;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray44;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IZI)B")
	public static byte method5709(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)Z")
	public static boolean method5710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BZIIIFIII)[[I")
	public static int[][] method5712(@OriginalArg(5) float arg0) {
		@Pc(14) int[][] local14 = new int[256][64];
		@Pc(18) Class6_Sub5_Sub37 local18 = new Class6_Sub5_Sub37();
		local18.anInt7651 = 8;
		local18.anInt7653 = 4;
		local18.anInt7657 = 3;
		local18.anInt7658 = (int) (arg0 * 4096.0F);
		local18.aBoolean482 = false;
		local18.method6533();
		Static369.method3609(64, 256);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local18.method6263(local45, local14[local45]);
		}
		return local14;
	}
}
