import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!op", name = "l", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!op", name = "t", descriptor = "Lclient!ir;")
	public static Class100 aClass100_95;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!op", name = "m", descriptor = "[I")
	public static final int[] anIntArray376 = new int[4096];

	@OriginalMember(owner = "client!op", name = "o", descriptor = "I")
	public static int anInt4637 = 0;

	@OriginalMember(owner = "client!op", name = "p", descriptor = "I")
	public static int anInt4638 = 0;

	@OriginalMember(owner = "client!op", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray26 = new String[100];

	@OriginalMember(owner = "client!op", name = "v", descriptor = "I")
	public static int anInt4641 = -50;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	public static void method3951() {
		Static291.aClass3_Sub4_Sub2_3.method3682(237);
		Static291.aClass3_Sub4_Sub2_3.method3614(Static205.method34());
		Static291.aClass3_Sub4_Sub2_3.method3660(Static298.anInt5944);
		Static291.aClass3_Sub4_Sub2_3.method3660(Static171.anInt3583);
		Static291.aClass3_Sub4_Sub2_3.method3614(Static135.anInt2792);
	}

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLclient!de;)[Lclient!je;")
	public static Class105[] method3952(@OriginalArg(1) Class42 arg0) {
		if (!arg0.method965()) {
			return new Class105[0];
		}
		@Pc(16) Class207 local16 = arg0.method985();
		while (local16.anInt6346 == 0) {
			Static134.method2241(10L);
		}
		if (local16.anInt6346 == 2) {
			return new Class105[0];
		}
		@Pc(37) int[] local37 = (int[]) local16.anObject7;
		@Pc(43) Class105[] local43 = new Class105[local37.length >> 2];
		for (@Pc(52) int local52 = 0; local52 < local43.length; local52++) {
			@Pc(58) Class105 local58 = new Class105();
			local43[local52] = local58;
			local58.anInt2899 = local37[local52 << 2];
			local58.anInt2895 = local37[(local52 << 2) + 1];
			local58.anInt2896 = local37[(local52 << 2) + 2];
			local58.anInt2898 = local37[(local52 << 2) + 3];
		}
		return local43;
	}

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(Z)V")
	public static void method3953() {
		Static154.anInt6365 = -1;
		Static208.anInt4202 = -1;
		Static355.anInt6865 = -1;
		Static251.anInt4974 = 0;
	}
}
