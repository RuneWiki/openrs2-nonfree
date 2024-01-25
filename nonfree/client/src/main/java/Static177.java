import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!gfa", name = "c", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray9;

	@OriginalMember(owner = "client!gfa", name = "e", descriptor = "[Lclient!kr;")
	public static Class20[] aClass20Array4;

	@OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
	public static int anInt3963 = 100;

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[IZI[ILclient!gt;)Lclient!mfa;")
	public static Class1_Sub2 method3262(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class87_Sub1 arg4) {
		@Pc(21) int local21;
		@Pc(30) int local30;
		@Pc(32) int local32;
		if (!arg4.method5091(Static545.aClass324_12, Static249.aClass187_7)) {
			@Pc(19) int[] local19 = new int[arg0 * arg2];
			for (local21 = 0; local21 < arg0; local21++) {
				local30 = arg3[local21] + arg2 * local21;
				for (local32 = 0; local32 < arg1[local21]; local32++) {
					local19[local30++] = -16777216;
				}
			}
			return new Class1_Sub2(arg4, arg2, arg0, local19);
		}
		@Pc(69) byte[] local69 = new byte[arg2 * arg0];
		for (local21 = 0; local21 < arg0; local21++) {
			local30 = local21 * arg2 + arg3[local21];
			for (local32 = 0; local32 < arg1[local21]; local32++) {
				local69[local30++] = -1;
			}
		}
		return new Class1_Sub2(arg4, arg2, arg0, local69);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V")
	public static void method3264(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static470.method6758(arg1, arg1.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)V")
	public static void method3265(@OriginalArg(1) int arg0) {
		@Pc(19) Class2_Sub5_Sub10 local19 = Static594.method8175(arg0, 2);
		local19.method4387();
	}
}
