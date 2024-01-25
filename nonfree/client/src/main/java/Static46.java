import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static46 {

	@OriginalMember(owner = "client!bq", name = "d", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_8 = new Class77(24, 3);

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_26 = new Class88("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(I)V")
	public static void method864() {
		Static321.aClass68_49.method1922();
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(IILclient!nj;)Z")
	public static boolean method865(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method5238(2);
		@Pc(28) int local28;
		@Pc(33) int local33;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method5238(1) != 0) {
				method865(arg0, arg1);
			}
			local28 = arg1.method5238(6);
			local33 = arg1.method5238(6);
			@Pc(45) boolean local45 = arg1.method5238(1) == 1;
			if (local45) {
				Static523.anIntArray683[Static77.anInt1793++] = arg0;
			}
			if (Static90.aClass30_Sub1_Sub1_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(68) Class211 local68 = Static111.aClass211Array1[arg0];
			@Pc(76) Class30_Sub1_Sub1_Sub1 local76 = Static90.aClass30_Sub1_Sub1_Sub1Array1[arg0] = new Class30_Sub1_Sub1_Sub1();
			local76.anInt4197 = arg0;
			if (Static494.aClass12_Sub8Array1[arg0] != null) {
				local76.method784(Static494.aClass12_Sub8Array1[arg0]);
			}
			local76.method3594(true, local68.anInt6042);
			local76.anInt4135 = local68.anInt6044;
			local102 = local68.anInt6041;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local76.aBoolean43 = local68.aBoolean459;
			@Pc(120) int local120 = local102 & 0xFF;
			local76.aByteArray49[0] = Static219.aByteArray58[arg0];
			local76.aByte99 = (byte) local106;
			local76.method782((local112 << 6) + local28 - Static61.anInt1459, (local120 << 6) - -local33 - Static203.anInt4534);
			local76.aBoolean41 = false;
			Static111.aClass211Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local28 = arg1.method5238(2);
			local33 = Static111.aClass211Array1[arg0].anInt6041;
			Static111.aClass211Array1[arg0].anInt6041 = (local33 & 0xFFFFFFF) + ((local28 + (local33 >> 28) & 0x3) << 28);
			return false;
		} else {
			@Pc(207) int local207;
			@Pc(212) int local212;
			@Pc(220) int local220;
			if (local8 != 2) {
				local28 = arg1.method5238(18);
				local33 = local28 >> 16;
				local207 = local28 >> 8 & 0xFF;
				local212 = local28 & 0xFF;
				local220 = Static111.aClass211Array1[arg0].anInt6041;
				local102 = (local220 >> 28) + local33 & 0x3;
				local106 = local207 + (local220 >> 14) & 0xFF;
				local112 = local212 + local220 & 0xFF;
				Static111.aClass211Array1[arg0].anInt6041 = local112 + (local102 << 28) + (local106 << 14);
				return false;
			}
			local28 = arg1.method5238(5);
			local33 = local28 >> 3;
			local207 = local28 & 0x7;
			local212 = Static111.aClass211Array1[arg0].anInt6041;
			local220 = local33 + (local212 >> 28) & 0x3;
			local102 = local212 >> 14 & 0xFF;
			local106 = local212 & 0xFF;
			if (local207 == 0) {
				local106--;
				local102--;
			}
			if (local207 == 1) {
				local106--;
			}
			if (local207 == 2) {
				local102++;
				local106--;
			}
			if (local207 == 3) {
				local102--;
			}
			if (local207 == 4) {
				local102++;
			}
			if (local207 == 5) {
				local106++;
				local102--;
			}
			if (local207 == 6) {
				local106++;
			}
			if (local207 == 7) {
				local106++;
				local102++;
			}
			Static111.aClass211Array1[arg0].anInt6041 = local106 + (local102 << 14) + (local220 << 28);
			return false;
		}
	}
}
