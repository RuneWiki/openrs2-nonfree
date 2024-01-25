import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!lk;ILclient!r;)V")
	public static void method6204(@OriginalArg(0) Class203 arg0, @OriginalArg(2) Class43 arg1) {
		@Pc(38) boolean local38 = Static517.aClass145_1.method3793(arg0.anInt5497, arg0.anInt5503, arg1, arg0.aBoolean442 ? Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aClass75_1 : null, arg0.anInt5456 | 0xFF000000, arg0.anInt5467, arg0.anInt5507) == null;
		if (local38) {
			Static485.aClass130_48.method3548(new Class3_Sub25(arg0.anInt5507, arg0.anInt5497, arg0.anInt5503, arg0.anInt5456 | 0xFF000000, arg0.anInt5467, arg0.aBoolean442));
			Static138.method2656(arg0);
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "()V")
	public static void method6205() {
		for (@Pc(1) int local1 = 0; local1 < Static472.anInt7698; local1++) {
			@Pc(6) Class9_Sub1_Sub1 local6 = Static288.aClass9_Sub1_Sub1Array1[local1];
			Static200.method3627(local6, true);
			Static288.aClass9_Sub1_Sub1Array1[local1] = null;
		}
		Static472.anInt7698 = 0;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IILclient!qh;)Ljava/lang/String;")
	public static String method6206(@OriginalArg(2) Class3_Sub11 arg0) {
		try {
			@Pc(7) int local7 = arg0.method3138();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt3520 += Static203.aClass49_1.method1529(arg0.anInt3520, 0, arg0.aByteArray36, local19, local7);
			return Static331.method5118(0, local19, local7);
		} catch (@Pc(52) Exception local52) {
			return "Cabbage";
		}
	}
}
