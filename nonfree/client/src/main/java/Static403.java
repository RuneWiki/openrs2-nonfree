import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!pm", name = "q", descriptor = "Lclient!fc;")
	public static final Class98 aClass98_114 = new Class98(51, 11);

	@OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
	public static int anInt7295 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
	public static Object method5820(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static214.aBoolean488) {
			try {
				@Pc(25) Class251 local25 = (Class251) Class.forName("Class251_Sub1").getDeclaredConstructor().newInstance();
				local25.method5846(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static214.aBoolean488 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "([BFFIFFIFIIIIILclient!tfa;)V")
	public static void method5822(@OriginalArg(0) byte[] arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) float arg6, @OriginalArg(9) int arg7, @OriginalArg(13) Class306 arg8) {
		@Pc(12) float[] local12 = new float[16384];
		@Pc(42) int local42;
		@Pc(60) int local60;
		for (@Pc(14) int local14 = 0; local14 < 8; local14++) {
			arg8.method7218(arg6 / (float) 128, arg1 / (float) 16, arg4 * 127.0F, arg5 / (float) 128, 0, local12, arg7);
			local42 = arg3;
			arg1 *= 2.0F;
			arg4 *= arg2;
			arg6 *= 2.0F;
			arg5 *= 2.0F;
			for (local60 = 0; local60 < 16384; local60++) {
				arg0[local42] = (byte) ((float) arg0[local42] + local12[local60]);
				local42++;
			}
		}
		local42 = arg3;
		for (local60 = 0; local60 < 16384; local60++) {
			arg0[local42] = (byte) (arg0[local42] + 127);
			local42++;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5823() {
		return Static266.aBoolean351 || Static222.aClass6_Sub26_1 == null ? "" : Static222.aClass6_Sub26_1.aString43;
	}
}
