import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public abstract class Class18 {

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "[I")
	public static final int[] anIntArray546 = new int[128];

	@OriginalMember(owner = "client!hba", name = "m", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
	private int anInt10309 = 4;

	@OriginalMember(owner = "client!hba", name = "g", descriptor = "I")
	private int anInt10311 = 4;

	@OriginalMember(owner = "client!hba", name = "h", descriptor = "I")
	private int anInt10312 = 0;

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "[S")
	private final short[] aShortArray137 = new short[512];

	@OriginalMember(owner = "client!hba", name = "n", descriptor = "I")
	private int anInt10316 = 4;

	@OriginalMember(owner = "client!hba", name = "j", descriptor = "I")
	protected int anInt10314 = 4;

	static {
		for (@Pc(145) int local145 = 0; local145 < anIntArray546.length; local145++) {
			anIntArray546[local145] = -1;
		}
		for (@Pc(161) int local161 = 65; local161 <= 90; local161++) {
			anIntArray546[local161] = local161 - 65;
		}
		for (@Pc(174) int local174 = 97; local174 <= 122; local174++) {
			anIntArray546[local174] = local174 + 26 - 97;
		}
		for (@Pc(191) int local191 = 48; local191 <= 57; local191++) {
			anIntArray546[local191] = local191 + 52 - 48;
		}
		anIntArray546[45] = anIntArray546[47] = 63;
		anIntArray546[42] = anIntArray546[43] = 62;
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(IIIII)V")
	protected Class18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10312 = arg0;
		this.anInt10309 = arg3;
		this.anInt10314 = arg1;
		this.anInt10311 = arg4;
		this.anInt10316 = arg2;
		this.method8419();
		this.method8418();
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	protected abstract void method8415();

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIZI)V")
	protected final void method8416() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(36) int local36 = 0; local36 < 128; local36++) {
			local11[local36] = (local36 << 12) / 128;
		}
		for (@Pc(52) int local52 = 0; local52 < 16; local52++) {
			local14[local52] = (local52 << 12) / 16;
		}
		this.method8415();
		for (@Pc(71) int local71 = 0; local71 < 16; local71++) {
			for (@Pc(75) int local75 = 0; local75 < 128; local75++) {
				for (@Pc(79) int local79 = 0; local79 < 128; local79++) {
					for (@Pc(83) int local83 = 0; local83 < this.anInt10314; local83++) {
						@Pc(92) int local92 = this.aShortArray138[local83] << 12;
						@Pc(99) int local99 = this.anInt10316 * local92 >> 12;
						@Pc(107) int local107 = local92 * local14[local71] >> 12;
						@Pc(115) int local115 = local8[local79] * local92 >> 12;
						@Pc(122) int local122 = this.anInt10311 * local92 >> 12;
						@Pc(130) int local130 = local92 * local11[local75] >> 12;
						@Pc(137) int local137 = local92 * this.anInt10309 >> 12;
						@Pc(142) int local142 = local130 * this.anInt10309;
						@Pc(147) int local147 = local107 * this.anInt10311;
						@Pc(152) int local152 = local115 * this.anInt10316;
						@Pc(156) int local156 = local152 >> 12;
						@Pc(160) int local160 = local156 + 1;
						@Pc(164) int local164 = local142 >> 12;
						@Pc(168) int local168 = local156 & 0xFF;
						@Pc(172) int local172 = local164 + 1;
						@Pc(176) int local176 = local147 >> 12;
						@Pc(180) int local180 = local164 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						if (local160 >= local99) {
							local160 = 0;
						} else {
							local160 &= 0xFF;
						}
						if (local172 < local137) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						local130 = local142 & 0xFFF;
						if (local184 >= local122) {
							local184 = 0;
						} else {
							local184 &= 0xFF;
						}
						local176 &= 0xFF;
						local107 = local147 & 0xFFF;
						local115 = local152 & 0xFFF;
						@Pc(241) int local241 = local115 - 4096;
						@Pc(245) int local245 = Class268.anIntArray386[local107];
						@Pc(250) short local250 = this.aShortArray137[local176];
						@Pc(254) int local254 = Class268.anIntArray386[local115];
						@Pc(258) int local258 = local130 - 4096;
						@Pc(263) short local263 = this.aShortArray137[local184];
						@Pc(267) int local267 = Class268.anIntArray386[local130];
						@Pc(271) int local271 = local107 - 4096;
						@Pc(279) short local279 = this.aShortArray137[local180 + local250];
						@Pc(286) short local286 = this.aShortArray137[local172 + local263];
						@Pc(293) short local293 = this.aShortArray137[local263 + local180];
						@Pc(300) short local300 = this.aShortArray137[local250 + local172];
						@Pc(313) int local313 = Static278.method4063(this.aShortArray137[local168 + local279], local130, local115, local107);
						@Pc(326) int local326 = Static278.method4063(this.aShortArray137[local160 + local279], local130, local241, local107);
						@Pc(337) int local337 = ((local326 - local313) * local254 >> 12) + local313;
						@Pc(349) int local349 = Static278.method4063(this.aShortArray137[local300 + local168], local258, local115, local107);
						@Pc(362) int local362 = Static278.method4063(this.aShortArray137[local160 + local300], local258, local241, local107);
						@Pc(372) int local372 = local349 + ((local362 - local349) * local254 >> 12);
						@Pc(383) int local383 = local337 + (local267 * (local372 - local337) >> 12);
						@Pc(395) int local395 = Static278.method4063(this.aShortArray137[local293 + local168], local130, local115, local271);
						@Pc(407) int local407 = Static278.method4063(this.aShortArray137[local293 + local160], local130, local241, local271);
						@Pc(418) int local418 = ((local407 - local395) * local254 >> 12) + local395;
						@Pc(430) int local430 = Static278.method4063(this.aShortArray137[local286 + local168], local258, local115, local271);
						@Pc(442) int local442 = Static278.method4063(this.aShortArray137[local286 + local160], local258, local241, local271);
						@Pc(453) int local453 = (local254 * (local442 - local430) >> 12) + local430;
						@Pc(465) int local465 = local418 + ((local453 - local418) * local267 >> 12);
						this.method8420(local83, local383 + (local245 * (local465 - local383) >> 12));
					}
					this.method8417();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	protected abstract void method8417();

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
	private void method8418() {
		@Pc(17) Random local17 = new Random((long) this.anInt10312);
		for (@Pc(19) int local19 = 0; local19 < 255; local19++) {
			this.aShortArray137[local19] = (short) local19;
		}
		for (@Pc(35) int local35 = 0; local35 < 255; local35++) {
			@Pc(41) int local41 = 255 - local35;
			@Pc(46) int local46 = Static93.method1603(local41, local17);
			@Pc(51) short local51 = this.aShortArray137[local46];
			this.aShortArray137[local46] = this.aShortArray137[local41];
			this.aShortArray137[local41] = this.aShortArray137[local41 + 256] = local51;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
	private void method8419() {
		this.aShortArray138 = new short[this.anInt10314];
		for (@Pc(20) int local20 = 0; local20 < this.anInt10314; local20++) {
			this.aShortArray138[local20] = (short) (int) Math.pow(2.0D, (double) local20);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIB)V")
	protected abstract void method8420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
