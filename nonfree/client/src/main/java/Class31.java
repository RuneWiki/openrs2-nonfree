import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public abstract class Class31 {

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
	private int anInt5467 = 4;

	@OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
	private int anInt5469 = 0;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
	protected int anInt5468 = 4;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	private int anInt5471 = 4;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "[S")
	private short[] aShortArray66 = new short[512];

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
	private int anInt5474 = 4;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIII)V")
	protected Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt5474 = arg3;
		this.anInt5468 = arg1;
		this.anInt5467 = arg2;
		this.anInt5471 = arg4;
		this.anInt5469 = arg0;
		this.method4123();
		this.method4124();
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIBI)V")
	protected final void method4122() {
		@Pc(15) int[] local15 = new int[64];
		@Pc(18) int[] local18 = new int[64];
		@Pc(21) int[] local21 = new int[64];
		@Pc(23) int local23;
		for (local23 = 0; local23 < 64; local23++) {
			local21[local23] = (local23 << 12) / 64;
		}
		for (local23 = 0; local23 < 64; local23++) {
			local15[local23] = (local23 << 12) / 64;
		}
		for (local23 = 0; local23 < 64; local23++) {
			local18[local23] = (local23 << 12) / 64;
		}
		this.method4125();
		for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
			for (@Pc(87) int local87 = 0; local87 < 64; local87++) {
				for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
					for (@Pc(101) int local101 = 0; local101 < this.anInt5468; local101++) {
						local23 = this.aShortArray65[local101] << 12;
						@Pc(124) int local124 = local15[local87] * local23 >> 12;
						@Pc(132) int local132 = local18[local82] * local23 >> 12;
						@Pc(140) int local140 = local21[local96] * local23 >> 12;
						@Pc(147) int local147 = this.anInt5471 * local23 >> 12;
						@Pc(152) int local152 = local132 * this.anInt5471;
						@Pc(157) int local157 = local140 * this.anInt5467;
						@Pc(164) int local164 = local23 * this.anInt5474 >> 12;
						@Pc(168) int local168 = local152 >> 12;
						@Pc(172) int local172 = local152 & 0xFFF;
						@Pc(176) int local176 = local172 - 4096;
						@Pc(181) int local181 = local124 * this.anInt5474;
						@Pc(185) int local185 = local157 >> 12;
						@Pc(189) int local189 = local185 + 1;
						@Pc(193) int local193 = Class23.anIntArray52[local172];
						@Pc(197) int local197 = local185 & 0xFF;
						@Pc(201) int local201 = local181 >> 12;
						@Pc(205) int local205 = local181 & 0xFFF;
						@Pc(209) int local209 = Class23.anIntArray52[local205];
						@Pc(213) int local213 = local157 & 0xFFF;
						@Pc(217) int local217 = local213 - 4096;
						@Pc(221) int local221 = local201 + 1;
						@Pc(225) int local225 = Class23.anIntArray52[local213];
						@Pc(229) int local229 = local168 + 1;
						if (local164 <= local221) {
							local221 = 0;
						} else {
							local221 &= 0xFF;
						}
						local201 &= 0xFF;
						if (local229 >= local147) {
							local229 = 0;
						} else {
							local229 &= 0xFF;
						}
						@Pc(264) short local264 = this.aShortArray66[local229];
						local168 &= 0xFF;
						@Pc(275) int local275 = local23 * this.anInt5467 >> 12;
						@Pc(283) short local283 = this.aShortArray66[local201 + local264];
						@Pc(291) short local291 = this.aShortArray66[local221 + local264];
						if (local275 <= local189) {
							local189 = 0;
						} else {
							local189 &= 0xFF;
						}
						@Pc(306) int local306 = local205 - 4096;
						@Pc(311) short local311 = this.aShortArray66[local168];
						@Pc(318) short local318 = this.aShortArray66[local311 + local201];
						@Pc(325) short local325 = this.aShortArray66[local311 + local221];
						@Pc(337) int local337 = Static253.method3797(this.aShortArray66[local318 + local197], local205, local172, local213);
						@Pc(350) int local350 = Static253.method3797(this.aShortArray66[local189 + local318], local205, local172, local217);
						@Pc(361) int local361 = (local225 * (local350 - local337) >> 12) + local337;
						@Pc(374) int local374 = Static253.method3797(this.aShortArray66[local197 + local325], local306, local172, local213);
						@Pc(386) int local386 = Static253.method3797(this.aShortArray66[local325 + local189], local306, local172, local217);
						@Pc(397) int local397 = local374 + (local225 * (local386 - local374) >> 12);
						@Pc(408) int local408 = local361 + (local209 * (local397 - local361) >> 12);
						@Pc(421) int local421 = Static253.method3797(this.aShortArray66[local197 + local283], local205, local176, local213);
						@Pc(433) int local433 = Static253.method3797(this.aShortArray66[local189 + local283], local205, local176, local217);
						@Pc(445) int local445 = local421 + (local225 * (local433 - local421) >> 12);
						@Pc(457) int local457 = Static253.method3797(this.aShortArray66[local197 + local291], local306, local176, local213);
						@Pc(469) int local469 = Static253.method3797(this.aShortArray66[local291 + local189], local306, local176, local217);
						@Pc(480) int local480 = ((local469 - local457) * local225 >> 12) + local457;
						@Pc(491) int local491 = (local209 * (local480 - local445) >> 12) + local445;
						this.method4129((local193 * (local491 - local408) >> 12) + local408, local101);
					}
					this.method4126();
				}
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	private void method4123() {
		this.aShortArray65 = new short[this.anInt5468];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5468; local16++) {
			this.aShortArray65[local16] = (short) Math.pow(2.0D, (double) local16);
		}
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	private void method4124() {
		@Pc(12) Random local12 = new Random((long) this.anInt5469);
		@Pc(18) int local18;
		for (local18 = 0; local18 < 255; local18++) {
			this.aShortArray66[local18] = (short) local18;
		}
		for (local18 = 0; local18 < 255; local18++) {
			@Pc(40) int local40 = 255 - local18;
			@Pc(45) int local45 = Static293.method4280(local40, local12);
			@Pc(50) short local50 = this.aShortArray66[local45];
			this.aShortArray66[local45] = this.aShortArray66[local40];
			this.aShortArray66[local40] = this.aShortArray66[local40 + 256] = local50;
		}
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)V")
	protected abstract void method4125();

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(B)V")
	protected abstract void method4126();

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V")
	protected abstract void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
