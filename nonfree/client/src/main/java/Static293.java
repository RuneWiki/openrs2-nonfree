import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!jp", name = "i", descriptor = "[[S")
	public static short[][] aShortArrayArray7;

	@OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
	public static final int anInt5673 = 4;

	@OriginalMember(owner = "client!jp", name = "h", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_105 = new Class359(108, -1);

	@OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
	public static int anInt5675 = -1;

	@OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
	public static final int[] anIntArray312 = new int[25];

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	public static void method4685() {
		Static69.aClass97_5.method2402();
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
	public static void method4686(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static581.anInt9529 == 2) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[0]);
				Static393.aClass204Array1[1].method5077(Static198.aClass289Array2[1]);
			} else if (Static581.anInt9529 == 3) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[0]);
				Static393.aClass204Array1[1].method5077(Static198.aClass289Array2[1]);
				Static393.aClass204Array1[2].method5077(Static198.aClass289Array2[2]);
			} else {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[0]);
				Static393.aClass204Array1[1].method5077(Static198.aClass289Array2[1]);
				Static393.aClass204Array1[2].method5077(Static198.aClass289Array2[2]);
				Static393.aClass204Array1[3].method5077(Static198.aClass289Array2[3]);
			}
		} else if (arg0 == 1) {
			if (Static581.anInt9529 == 2) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[2]);
			} else if (Static581.anInt9529 == 3) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[3]);
				Static393.aClass204Array1[1].method5077(Static198.aClass289Array2[4]);
			} else {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[4]);
				Static393.aClass204Array1[1].method5077(Static198.aClass289Array2[5]);
				Static393.aClass204Array1[2].method5077(Static198.aClass289Array2[6]);
			}
		} else if (arg0 == 2) {
			if (Static581.anInt9529 == 2) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[3]);
				return;
			}
			if (Static581.anInt9529 == 3) {
				Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[5]);
				return;
			}
			Static393.aClass204Array1[0].method5077(Static198.aClass289Array2[7]);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)I")
	public static int method4687(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static105.anInt2259 == -1) {
			return 1;
		}
		if (arg1 != Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616()) {
			Static656.method8802(true, arg1, Static64.aClass52_13.method907(Static544.anInt8937));
			if (Static172.aClass5_Sub50_14.aClass12_Sub16_2.method3616() != arg1) {
				return -1;
			}
		}
		try {
			@Pc(38) Dimension local38 = Static141.aCanvas7.getSize();
			Static270.method4168(Static64.aClass52_13.method907(Static544.anInt8937), Static208.aClass65_7, Static604.aClass73_15, true, Static247.aClass247_16);
			@Pc(54) Class329 local54 = Static347.method5290(Static105.anInt2259, Static676.aClass390_129);
			@Pc(57) long local57 = Static547.method7619();
			Static208.aClass65_7.la();
			Static546.aClass254_8.method7361(0, Static558.anInt7322, 0);
			Static208.aClass65_7.method6891(Static546.aClass254_8);
			Static208.aClass65_7.DA(local38.width / 2, local38.height / 2, 512, 512);
			Static208.aClass65_7.xa(1.0F);
			Static208.aClass65_7.ZA(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			@Pc(103) Class153 local103 = Static208.aClass65_7.method6964(local54, 2048, 64, 64, 768);
			@Pc(105) int local105 = 0;
			label41: for (@Pc(107) int local107 = 0; local107 < 500; local107++) {
				Static208.aClass65_7.GA(0);
				Static208.aClass65_7.ya();
				for (@Pc(115) int local115 = 15; local115 >= 0; local115--) {
					for (@Pc(118) int local118 = 0; local118 <= local115; local118++) {
						Static109.aClass254_2.method7361((int) ((-((float) local115 / 2.0F) + (float) local118) * (float) Static671.anInt10769), 0, Static671.anInt10769 * (local115 + 1));
						local103.method8585(Static109.aClass254_2, (Class28_Sub9) null, 0);
						local105++;
						if ((long) arg0 <= Static547.method7619() - local57) {
							break label41;
						}
					}
				}
			}
			Static208.aClass65_7.method6910();
			@Pc(178) long local178 = (long) (local105 * 1000) / (Static547.method7619() - local57);
			Static208.aClass65_7.GA(0);
			Static208.aClass65_7.ya();
			return (int) local178;
		} catch (@Pc(187) Throwable local187) {
			local187.printStackTrace();
			return -1;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ[B)V")
	public static void method4689(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static342.aClass5_Sub41_4 == null) {
			Static342.aClass5_Sub41_4 = new Class5_Sub41(20000);
		}
		Static342.aClass5_Sub41_4.method7837(0, arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static190.method4435(Static342.aClass5_Sub41_4.aByteArray93);
		Static394.aClass6_Sub1Array2 = new Class6_Sub1[Static443.anInt7640];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static465.anInt7847; local37 <= Static7.anInt114; local37++) {
			@Pc(43) Class6_Sub1 local43 = Static603.method8261(local37);
			if (local43 != null) {
				Static394.aClass6_Sub1Array2[local35++] = local43;
			}
		}
		Static133.aBoolean233 = false;
		Static421.aLong199 = Static547.method7619();
		Static342.aClass5_Sub41_4 = null;
	}
}
