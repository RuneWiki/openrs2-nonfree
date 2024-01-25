import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class5_Sub1_Sub19 extends Class5_Sub1 {

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
	private int anInt4796 = 0;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	private int anInt4797 = 16;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
	private int anInt4798 = 2000;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	private int anInt4801 = 0;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
	private int anInt4802 = 4096;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	@Override
	public void method7157() {
		Static340.method5294();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BILclient!co;)V")
	@Override
	public void method7164(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt4796 = arg1.method4220();
		} else if (arg0 == 1) {
			this.anInt4798 = arg1.method4227();
		} else if (arg0 == 2) {
			this.anInt4797 = arg1.method4220();
		} else if (arg0 == 3) {
			this.anInt4801 = arg1.method4227();
		} else if (arg0 == 4) {
			this.anInt4802 = arg1.method4227();
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7155(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass104_41.method2752(arg0);
		if (super.aClass104_41.aBoolean203) {
			@Pc(28) int local28 = this.anInt4802 >> 1;
			@Pc(33) int[][] local33 = super.aClass104_41.method2754();
			@Pc(40) Random local40 = new Random((long) this.anInt4796);
			for (@Pc(42) int local42 = 0; local42 < this.anInt4798; local42++) {
				@Pc(65) int local65 = this.anInt4802 <= 0 ? this.anInt4801 : this.anInt4801 + Static542.method7398(local40, this.anInt4802) - local28;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static542.method7398(local40, Static147.anInt3075);
				@Pc(81) int local81 = Static542.method7398(local40, Static250.anInt5057);
				@Pc(92) int local92 = (Static20.anIntArray25[local71] * this.anInt4797 >> 12) + local76;
				@Pc(103) int local103 = local81 + (Static480.anIntArray648[local71] * this.anInt4797 >> 12);
				@Pc(108) int local108 = local103 - local81;
				@Pc(113) int local113 = local92 - local76;
				if (local113 != 0 || local108 != 0) {
					if (local113 < 0) {
						local113 = -local113;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(141) boolean local141 = local113 < local108;
					@Pc(145) int local145;
					@Pc(147) int local147;
					if (local141) {
						local145 = local76;
						local147 = local92;
						local76 = local81;
						local92 = local103;
						local81 = local145;
						local103 = local147;
					}
					if (local76 > local92) {
						local145 = local76;
						local76 = local92;
						local147 = local81;
						local81 = local103;
						local92 = local145;
						local103 = local147;
					}
					local145 = local81;
					local147 = local92 - local76;
					@Pc(185) int local185 = local103 - local81;
					@Pc(190) int local190 = -local147 / 2;
					@Pc(194) int local194 = 2048 / local147;
					@Pc(203) int local203 = 1024 - (Static542.method7398(local40, 4096) >> 2);
					if (local185 < 0) {
						local185 = -local185;
					}
					@Pc(219) int local219 = local81 < local103 ? 1 : -1;
					for (@Pc(221) int local221 = local76; local221 < local92; local221++) {
						@Pc(234) int local234 = (local221 - local76) * local194 + local203 + 1024;
						@Pc(238) int local238 = local221 & Static497.anInt9138;
						@Pc(242) int local242 = Static160.anInt3274 & local145;
						local190 += local185;
						if (local141) {
							local33[local242][local238] = local234;
						} else {
							local33[local238][local242] = local234;
						}
						if (local190 > 0) {
							local145 += local219;
							local190 += -local147;
						}
					}
				}
			}
		}
		return local11;
	}
}
