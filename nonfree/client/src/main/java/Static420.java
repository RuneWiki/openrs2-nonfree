import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static420 {

	@OriginalMember(owner = "client!vf", name = "l", descriptor = "[Lclient!fo;")
	public static Class84[] aClass84Array4;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[Lclient!nf;")
	public static final Class96_Sub1[] aClass96_Sub1Array1 = new Class96_Sub1[30];

	@OriginalMember(owner = "client!vf", name = "i", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_126 = new Class186(0, 3);

	@OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
	public static int anInt7016 = -1;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "([IB)Ljava/lang/String;")
	public static String method5693(@OriginalArg(0) int[] arg0) {
		@Pc(14) StringBuffer local14 = new StringBuffer();
		@Pc(16) int local16 = Static274.anInt4686;
		for (@Pc(18) int local18 = 0; local18 < arg0.length; local18++) {
			@Pc(27) Class160 local27 = Static320.aClass116_1.method2664(arg0[local18]);
			if (local27.anInt4056 != -1) {
				@Pc(40) Class12 local40 = (Class12) Static210.aClass220_26.method4990((long) local27.anInt4056);
				if (local40 == null) {
					@Pc(48) Class77 local48 = Static455.method1703(Static76.aClass158_17, local27.anInt4056, 0);
					if (local48 != null) {
						local40 = Static44.aClass28_14.method3540(local48);
						Static210.aClass220_26.method4996(local40, (long) local27.anInt4056);
					}
				}
				if (local40 != null) {
					Static136.aClass12Array7[local16] = local40;
					local14.append(" <img=").append(local16).append(">");
					local16++;
				}
			}
		}
		return local14.toString();
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
	public static void method5694() {
		Static189.anInt6579 = -3;
		Static40.anInt882 = 0;
		Static205.anInt1293 = 0;
		Static234.aBoolean264 = false;
		Static236.anInt4058 = -1;
		Static140.anInt2540 = 1;
		Static246.anInt4149 = 0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIII)V")
	public static void method5695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static183.anInt5902 = arg1;
		Static393.anInt5631 = arg3;
		Static358.anInt6025 = arg0;
		Static17.anInt311 = arg2;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)I")
	public static int method5696(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(28) int local28 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local28 | local28 >>> 16;
		return local39 + 1;
	}
}
