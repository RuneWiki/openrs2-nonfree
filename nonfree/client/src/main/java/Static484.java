import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static484 {

	@OriginalMember(owner = "client!rga", name = "R", descriptor = "Lclient!cd;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!rga", name = "A", descriptor = "Lclient!nf;")
	public static final Class242 aClass242_6 = new Class242();

	@OriginalMember(owner = "client!rga", name = "Q", descriptor = "[S")
	private static final short[] aShortArray114 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!rga", name = "U", descriptor = "[S")
	private static final short[] aShortArray116 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rga", name = "T", descriptor = "[S")
	public static final short[] aShortArray115 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!rga", name = "P", descriptor = "[[S")
	public static final short[][] aShortArrayArray25 = new short[][] { aShortArray114, aShortArray116, aShortArray115 };

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(ZIZII)V")
	public static void method7186(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988() == 0) {
			Static232.method3875(false);
		} else {
			Static230.anInt4251 = Static97.aClass5_Sub25_8.aClass6_Sub11_1.method3988();
			Static638.method9004(0, true);
		}
		Static106.aBoolean155 = arg0;
		Static4.anInt57 = arg1;
		Static181.anInt3227 = arg2;
		Static620.method7123(arg3);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7188(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) byte[] local16 = new byte[arg0.length];
			Static652.method4548(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}
}
