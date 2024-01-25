import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!am", name = "f", descriptor = "I")
	public static int anInt190;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "Lclient!sl;")
	public static final Class215 aClass215_2 = new Class215(74, 0);

	@OriginalMember(owner = "client!am", name = "d", descriptor = "[[I")
	public static final int[][] anIntArrayArray1 = new int[128][128];

	@OriginalMember(owner = "client!am", name = "e", descriptor = "I")
	public static int anInt189 = 0;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public static int anInt191 = 0;

	@OriginalMember(owner = "client!am", name = "h", descriptor = "S")
	public static short aShort1 = 256;

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	public static boolean method143() {
		return Static407.anInt6710 > 0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIB)V")
	public static void method145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub1_Sub11 local13 = Static405.method5222(arg0, 6);
		local13.method2604();
		local13.anInt3083 = arg1;
	}
}
