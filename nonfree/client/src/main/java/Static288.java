import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
	public static int anInt5628;

	@OriginalMember(owner = "client!vg", name = "Z", descriptor = "[I")
	public static int[] anIntArray455;

	@OriginalMember(owner = "client!vg", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString187 = "glow3:";

	@OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
	public static int anInt5635 = -1;

	@OriginalMember(owner = "client!vg", name = "Y", descriptor = "Lclient!ul;")
	public static Class172 aClass172_48 = new Class172(50);

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "(II)I")
	public static int method4501(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 & 0x3F;
		@Pc(19) int local19 = arg0 >> 6 & 0x3;
		if (local13 == 18) {
			if (local19 == 0) {
				return 1;
			}
			if (local19 == 1) {
				return 2;
			}
			if (local19 == 2) {
				return 4;
			}
			if (local19 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local19 == 0) {
				return 16;
			}
			if (local19 == 1) {
				return 32;
			}
			if (local19 == 2) {
				return 64;
			}
			if (local19 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "()V")
	public static void method4502() {
		@Pc(1) GL local1 = Static251.aGL1;
		local1.glDisableClientState(32886);
		Static251.method3854(false);
		local1.glDisable(2929);
		local1.glPushAttrib(128);
		local1.glFogf(2915, 3072.0F);
		Static251.method3856();
		for (@Pc(19) int local19 = 0; local19 < Static213.aClass4_Sub8ArrayArray2[0].length; local19++) {
			@Pc(31) Class4_Sub8 local31 = Static213.aClass4_Sub8ArrayArray2[0][local19];
			if (local31.anInt586 >= 0 && Static16.method285(Static283.anInterface1_1.method2427(local31.anInt586))) {
				local1.glColor4fv(Static205.method3273(local31.anInt583), 0);
				@Pc(58) float local58 = 201.5F - (local31.aBoolean45 ? 1.0F : 0.5F);
				local31.method575(Static261.aClass4_Sub21ArrayArrayArray4, local58, true);
			}
		}
		local1.glEnableClientState(32886);
		Static251.method3864();
		local1.glEnable(2929);
		local1.glPopAttrib();
		Static251.method3878();
	}

	@OriginalMember(owner = "client!vg", name = "h", descriptor = "(I)V")
	public static void method4503() {
		Static109.aClass172_20.method4350();
		Static242.aClass172_39.method4350();
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIILclient!uk;Lclient!uk;IIJ)V")
	public static void method4504(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class13 arg4, @OriginalArg(5) Class13 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class181 local8 = new Class181();
		local8.aLong206 = arg8;
		local8.anInt5714 = arg1 * 128 + 64;
		local8.anInt5721 = arg2 * 128 + 64;
		local8.anInt5720 = arg3;
		local8.aClass13_9 = arg4;
		local8.aClass13_10 = arg5;
		local8.anInt5713 = arg6;
		local8.anInt5718 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static261.aClass4_Sub21ArrayArrayArray4[local42][arg1][arg2] == null) {
				Static261.aClass4_Sub21ArrayArrayArray4[local42][arg1][arg2] = new Class4_Sub21(local42, arg1, arg2);
			}
		}
		Static261.aClass4_Sub21ArrayArrayArray4[arg0][arg1][arg2].aClass181_1 = local8;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIII)V")
	public static void method4505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static265.anInt5214 == 0 || arg3 == 0 || Static111.anInt2210 >= 50 || arg1 == -1) {
			return;
		}
		Static246.anIntArray384[Static111.anInt2210] = arg1;
		Static161.anIntArray270[Static111.anInt2210] = arg3;
		Static32.anIntArray84[Static111.anInt2210] = arg2;
		Static68.aClass56Array2[Static111.anInt2210] = null;
		Static97.anIntArray371[Static111.anInt2210] = 0;
		Static173.anIntArray293[Static111.anInt2210] = arg0;
		Static111.anInt2210++;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
	public static void method4506() {
		Static158.aClass172_27.method4349(5);
	}
}
