import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class1_Sub1_Sub18 extends Class1_Sub1 {

	@OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
	private int anInt4980 = 16;

	@OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
	private int anInt4979 = 0;

	@OriginalMember(owner = "client!laa", name = "K", descriptor = "I")
	private int anInt4985 = 2000;

	@OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
	private int anInt4984 = 0;

	@OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
	private int anInt4988 = 4096;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4979 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt4985 = arg0.method5771();
		} else if (arg1 == 2) {
			this.anInt4980 = arg0.method5750();
		} else if (arg1 == 3) {
			this.anInt4984 = arg0.method5771();
		} else if (arg1 == 4) {
			this.anInt4988 = arg0.method5771();
		}
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		Static499.method3357();
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(28) int local28 = this.anInt4988 >> 1;
			@Pc(33) int[][] local33 = super.aClass223_41.method4437();
			@Pc(40) Random local40 = new Random((long) this.anInt4979);
			for (@Pc(42) int local42 = 0; local42 < this.anInt4985; local42++) {
				@Pc(65) int local65 = this.anInt4988 <= 0 ? this.anInt4984 : this.anInt4984 + Static87.method4324(this.anInt4988, local40) - local28;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static87.method4324(Static279.anInt4906, local40);
				@Pc(81) int local81 = Static87.method4324(Static52.anInt1010, local40);
				@Pc(92) int local92 = (Static359.anIntArray435[local71] * this.anInt4980 >> 12) + local76;
				@Pc(103) int local103 = local81 + (this.anInt4980 * Static508.anIntArray651[local71] >> 12);
				@Pc(108) int local108 = local103 - local81;
				@Pc(112) int local112 = local92 - local76;
				if (local112 != 0 || local108 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local108 < 0) {
						local108 = -local108;
					}
					@Pc(136) boolean local136 = local112 < local108;
					@Pc(140) int local140;
					@Pc(144) int local144;
					if (local136) {
						local140 = local76;
						local76 = local81;
						local144 = local92;
						local92 = local103;
						local81 = local140;
						local103 = local144;
					}
					if (local76 > local92) {
						local140 = local76;
						local144 = local81;
						local76 = local92;
						local92 = local140;
						local81 = local103;
						local103 = local144;
					}
					local140 = local81;
					local144 = local92 - local76;
					@Pc(176) int local176 = local103 - local81;
					@Pc(181) int local181 = -local144 / 2;
					@Pc(185) int local185 = 2048 / local144;
					@Pc(194) int local194 = 1024 - (Static87.method4324(4096, local40) >> 2);
					if (local176 < 0) {
						local176 = -local176;
					}
					@Pc(213) int local213 = local81 >= local103 ? -1 : 1;
					for (@Pc(215) int local215 = local76; local215 < local92; local215++) {
						@Pc(228) int local228 = local194 + local185 * (local215 - local76) + 1024;
						@Pc(232) int local232 = local215 & Static216.anInt4134;
						@Pc(236) int local236 = Static171.anInt3020 & local140;
						local181 += local176;
						if (local136) {
							local33[local236][local232] = local228;
						} else {
							local33[local232][local236] = local228;
						}
						if (local181 > 0) {
							local181 -= local144;
							local140 += local213;
						}
					}
				}
			}
		}
		return local19;
	}
}
