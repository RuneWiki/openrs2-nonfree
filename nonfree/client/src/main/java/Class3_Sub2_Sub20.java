import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
	private int anInt2705 = 0;

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
	private int anInt2706 = 0;

	@OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
	private int anInt2711 = 2000;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "I")
	private int anInt2713 = 16;

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "I")
	private int anInt2714 = 4096;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V")
	@Override
	public void method4952() {
		Static66.method1029();
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZLclient!ug;)V")
	@Override
	public void method4958(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2705 = arg1.method3915();
		} else if (arg0 == 1) {
			this.anInt2711 = arg1.method3948();
		} else if (arg0 == 2) {
			this.anInt2713 = arg1.method3915();
		} else if (arg0 == 3) {
			this.anInt2706 = arg1.method3948();
		} else if (arg0 == 4) {
			this.anInt2714 = arg1.method3948();
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = this.aClass168_41.method4366(arg0);
		if (this.aClass168_41.aBoolean373) {
			@Pc(26) int local26 = this.anInt2714 >> 1;
			@Pc(31) int[][] local31 = this.aClass168_41.method4361();
			@Pc(38) Random local38 = new Random((long) this.anInt2705);
			for (@Pc(40) int local40 = 0; local40 < this.anInt2711; local40++) {
				@Pc(69) int local69 = this.anInt2714 > 0 ? this.anInt2706 + Static276.method4529(this.anInt2714, local38) - local26 : this.anInt2706;
				@Pc(75) int local75 = local69 >> 4 & 0xFF;
				@Pc(80) int local80 = Static276.method4529(Static22.anInt421, local38);
				@Pc(85) int local85 = Static276.method4529(Static62.anInt1150, local38);
				@Pc(96) int local96 = local80 + (this.anInt2713 * Static220.anIntArray542[local75] >> 12);
				@Pc(107) int local107 = (this.anInt2713 * Static122.anIntArray279[local75] >> 12) + local85;
				@Pc(112) int local112 = local107 - local85;
				@Pc(117) int local117 = local96 - local80;
				if (local117 != 0 || local112 != 0) {
					if (local112 < 0) {
						local112 = -local112;
					}
					if (local117 < 0) {
						local117 = -local117;
					}
					@Pc(139) boolean local139 = local112 > local117;
					@Pc(150) int local150;
					@Pc(144) int local144;
					if (local139) {
						local144 = local96;
						local96 = local107;
						local107 = local144;
						local150 = local80;
						local80 = local85;
						local85 = local150;
					}
					if (local96 < local80) {
						local150 = local80;
						local80 = local96;
						local144 = local85;
						local96 = local150;
						local85 = local107;
						local107 = local144;
					}
					local144 = local96 - local80;
					local150 = local85;
					@Pc(181) int local181 = local107 - local85;
					if (local181 < 0) {
						local181 = -local181;
					}
					@Pc(194) int local194 = -local144 / 2;
					@Pc(198) int local198 = 2048 / local144;
					@Pc(209) int local209 = local85 < local107 ? 1 : -1;
					@Pc(219) int local219 = 1024 - (Static276.method4529(4096, local38) >> 2);
					for (@Pc(221) int local221 = local80; local221 < local96; local221++) {
						local194 += local181;
						@Pc(239) int local239 = local219 + (local221 - local80) * local198 + 1024;
						@Pc(243) int local243 = Static148.anInt2810 & local150;
						@Pc(247) int local247 = local221 & Static84.anInt1566;
						if (local194 > 0) {
							local150 += local209;
							local194 += -local144;
						}
						if (local139) {
							local31[local243][local247] = local239;
						} else {
							local31[local247][local243] = local239;
						}
					}
				}
			}
		}
		return local17;
	}
}
