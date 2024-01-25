import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Lclient!wn;")
	public static Class269 aClass269_32;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "[I")
	public static final int[] anIntArray260 = new int[13];

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Z")
	public static boolean aBoolean267 = true;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_70 = new Class194(1, 8);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method3217() {
		Static31.anInt622 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static21.aClass5_Sub15Array1[local13] = null;
			Static142.aByteArray31[local13] = 1;
			Static99.aClass105Array1[local13] = null;
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	public static void method3221() {
		Static80.aClass44_14.method1031();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIFBIIIZ)[[I")
	public static int[][] method3222(@OriginalArg(3) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class5_Sub1_Sub20 local13 = new Class5_Sub1_Sub20();
		local13.anInt3278 = 8;
		local13.aBoolean210 = false;
		local13.anInt3283 = 4;
		local13.anInt3288 = 3;
		local13.anInt3289 = (int) (arg0 * 4096.0F);
		local13.method5762();
		Static320.method3944(256, 64);
		for (@Pc(48) int local48 = 0; local48 < 256; local48++) {
			local13.method2647(local9[local48], local48);
		}
		return local9;
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
	public static void method3223() {
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			Static99.aBooleanArray5[local7] = true;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IZ)V")
	public static void method3224(@OriginalArg(1) boolean arg0) {
		Static341.method4427();
		if (!Static99.method1399(Static376.anInt6324)) {
			return;
		}
		Static324.anInt5058++;
		if (Static324.anInt5058 < 50 && !arg0) {
			return;
		}
		Static324.anInt5058 = 0;
		if (!Static419.aBoolean470 && Static14.aClass99_2 != null) {
			Static288.method3576(Static393.aClass194_73);
			try {
				Static14.aClass99_2.method4964(Static281.aClass5_Sub15_Sub2_13.anInt7013, Static281.aClass5_Sub15_Sub2_13.aByteArray93);
				Static281.aClass5_Sub15_Sub2_13.anInt7013 = 0;
			} catch (@Pc(46) IOException local46) {
				Static419.aBoolean470 = true;
			}
		}
		Static341.method4427();
	}
}
