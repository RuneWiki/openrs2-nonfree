import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!lda", name = "i", descriptor = "Lclient!ea;")
	public static Class78 aClass78_1;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "Lclient!cba;")
	public static final Class45 aClass45_82 = new Class45(37, 5);

	@OriginalMember(owner = "client!lda", name = "d", descriptor = "[F")
	public static final float[] aFloatArray41 = new float[4];

	@OriginalMember(owner = "client!lda", name = "e", descriptor = "[S")
	public static final short[] aShortArray76 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!lda", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString59 = null;

	@OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
	public static final int anInt5452 = 1400;

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZI)Ljava/lang/String;")
	public static String method4601(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static500.method7439(arg0);
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(IZZ)V")
	public static void method4602(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Class12_Sub23 local8 = Static292.method4742(arg0, arg1);
		if (local8 != null) {
			local8.method7967();
		}
	}

	@OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lclient!mc;III)V")
	public static void method4603(@OriginalArg(0) Class198 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == null) {
			return;
		}
		if (arg0.anObjectArray22 != null) {
			@Pc(13) Class12_Sub6 local13 = new Class12_Sub6();
			local13.anObjectArray2 = arg0.anObjectArray22;
			local13.aClass198_2 = arg0;
			Static312.method5029(local13);
		}
		Static148.anInt6865 = arg0.anInt5705;
		Static266.anInt5318 = arg2;
		Static147.anInt3219 = arg1;
		Static156.anInt3411 = arg0.anInt5729;
		Static155.anInt3381 = arg0.anInt5739;
		Static514.anInt1498 = arg0.anInt5726;
		Static4.anInt69 = arg0.anInt5711;
		Static73.aBoolean136 = true;
		Static331.method5282(arg0);
	}
}
