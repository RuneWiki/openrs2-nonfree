import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public abstract class Class107 {

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "[S")
	private final short[] aShortArray53 = new short[512];

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
	private int anInt3262 = 4;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	private int anInt3263 = 4;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	protected int anInt3258 = 4;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	private int anInt3266 = 4;

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
	private int anInt3261 = 0;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIII)V")
	protected Class107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt3261 = arg0;
		this.anInt3258 = arg1;
		this.anInt3266 = arg3;
		this.anInt3262 = arg2;
		this.anInt3263 = arg4;
		this.method2825();
		this.method2823();
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIII)V")
	protected final void method2820() {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		@Pc(14) int[] local14 = new int[16];
		for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
			local8[local16] = (local16 << 12) / 128;
		}
		for (@Pc(44) int local44 = 0; local44 < 128; local44++) {
			local11[local44] = (local44 << 12) / 128;
		}
		for (@Pc(64) int local64 = 0; local64 < 16; local64++) {
			local14[local64] = (local64 << 12) / 16;
		}
		this.method2824();
		for (@Pc(83) int local83 = 0; local83 < 16; local83++) {
			for (@Pc(87) int local87 = 0; local87 < 128; local87++) {
				for (@Pc(91) int local91 = 0; local91 < 128; local91++) {
					for (@Pc(95) int local95 = 0; local95 < this.anInt3258; local95++) {
						@Pc(104) int local104 = this.aShortArray54[local95] << 12;
						@Pc(112) int local112 = local104 * local11[local87] >> 12;
						@Pc(119) int local119 = this.anInt3263 * local104 >> 12;
						@Pc(126) int local126 = this.anInt3266 * local104 >> 12;
						@Pc(133) int local133 = local104 * this.anInt3262 >> 12;
						@Pc(141) int local141 = local8[local91] * local104 >> 12;
						@Pc(149) int local149 = local104 * local14[local83] >> 12;
						@Pc(154) int local154 = local141 * this.anInt3262;
						@Pc(159) int local159 = local149 * this.anInt3263;
						@Pc(164) int local164 = local112 * this.anInt3266;
						@Pc(168) int local168 = local154 >> 12;
						@Pc(172) int local172 = local168 + 1;
						@Pc(176) int local176 = local164 >> 12;
						@Pc(180) int local180 = local168 & 0xFF;
						@Pc(184) int local184 = local176 + 1;
						@Pc(188) int local188 = local159 >> 12;
						@Pc(192) int local192 = local176 & 0xFF;
						@Pc(196) int local196 = local188 + 1;
						if (local133 > local172) {
							local172 &= 0xFF;
						} else {
							local172 = 0;
						}
						local141 = local154 & 0xFFF;
						local149 = local159 & 0xFFF;
						if (local119 <= local196) {
							local196 = 0;
						} else {
							local196 &= 0xFF;
						}
						if (local184 < local126) {
							local184 &= 0xFF;
						} else {
							local184 = 0;
						}
						local112 = local164 & 0xFFF;
						local188 &= 0xFF;
						@Pc(249) int local249 = local112 - 4096;
						@Pc(254) short local254 = this.aShortArray53[local188];
						@Pc(258) int local258 = Class76_Sub5.anIntArray346[local141];
						@Pc(262) int local262 = local141 - 4096;
						@Pc(267) short local267 = this.aShortArray53[local196];
						@Pc(271) int local271 = local149 - 4096;
						@Pc(275) int local275 = Class76_Sub5.anIntArray346[local112];
						@Pc(279) int local279 = Class76_Sub5.anIntArray346[local149];
						@Pc(286) short local286 = this.aShortArray53[local184 + local254];
						@Pc(293) short local293 = this.aShortArray53[local184 + local267];
						@Pc(301) short local301 = this.aShortArray53[local192 + local267];
						@Pc(308) short local308 = this.aShortArray53[local192 + local254];
						@Pc(322) int local322 = Static174.method2769(this.aShortArray53[local180 + local308], local141, local149, local112);
						@Pc(336) int local336 = Static174.method2769(this.aShortArray53[local308 + local172], local262, local149, local112);
						@Pc(347) int local347 = ((local336 - local322) * local258 >> 12) + local322;
						@Pc(359) int local359 = Static174.method2769(this.aShortArray53[local286 + local180], local141, local149, local249);
						@Pc(371) int local371 = Static174.method2769(this.aShortArray53[local286 + local172], local262, local149, local249);
						@Pc(381) int local381 = (local258 * (local371 - local359) >> 12) + local359;
						@Pc(393) int local393 = local347 + ((local381 - local347) * local275 >> 12);
						@Pc(405) int local405 = Static174.method2769(this.aShortArray53[local301 + local180], local141, local271, local112);
						@Pc(419) int local419 = Static174.method2769(this.aShortArray53[local301 + local172], local262, local271, local112);
						@Pc(431) int local431 = local405 + ((local419 - local405) * local258 >> 12);
						@Pc(445) int local445 = Static174.method2769(this.aShortArray53[local293 + local180], local141, local271, local249);
						@Pc(457) int local457 = Static174.method2769(this.aShortArray53[local172 + local293], local262, local271, local249);
						@Pc(469) int local469 = local445 + ((local457 - local445) * local258 >> 12);
						@Pc(481) int local481 = local431 + ((local469 - local431) * local275 >> 12);
						this.method2827(local393 + (local279 * (local481 - local393) >> 12), local95);
					}
					this.method2822();
				}
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	protected abstract void method2822();

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
	private void method2823() {
		@Pc(12) Random local12 = new Random((long) this.anInt3261);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray53[local14] = (short) local14;
		}
		for (@Pc(36) int local36 = 0; local36 < 255; local36++) {
			@Pc(43) int local43 = 255 - local36;
			@Pc(48) int local48 = Static19.method243(local43, local12);
			@Pc(53) short local53 = this.aShortArray53[local48];
			this.aShortArray53[local48] = this.aShortArray53[local43];
			this.aShortArray53[local43] = this.aShortArray53[local43 + 256] = local53;
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	protected abstract void method2824();

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
	private void method2825() {
		this.aShortArray54 = new short[this.anInt3258];
		for (@Pc(16) int local16 = 0; local16 < this.anInt3258; local16++) {
			this.aShortArray54[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
	protected abstract void method2827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);
}
