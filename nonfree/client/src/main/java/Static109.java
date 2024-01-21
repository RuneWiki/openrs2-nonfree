import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "Lclient!eh;")
	public static Class28 aClass28_905 = Static170.method3101("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
	public static boolean aBoolean138 = false;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "Lclient!eh;")
	public static Class28 aClass28_906 = Static170.method3101("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[I")
	public static int[] anIntArray491 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
	public static int[] anIntArray492 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI[Lclient!dg;BI)V")
	public static void method2208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21[] arg2, @OriginalArg(4) int arg3) {
		@Pc(18) Class3_Sub8 local18 = new Class3_Sub8(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method1544();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method1544();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local18.method1545();
				@Pc(62) int local62 = local32 >> 12;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(70) int local70 = local58 >> 2;
				@Pc(74) int local74 = arg3 + local48;
				@Pc(79) int local79 = local54 + arg1;
				if (local79 > 0 && local74 > 0 && local79 < 103 && local74 < 103) {
					@Pc(93) int local93 = local62;
					if ((Static157.aByteArrayArrayArray41[1][local79][local74] & 0x2) == 2) {
						local93 = local62 - 1;
					}
					@Pc(109) Class21 local109 = null;
					if (local93 >= 0) {
						local109 = arg2[local93];
					}
					Static11.method403(local74, local79, local66, local20, local109, local70, local62);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	public static void method2209() {
		aClass28_905 = null;
		anIntArray492 = null;
		anIntArray491 = null;
		aClass28_906 = null;
	}
}
