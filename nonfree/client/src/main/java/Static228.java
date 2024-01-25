import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iq", name = "v", descriptor = "[I")
	public static int[] anIntArray292;

	@OriginalMember(owner = "client!iq", name = "n", descriptor = "Lclient!me;")
	public static final Class211 aClass211_33 = new Class211(8);

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "[Lclient!jba;")
	public static Class69_Sub1[] aClass69_Sub1Array1 = new Class69_Sub1[0];

	@OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
	public static int anInt4641 = 0;

	@OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)Lclient!cg;")
	public static Class3_Sub9 method3902() {
		return Static108.anInt2578 == 0 ? new Class3_Sub9() : Static73.aClass3_Sub9Array24[--Static108.anInt2578];
	}

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "(I)V")
	public static void method3903() {
		@Pc(7) Class148 local7 = null;
		try {
			@Pc(13) Class66 local13 = Static480.aClass326_3.method7783("2", true);
			while (local13.anInt2308 == 0) {
				Static1.method125(1L);
			}
			if (local13.anInt2308 == 1) {
				local7 = (Class148) local13.anObject4;
				@Pc(44) byte[] local44 = new byte[(int) local7.method3371()];
				@Pc(59) int local59;
				for (@Pc(46) int local46 = 0; local46 < local44.length; local46 += local59) {
					local59 = local7.method3370(local44.length - local46, local44, local46);
					if (local59 == -1) {
						throw new IOException("EOF");
					}
				}
				Static296.method4989(new Class3_Sub7(local44));
			}
		} catch (@Pc(94) Exception local94) {
		}
		try {
			if (local7 != null) {
				local7.method3377();
			}
		} catch (@Pc(101) Exception local101) {
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IFIIIIIZI)[[I")
	public static int[][] method3904(@OriginalArg(1) float arg0) {
		@Pc(7) int[][] local7 = new int[256][64];
		@Pc(19) Class3_Sub1_Sub2 local19 = new Class3_Sub1_Sub2();
		local19.aBoolean23 = false;
		local19.anInt258 = 4;
		local19.anInt262 = (int) (arg0 * 4096.0F);
		local19.anInt267 = 8;
		local19.anInt268 = 3;
		local19.method8365();
		Static334.method5783(256, 64);
		for (@Pc(46) int local46 = 0; local46 < 256; local46++) {
			local19.method271(local7[local46], local46);
		}
		return local7;
	}
}
