import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static548 {

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[[S")
	public static short[][] aShortArrayArray10;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "[Lclient!gi;")
	public static Class116_Sub1[] aClass116_Sub1Array2;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[Lclient!xa;")
	public static Class66[] aClass66Array14;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray49 = new String[100];

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_65 = new Class245(20);

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "Z")
	public static boolean aBoolean699 = false;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "J")
	public static long aLong238 = 0L;

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	public static void method7831() {
		@Pc(7) int local7 = Static81.anInt1953;
		@Pc(9) int[] local9 = Static227.anIntArray309;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class11_Sub1_Sub1_Sub2 local19 = Static239.aClass11_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static370.method5897(local19, local19.method6212());
			}
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!ag;I)V")
	public static void method7833(@OriginalArg(0) Class11_Sub1_Sub1_Sub1 arg0) {
		for (@Pc(14) Class6_Sub2 local14 = (Class6_Sub2) Static299.aClass211_43.method5183(); local14 != null; local14 = (Class6_Sub2) Static299.aClass211_43.method5177()) {
			if (local14.aClass11_Sub1_Sub1_Sub1_1 == arg0) {
				if (local14.aClass6_Sub10_Sub2_1 != null) {
					Static35.aClass6_Sub10_Sub3_1.method4742(local14.aClass6_Sub10_Sub2_1);
					local14.aClass6_Sub10_Sub2_1 = null;
				}
				local14.method8151();
				return;
			}
		}
	}
}
