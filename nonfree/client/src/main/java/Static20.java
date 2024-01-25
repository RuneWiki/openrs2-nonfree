import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!an", name = "s", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!an", name = "q", descriptor = "Lclient!jf;")
	public static final Class46 aClass46_1 = Static25.method1664();

	@OriginalMember(owner = "client!an", name = "u", descriptor = "[F")
	public static final float[] aFloatArray4 = new float[4];

	@OriginalMember(owner = "client!an", name = "w", descriptor = "Z")
	public static boolean aBoolean30 = true;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IZ[Lclient!wca;IBI)V")
	public static void method548(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class310[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(17) int local17 = 0; local17 < arg2.length; local17++) {
			@Pc(23) Class310 local23 = arg2[local17];
			if (local23 != null && arg4 == local23.anInt9167) {
				Static453.method6919(local23, arg1, arg3, arg0);
				Static367.method5868(arg0, arg3, local23);
				if (local23.anInt9191 - local23.anInt9163 < local23.anInt9230) {
					local23.anInt9230 = local23.anInt9191 - local23.anInt9163;
				}
				if (local23.anInt9178 - local23.anInt9198 < local23.anInt9227) {
					local23.anInt9227 = local23.anInt9178 - local23.anInt9198;
				}
				if (local23.anInt9230 < 0) {
					local23.anInt9230 = 0;
				}
				if (local23.anInt9227 < 0) {
					local23.anInt9227 = 0;
				}
				if (local23.anInt9220 == 0) {
					Static113.method2228(local23, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Z)V")
	public static void method550() {
		Static519.aClass2_Sub12_Sub1_3.method1005();
		Static289.aClass53_83 = null;
		Static517.anInt9002 = 1;
	}
}
