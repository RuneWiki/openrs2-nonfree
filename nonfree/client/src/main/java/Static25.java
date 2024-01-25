import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "[Lclient!sm;")
	public static Class225[] aClass225Array1;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!ae;")
	public static final Class6 aClass6_1 = new Class6();

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_10 = new Class27(23, 3);

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_7 = new Class167(512);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([[II)V")
	public static void method331(@OriginalArg(0) int[][] arg0) {
		Class10_Sub10_Sub1.lb = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(JZII)V")
	public static void method332(@OriginalArg(0) long arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = (int) arg0 >> 14 & 0x1F;
		@Pc(23) int local23 = (int) arg0 >> 20 & 0x3;
		@Pc(30) int local30 = (int) (arg0 >>> 32) & Integer.MAX_VALUE;
		if (local16 != 10 && local16 != 11 && local16 != 22) {
			Static28.method370(0, arg2, true, 0, arg1, local16, 0, local23);
			return;
		}
		@Pc(48) Class126 local48 = Static342.aClass237_4.method5212(local30);
		@Pc(64) int local64;
		@Pc(61) int local61;
		if (local23 == 0 || local23 == 2) {
			local61 = local48.anInt3782;
			local64 = local48.anInt3785;
		} else {
			local64 = local48.anInt3782;
			local61 = local48.anInt3785;
		}
		@Pc(75) int local75 = local48.anInt3787;
		if (local23 != 0) {
			local75 = (local75 << local23 & 0xF) + (local75 >> 4 - local23);
		}
		Static28.method370(local75, arg2, true, local64, arg1, 0, local61, 0);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
	public static void method333(@OriginalArg(1) int arg0) {
		@Pc(16) Class10_Sub1_Sub17 local16 = Static154.method2630(4, arg0);
		local16.method5346();
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!gh;II)Ljava/lang/String;")
	public static String method334(@OriginalArg(0) Class89 arg0, @OriginalArg(2) int arg1) {
		if (!Static56.method1002(arg0).method4508(arg1) && arg0.anObjectArray10 == null) {
			return null;
		} else if (arg0.aStringArray24 == null || arg0.aStringArray24.length <= arg1 || arg0.aStringArray24[arg1] == null || arg0.aStringArray24[arg1].trim().length() == 0) {
			return Static372.aBoolean418 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray24[arg1];
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIIII)V")
	public static void method335(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class10_Sub1_Sub17 local8 = Static154.method2630(8, arg3);
		local8.method5345();
		local8.anInt6813 = arg0;
		local8.anInt6807 = arg2;
		local8.anInt6806 = arg1;
	}
}
