import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public static int anInt1363;

	@OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
	public static int anInt1367;

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "Lclient!ui;")
	public static final Class242 aClass242_13 = new Class242("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!cg", name = "y", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_38 = new Class186(22, 4);

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray6 = new String[100];

	@OriginalMember(owner = "client!cg", name = "K", descriptor = "Lclient!wi;")
	public static final Class263 aClass263_9 = new Class263(1, 2, 2, 0);

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public static void method1029() {
		if (Static55.aBoolean100) {
			return;
		}
		Static55.aBoolean100 = true;
		Static280.aBoolean347 = true;
		if (Static126.aClass67_Sub1_1.aBoolean402) {
			Static416.aFloat208 = (int) Static416.aFloat208 - 17 & 0xFFFFFFF0;
		} else {
			Static311.aFloat155 += (-Static311.aFloat155 - 12.0F) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!ap;)I")
	public static int method1033(@OriginalArg(1) Class6_Sub2_Sub1 arg0) {
		if (arg0.anInt6071 == 0) {
			return 0;
		}
		@Pc(56) int local56;
		@Pc(63) int local63;
		if (arg0.anInt6081 != -1) {
			@Pc(23) Class6_Sub2_Sub1 local23 = null;
			if (arg0.anInt6081 < 32768) {
				local23 = Static176.aClass6_Sub2_Sub1_Sub2Array1[arg0.anInt6081];
			} else if (arg0.anInt6081 >= 32768) {
				local23 = Static171.aClass6_Sub2_Sub1_Sub1Array1[arg0.anInt6081 - 32768];
			}
			if (local23 != null) {
				local56 = arg0.anInt6062 - local23.anInt6062;
				local63 = arg0.anInt6061 - local23.anInt6061;
				if (local56 != 0 || local63 != 0) {
					arg0.method4753((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class6_Sub2_Sub1_Sub1) {
			@Pc(168) Class6_Sub2_Sub1_Sub1 local168 = (Class6_Sub2_Sub1_Sub1) arg0;
			if (local168.anInt971 != -1 && (local168.anInt6147 == 0 || local168.anInt6146 > 0)) {
				local168.method4753(local168.anInt971);
				local168.anInt971 = -1;
			}
		} else if (arg0 instanceof Class6_Sub2_Sub1_Sub2) {
			@Pc(95) Class6_Sub2_Sub1_Sub2 local95 = (Class6_Sub2_Sub1_Sub2) arg0;
			if (local95.anInt6150 != -1 && (local95.anInt6147 == 0 || local95.anInt6146 > 0)) {
				local56 = local95.anInt6062 - (local95.anInt6150 - Static381.anInt6688 - Static381.anInt6688) * 64;
				local63 = local95.anInt6061 - (local95.anInt6155 - Static285.anInt5187 - Static285.anInt5187) * 64;
				if (local56 != 0 || local63 != 0) {
					local95.method4753((int) (Math.atan2((double) local56, (double) local63) * 2607.5945876176133D) & 0x3FFF);
				}
				local95.anInt6150 = -1;
			}
		}
		return arg0.method4754();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	public static int method1034(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static74.anIntArrayArray14 == null ? 0 : Static74.anIntArrayArray14[arg0][arg1] & 0xFFFFFF;
	}
}
