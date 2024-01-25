import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ni")
public final class Class1_Sub2_Sub25 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ni", name = "N", descriptor = "[[I")
	private int[][] anIntArrayArray50;

	@OriginalMember(owner = "client!ni", name = "I", descriptor = "[I")
	private final int[] anIntArray504 = new int[257];

	static {
		new Class169("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub25() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 != 0) {
			return;
		}
		@Pc(14) int local14 = arg1.method5174();
		if (local14 != 0) {
			this.method3322(local14);
			return;
		}
		this.anIntArrayArray50 = new int[arg1.method5174()][4];
		for (@Pc(31) int local31 = 0; local31 < this.anIntArrayArray50.length; local31++) {
			this.anIntArrayArray50[local31][0] = arg1.method5177();
			this.anIntArrayArray50[local31][1] = arg1.method5174() << 4;
			this.anIntArrayArray50[local31][2] = arg1.method5174() << 4;
			this.anIntArrayArray50[local31][3] = arg1.method5174() << 4;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(IB)V")
	private void method3322(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray50 = new int[2][4];
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[1][0] = 4096;
			this.anIntArrayArray50[1][1] = 4096;
			this.anIntArrayArray50[1][3] = 4096;
			this.anIntArrayArray50[1][2] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray50 = new int[8][4];
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][2] = 2602;
			this.anIntArrayArray50[0][3] = 2361;
			this.anIntArrayArray50[0][1] = 2650;
			this.anIntArrayArray50[1][3] = 1558;
			this.anIntArrayArray50[1][0] = 2867;
			this.anIntArrayArray50[1][2] = 1799;
			this.anIntArrayArray50[1][1] = 2313;
			this.anIntArrayArray50[2][0] = 3072;
			this.anIntArrayArray50[2][1] = 2618;
			this.anIntArrayArray50[2][3] = 1413;
			this.anIntArrayArray50[2][2] = 1734;
			this.anIntArrayArray50[3][2] = 1220;
			this.anIntArrayArray50[3][1] = 2296;
			this.anIntArrayArray50[3][0] = 3276;
			this.anIntArrayArray50[3][3] = 947;
			this.anIntArrayArray50[4][0] = 3481;
			this.anIntArrayArray50[4][3] = 722;
			this.anIntArrayArray50[4][1] = 2072;
			this.anIntArrayArray50[4][2] = 963;
			this.anIntArrayArray50[5][0] = 3686;
			this.anIntArrayArray50[5][3] = 1766;
			this.anIntArrayArray50[5][2] = 2152;
			this.anIntArrayArray50[5][1] = 2730;
			this.anIntArrayArray50[6][2] = 1060;
			this.anIntArrayArray50[6][1] = 2232;
			this.anIntArrayArray50[6][3] = 915;
			this.anIntArrayArray50[6][0] = 3891;
			this.anIntArrayArray50[7][1] = 1686;
			this.anIntArrayArray50[7][3] = 1140;
			this.anIntArrayArray50[7][0] = 4096;
			this.anIntArrayArray50[7][2] = 1413;
		} else if (arg0 == 3) {
			this.anIntArrayArray50 = new int[7][4];
			this.anIntArrayArray50[0][3] = 4096;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[1][3] = 4096;
			this.anIntArrayArray50[1][1] = 0;
			this.anIntArrayArray50[1][0] = 663;
			this.anIntArrayArray50[1][2] = 4096;
			this.anIntArrayArray50[2][2] = 4096;
			this.anIntArrayArray50[2][0] = 1363;
			this.anIntArrayArray50[2][1] = 0;
			this.anIntArrayArray50[2][3] = 0;
			this.anIntArrayArray50[3][1] = 4096;
			this.anIntArrayArray50[3][0] = 2048;
			this.anIntArrayArray50[3][2] = 4096;
			this.anIntArrayArray50[3][3] = 0;
			this.anIntArrayArray50[4][1] = 4096;
			this.anIntArrayArray50[4][2] = 0;
			this.anIntArrayArray50[4][3] = 0;
			this.anIntArrayArray50[4][0] = 2727;
			this.anIntArrayArray50[5][0] = 3411;
			this.anIntArrayArray50[5][2] = 0;
			this.anIntArrayArray50[5][1] = 4096;
			this.anIntArrayArray50[5][3] = 4096;
			this.anIntArrayArray50[6][3] = 4096;
			this.anIntArrayArray50[6][2] = 0;
			this.anIntArrayArray50[6][0] = 4096;
			this.anIntArrayArray50[6][1] = 0;
		} else if (arg0 == 4) {
			this.anIntArrayArray50 = new int[6][4];
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][2] = 0;
			this.anIntArrayArray50[1][2] = 0;
			this.anIntArrayArray50[1][1] = 0;
			this.anIntArrayArray50[1][3] = 1493;
			this.anIntArrayArray50[1][0] = 1843;
			this.anIntArrayArray50[2][3] = 2939;
			this.anIntArrayArray50[2][2] = 0;
			this.anIntArrayArray50[2][0] = 2457;
			this.anIntArrayArray50[2][1] = 0;
			this.anIntArrayArray50[3][3] = 3565;
			this.anIntArrayArray50[3][2] = 1124;
			this.anIntArrayArray50[3][1] = 0;
			this.anIntArrayArray50[3][0] = 2781;
			this.anIntArrayArray50[4][2] = 3084;
			this.anIntArrayArray50[4][3] = 4031;
			this.anIntArrayArray50[4][1] = 546;
			this.anIntArrayArray50[4][0] = 3481;
			this.anIntArrayArray50[5][0] = 4096;
			this.anIntArrayArray50[5][1] = 4096;
			this.anIntArrayArray50[5][2] = 4096;
			this.anIntArrayArray50[5][3] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray50 = new int[16][4];
			this.anIntArrayArray50[0][1] = 80;
			this.anIntArrayArray50[0][0] = 0;
			this.anIntArrayArray50[0][3] = 321;
			this.anIntArrayArray50[0][2] = 192;
			this.anIntArrayArray50[1][1] = 321;
			this.anIntArrayArray50[1][2] = 449;
			this.anIntArrayArray50[1][3] = 562;
			this.anIntArrayArray50[1][0] = 155;
			this.anIntArrayArray50[2][2] = 690;
			this.anIntArrayArray50[2][3] = 803;
			this.anIntArrayArray50[2][0] = 389;
			this.anIntArrayArray50[2][1] = 578;
			this.anIntArrayArray50[3][3] = 1140;
			this.anIntArrayArray50[3][1] = 947;
			this.anIntArrayArray50[3][0] = 671;
			this.anIntArrayArray50[3][2] = 995;
			this.anIntArrayArray50[4][1] = 1285;
			this.anIntArrayArray50[4][2] = 1397;
			this.anIntArrayArray50[4][0] = 897;
			this.anIntArrayArray50[4][3] = 1509;
			this.anIntArrayArray50[5][2] = 1429;
			this.anIntArrayArray50[5][3] = 1413;
			this.anIntArrayArray50[5][1] = 1525;
			this.anIntArrayArray50[5][0] = 1175;
			this.anIntArrayArray50[6][2] = 1461;
			this.anIntArrayArray50[6][3] = 1333;
			this.anIntArrayArray50[6][1] = 1734;
			this.anIntArrayArray50[6][0] = 1368;
			this.anIntArrayArray50[7][0] = 1507;
			this.anIntArrayArray50[7][3] = 1702;
			this.anIntArrayArray50[7][2] = 1525;
			this.anIntArrayArray50[7][1] = 1413;
			this.anIntArrayArray50[8][1] = 1108;
			this.anIntArrayArray50[8][0] = 1736;
			this.anIntArrayArray50[8][3] = 2056;
			this.anIntArrayArray50[8][2] = 1590;
			this.anIntArrayArray50[9][2] = 2056;
			this.anIntArrayArray50[9][3] = 2666;
			this.anIntArrayArray50[9][0] = 2088;
			this.anIntArrayArray50[9][1] = 1766;
			this.anIntArrayArray50[10][3] = 3276;
			this.anIntArrayArray50[10][2] = 2586;
			this.anIntArrayArray50[10][0] = 2355;
			this.anIntArrayArray50[10][1] = 2409;
			this.anIntArrayArray50[11][0] = 2691;
			this.anIntArrayArray50[11][3] = 3228;
			this.anIntArrayArray50[11][2] = 3148;
			this.anIntArrayArray50[11][1] = 3116;
			this.anIntArrayArray50[12][2] = 3710;
			this.anIntArrayArray50[12][1] = 3806;
			this.anIntArrayArray50[12][3] = 3196;
			this.anIntArrayArray50[12][0] = 3031;
			this.anIntArrayArray50[13][2] = 3421;
			this.anIntArrayArray50[13][1] = 3437;
			this.anIntArrayArray50[13][3] = 3019;
			this.anIntArrayArray50[13][0] = 3522;
			this.anIntArrayArray50[14][3] = 3228;
			this.anIntArrayArray50[14][0] = 3727;
			this.anIntArrayArray50[14][1] = 3116;
			this.anIntArrayArray50[14][2] = 3148;
			this.anIntArrayArray50[15][2] = 2505;
			this.anIntArrayArray50[15][1] = 2377;
			this.anIntArrayArray50[15][3] = 2746;
			this.anIntArrayArray50[15][0] = 4096;
		} else if (arg0 == 6) {
			this.anIntArrayArray50 = new int[4][4];
			this.anIntArrayArray50[0][0] = 2048;
			this.anIntArrayArray50[0][3] = 0;
			this.anIntArrayArray50[0][1] = 0;
			this.anIntArrayArray50[0][2] = 4096;
			this.anIntArrayArray50[1][1] = 4096;
			this.anIntArrayArray50[1][3] = 0;
			this.anIntArrayArray50[1][0] = 2867;
			this.anIntArrayArray50[1][2] = 4096;
			this.anIntArrayArray50[2][0] = 3276;
			this.anIntArrayArray50[2][3] = 0;
			this.anIntArrayArray50[2][2] = 4096;
			this.anIntArrayArray50[2][1] = 4096;
			this.anIntArrayArray50[3][2] = 0;
			this.anIntArrayArray50[3][3] = 0;
			this.anIntArrayArray50[3][1] = 4096;
			this.anIntArrayArray50[3][0] = 4096;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!ni", name = "b", descriptor = "(B)V")
	private void method3323() {
		@Pc(9) int local9 = this.anIntArrayArray50.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < 257; local16++) {
			@Pc(20) int local20 = 0;
			@Pc(24) int local24 = local16 << 4;
			for (@Pc(26) int local26 = 0; local9 > local26 && this.anIntArrayArray50[local26][0] <= local24; local26++) {
				local20++;
			}
			@Pc(67) int local67;
			@Pc(63) int local63;
			@Pc(71) int local71;
			@Pc(59) int[] local59;
			if (local9 <= local20) {
				local59 = this.anIntArrayArray50[local9 - 1];
				local63 = local59[2];
				local67 = local59[1];
				local71 = local59[3];
			} else {
				local59 = this.anIntArrayArray50[local20];
				if (local20 > 0) {
					@Pc(90) int[] local90 = this.anIntArrayArray50[local20 - 1];
					@Pc(108) int local108 = (local24 - local90[0] << 12) / (local59[0] - local90[0]);
					@Pc(113) int local113 = 4096 - local108;
					local71 = local108 * local59[3] + local90[3] * local113 >> 12;
					local67 = local113 * local90[1] + local108 * local59[1] >> 12;
					local63 = local113 * local90[2] + local108 * local59[2] >> 12;
				} else {
					local63 = local59[2];
					local67 = local59[1];
					local71 = local59[3];
				}
			}
			local63 >>= 0x4;
			local71 >>= 0x4;
			local67 >>= 0x4;
			if (local63 < 0) {
				local63 = 0;
			} else if (local63 > 255) {
				local63 = 255;
			}
			if (local67 < 0) {
				local67 = 0;
			} else if (local67 > 255) {
				local67 = 255;
			}
			if (local71 < 0) {
				local71 = 0;
			} else if (local71 > 255) {
				local71 = 255;
			}
			this.anIntArray504[local16] = local71 | local67 << 16 | local63 << 8;
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(27) int[] local27 = this.method5510(arg0, 0);
			@Pc(31) int[] local31 = local15[0];
			@Pc(35) int[] local35 = local15[1];
			@Pc(39) int[] local39 = local15[2];
			for (@Pc(41) int local41 = 0; local41 < Static158.anInt2658; local41++) {
				@Pc(49) int local49 = local27[local41] >> 4;
				if (local49 < 0) {
					local49 = 0;
				}
				if (local49 > 256) {
					local49 = 256;
				}
				local49 = this.anIntArray504[local49];
				local31[local41] = local49 >> 12 & 0xFF0;
				local35[local41] = local49 >> 4 & 0xFF0;
				local39[local41] = (local49 & 0xFF) << 4;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
	@Override
	public void method5505() {
		if (this.anIntArrayArray50 == null) {
			this.method3322(1);
		}
		this.method3323();
	}
}
