import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class1_Sub2_Sub31 extends Class1_Sub2 {

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "[[I")
	private int[][] anIntArrayArray49;

	@OriginalMember(owner = "client!uo", name = "I", descriptor = "[I")
	private final int[] anIntArray480 = new int[257];

	static {
		new Class142(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
		new Class265("", 73);
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub31() {
		super(1, false);
	}

	@OriginalMember(owner = "client!uo", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		if (this.anIntArrayArray49 == null) {
			this.method5322(1);
		}
		this.method5319();
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(B)V")
	private void method5319() {
		@Pc(9) int local9 = this.anIntArrayArray49.length;
		if (local9 <= 0) {
			return;
		}
		for (@Pc(23) int local23 = 0; local23 < 257; local23++) {
			@Pc(27) int local27 = 0;
			@Pc(31) int local31 = local23 << 4;
			for (@Pc(33) int local33 = 0; local9 > local33 && this.anIntArrayArray49[local33][0] <= local31; local33++) {
				local27++;
			}
			@Pc(74) int local74;
			@Pc(70) int local70;
			@Pc(78) int local78;
			@Pc(66) int[] local66;
			if (local9 <= local27) {
				local66 = this.anIntArrayArray49[local9 - 1];
				local70 = local66[2];
				local74 = local66[1];
				local78 = local66[3];
			} else {
				local66 = this.anIntArrayArray49[local27];
				if (local27 <= 0) {
					local74 = local66[1];
					local78 = local66[3];
					local70 = local66[2];
				} else {
					@Pc(108) int[] local108 = this.anIntArrayArray49[local27 - 1];
					@Pc(126) int local126 = (local31 - local108[0] << 12) / (local66[0] - local108[0]);
					@Pc(131) int local131 = 4096 - local126;
					local70 = local108[2] * local131 + local126 * local66[2] >> 12;
					local74 = local131 * local108[1] + local126 * local66[1] >> 12;
					local78 = local66[3] * local126 + local108[3] * local131 >> 12;
				}
			}
			local78 >>= 0x4;
			local70 >>= 0x4;
			local74 >>= 0x4;
			if (local74 < 0) {
				local74 = 0;
			} else if (local74 > 255) {
				local74 = 255;
			}
			if (local78 < 0) {
				local78 = 0;
			} else if (local78 > 255) {
				local78 = 255;
			}
			if (local70 < 0) {
				local70 = 0;
			} else if (local70 > 255) {
				local70 = 255;
			}
			this.anIntArray480[local23] = local78 | local70 << 8 | local74 << 16;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5965(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method1772(arg0);
		if (super.aClass99_41.aBoolean228) {
			@Pc(26) int[] local26 = this.method5964(arg0, 0);
			@Pc(30) int[] local30 = local16[0];
			@Pc(34) int[] local34 = local16[1];
			@Pc(38) int[] local38 = local16[2];
			for (@Pc(40) int local40 = 0; local40 < Static218.anInt3990; local40++) {
				@Pc(48) int local48 = local26[local40] >> 4;
				if (local48 < 0) {
					local48 = 0;
				}
				if (local48 > 256) {
					local48 = 256;
				}
				local48 = this.anIntArray480[local48];
				local30[local40] = local48 >> 12 & 0xFF0;
				local34[local40] = local48 >> 4 & 0xFF0;
				local38[local40] = (local48 & 0xFF) << 4;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V")
	private void method5322(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return;
		}
		if (arg0 == 1) {
			this.anIntArrayArray49 = new int[2][4];
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][0] = 4096;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][1] = 4096;
			this.anIntArrayArray49[1][3] = 4096;
		} else if (arg0 == 2) {
			this.anIntArrayArray49 = new int[8][4];
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 2650;
			this.anIntArrayArray49[0][2] = 2602;
			this.anIntArrayArray49[0][3] = 2361;
			this.anIntArrayArray49[1][3] = 1558;
			this.anIntArrayArray49[1][2] = 1799;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[1][1] = 2313;
			this.anIntArrayArray49[2][0] = 3072;
			this.anIntArrayArray49[2][1] = 2618;
			this.anIntArrayArray49[2][2] = 1734;
			this.anIntArrayArray49[2][3] = 1413;
			this.anIntArrayArray49[3][3] = 947;
			this.anIntArrayArray49[3][2] = 1220;
			this.anIntArrayArray49[3][0] = 3276;
			this.anIntArrayArray49[3][1] = 2296;
			this.anIntArrayArray49[4][3] = 722;
			this.anIntArrayArray49[4][1] = 2072;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[4][2] = 963;
			this.anIntArrayArray49[5][2] = 2152;
			this.anIntArrayArray49[5][1] = 2730;
			this.anIntArrayArray49[5][0] = 3686;
			this.anIntArrayArray49[5][3] = 1766;
			this.anIntArrayArray49[6][1] = 2232;
			this.anIntArrayArray49[6][2] = 1060;
			this.anIntArrayArray49[6][0] = 3891;
			this.anIntArrayArray49[6][3] = 915;
			this.anIntArrayArray49[7][2] = 1413;
			this.anIntArrayArray49[7][3] = 1140;
			this.anIntArrayArray49[7][0] = 4096;
			this.anIntArrayArray49[7][1] = 1686;
		} else if (arg0 == 3) {
			this.anIntArrayArray49 = new int[7][4];
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][3] = 4096;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][3] = 4096;
			this.anIntArrayArray49[1][0] = 663;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[2][0] = 1363;
			this.anIntArrayArray49[3][1] = 4096;
			this.anIntArrayArray49[3][0] = 2048;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[3][2] = 4096;
			this.anIntArrayArray49[4][2] = 0;
			this.anIntArrayArray49[4][0] = 2727;
			this.anIntArrayArray49[4][3] = 0;
			this.anIntArrayArray49[4][1] = 4096;
			this.anIntArrayArray49[5][1] = 4096;
			this.anIntArrayArray49[5][2] = 0;
			this.anIntArrayArray49[5][0] = 3411;
			this.anIntArrayArray49[5][3] = 4096;
			this.anIntArrayArray49[6][1] = 0;
			this.anIntArrayArray49[6][0] = 4096;
			this.anIntArrayArray49[6][2] = 0;
			this.anIntArrayArray49[6][3] = 4096;
		} else if (arg0 == 4) {
			this.anIntArrayArray49 = new int[6][4];
			this.anIntArrayArray49[0][2] = 0;
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[1][2] = 0;
			this.anIntArrayArray49[1][1] = 0;
			this.anIntArrayArray49[1][3] = 1493;
			this.anIntArrayArray49[1][0] = 1843;
			this.anIntArrayArray49[2][2] = 0;
			this.anIntArrayArray49[2][3] = 2939;
			this.anIntArrayArray49[2][0] = 2457;
			this.anIntArrayArray49[2][1] = 0;
			this.anIntArrayArray49[3][1] = 0;
			this.anIntArrayArray49[3][2] = 1124;
			this.anIntArrayArray49[3][0] = 2781;
			this.anIntArrayArray49[3][3] = 3565;
			this.anIntArrayArray49[4][3] = 4031;
			this.anIntArrayArray49[4][1] = 546;
			this.anIntArrayArray49[4][0] = 3481;
			this.anIntArrayArray49[4][2] = 3084;
			this.anIntArrayArray49[5][3] = 4096;
			this.anIntArrayArray49[5][0] = 4096;
			this.anIntArrayArray49[5][1] = 4096;
			this.anIntArrayArray49[5][2] = 4096;
		} else if (arg0 == 5) {
			this.anIntArrayArray49 = new int[16][4];
			this.anIntArrayArray49[0][3] = 321;
			this.anIntArrayArray49[0][0] = 0;
			this.anIntArrayArray49[0][2] = 192;
			this.anIntArrayArray49[0][1] = 80;
			this.anIntArrayArray49[1][0] = 155;
			this.anIntArrayArray49[1][2] = 449;
			this.anIntArrayArray49[1][3] = 562;
			this.anIntArrayArray49[1][1] = 321;
			this.anIntArrayArray49[2][2] = 690;
			this.anIntArrayArray49[2][3] = 803;
			this.anIntArrayArray49[2][1] = 578;
			this.anIntArrayArray49[2][0] = 389;
			this.anIntArrayArray49[3][2] = 995;
			this.anIntArrayArray49[3][1] = 947;
			this.anIntArrayArray49[3][0] = 671;
			this.anIntArrayArray49[3][3] = 1140;
			this.anIntArrayArray49[4][2] = 1397;
			this.anIntArrayArray49[4][0] = 897;
			this.anIntArrayArray49[4][1] = 1285;
			this.anIntArrayArray49[4][3] = 1509;
			this.anIntArrayArray49[5][0] = 1175;
			this.anIntArrayArray49[5][3] = 1413;
			this.anIntArrayArray49[5][2] = 1429;
			this.anIntArrayArray49[5][1] = 1525;
			this.anIntArrayArray49[6][3] = 1333;
			this.anIntArrayArray49[6][2] = 1461;
			this.anIntArrayArray49[6][0] = 1368;
			this.anIntArrayArray49[6][1] = 1734;
			this.anIntArrayArray49[7][2] = 1525;
			this.anIntArrayArray49[7][0] = 1507;
			this.anIntArrayArray49[7][3] = 1702;
			this.anIntArrayArray49[7][1] = 1413;
			this.anIntArrayArray49[8][2] = 1590;
			this.anIntArrayArray49[8][3] = 2056;
			this.anIntArrayArray49[8][0] = 1736;
			this.anIntArrayArray49[8][1] = 1108;
			this.anIntArrayArray49[9][3] = 2666;
			this.anIntArrayArray49[9][1] = 1766;
			this.anIntArrayArray49[9][2] = 2056;
			this.anIntArrayArray49[9][0] = 2088;
			this.anIntArrayArray49[10][1] = 2409;
			this.anIntArrayArray49[10][0] = 2355;
			this.anIntArrayArray49[10][2] = 2586;
			this.anIntArrayArray49[10][3] = 3276;
			this.anIntArrayArray49[11][1] = 3116;
			this.anIntArrayArray49[11][2] = 3148;
			this.anIntArrayArray49[11][0] = 2691;
			this.anIntArrayArray49[11][3] = 3228;
			this.anIntArrayArray49[12][1] = 3806;
			this.anIntArrayArray49[12][0] = 3031;
			this.anIntArrayArray49[12][3] = 3196;
			this.anIntArrayArray49[12][2] = 3710;
			this.anIntArrayArray49[13][3] = 3019;
			this.anIntArrayArray49[13][1] = 3437;
			this.anIntArrayArray49[13][0] = 3522;
			this.anIntArrayArray49[13][2] = 3421;
			this.anIntArrayArray49[14][1] = 3116;
			this.anIntArrayArray49[14][3] = 3228;
			this.anIntArrayArray49[14][0] = 3727;
			this.anIntArrayArray49[14][2] = 3148;
			this.anIntArrayArray49[15][2] = 2505;
			this.anIntArrayArray49[15][0] = 4096;
			this.anIntArrayArray49[15][1] = 2377;
			this.anIntArrayArray49[15][3] = 2746;
		} else if (arg0 == 6) {
			this.anIntArrayArray49 = new int[4][4];
			this.anIntArrayArray49[0][3] = 0;
			this.anIntArrayArray49[0][1] = 0;
			this.anIntArrayArray49[0][0] = 2048;
			this.anIntArrayArray49[0][2] = 4096;
			this.anIntArrayArray49[1][3] = 0;
			this.anIntArrayArray49[1][2] = 4096;
			this.anIntArrayArray49[1][1] = 4096;
			this.anIntArrayArray49[1][0] = 2867;
			this.anIntArrayArray49[2][1] = 4096;
			this.anIntArrayArray49[2][0] = 3276;
			this.anIntArrayArray49[2][2] = 4096;
			this.anIntArrayArray49[2][3] = 0;
			this.anIntArrayArray49[3][0] = 4096;
			this.anIntArrayArray49[3][1] = 4096;
			this.anIntArrayArray49[3][3] = 0;
			this.anIntArrayArray49[3][2] = 0;
		} else {
			throw new RuntimeException("Invalid gradient preset");
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 0) {
			return;
		}
		@Pc(16) int local16 = arg0.method2915();
		if (local16 != 0) {
			this.method5322(local16);
			return;
		}
		this.anIntArrayArray49 = new int[arg0.method2915()][4];
		for (@Pc(33) int local33 = 0; local33 < this.anIntArrayArray49.length; local33++) {
			this.anIntArrayArray49[local33][0] = arg0.method2896();
			this.anIntArrayArray49[local33][1] = arg0.method2915() << 4;
			this.anIntArrayArray49[local33][2] = arg0.method2915() << 4;
			this.anIntArrayArray49[local33][3] = arg0.method2915() << 4;
		}
	}
}
