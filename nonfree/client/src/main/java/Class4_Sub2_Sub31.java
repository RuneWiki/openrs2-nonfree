import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class4_Sub2_Sub31 extends Class4_Sub2 {

	@OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
	private int anInt5943 = 4096;

	@OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
	private int anInt5946 = 16;

	@OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
	private int anInt5947 = 0;

	@OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
	private int anInt5948 = 2000;

	@OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
	private int anInt5949 = 0;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
	@Override
	public void method5845() {
		Static47.method995();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBLclient!tl;)V")
	@Override
	public void method5843(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub30 arg1) {
		if (arg0 == 0) {
			this.anInt5949 = arg1.method4864();
		} else if (arg0 == 1) {
			this.anInt5948 = arg1.method4877();
		} else if (arg0 == 2) {
			this.anInt5946 = arg1.method4864();
		} else if (arg0 == 3) {
			this.anInt5947 = arg1.method4877();
		} else if (arg0 == 4) {
			this.anInt5943 = arg1.method4877();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5838(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass9_41.method279(arg0);
		if (super.aClass9_41.aBoolean15) {
			@Pc(26) int local26 = this.anInt5943 >> 1;
			@Pc(33) int[][] local33 = super.aClass9_41.method276();
			@Pc(40) Random local40 = new Random((long) this.anInt5949);
			for (@Pc(42) int local42 = 0; local42 < this.anInt5948; local42++) {
				@Pc(65) int local65 = this.anInt5943 > 0 ? this.anInt5947 + Static346.method4895(local40, this.anInt5943) - local26 : this.anInt5947;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static346.method4895(local40, Static350.anInt6330);
				@Pc(81) int local81 = Static346.method4895(local40, Static160.anInt3006);
				@Pc(92) int local92 = local76 + (Static100.anIntArray135[local71] * this.anInt5946 >> 12);
				@Pc(103) int local103 = local81 + (Static249.anIntArray375[local71] * this.anInt5946 >> 12);
				@Pc(108) int local108 = local103 - local81;
				@Pc(113) int local113 = local92 - local76;
				if (local113 != 0 || local108 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local113 < 0) {
						local113 = -local113;
					}
					@Pc(141) boolean local141 = local113 < local108;
					@Pc(145) int local145;
					@Pc(147) int local147;
					if (local141) {
						local145 = local76;
						local147 = local92;
						local76 = local81;
						local81 = local145;
						local92 = local103;
						local103 = local147;
					}
					if (local92 < local76) {
						local145 = local76;
						local76 = local92;
						local147 = local81;
						local92 = local145;
						local81 = local103;
						local103 = local147;
					}
					local145 = local81;
					local147 = local92 - local76;
					@Pc(182) int local182 = local103 - local81;
					@Pc(187) int local187 = -local147 / 2;
					@Pc(191) int local191 = 2048 / local147;
					@Pc(200) int local200 = 1024 - (Static346.method4895(local40, 4096) >> 2);
					if (local182 < 0) {
						local182 = -local182;
					}
					@Pc(215) int local215 = local103 <= local81 ? -1 : 1;
					for (@Pc(217) int local217 = local76; local217 < local92; local217++) {
						@Pc(229) int local229 = local191 * (local217 - local76) + local200 + 1024;
						@Pc(233) int local233 = Static144.anInt2707 & local217;
						@Pc(237) int local237 = local145 & Static323.anInt5763;
						if (local141) {
							local33[local237][local233] = local229;
						} else {
							local33[local233][local237] = local229;
						}
						local187 += local182;
						if (local187 > 0) {
							local145 += local215;
							local187 += -local147;
						}
					}
				}
			}
		}
		return local11;
	}
}
