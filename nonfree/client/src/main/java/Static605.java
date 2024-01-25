import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static605 {

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "[Lclient!s;")
	public static Class104[] aClass104Array3;

	@OriginalMember(owner = "client!uh", name = "e", descriptor = "Lclient!bn;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!uh", name = "g", descriptor = "Lclient!ha;")
	public static Class16 aClass16_14;

	@OriginalMember(owner = "client!uh", name = "i", descriptor = "Lclient!hn;")
	public static Class161 aClass161_7;

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString120 = null;

	@OriginalMember(owner = "client!uh", name = "d", descriptor = "[I")
	public static final int[] anIntArray620 = new int[8];

	@OriginalMember(owner = "client!uh", name = "h", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_137 = new Class376(88, 18);

	@OriginalMember(owner = "client!uh", name = "k", descriptor = "Z")
	public static boolean aBoolean708 = false;

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	public static void method8019() {
		Static554.aClass279_45.method6637();
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method8021(@OriginalArg(1) int arg0) {
		@Pc(24) byte[] local24;
		if (arg0 == 100 && Static213.anInt3976 > 0) {
			local24 = Static466.aByteArrayArray19[--Static213.anInt3976];
			Static466.aByteArrayArray19[Static213.anInt3976] = null;
			return local24;
		} else if (arg0 == 5000 && Static337.anInt6128 > 0) {
			local24 = Static434.aByteArrayArray18[--Static337.anInt6128];
			Static434.aByteArrayArray18[Static337.anInt6128] = null;
			return local24;
		} else if (arg0 == 30000 && Static365.anInt4070 > 0) {
			local24 = Static148.aByteArrayArray5[--Static365.anInt4070];
			Static148.aByteArrayArray5[Static365.anInt4070] = null;
			return local24;
		} else {
			if (Static418.aByteArrayArrayArray15 != null) {
				for (@Pc(79) int local79 = 0; local79 < Static339.anIntArray393.length; local79++) {
					if (Static339.anIntArray393[local79] == arg0 && Static552.anIntArray582[local79] > 0) {
						@Pc(106) byte[] local106 = Static418.aByteArrayArrayArray15[local79][--Static552.anIntArray582[local79]];
						Static418.aByteArrayArrayArray15[local79][Static552.anIntArray582[local79]] = null;
						return local106;
					}
				}
			}
			return new byte[arg0];
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B[B)V")
	public static synchronized void method8022(@OriginalArg(1) byte[] arg0) {
		if (arg0.length == 100 && Static213.anInt3976 < 1000) {
			Static466.aByteArrayArray19[Static213.anInt3976++] = arg0;
		} else if (arg0.length == 5000 && Static337.anInt6128 < 250) {
			Static434.aByteArrayArray18[Static337.anInt6128++] = arg0;
		} else if (arg0.length == 30000 && Static365.anInt4070 < 50) {
			Static148.aByteArrayArray5[Static365.anInt4070++] = arg0;
		} else if (Static418.aByteArrayArrayArray15 != null) {
			for (@Pc(71) int local71 = 0; local71 < Static339.anIntArray393.length; local71++) {
				if (Static339.anIntArray393[local71] == arg0.length && Static418.aByteArrayArrayArray15[local71].length > Static552.anIntArray582[local71]) {
					Static418.aByteArrayArrayArray15[local71][Static552.anIntArray582[local71]++] = arg0;
					return;
				}
			}
		}
	}
}
