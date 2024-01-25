import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!kp", name = "M", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_79 = new Class85("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "(I)V")
	public static void method3124() {
		Static238.aClass109_47.method2858();
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!jq;B)V")
	public static void method3125(@OriginalArg(0) Class4_Sub5_Sub2 arg0) {
		@Pc(17) int local17 = arg0.anInt5390 - Static283.anInt5563;
		@Pc(28) int local28 = arg0.anInt5387 * 128 + arg0.method4807() * 64;
		@Pc(40) int local40 = arg0.anInt5403 * 128 + arg0.method4807() * 64;
		arg0.anInt6632 += (local40 - arg0.anInt6632) / local17;
		arg0.anInt6631 += (local28 - arg0.anInt6631) / local17;
		arg0.anInt5417 = 0;
		if (arg0.anInt5397 == 0) {
			arg0.method4811(8192);
		}
		if (arg0.anInt5397 == 1) {
			arg0.method4811(12288);
		}
		if (arg0.anInt5397 == 2) {
			arg0.method4811(0);
		}
		if (arg0.anInt5397 == 3) {
			arg0.method4811(4096);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!ij;Lclient!ea;B)V")
	public static void method3126(@OriginalArg(0) Class93 arg0, @OriginalArg(1) Class55 arg1) {
		@Pc(8) Class100[] local8 = Static363.method2681(arg0, Static57.anInt5922);
		Static11.aClass95Array2 = new Class95[local8.length];
		for (@Pc(14) int local14 = 0; local14 < local8.length; local14++) {
			Static11.aClass95Array2[local14] = arg1.method5229(local8[local14]);
		}
		local8 = Static363.method2681(arg0, Static72.anInt1380);
		Static254.aClass95Array13 = new Class95[local8.length];
		for (@Pc(40) int local40 = 0; local40 < local8.length; local40++) {
			Static254.aClass95Array13[local40] = arg1.method5229(local8[local40]);
		}
		local8 = Static363.method2681(arg0, Static230.anInt4649);
		Static318.aClass95Array17 = new Class95[local8.length];
		for (@Pc(70) int local70 = 0; local70 < local8.length; local70++) {
			Static318.aClass95Array17[local70] = arg1.method5229(local8[local70]);
		}
		local8 = Static363.method2681(arg0, Static157.anInt3039);
		Static124.aClass95Array8 = new Class95[local8.length];
		for (@Pc(100) int local100 = 0; local100 < local8.length; local100++) {
			Static124.aClass95Array8[local100] = arg1.method5229(local8[local100]);
		}
		local8 = Static363.method2681(arg0, Static160.anInt3176);
		Static144.aClass95Array10 = new Class95[local8.length];
		for (@Pc(126) int local126 = 0; local126 < local8.length; local126++) {
			Static144.aClass95Array10[local126] = arg1.method5229(local8[local126]);
		}
		local8 = Static363.method2681(arg0, Static176.anInt3502);
		Static50.aClass95Array5 = new Class95[local8.length];
		for (@Pc(156) int local156 = 0; local156 < local8.length; local156++) {
			Static50.aClass95Array5[local156] = arg1.method5229(local8[local156]);
		}
		local8 = Static363.method2681(arg0, Static168.anInt3372);
		Static24.aClass95Array16 = new Class95[local8.length];
		for (@Pc(182) int local182 = 0; local182 < local8.length; local182++) {
			Static24.aClass95Array16[local182] = arg1.method5229(local8[local182]);
		}
		local8 = Static363.method2681(arg0, Static37.anInt673);
		Static2.aClass95Array6 = new Class95[local8.length];
		for (@Pc(212) int local212 = 0; local212 < local8.length; local212++) {
			Static2.aClass95Array6[local212] = arg1.method5229(local8[local212]);
		}
		local8 = Static363.method2681(arg0, Static278.anInt5476);
		Static333.aClass95Array18 = new Class95[local8.length];
		for (@Pc(242) int local242 = 0; local242 < local8.length; local242++) {
			Static333.aClass95Array18[local242] = arg1.method5229(local8[local242]);
		}
		local8 = Static363.method2681(arg0, Static207.anInt4110);
		Static287.aClass95Array14 = new Class95[local8.length];
		for (@Pc(272) int local272 = 0; local272 < local8.length; local272++) {
			Static287.aClass95Array14[local272] = arg1.method5229(local8[local272]);
		}
		local8 = Static363.method2681(arg0, Static69.anInt1360);
		Static20.aClass95Array3 = new Class95[local8.length];
		for (@Pc(302) int local302 = 0; local302 < local8.length; local302++) {
			Static20.aClass95Array3[local302] = arg1.method5229(local8[local302]);
		}
		local8 = Static363.method2681(arg0, Static178.anInt3526);
		Static132.aClass95Array9 = new Class95[local8.length];
		for (@Pc(328) int local328 = 0; local328 < local8.length; local328++) {
			Static132.aClass95Array9[local328] = arg1.method5229(local8[local328]);
		}
		local8 = Static363.method2681(arg0, Static167.anInt3341);
		Static203.aClass95Array12 = new Class95[local8.length];
		for (@Pc(363) int local363 = 0; local363 < local8.length; local363++) {
			Static203.aClass95Array12[local363] = arg1.method5229(local8[local363]);
		}
		Static86.aClass95_6 = arg1.method5229(Static363.method2672(arg0, Static54.anInt997, 0));
	}
}
