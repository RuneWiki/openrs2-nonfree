import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jha")
public final class Class14_Sub1_Sub20 extends Class14_Sub1 {

	@OriginalMember(owner = "client!jha", name = "G", descriptor = "I")
	private int anInt4806 = 16;

	@OriginalMember(owner = "client!jha", name = "J", descriptor = "I")
	private int anInt4808 = 4096;

	@OriginalMember(owner = "client!jha", name = "N", descriptor = "I")
	private int anInt4812 = 2000;

	@OriginalMember(owner = "client!jha", name = "P", descriptor = "I")
	private int anInt4814 = 0;

	@OriginalMember(owner = "client!jha", name = "E", descriptor = "I")
	private int anInt4805 = 0;

	@OriginalMember(owner = "client!jha", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(26) int local26 = this.anInt4808 >> 1;
			@Pc(31) int[][] local31 = super.aClass211_41.method5139();
			@Pc(38) Random local38 = new Random((long) this.anInt4805);
			for (@Pc(40) int local40 = 0; local40 < this.anInt4812; local40++) {
				@Pc(60) int local60 = this.anInt4808 > 0 ? this.anInt4814 + Static251.method3688(local38, this.anInt4808) - local26 : this.anInt4814;
				@Pc(66) int local66 = local60 >> 4 & 0xFF;
				@Pc(71) int local71 = Static251.method3688(local38, Static371.anInt6835);
				@Pc(76) int local76 = Static251.method3688(local38, Static535.anInt9239);
				@Pc(87) int local87 = (this.anInt4806 * Static646.anIntArray808[local66] >> 12) + local71;
				@Pc(98) int local98 = (this.anInt4806 * Static656.anIntArray814[local66] >> 12) + local76;
				@Pc(103) int local103 = local98 - local76;
				@Pc(108) int local108 = local87 - local71;
				if (local108 != 0 || local103 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local103 < 0) {
						local103 = -local103;
					}
					@Pc(142) boolean local142 = local103 > local108;
					@Pc(146) int local146;
					@Pc(148) int local148;
					if (local142) {
						local146 = local71;
						local148 = local87;
						local71 = local76;
						local76 = local146;
						local87 = local98;
						local98 = local148;
					}
					if (local87 < local71) {
						local146 = local71;
						local71 = local87;
						local148 = local76;
						local87 = local146;
						local76 = local98;
						local98 = local148;
					}
					local146 = local76;
					local148 = local87 - local71;
					@Pc(187) int local187 = local98 - local76;
					@Pc(192) int local192 = -local148 / 2;
					@Pc(196) int local196 = 2048 / local148;
					@Pc(205) int local205 = 1024 - (Static251.method3688(local38, 4096) >> 2);
					@Pc(216) int local216 = local98 > local76 ? 1 : -1;
					if (local187 < 0) {
						local187 = -local187;
					}
					for (@Pc(223) int local223 = local71; local223 < local87; local223++) {
						@Pc(236) int local236 = local205 + local196 * (local223 - local71) + 1024;
						@Pc(240) int local240 = Static192.anInt3590 & local223;
						@Pc(244) int local244 = local146 & Static52.anInt1266;
						if (local142) {
							local31[local244][local240] = local236;
						} else {
							local31[local240][local244] = local236;
						}
						local192 += local187;
						if (local192 > 0) {
							local192 += -local148;
							local146 -= -local216;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4805 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt4812 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt4806 = arg0.method5866();
		} else if (arg1 == 3) {
			this.anInt4814 = arg0.method5900();
		} else if (arg1 == 4) {
			this.anInt4808 = arg0.method5900();
		}
	}

	@OriginalMember(owner = "client!jha", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		Static277.method4028();
	}
}
