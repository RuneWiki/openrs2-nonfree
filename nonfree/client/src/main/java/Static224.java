import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
	public static int anInt4178;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "Lclient!wia;")
	public static Class386 aClass386_52;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray30 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public static void method3462() {
		Static150.method2368();
		Static505.aBoolean629 = false;
		Static481.method7124(Static624.anInt10515, Static370.anInt10482, Static189.anInt3555, Static222.anInt4164);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)[Lclient!ne;")
	public static Class240[] method3463() {
		return new Class240[] { Static420.aClass240_5, Static508.aClass240_6, Static380.aClass240_4, Static133.aClass240_2, Static12.aClass240_1, Static223.aClass240_3, Static628.aClass240_8 };
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ZIZI)Ljava/lang/String;")
	public static String method3464(@OriginalArg(2) boolean arg0, @OriginalArg(3) int arg1) {
		if (!arg0 || arg1 < 0) {
			return Integer.toString(arg1, 10);
		}
		@Pc(39) int local39 = 2;
		for (@Pc(43) int local43 = arg1 / 10; local43 != 0; local43 /= 10) {
			local39++;
		}
		@Pc(58) char[] local58 = new char[local39];
		local58[0] = '+';
		for (@Pc(66) int local66 = local39 - 1; local66 > 0; local66--) {
			@Pc(70) int local70 = arg1;
			arg1 /= 10;
			@Pc(81) int local81 = local70 - arg1 * 10;
			if (local81 < 10) {
				local58[local66] = (char) (local81 + 48);
			} else {
				local58[local66] = (char) (local81 + 87);
			}
		}
		return new String(local58);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLclient!so;)Lclient!cf;")
	public static Class53_Sub1 method3466(@OriginalArg(1) Class14_Sub29 arg0) {
		@Pc(12) Class53 local12 = Static74.method1390(arg0);
		@Pc(16) int local16 = arg0.method5858();
		return new Class53_Sub1(local12.anInt1559, local12.aClass168_3, local12.aClass339_2, local12.anInt1556, local12.anInt1560, local16);
	}
}
