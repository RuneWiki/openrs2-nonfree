import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public abstract class Class57 {

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
	private short[] aShortArray125;

	@OriginalMember(owner = "client!os", name = "c", descriptor = "I")
	private int anInt6701 = 4;

	@OriginalMember(owner = "client!os", name = "e", descriptor = "I")
	private int anInt6703 = 4;

	@OriginalMember(owner = "client!os", name = "d", descriptor = "I")
	private int anInt6702 = 0;

	@OriginalMember(owner = "client!os", name = "g", descriptor = "I")
	private int anInt6705 = 4;

	@OriginalMember(owner = "client!os", name = "l", descriptor = "[S")
	private final short[] aShortArray126 = new short[512];

	@OriginalMember(owner = "client!os", name = "k", descriptor = "I")
	protected int anInt6708 = 4;

	@OriginalMember(owner = "client!os", name = "<init>", descriptor = "(IIIII)V", line = 1229)
	protected Class57(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt6705 = arg2;
		this.anInt6701 = arg3;
		this.anInt6702 = arg0;
		this.anInt6708 = arg1;
		this.anInt6703 = arg4;
		this.method6013();
		this.method6015();
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 7)
	private void method6013() {
		this.aShortArray125 = new short[this.anInt6708];
		for (@Pc(12) int local12 = 0; local12 < this.anInt6708; local12++) {
			this.aShortArray125[local12] = (short) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(IIBI)V", line = 26)
	protected final void method6014() {
		@Pc(12) int[] local12 = new int[128];
		@Pc(15) int[] local15 = new int[128];
		for (@Pc(17) int local17 = 0; local17 < 128; local17++) {
			local12[local17] = (local17 << 12) / 128;
		}
		@Pc(38) int[] local38 = new int[16];
		for (@Pc(40) int local40 = 0; local40 < 128; local40++) {
			local15[local40] = (local40 << 12) / 128;
		}
		for (@Pc(60) int local60 = 0; local60 < 16; local60++) {
			local38[local60] = (local60 << 12) / 16;
		}
		this.method6016();
		for (@Pc(79) int local79 = 0; local79 < 16; local79++) {
			for (@Pc(83) int local83 = 0; local83 < 128; local83++) {
				for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
					for (@Pc(91) int local91 = 0; local91 < this.anInt6708; local91++) {
						@Pc(100) int local100 = this.aShortArray125[local91] << 12;
						@Pc(107) int local107 = local100 * this.anInt6703 >> 12;
						@Pc(114) int local114 = local100 * this.anInt6701 >> 12;
						@Pc(121) int local121 = this.anInt6705 * local100 >> 12;
						@Pc(129) int local129 = local12[local87] * local100 >> 12;
						@Pc(137) int local137 = local100 * local15[local83] >> 12;
						@Pc(145) int local145 = local38[local79] * local100 >> 12;
						@Pc(150) int local150 = local137 * this.anInt6701;
						@Pc(155) int local155 = local145 * this.anInt6703;
						@Pc(160) int local160 = local129 * this.anInt6705;
						@Pc(164) int local164 = local160 >> 12;
						@Pc(168) int local168 = local164 + 1;
						@Pc(172) int local172 = local164 & 0xFF;
						@Pc(176) int local176 = local150 >> 12;
						@Pc(180) int local180 = local176 + 1;
						@Pc(184) int local184 = local176 & 0xFF;
						@Pc(188) int local188 = local155 >> 12;
						@Pc(192) int local192 = local188 + 1;
						if (local168 >= local121) {
							local168 = 0;
						} else {
							local168 &= 0xFF;
						}
						if (local114 > local180) {
							local180 &= 0xFF;
						} else {
							local180 = 0;
						}
						local188 &= 0xFF;
						if (local192 >= local107) {
							local192 = 0;
						} else {
							local192 &= 0xFF;
						}
						local145 = local155 & 0xFFF;
						local137 = local150 & 0xFFF;
						local129 = local160 & 0xFFF;
						@Pc(249) int local249 = local137 - 4096;
						@Pc(253) int local253 = local145 - 4096;
						@Pc(258) short local258 = this.aShortArray126[local188];
						@Pc(262) int local262 = Class187.anIntArray360[local145];
						@Pc(266) int local266 = Class187.anIntArray360[local137];
						@Pc(271) short local271 = this.aShortArray126[local192];
						@Pc(275) int local275 = Class187.anIntArray360[local129];
						@Pc(279) int local279 = local129 - 4096;
						@Pc(287) short local287 = this.aShortArray126[local180 + local258];
						@Pc(294) short local294 = this.aShortArray126[local271 + local180];
						@Pc(302) short local302 = this.aShortArray126[local184 + local271];
						@Pc(309) short local309 = this.aShortArray126[local184 + local258];
						@Pc(321) int local321 = Static158.method3212(local145, local129, local137, this.aShortArray126[local309 + local172]);
						@Pc(333) int local333 = Static158.method3212(local145, local279, local137, this.aShortArray126[local168 + local309]);
						@Pc(344) int local344 = local321 + (local275 * (local333 - local321) >> 12);
						@Pc(356) int local356 = Static158.method3212(local145, local129, local249, this.aShortArray126[local172 + local287]);
						@Pc(368) int local368 = Static158.method3212(local145, local279, local249, this.aShortArray126[local287 + local168]);
						@Pc(379) int local379 = ((local368 - local356) * local275 >> 12) + local356;
						@Pc(390) int local390 = (local266 * (local379 - local344) >> 12) + local344;
						@Pc(402) int local402 = Static158.method3212(local253, local129, local137, this.aShortArray126[local172 + local302]);
						@Pc(415) int local415 = Static158.method3212(local253, local279, local137, this.aShortArray126[local168 + local302]);
						@Pc(426) int local426 = (local275 * (local415 - local402) >> 12) + local402;
						@Pc(438) int local438 = Static158.method3212(local253, local129, local249, this.aShortArray126[local294 + local172]);
						@Pc(450) int local450 = Static158.method3212(local253, local279, local249, this.aShortArray126[local294 + local168]);
						@Pc(461) int local461 = (local275 * (local450 - local438) >> 12) + local438;
						@Pc(473) int local473 = local426 + (local266 * (local461 - local426) >> 12);
						this.method6012(local91, local390 + (local262 * (local473 - local390) >> 12));
					}
					this.method6018();
				}
			}
		}
	}

	@OriginalMember(owner = "client!os", name = "b", descriptor = "(B)V", line = 193)
	private void method6015() {
		@Pc(12) Random local12 = new Random((long) this.anInt6702);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray126[local14] = (short) local14;
		}
		for (@Pc(39) int local39 = 0; local39 < 255; local39++) {
			@Pc(46) int local46 = 255 - local39;
			@Pc(51) int local51 = Static356.method6362(local46, local12);
			@Pc(56) short local56 = this.aShortArray126[local51];
			this.aShortArray126[local51] = this.aShortArray126[local46];
			this.aShortArray126[local46] = this.aShortArray126[local46 + 256] = local56;
		}
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)V")
	protected abstract void method6012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)V")
	protected abstract void method6016();

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V")
	protected abstract void method6018();
}
