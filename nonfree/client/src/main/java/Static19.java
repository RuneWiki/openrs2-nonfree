import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!ca", name = "o", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_147 = Static120.method1824("skill)2");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "Lclient!rd;")
	public static Class80 aClass80_142 = aClass80_147;

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_143 = Static120.method1824("<col=ff7000>");

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_148 = Static120.method1824(" is already on your friend list)3");

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "Lclient!rd;")
	public static Class80 aClass80_144 = aClass80_148;

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
	public static int anInt464 = 0;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
	public static final int[] anIntArray66 = new int[4000];

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_145 = Static120.method1824("(U");

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Z")
	public static volatile boolean aBoolean27 = false;

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_146 = Static120.method1824(":tradereq:");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
	public static int anInt469 = -1;

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "[I")
	public static final int[] anIntArray67 = new int[500];

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(B[B)[B")
	public static byte[] method319(@OriginalArg(1) byte[] arg0) {
		@Pc(9) Class3_Sub17 local9 = new Class3_Sub17(arg0);
		@Pc(13) int local13 = local9.method2107();
		@Pc(21) int local21 = local9.method2132();
		if (local21 < 0 || Static71.anInt1594 != 0 && local21 > Static71.anInt1594) {
			throw new RuntimeException();
		} else if (local13 == 0) {
			@Pc(84) byte[] local84 = new byte[local21];
			local9.method2126(local84, local21);
			return local84;
		} else {
			@Pc(45) int local45 = local9.method2132();
			if (local45 < 0 || Static71.anInt1594 != 0 && Static71.anInt1594 < local45) {
				throw new RuntimeException();
			}
			@Pc(62) byte[] local62 = new byte[local45];
			if (local13 == 1) {
				Static80.method1204(local62, local45, arg0, local21);
			} else {
				Static64.aClass16_1.method401(local62, local9);
			}
			return local62;
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIII)I")
	public static int method320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return arg0 * (4096 - arg1) + arg2 * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IJ)Lclient!rd;")
	public static Class80 method321(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(32) int local32 = 0;
			@Pc(34) long local34 = arg0;
			while (local34 != 0L) {
				local34 /= 37L;
				local32++;
			}
			@Pc(48) byte[] local48 = new byte[local32];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local32--;
				local48[local32] = Static131.aByteArray49[(int) (local52 - arg0 * 37L)];
			}
			@Pc(79) Class80 local79 = new Class80();
			local79.aByteArray43 = local48;
			local79.anInt3421 = local48.length;
			return local79;
		}
	}
}
