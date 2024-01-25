import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oha")
public final class Class5_Sub1_Sub23 extends Class5_Sub1 {

	@OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
	private int anInt7294 = 0;

	@OriginalMember(owner = "client!oha", name = "N", descriptor = "I")
	private int anInt7299 = 16;

	@OriginalMember(owner = "client!oha", name = "D", descriptor = "I")
	private int anInt7298 = 4096;

	@OriginalMember(owner = "client!oha", name = "F", descriptor = "I")
	private int anInt7293 = 0;

	@OriginalMember(owner = "client!oha", name = "K", descriptor = "I")
	private int anInt7301 = 2000;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V")
	@Override
	public void method9204() {
		Static19.method298();
	}

	@OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			@Pc(28) int local28 = this.anInt7298 >> 1;
			@Pc(33) int[][] local33 = super.aClass83_41.method1412();
			@Pc(40) Random local40 = new Random((long) this.anInt7294);
			for (@Pc(42) int local42 = 0; local42 < this.anInt7301; local42++) {
				@Pc(64) int local64 = this.anInt7298 <= 0 ? this.anInt7293 : this.anInt7293 + Static547.method7966(this.anInt7298, local40) - local28;
				@Pc(70) int local70 = local64 >> 4 & 0xFF;
				@Pc(75) int local75 = Static547.method7966(Static648.anInt9588, local40);
				@Pc(80) int local80 = Static547.method7966(Static269.anInt4686, local40);
				@Pc(92) int local92 = local75 + (Static633.anIntArray577[local70] * this.anInt7299 >> 12);
				@Pc(103) int local103 = (Static19.anIntArray23[local70] * this.anInt7299 >> 12) + local80;
				@Pc(108) int local108 = local103 - local80;
				@Pc(113) int local113 = local92 - local75;
				if (local113 != 0 || local108 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local113 < 0) {
						local113 = -local113;
					}
					@Pc(142) boolean local142 = local113 < local108;
					@Pc(146) int local146;
					@Pc(148) int local148;
					if (local142) {
						local146 = local75;
						local148 = local92;
						local75 = local80;
						local80 = local146;
						local92 = local103;
						local103 = local148;
					}
					if (local75 > local92) {
						local146 = local75;
						local75 = local92;
						local148 = local80;
						local92 = local146;
						local80 = local103;
						local103 = local148;
					}
					local146 = local80;
					local148 = local92 - local75;
					@Pc(187) int local187 = local103 - local80;
					@Pc(192) int local192 = -local148 / 2;
					@Pc(196) int local196 = 2048 / local148;
					@Pc(205) int local205 = 1024 - (Static547.method7966(4096, local40) >> 2);
					if (local187 < 0) {
						local187 = -local187;
					}
					@Pc(222) int local222 = local80 < local103 ? 1 : -1;
					for (@Pc(224) int local224 = local75; local224 < local92; local224++) {
						@Pc(237) int local237 = (local224 - local75) * local196 + local205 + 1024;
						@Pc(241) int local241 = Static116.anInt3312 & local224;
						@Pc(245) int local245 = Static542.anInt9254 & local146;
						local192 += local187;
						if (local142) {
							local33[local245][local241] = local237;
						} else {
							local33[local241][local245] = local237;
						}
						if (local192 > 0) {
							local192 -= local148;
							local146 -= -local222;
						}
					}
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt7294 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt7301 = arg1.method8519();
		} else if (arg0 == 2) {
			this.anInt7299 = arg1.method8529();
		} else if (arg0 == 3) {
			this.anInt7293 = arg1.method8519();
		} else if (arg0 == 4) {
			this.anInt7298 = arg1.method8519();
		}
	}
}
