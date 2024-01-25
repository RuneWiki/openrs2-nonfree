import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
	public static int anInt6642;

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method5764(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static477.aClass259Array3 != Static378.aClass259Array2) {
			@Pc(12) int local12 = Static43.aClass259Array1[arg1].method9294(arg3, arg2);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class259 local19 = Static43.aClass259Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method9294(arg3, arg2);
					if (arg4 != null) {
						arg4[local14] = local19.method9297(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)V")
	public static void method5765() {
		@Pc(22) int local22 = Static580.aClass3_Sub22_24.aClass21_Sub21_2.method6042();
		if (local22 == 0) {
			Static153.aByteArrayArrayArray3 = null;
			Static93.method1945(0);
		} else if (local22 == 1) {
			Static127.method2310((byte) 0);
			Static93.method1945(512);
			if (Static510.aByteArrayArrayArray11 != null) {
				Static555.method6583();
			}
		} else {
			Static127.method2310((byte) (Static247.anInt3877 - 4 & 0xFF));
			Static93.method1945(2);
		}
		Static725.anInt11247 = Static723.anInt11225;
	}
}
