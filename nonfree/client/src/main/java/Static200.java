import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static200 {

	@OriginalMember(owner = "client!ju", name = "h", descriptor = "[I")
	public static final int[] anIntArray295 = new int[2048];

	@OriginalMember(owner = "client!ju", name = "k", descriptor = "Z")
	public static volatile boolean aBoolean205 = false;

	@OriginalMember(owner = "client!ju", name = "m", descriptor = "[F")
	public static final float[] aFloatArray9 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

	@OriginalMember(owner = "client!ju", name = "q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[100];

	@OriginalMember(owner = "client!ju", name = "r", descriptor = "Lclient!sn;")
	public static final Class225 aClass225_11 = new Class225(14, 2);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IB)V")
	public static void method2688(@OriginalArg(1) byte arg0) {
		if (Static111.aByteArrayArrayArray1 == null) {
			Static111.aByteArrayArrayArray1 = new byte[4][Static166.anInt2852][Static426.anInt6923];
		}
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			for (@Pc(23) int local23 = 0; local23 < Static166.anInt2852; local23++) {
				for (@Pc(27) int local27 = 0; local27 < Static426.anInt6923; local27++) {
					Static111.aByteArrayArrayArray1[local19][local23][local27] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!jm;IZI)V")
	public static void method2690(@OriginalArg(0) Class3_Sub4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0.anInt4903 == arg2 && arg2 != -1) {
			@Pc(79) Class128 local79 = Static334.aClass62_2.method1418(arg2);
			@Pc(82) int local82 = local79.anInt3329;
			if (local82 == 1) {
				arg0.anInt4940 = 0;
				arg0.anInt4945 = 1;
				arg0.anInt4929 = 0;
				arg0.lb = 0;
				arg0.anInt4954 = arg1;
				Static128.method1905(local79, arg0.anInt6835, false, arg0.aByte91, arg0.anInt6833, arg0.anInt4929);
			}
			if (local82 == 2) {
				arg0.anInt4940 = 0;
			}
		} else if (arg2 == -1 || arg0.anInt4903 == -1 || Static334.aClass62_2.method1418(arg2).anInt3326 >= Static334.aClass62_2.method1418(arg0.anInt4903).anInt3326) {
			arg0.anInt4903 = arg2;
			arg0.anInt4929 = 0;
			arg0.lb = 0;
			arg0.anInt4940 = 0;
			arg0.anInt4976 = arg0.anInt4977;
			arg0.anInt4945 = 1;
			arg0.anInt4954 = arg1;
			if (arg0.anInt4903 != -1) {
				Static128.method1905(Static334.aClass62_2.method1418(arg0.anInt4903), arg0.anInt6835, false, arg0.aByte91, arg0.anInt6833, arg0.anInt4929);
			}
		}
	}
}
