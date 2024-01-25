import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "Lclient!oq;")
	public static Class256 aClass256_13;

	@OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
	public static int anInt6119;

	@OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
	public static int anInt6121;

	@OriginalMember(owner = "client!nw", name = "c", descriptor = "Lclient!kea;")
	public static final Class188 aClass188_11 = new Class188(2);

	@OriginalMember(owner = "client!nw", name = "h", descriptor = "Z")
	public static boolean aBoolean445 = false;

	@OriginalMember(owner = "client!nw", name = "i", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_85 = new Class179(3, -1);

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
	public static boolean method5231(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIZII)Lclient!eda;")
	public static Class2_Sub9 method5232(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class2_Sub9 local7 = new Class2_Sub9();
		local7.anInt2172 = arg2;
		local7.anInt2171 = arg3;
		Static606.aClass118_47.method2601(local7, (long) arg0);
		Static570.method7809(arg3);
		@Pc(26) Class261 local26 = Static357.method4826(arg0);
		if (local26 != null) {
			Static624.method8351(local26);
		}
		if (Static11.aClass261_1 != null) {
			Static624.method8351(Static11.aClass261_1);
			Static11.aClass261_1 = null;
		}
		Static493.method6850();
		if (local26 != null) {
			Static338.method4549(!arg1, local26);
		}
		if (!arg1) {
			Static300.method4134(arg3);
		}
		if (!arg1 && Static38.anInt777 != -1) {
			Static170.method7974(Static38.anInt777, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILclient!ha;I)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1) {
		if (!Static220.aBoolean257 || !Static436.aBoolean530) {
			Static605.anInt9754 = 0;
			return;
		}
		if (Static16.aBoolean14) {
			Static611.aLong263 = Static20.aClass123_1.method2765();
		}
		Static64.anInt1176 = 0;
		Static49.anInt8547 = 0;
		Static536.anInt8797 = 0;
		@Pc(27) int[] local27 = arg1.Y();
		Static131.anInt10156 = (int) ((float) local27[2] / 3.0F);
		Static340.anInt5397 = (int) ((float) local27[3] / 3.0F);
		arg1.method6969(Static190.anIntArray218);
		if ((int) ((float) Static190.anIntArray218[0] / 3.0F) != Static278.anInt4447 || Static585.anInt9543 != (int) ((float) Static190.anIntArray218[1] / 3.0F)) {
			Static585.anInt9543 = (int) ((float) Static190.anIntArray218[1] / 3.0F);
			Static278.anInt4447 = (int) ((float) Static190.anIntArray218[0] / 3.0F);
			Static99.anInt7119 = Static278.anInt4447 >> 1;
			Static79.anInt1416 = Static585.anInt9543 >> 1;
			Static269.anIntArray287 = new int[Static585.anInt9543 * Static278.anInt4447];
		}
		Static83.aClass177_3 = arg1.method6979();
		Static605.anInt9754 = 0;
		for (@Pc(104) int local104 = 0; local104 < Static631.anInt9614; local104++) {
			Static630.method8443(arg1, Static321.aClass327Array3[local104], arg0);
		}
		for (@Pc(123) int local123 = 0; local123 < Static238.anInt3898; local123++) {
			Static630.method8443(arg1, Static144.aClass327Array1[local123], arg0);
		}
		for (@Pc(138) int local138 = 0; local138 < Static296.anInt4855; local138++) {
			Static630.method8443(arg1, Static422.aClass327Array4[local138], arg0);
		}
		Static29.anInt690 = 0;
		if (Static605.anInt9754 > 0) {
			@Pc(162) int local162 = Static269.anIntArray287.length;
			@Pc(169) int local169 = local162 - local162 & 0x7;
			@Pc(171) int local171 = 0;
			while (local169 > local171) {
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
			}
			while (local171 < local162) {
				Static269.anIntArray287[local171++] = Integer.MAX_VALUE;
			}
			Static176.anInt3095 = 1;
			for (@Pc(234) int local234 = 0; local234 < Static605.anInt9754; local234++) {
				@Pc(240) Class327 local240 = Static160.aClass327Array2[local234];
				Static313.method4244(local240.aShortArray135[3], local240.aShortArray134[1], local240.aShortArray135[0], local240.aShortArray134[3], local240.aShortArray134[0], local240.aShortArray133[1], local240.aShortArray135[1], local240.aShortArray133[3], local240.aShortArray133[0]);
				Static313.method4244(local240.aShortArray135[3], local240.aShortArray134[2], local240.aShortArray135[1], local240.aShortArray134[3], local240.aShortArray134[1], local240.aShortArray133[2], local240.aShortArray135[2], local240.aShortArray133[3], local240.aShortArray133[1]);
			}
			Static176.anInt3095 = 2;
		}
		if (Static16.aBoolean14) {
			Static576.aLong252 = Static20.aClass123_1.method2765() - Static611.aLong263;
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V")
	public static void method5234() {
		@Pc(5) Class32 local5 = Static22.aClass32_6;
		synchronized (Static22.aClass32_6) {
			Static22.aClass32_6.method640();
		}
	}
}
