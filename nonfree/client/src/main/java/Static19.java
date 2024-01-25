import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!as", name = "c", descriptor = "Lclient!bu;")
	public static Class32 aClass32_8;

	@OriginalMember(owner = "client!as", name = "d", descriptor = "I")
	public static int anInt480;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Lclient!gr;")
	public static final Class95 aClass95_1 = new Class95(13, 2);

	@OriginalMember(owner = "client!as", name = "a", descriptor = "([J[Ljava/lang/Object;I)V")
	public static void method380(@OriginalArg(0) long[] arg0, @OriginalArg(1) Object[] arg1) {
		Static444.method5853(arg1, arg0, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!hu;[[B)V")
	public static void method383(@OriginalArg(1) Class105_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg1.length;
		@Pc(36) int local36;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(23) byte[] local23 = arg1[local17];
			if (local23 != null) {
				@Pc(30) Class3_Sub7 local30 = new Class3_Sub7(local23);
				local36 = Static81.anIntArray204[local17] >> 8;
				@Pc(42) int local42 = Static81.anIntArray204[local17] & 0xFF;
				@Pc(49) int local49 = local36 * 64 - Static223.anInt7618;
				@Pc(56) int local56 = local42 * 64 - Static57.anInt5085;
				Static170.method2751();
				arg0.method2665(Static382.aClass29Array3, local49, Static223.anInt7618, local30, local56, Static57.anInt5085);
				arg0.method2678(local12, local56, local49, local30, Static121.aClass172_3);
				if (!arg0.aBoolean286 && Static373.anInt6270 / 8 == local36 && local42 == Static417.anInt6837 / 8 && local12[0] != -1) {
					Static81.aClass108_4 = Static212.aClass184_1.method4142(local12[3], local12[0], local12[1], local12[2], Static353.aClass212_1);
					Static350.anInt3659 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			@Pc(142) int local142 = (Static81.anIntArray204[local130] >> 8) * 64 - Static223.anInt7618;
			local36 = (Static81.anIntArray204[local130] & 0xFF) * 64 - Static57.anInt5085;
			@Pc(157) byte[] local157 = arg1[local130];
			if (local157 == null && Static417.anInt6837 < 800) {
				Static170.method2751();
				arg0.method2670(local36, local142);
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method384(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!vj;BZ[BIIII)Lclient!mk;")
	public static Class112_Sub2_Sub1 method385(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(3) byte[] arg1, @OriginalArg(6) int arg2, @OriginalArg(7) int arg3) {
		if (arg0.aBoolean619 || Static137.method2172(arg3) && Static137.method2172(arg2)) {
			return new Class112_Sub2_Sub1(arg0, 3553, 6406, arg3, arg2, false, arg1, 6406);
		} else if (arg0.aBoolean607) {
			return new Class112_Sub2_Sub1(arg0, 34037, 6406, arg3, arg2, false, arg1, 6406);
		} else {
			return new Class112_Sub2_Sub1(arg0, 6406, arg3, arg2, Static288.method4088(arg3), Static288.method4088(arg2), arg1, 6406);
		}
	}
}
