import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_130 = Static151.method2243("Loading )2 please wait)3");

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "[[B")
	public static final byte[][] aByteArrayArray2 = new byte[1000][];

	@OriginalMember(owner = "client!bi", name = "P", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_131 = Static151.method2243(" (X");

	@OriginalMember(owner = "client!bi", name = "U", descriptor = "Lclient!mb;")
	public static Class62 aClass62_132 = aClass62_130;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)Z")
	public static boolean method331(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	public static void method332() {
		Static60.aBoolean52 = true;
		Static164.aBoolean149 = true;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V")
	public static void method335() {
		Static108.aClass2_Sub11_Sub1_3.method1586();
		@Pc(13) int local13 = Static108.aClass2_Sub11_Sub1_3.method1584(8);
		@Pc(18) int local18;
		if (Static118.anInt2607 > local13) {
			for (local18 = local13; local18 < Static118.anInt2607; local18++) {
				Static111.anIntArray226[Static39.anInt4460++] = Static199.anIntArray373[local18];
			}
		}
		if (Static118.anInt2607 < local13) {
			throw new RuntimeException("gnpov1");
		}
		Static118.anInt2607 = 0;
		for (local18 = 0; local18 < local13; local18++) {
			@Pc(56) int local56 = Static199.anIntArray373[local18];
			@Pc(60) Class7_Sub2_Sub1 local60 = Static9.aClass7_Sub2_Sub1Array1[local56];
			@Pc(65) int local65 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
			if (local65 == 0) {
				Static199.anIntArray373[Static118.anInt2607++] = local56;
				local60.anInt3043 = Static25.anInt581;
			} else {
				@Pc(85) int local85 = Static108.aClass2_Sub11_Sub1_3.method1584(2);
				if (local85 == 0) {
					Static199.anIntArray373[Static118.anInt2607++] = local56;
					local60.anInt3043 = Static25.anInt581;
					Static187.anIntArray355[Static196.anInt4032++] = local56;
				} else {
					@Pc(129) int local129;
					@Pc(139) int local139;
					if (local85 == 1) {
						Static199.anIntArray373[Static118.anInt2607++] = local56;
						local60.anInt3043 = Static25.anInt581;
						local129 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
						local60.method2174(false, local129);
						local139 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
						if (local139 == 1) {
							Static187.anIntArray355[Static196.anInt4032++] = local56;
						}
					} else if (local85 == 2) {
						Static199.anIntArray373[Static118.anInt2607++] = local56;
						local60.anInt3043 = Static25.anInt581;
						local129 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
						local60.method2174(true, local129);
						local139 = Static108.aClass2_Sub11_Sub1_3.method1584(3);
						local60.method2174(true, local139);
						@Pc(193) int local193 = Static108.aClass2_Sub11_Sub1_3.method1584(1);
						if (local193 == 1) {
							Static187.anIntArray355[Static196.anInt4032++] = local56;
						}
					} else if (local85 == 3) {
						Static111.anIntArray226[Static39.anInt4460++] = local56;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(III)Lclient!uf;")
	public static Class100 method337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass100_1;
	}
}
