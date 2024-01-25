import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	public static int anInt782;

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_1 = new Class35(1);

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_2 = new Class35(2);

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_3 = new Class35(4);

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_4 = new Class35(1);

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_5 = new Class35(2);

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_6 = new Class35(4);

	@OriginalMember(owner = "client!bk", name = "m", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_7 = new Class35(2);

	@OriginalMember(owner = "client!bk", name = "n", descriptor = "Lclient!bk;")
	public static final Class35 aClass35_8 = new Class35(4);

	@OriginalMember(owner = "client!bk", name = "p", descriptor = "[I")
	public static final int[] anIntArray93 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
	public static void method722(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub2_Sub18 local8 = Static508.method6607(arg1, 12);
		local8.method6227();
		local8.anInt7701 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	public static void method723() {
		if (Static417.aClass162_17.method6822()) {
			Static417.aClass162_17.method6854(Static9.aCanvas1);
			Static8.method174();
			Static417.aClass162_17.method6814(Static9.aCanvas1);
			Static417.aClass162_17.method6884(Static9.aCanvas1);
		} else {
			Static368.method6714(Static226.anInt3318);
		}
		Static549.method7175();
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
	public static void method724(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static122.anInt2094 != -1) {
				Static453.method5905(Static122.anInt2094);
			}
			for (@Pc(23) Class2_Sub33 local23 = (Class2_Sub33) Static346.aClass90_17.method1676(); local23 != null; local23 = (Class2_Sub33) Static346.aClass90_17.method1680()) {
				if (!local23.method7656()) {
					local23 = (Class2_Sub33) Static346.aClass90_17.method1676();
					if (local23 == null) {
						break;
					}
				}
				Static393.method5411(false, local23, true);
			}
			Static122.anInt2094 = -1;
			Static346.aClass90_17 = new Class90(8);
			Static397.method5455();
			Static122.anInt2094 = Static360.anInt6110;
			Static579.method7524(false);
			Static549.method7175();
			Static566.method7401(Static122.anInt2094);
		}
		Static433.aBoolean571 = true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!lr;BI)Z")
	public static boolean method726(@OriginalArg(0) Class2_Sub7_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0.method4535(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg0.method4535(1) != 0) {
				method726(arg0, arg1);
			}
			local28 = arg0.method4535(6);
			local33 = arg0.method4535(6);
			@Pc(45) boolean local45 = arg0.method4535(1) == 1;
			if (local45) {
				Static302.anIntArray350[Static179.anInt2668++] = arg1;
			}
			if (Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[arg1] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class20 local68 = Static261.aClass20Array1[arg1];
			@Pc(76) Class12_Sub2_Sub1_Sub4_Sub1 local76 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[arg1] = new Class12_Sub2_Sub1_Sub4_Sub1();
			local76.anInt8406 = arg1;
			if (Static316.aClass2_Sub7Array1[arg1] != null) {
				local76.method4908(Static316.aClass2_Sub7Array1[arg1]);
			}
			local76.method6766(local68.anInt387, true);
			local76.anInt8424 = local68.anInt386;
			local102 = local68.anInt388;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			@Pc(116) int local116 = local102 & 0xFF;
			@Pc(124) int local124 = local28 + (local112 << 6) - Static485.anInt7725;
			local76.aBoolean462 = local68.aBoolean27;
			@Pc(138) int local138 = (local116 << 6) + local33 - Static310.anInt5129;
			local76.aByteArray92[0] = Static12.aByteArray5[arg1];
			local76.aByte128 = local76.aByte127 = (byte) local106;
			if (Static562.method7350(local124, local138)) {
				local76.aByte127++;
			}
			local76.method4907(local124, local138);
			local76.aBoolean459 = false;
			Static261.aClass20Array1[arg1] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg0.method4535(2);
			local33 = Static261.aClass20Array1[arg1].anInt388;
			Static261.aClass20Array1[arg1].anInt388 = ((local28 + (local33 >> 28) & 0x3) << 28) + (local33 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(229) int local229;
			@Pc(234) int local234;
			@Pc(242) int local242;
			if (local8 != 2) {
				local28 = arg0.method4535(18);
				local33 = local28 >> 16;
				local229 = local28 >> 8 & 0xFF;
				local234 = local28 & 0xFF;
				local242 = Static261.aClass20Array1[arg1].anInt388;
				local102 = (local242 >> 28) + local33 & 0x3;
				local106 = (local242 >> 14) + local229 & 0xFF;
				local112 = local234 + local242 & 0xFF;
				Static261.aClass20Array1[arg1].anInt388 = (local106 << 14) + (local102 << 28) + local112;
				return false;
			}
			local28 = arg0.method4535(5);
			local33 = local28 >> 3;
			local229 = local28 & 0x7;
			local234 = Static261.aClass20Array1[arg1].anInt388;
			local242 = local33 + (local234 >> 28) & 0x3;
			local102 = local234 >> 14 & 0xFF;
			local106 = local234 & 0xFF;
			if (local229 == 0) {
				local106--;
				local102--;
			}
			if (local229 == 1) {
				local106--;
			}
			if (local229 == 2) {
				local102++;
				local106--;
			}
			if (local229 == 3) {
				local102--;
			}
			if (local229 == 4) {
				local102++;
			}
			if (local229 == 5) {
				local102--;
				local106++;
			}
			if (local229 == 6) {
				local106++;
			}
			if (local229 == 7) {
				local106++;
				local102++;
			}
			Static261.aClass20Array1[arg1].anInt388 = (local242 << 28) + (local102 << 14) + local106;
			return false;
		}
	}
}
