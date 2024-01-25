import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
	public static int anInt5715;

	@OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
	public static int anInt5716;

	@OriginalMember(owner = "client!tk", name = "b", descriptor = "Lclient!nea;")
	public static Class235 aClass235_188 = null;

	@OriginalMember(owner = "client!tk", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray14 = new boolean[100];

	@OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
	public static int anInt5717 = 0;

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZI)Z")
	public static boolean method4690(@OriginalArg(1) int arg0) {
		if (Static410.aBooleanArray15[arg0]) {
			return true;
		} else if (Static466.aClass270_99.method5679(arg0)) {
			@Pc(23) int local23 = Static466.aClass270_99.method5685(arg0);
			if (local23 == 0) {
				Static410.aBooleanArray15[arg0] = true;
				return true;
			}
			if (Static578.aClass341ArrayArray2[arg0] == null) {
				Static578.aClass341ArrayArray2[arg0] = new Class341[local23];
			}
			for (@Pc(50) int local50 = 0; local50 < local23; local50++) {
				if (Static578.aClass341ArrayArray2[arg0][local50] == null) {
					@Pc(64) byte[] local64 = Static466.aClass270_99.method5704(arg0, local50);
					if (local64 != null) {
						@Pc(76) Class341 local76 = Static578.aClass341ArrayArray2[arg0][local50] = new Class341();
						local76.anInt9306 = local50 + (arg0 << 16);
						if (local64[0] != -1) {
							throw new IllegalStateException("if1");
						}
						local76.method7574(new Class1_Sub35(local64));
					}
				}
			}
			Static410.aBooleanArray15[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "([Lclient!rga;II)V")
	public static void method4692(@OriginalArg(0) Class8_Sub3[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class8_Sub3 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9367;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9367 < local27 + (local29 & 0x1)) {
				@Pc(44) Class8_Sub3 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4692(arg0, arg1, local10 - 1);
		method4692(arg0, local10 + 1, arg2);
	}
}
