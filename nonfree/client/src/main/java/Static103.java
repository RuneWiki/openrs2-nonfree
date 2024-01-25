import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!ew", name = "zb", descriptor = "Lclient!sr;")
	public static Class227 aClass227_8;

	@OriginalMember(owner = "client!ew", name = "hb", descriptor = "Lclient!qh;")
	public static final Class199 aClass199_59 = new Class199(16);

	@OriginalMember(owner = "client!ew", name = "wb", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ew", name = "xb", descriptor = "I")
	public static final int anInt1912 = 0;

	@OriginalMember(owner = "client!ew", name = "yb", descriptor = "[I")
	public static final int[] anIntArray135 = new int[2048];

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BII)Z")
	public static boolean method1580(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method1581(@OriginalArg(1) Class1_Sub28 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static312.anInt5420; local3++) {
			@Pc(9) int local9 = arg0.method5392();
			@Pc(15) int local15 = arg0.method5335();
			if (local15 == 65535) {
				local15 = -1;
			}
			if (Static222.aClass147_Sub1Array2[local9] != null) {
				Static222.aClass147_Sub1Array2[local9].anInt6661 = local15;
			}
		}
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIIZI)V")
	public static void method1584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg3 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class1_Sub43 local20 = (Class1_Sub43) Static401.aClass199_172.method4387(local14);
		if (local20 == null) {
			local20 = new Class1_Sub43();
			Static401.aClass199_172.method4383(local14, local20);
		}
		if (local20.anIntArray507.length <= arg1) {
			@Pc(45) int[] local45 = new int[arg1 + 1];
			@Pc(50) int[] local50 = new int[arg1 + 1];
			for (@Pc(52) int local52 = 0; local52 < local20.anIntArray507.length; local52++) {
				local45[local52] = local20.anIntArray507[local52];
				local50[local52] = local20.anIntArray506[local52];
			}
			for (@Pc(78) int local78 = local20.anIntArray507.length; local78 < arg1; local78++) {
				local45[local78] = -1;
				local50[local78] = 0;
			}
			local20.anIntArray507 = local45;
			local20.anIntArray506 = local50;
		}
		local20.anIntArray507[arg1] = arg0;
		local20.anIntArray506[arg1] = arg2;
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIZIIFIII)[[I")
	public static int[][] method1585(@OriginalArg(5) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class1_Sub4_Sub1 local13 = new Class1_Sub4_Sub1();
		local13.anInt176 = 8;
		local13.anInt170 = (int) (arg0 * 4096.0F);
		local13.aBoolean17 = false;
		local13.anInt175 = 3;
		local13.anInt168 = 4;
		local13.method5686();
		Static412.method5317(64, 256);
		for (@Pc(40) int local40 = 0; local40 < 256; local40++) {
			local13.method136(local9[local40], local40);
		}
		return local9;
	}
}
