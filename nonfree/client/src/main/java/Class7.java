import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public abstract class Class7 {

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
	private int anInt6457 = 0;

	@OriginalMember(owner = "client!jea", name = "i", descriptor = "I")
	private int anInt6459 = 4;

	@OriginalMember(owner = "client!jea", name = "j", descriptor = "I")
	private int anInt6460 = 4;

	@OriginalMember(owner = "client!jea", name = "g", descriptor = "I")
	private int anInt6458 = 4;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
	protected int anInt6454 = 4;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "[S")
	private final short[] aShortArray100 = new short[512];

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(IIIII)V")
	protected Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6458 = arg2;
		this.anInt6457 = arg0;
		this.anInt6459 = arg4;
		this.anInt6454 = arg1;
		this.anInt6460 = arg3;
		this.method5798();
		this.method5799();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
	protected abstract void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IIZI)V")
	protected final void method5797() {
		@Pc(6) int[] local6 = new int[128];
		@Pc(9) int[] local9 = new int[128];
		@Pc(12) int[] local12 = new int[16];
		for (@Pc(14) int local14 = 0; local14 < 128; local14++) {
			local6[local14] = (local14 << 12) / 128;
		}
		for (@Pc(29) int local29 = 0; local29 < 128; local29++) {
			local9[local29] = (local29 << 12) / 128;
		}
		for (@Pc(48) int local48 = 0; local48 < 16; local48++) {
			local12[local48] = (local48 << 12) / 16;
		}
		this.method5800();
		for (@Pc(70) int local70 = 0; local70 < 16; local70++) {
			for (@Pc(73) int local73 = 0; local73 < 128; local73++) {
				for (@Pc(76) int local76 = 0; local76 < 128; local76++) {
					for (@Pc(79) int local79 = 0; local79 < this.anInt6454; local79++) {
						@Pc(87) int local87 = this.aShortArray101[local79] << 12;
						@Pc(94) int local94 = local87 * this.anInt6460 >> 12;
						@Pc(101) int local101 = local87 * this.anInt6459 >> 12;
						@Pc(108) int local108 = local87 * this.anInt6458 >> 12;
						@Pc(116) int local116 = local6[local76] * local87 >> 12;
						@Pc(124) int local124 = local9[local73] * local87 >> 12;
						@Pc(132) int local132 = local87 * local12[local70] >> 12;
						@Pc(137) int local137 = local132 * this.anInt6459;
						@Pc(142) int local142 = local124 * this.anInt6460;
						@Pc(147) int local147 = local116 * this.anInt6458;
						@Pc(151) int local151 = local147 >> 12;
						@Pc(155) int local155 = local151 + 1;
						@Pc(159) int local159 = local142 >> 12;
						@Pc(163) int local163 = local151 & 0xFF;
						@Pc(167) int local167 = local159 + 1;
						@Pc(171) int local171 = local159 & 0xFF;
						@Pc(175) int local175 = local137 >> 12;
						@Pc(179) int local179 = local175 + 1;
						@Pc(183) int local183 = local175 & 0xFF;
						if (local167 >= local94) {
							local167 = 0;
						} else {
							local167 &= 0xFF;
						}
						if (local108 <= local155) {
							local155 = 0;
						} else {
							local155 &= 0xFF;
						}
						if (local179 >= local101) {
							local179 = 0;
						} else {
							local179 &= 0xFF;
						}
						local116 = local147 & 0xFFF;
						local124 = local142 & 0xFFF;
						local132 = local137 & 0xFFF;
						@Pc(241) int local241 = local124 - 4096;
						@Pc(246) short local246 = this.aShortArray100[local179];
						@Pc(250) int local250 = Class5_Sub5_Sub8_Sub2.anIntArray563[local132];
						@Pc(254) int local254 = Class5_Sub5_Sub8_Sub2.anIntArray563[local124];
						@Pc(258) int local258 = local132 - 4096;
						@Pc(262) int local262 = Class5_Sub5_Sub8_Sub2.anIntArray563[local116];
						@Pc(267) short local267 = this.aShortArray100[local183];
						@Pc(271) int local271 = local116 - 4096;
						@Pc(278) short local278 = this.aShortArray100[local167 + local246];
						@Pc(285) short local285 = this.aShortArray100[local267 + local171];
						@Pc(292) short local292 = this.aShortArray100[local246 + local171];
						@Pc(300) short local300 = this.aShortArray100[local167 + local267];
						@Pc(312) int local312 = Static485.method7189(local132, local124, local116, this.aShortArray100[local285 + local163]);
						@Pc(324) int local324 = Static485.method7189(local132, local124, local271, this.aShortArray100[local155 + local285]);
						@Pc(335) int local335 = (local262 * (local324 - local312) >> 12) + local312;
						@Pc(347) int local347 = Static485.method7189(local132, local241, local116, this.aShortArray100[local163 + local300]);
						@Pc(359) int local359 = Static485.method7189(local132, local241, local271, this.aShortArray100[local155 + local300]);
						@Pc(369) int local369 = ((local359 - local347) * local262 >> 12) + local347;
						@Pc(382) int local382 = Static485.method7189(local258, local124, local116, this.aShortArray100[local163 + local292]);
						@Pc(394) int local394 = local335 + ((local369 - local335) * local254 >> 12);
						@Pc(406) int local406 = Static485.method7189(local258, local124, local271, this.aShortArray100[local292 + local155]);
						@Pc(417) int local417 = (local262 * (local406 - local382) >> 12) + local382;
						@Pc(429) int local429 = Static485.method7189(local258, local241, local116, this.aShortArray100[local278 + local163]);
						@Pc(441) int local441 = Static485.method7189(local258, local241, local271, this.aShortArray100[local278 + local155]);
						@Pc(452) int local452 = local429 + (local262 * (local441 - local429) >> 12);
						@Pc(463) int local463 = (local254 * (local452 - local417) >> 12) + local417;
						this.method5795(local79, local394 + (local250 * (local463 - local394) >> 12));
					}
					this.method5801();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(Z)V")
	private void method5798() {
		this.aShortArray101 = new short[this.anInt6454];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6454; local16++) {
			this.aShortArray101[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(B)V")
	private void method5799() {
		@Pc(10) Random local10 = new Random((long) this.anInt6457);
		for (@Pc(12) int local12 = 0; local12 < 255; local12++) {
			this.aShortArray100[local12] = (short) local12;
		}
		for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
			@Pc(31) int local31 = 255 - local25;
			@Pc(36) int local36 = Static130.method1947(local31, local10);
			@Pc(41) short local41 = this.aShortArray100[local36];
			this.aShortArray100[local36] = this.aShortArray100[local31];
			this.aShortArray100[local31] = this.aShortArray100[local31 + 256] = local41;
		}
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)V")
	protected abstract void method5800();

	@OriginalMember(owner = "client!jea", name = "c", descriptor = "(I)V")
	protected abstract void method5801();
}
