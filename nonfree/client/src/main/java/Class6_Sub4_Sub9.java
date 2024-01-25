import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class6_Sub4_Sub9 extends Class6_Sub4 {

	@OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
	private int anInt1748 = 16;

	@OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
	private int anInt1746 = 0;

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	private int anInt1742 = 4096;

	@OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
	private int anInt1754 = 2000;

	@OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
	private int anInt1750 = 0;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub9() {
		super(0, true);
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	@Override
	public void method7754() {
		Static571.method7641();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt1750 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt1754 = arg1.method6003();
		} else if (arg0 == 2) {
			this.anInt1748 = arg1.method6069();
		} else if (arg0 == 3) {
			this.anInt1746 = arg1.method6003();
		} else if (arg0 == 4) {
			this.anInt1742 = arg1.method6003();
		}
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			@Pc(28) int local28 = this.anInt1742 >> 1;
			@Pc(33) int[][] local33 = super.aClass187_41.method4557();
			@Pc(40) Random local40 = new Random((long) this.anInt1750);
			for (@Pc(42) int local42 = 0; local42 < this.anInt1754; local42++) {
				@Pc(65) int local65 = this.anInt1742 <= 0 ? this.anInt1746 : this.anInt1746 + Static411.method7689(this.anInt1742, local40) - local28;
				@Pc(71) int local71 = local65 >> 4 & 0xFF;
				@Pc(76) int local76 = Static411.method7689(Static408.anInt7209, local40);
				@Pc(81) int local81 = Static411.method7689(Static88.anInt1743, local40);
				@Pc(92) int local92 = (this.anInt1748 * Static300.anIntArray410[local71] >> 12) + local76;
				@Pc(103) int local103 = (Static435.anIntArray543[local71] * this.anInt1748 >> 12) + local81;
				@Pc(108) int local108 = local103 - local81;
				@Pc(113) int local113 = local92 - local76;
				if (local113 != 0 || local108 != 0) {
					if (local108 < 0) {
						local108 = -local108;
					}
					if (local113 < 0) {
						local113 = -local113;
					}
					@Pc(141) boolean local141 = local108 > local113;
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
					if (local76 > local92) {
						local145 = local76;
						local147 = local81;
						local76 = local92;
						local81 = local103;
						local92 = local145;
						local103 = local147;
					}
					local145 = local81;
					local147 = local92 - local76;
					@Pc(186) int local186 = local103 - local81;
					@Pc(191) int local191 = -local147 / 2;
					@Pc(195) int local195 = 2048 / local147;
					@Pc(204) int local204 = 1024 - (Static411.method7689(4096, local40) >> 2);
					if (local186 < 0) {
						local186 = -local186;
					}
					@Pc(219) int local219 = local103 > local81 ? 1 : -1;
					for (@Pc(221) int local221 = local76; local221 < local92; local221++) {
						@Pc(234) int local234 = local195 * (local221 - local76) + local204 + 1024;
						@Pc(238) int local238 = Static368.anInt6505 & local221;
						@Pc(242) int local242 = Static457.anInt7873 & local145;
						local191 += local186;
						if (local141) {
							local33[local242][local238] = local234;
						} else {
							local33[local238][local242] = local234;
						}
						if (local191 > 0) {
							local191 += -local147;
							local145 += local219;
						}
					}
				}
			}
		}
		return local19;
	}
}
