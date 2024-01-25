import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gp")
public abstract class Class60 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "[S")
	private short[] aShortArray185;

	@OriginalMember(owner = "client!gp", name = "n", descriptor = "[S")
	private final short[] aShortArray184 = new short[512];

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "I")
	private int anInt10626 = 4;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "I")
	private int anInt10625 = 4;

	@OriginalMember(owner = "client!gp", name = "s", descriptor = "I")
	private int anInt10631 = 4;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "I")
	protected int anInt10636 = 4;

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "I")
	private int anInt10637 = 0;

	@OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(IIIII)V")
	protected Class60(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt10626 = arg4;
		this.anInt10631 = arg3;
		this.anInt10636 = arg1;
		this.anInt10625 = arg2;
		this.anInt10637 = arg0;
		this.method8974();
		this.method8972();
	}

	@OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V")
	protected abstract void method8966(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)V")
	protected abstract void method8968();

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(Z)V")
	private void method8972() {
		@Pc(12) Random local12 = new Random((long) this.anInt10637);
		for (@Pc(14) int local14 = 0; local14 < 255; local14++) {
			this.aShortArray184[local14] = (short) local14;
		}
		@Pc(32) int local32 = 0;
		if (false) {
			this.method8966(-95);
		}
		while (local32 < 255) {
			@Pc(49) int local49 = 255 - local32;
			@Pc(54) int local54 = Static131.method1936(local12, local49);
			@Pc(59) short local59 = this.aShortArray184[local54];
			this.aShortArray184[local54] = this.aShortArray184[local49];
			this.aShortArray184[local49] = this.aShortArray184[local49 + 256] = local59;
			local32++;
		}
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(I)V")
	private void method8974() {
		this.aShortArray185 = new short[this.anInt10636];
		for (@Pc(12) int local12 = 0; local12 < this.anInt10636; local12++) {
			this.aShortArray185[local12] = (short) (int) Math.pow(2.0D, (double) local12);
		}
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIB)V")
	protected abstract void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBII)V")
	protected final void method8976(@OriginalArg(1) byte arg0) {
		@Pc(8) int[] local8 = new int[128];
		@Pc(11) int[] local11 = new int[128];
		for (@Pc(13) int local13 = 0; local13 < 128; local13++) {
			local8[local13] = (local13 << 12) / 128;
		}
		@Pc(32) int[] local32 = new int[16];
		if (arg0 <= 119) {
			return;
		}
		for (@Pc(41) int local41 = 0; local41 < 128; local41++) {
			local11[local41] = (local41 << 12) / 128;
		}
		for (@Pc(63) int local63 = 0; local63 < 16; local63++) {
			local32[local63] = (local63 << 12) / 16;
		}
		this.method8968();
		for (@Pc(90) int local90 = 0; local90 < 16; local90++) {
			for (@Pc(96) int local96 = 0; local96 < 128; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 128; local100++) {
					for (@Pc(104) int local104 = 0; local104 < this.anInt10636; local104++) {
						@Pc(115) int local115 = this.aShortArray185[local104] << 12;
						@Pc(122) int local122 = local115 * this.anInt10631 >> 12;
						@Pc(129) int local129 = this.anInt10625 * local115 >> 12;
						@Pc(137) int local137 = local115 * local11[local96] >> 12;
						@Pc(144) int local144 = this.anInt10626 * local115 >> 12;
						@Pc(152) int local152 = local32[local90] * local115 >> 12;
						@Pc(160) int local160 = local8[local100] * local115 >> 12;
						@Pc(165) int local165 = local152 * this.anInt10626;
						@Pc(170) int local170 = local160 * this.anInt10625;
						@Pc(175) int local175 = local137 * this.anInt10631;
						@Pc(179) int local179 = local170 >> 12;
						@Pc(183) int local183 = local179 + 1;
						@Pc(187) int local187 = local179 & 0xFF;
						@Pc(191) int local191 = local175 >> 12;
						@Pc(195) int local195 = local191 + 1;
						@Pc(199) int local199 = local165 >> 12;
						@Pc(203) int local203 = local191 & 0xFF;
						@Pc(207) int local207 = local199 + 1;
						if (local207 >= local144) {
							local207 = 0;
						} else {
							local207 &= 0xFF;
						}
						local199 &= 0xFF;
						local160 = local170 & 0xFFF;
						local137 = local175 & 0xFFF;
						if (local129 <= local183) {
							local183 = 0;
						} else {
							local183 &= 0xFF;
						}
						local152 = local165 & 0xFFF;
						if (local122 <= local195) {
							local195 = 0;
						} else {
							local195 &= 0xFF;
						}
						@Pc(264) int local264 = Class5_Sub3_Sub20.anIntArray320[local152];
						@Pc(268) int local268 = local160 - 4096;
						@Pc(273) short local273 = this.aShortArray184[local199];
						@Pc(277) int local277 = local137 - 4096;
						@Pc(281) int local281 = Class5_Sub3_Sub20.anIntArray320[local137];
						@Pc(285) int local285 = local152 - 4096;
						@Pc(289) int local289 = Class5_Sub3_Sub20.anIntArray320[local160];
						@Pc(294) short local294 = this.aShortArray184[local207];
						@Pc(301) short local301 = this.aShortArray184[local294 + local195];
						@Pc(308) short local308 = this.aShortArray184[local294 + local203];
						@Pc(316) short local316 = this.aShortArray184[local195 + local273];
						@Pc(323) short local323 = this.aShortArray184[local273 + local203];
						@Pc(336) int local336 = Static70.method1154(local160, local137, local152, this.aShortArray184[local187 + local323]);
						@Pc(348) int local348 = Static70.method1154(local268, local137, local152, this.aShortArray184[local323 + local183]);
						@Pc(359) int local359 = local336 + ((local348 - local336) * local289 >> 12);
						@Pc(372) int local372 = Static70.method1154(local160, local277, local152, this.aShortArray184[local187 + local316]);
						@Pc(385) int local385 = Static70.method1154(local268, local277, local152, this.aShortArray184[local183 + local316]);
						@Pc(396) int local396 = ((local385 - local372) * local289 >> 12) + local372;
						@Pc(407) int local407 = ((local396 - local359) * local281 >> 12) + local359;
						@Pc(420) int local420 = Static70.method1154(local160, local137, local285, this.aShortArray184[local187 + local308]);
						@Pc(432) int local432 = Static70.method1154(local268, local137, local285, this.aShortArray184[local183 + local308]);
						@Pc(444) int local444 = local420 + (local289 * (local432 - local420) >> 12);
						@Pc(457) int local457 = Static70.method1154(local160, local277, local285, this.aShortArray184[local187 + local301]);
						@Pc(469) int local469 = Static70.method1154(local268, local277, local285, this.aShortArray184[local301 + local183]);
						@Pc(480) int local480 = local457 + (local289 * (local469 - local457) >> 12);
						@Pc(491) int local491 = ((local480 - local444) * local281 >> 12) + local444;
						this.method8975(local407 + (local264 * (local491 - local407) >> 12), local104);
					}
					this.method8966(-1815138708);
				}
			}
		}
	}
}
