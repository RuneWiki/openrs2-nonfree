import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dm", name = "n", descriptor = "Lclient!sha;")
	public static Class14_Sub3_Sub16 aClass14_Sub3_Sub16_1;

	@OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
	public static int anInt2258;

	@OriginalMember(owner = "client!dm", name = "j", descriptor = "Z")
	public static boolean aBoolean187 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IZLclient!ha;Z)Lclient!jm;")
	public static Class185 method1910(@OriginalArg(0) int arg0, @OriginalArg(2) Class137 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static572.anIntArray713 != null) {
			for (@Pc(14) int local14 = 0; local14 < Static572.anIntArray713.length; local14++) {
				if (Static572.anIntArray713[local14] == arg0) {
					return Static204.aClass185Array7[local14];
				}
			}
		}
		@Pc(37) Class185 local37 = (Class185) Static147.aClass264_19.method6367((long) arg0);
		if (local37 != null) {
			if (arg2 && local37.aClass158_8 == null) {
				@Pc(49) Class158 local49 = Static527.method7557(Static593.aClass386_123, arg0);
				if (local49 == null) {
					return null;
				}
				local37.aClass158_8 = local49;
			}
			return local37;
		}
		@Pc(62) Class356[] local62 = Static688.method8616(Static536.aClass386_115, arg0);
		if (local62 == null) {
			return null;
		}
		@Pc(71) Class158 local71 = Static527.method7557(Static593.aClass386_123, arg0);
		if (local71 == null) {
			return null;
		}
		if (arg2) {
			local37 = new Class185(arg1.method7870(local71, local62), local71);
		} else {
			local37 = new Class185(arg1.method7870(local71, local62));
		}
		Static147.aClass264_19.method6364((long) arg0, local37);
		return local37;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lclient!wia;JIIIIZI)V")
	public static void method1911(@OriginalArg(0) Class386 arg0, @OriginalArg(1) long arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		Static352.anInt6508 = arg3;
		Static613.anInt10339 = 0;
		Static27.anInt690 = arg2;
		Static628.aClass14_Sub5_Sub2_4 = null;
		Static478.aClass386_105 = arg0;
		Static445.anInt6142 = 0;
		Static286.anInt4898 = 10000;
		Static77.aLong42 = arg1;
		Static348.aBoolean440 = false;
		Static507.anInt8961 = 1;
	}
}
