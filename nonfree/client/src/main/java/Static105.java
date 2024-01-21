import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!nd", name = "pb", descriptor = "I")
	public static int anInt2733;

	@OriginalMember(owner = "client!nd", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_875 = Static170.method3101("cross");

	@OriginalMember(owner = "client!nd", name = "Z", descriptor = "[I")
	public static int[] anIntArray479 = new int[4000];

	@OriginalMember(owner = "client!nd", name = "cb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_876 = Static170.method3101("Hidden)2use");

	@OriginalMember(owner = "client!nd", name = "kb", descriptor = "[I")
	public static int[] anIntArray480 = new int[2000];

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
	public static void method2158() {
		aClass28_875 = null;
		anIntArray480 = null;
		aClass28_876 = null;
		anIntArray479 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BI)Z")
	public static boolean method2159(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class3_Sub8 local12 = new Class3_Sub8(arg1);
		@Pc(14) int local14 = -1;
		label56: while (true) {
			@Pc(18) int local18 = local12.method1544();
			if (local18 == 0) {
				return local7;
			}
			local14 += local18;
			@Pc(29) int local29 = 0;
			@Pc(31) boolean local31 = false;
			while (true) {
				@Pc(37) int local37;
				while (!local31) {
					local37 = local12.method1544();
					if (local37 == 0) {
						continue label56;
					}
					local29 += local37 - 1;
					@Pc(64) int local64 = local29 & 0x3F;
					@Pc(70) int local70 = local12.method1545() >> 2;
					@Pc(76) int local76 = local29 >> 6 & 0x3F;
					@Pc(81) int local81 = local64 + arg2;
					@Pc(85) int local85 = arg0 + local76;
					if (local85 > 0 && local81 > 0 && local85 < 103 && local81 < 103) {
						@Pc(106) Class3_Sub2_Sub18 local106 = Static86.method1991(local14);
						if (local70 != 22 || !Static179.aBoolean202 || local106.anInt4208 != 0 || local106.anInt4236 == 1 || local106.aBoolean201) {
							if (!local106.method3175()) {
								Static114.anInt2921++;
								local7 = false;
							}
							local31 = true;
						}
					}
				}
				local37 = local12.method1544();
				if (local37 == 0) {
					break;
				}
				local12.method1545();
			}
		}
	}
}
