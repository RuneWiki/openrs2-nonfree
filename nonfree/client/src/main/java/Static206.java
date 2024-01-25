import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!kh", name = "f", descriptor = "[I")
	public static int[] anIntArray258;

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_67 = new Class217(68, 2);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "[I")
	public static final int[] anIntArray257 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!kh", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[8];

	@OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
	public static final int[] anIntArray259 = new int[6];

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(IB)V")
	public static void method3197() {
		@Pc(5) Class126 local5 = Static219.aClass126_25;
		synchronized (Static219.aClass126_25) {
			Static219.aClass126_25.method3140(5);
		}
		local5 = Static179.aClass126_46;
		synchronized (Static179.aClass126_46) {
			Static179.aClass126_46.method3140(5);
		}
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
	public static void method3199() {
		if (Static121.aClass172_3 == null) {
			return;
		}
		Static344.aClass138_5.method3308();
		Static248.method3735();
		Static47.method862();
		Static345.method5809();
		Static281.method5785();
		Static87.method4803();
		if (Static81.aClass108_4 != null) {
			Static81.aClass108_4.method2713();
		}
		Static89.method1674();
		Static235.method3584();
		Static313.method4345();
		Static210.method3247(false);
		Static379.method4943();
		for (@Pc(40) int local40 = 0; local40 < 2048; local40++) {
			@Pc(45) Class7_Sub2_Sub3_Sub2 local45 = Static361.aClass7_Sub2_Sub3_Sub2Array1[local40];
			if (local45 != null) {
				local45.aClass3_Sub15_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass9Array3.length; local52++) {
					local45.aClass9Array3[local52] = null;
				}
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static139.aClass7_Sub2_Sub3_Sub1Array11.length; local70++) {
			@Pc(75) Class7_Sub2_Sub3_Sub1 local75 = Static139.aClass7_Sub2_Sub3_Sub1Array11[local70];
			if (local75 != null) {
				for (@Pc(79) int local79 = 0; local79 < local75.aClass9Array3.length; local79++) {
					local75.aClass9Array3[local79] = null;
				}
			}
		}
		Static121.aClass172_3.method5538();
		Static121.aClass172_3 = null;
	}

	@OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lclient!j;III[Z)V")
	public static void method3200(@OriginalArg(0) Class3_Sub4_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static444.aClass159Array3 == Static85.aClass159Array2) {
			return;
		}
		@Pc(9) int local9 = Static26.aClass159Array1[arg1].va(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class159 local22 = Static26.aClass159Array1[local11];
				if (local22 != null) {
					local22.U(arg0, arg2, local9 - local22.va(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
