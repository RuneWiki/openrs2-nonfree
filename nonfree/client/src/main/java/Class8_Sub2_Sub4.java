import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bu")
public final class Class8_Sub2_Sub4 extends Class8_Sub2 {

	@OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
	private int anInt1833 = 2000;

	@OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
	private int anInt1832 = 16;

	@OriginalMember(owner = "client!bu", name = "M", descriptor = "I")
	private int anInt1834 = 4096;

	@OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
	private int anInt1831 = 0;

	@OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
	private int anInt1830 = 0;

	@OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub4() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bu", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		Static282.method4762();
	}

	@OriginalMember(owner = "client!bu", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(25) int local25 = this.anInt1834 >> 1;
			@Pc(30) int[][] local30 = super.aClass50_41.method1693();
			@Pc(37) Random local37 = new Random((long) this.anInt1830);
			for (@Pc(39) int local39 = 0; local39 < this.anInt1833; local39++) {
				@Pc(61) int local61 = this.anInt1834 <= 0 ? this.anInt1831 : this.anInt1831 + Static221.method4149(this.anInt1834, local37) - local25;
				@Pc(67) int local67 = local61 >> 4 & 0xFF;
				@Pc(72) int local72 = Static221.method4149(Static538.anInt9297, local37);
				@Pc(77) int local77 = Static221.method4149(Static159.anInt8698, local37);
				@Pc(89) int local89 = local72 + (this.anInt1832 * Static308.anIntArray360[local67] >> 12);
				@Pc(100) int local100 = (Static246.anIntArray317[local67] * this.anInt1832 >> 12) + local77;
				@Pc(105) int local105 = local100 - local77;
				@Pc(109) int local109 = local89 - local72;
				if (local109 != 0 || local105 != 0) {
					if (local105 < 0) {
						local105 = -local105;
					}
					if (local109 < 0) {
						local109 = -local109;
					}
					@Pc(137) boolean local137 = local109 < local105;
					@Pc(141) int local141;
					@Pc(145) int local145;
					if (local137) {
						local141 = local72;
						local72 = local77;
						local145 = local89;
						local89 = local100;
						local77 = local141;
						local100 = local145;
					}
					if (local72 > local89) {
						local141 = local72;
						local72 = local89;
						local145 = local77;
						local77 = local100;
						local89 = local141;
						local100 = local145;
					}
					local141 = local77;
					local145 = local89 - local72;
					@Pc(180) int local180 = local100 - local77;
					@Pc(185) int local185 = -local145 / 2;
					@Pc(189) int local189 = 2048 / local145;
					@Pc(199) int local199 = 1024 - (Static221.method4149(4096, local37) >> 2);
					if (local180 < 0) {
						local180 = -local180;
					}
					@Pc(215) int local215 = local77 >= local100 ? -1 : 1;
					for (@Pc(217) int local217 = local72; local217 < local89; local217++) {
						@Pc(229) int local229 = local189 * (local217 - local72) + local199 + 1024;
						@Pc(233) int local233 = Static263.anInt5634 & local217;
						@Pc(237) int local237 = Static17.anInt866 & local141;
						local185 += local180;
						if (local137) {
							local30[local237][local233] = local229;
						} else {
							local30[local233][local237] = local229;
						}
						if (local185 > 0) {
							local141 += local215;
							local185 += -local145;
						}
					}
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1830 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt1833 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt1832 = arg1.method8525();
		} else if (arg0 == 3) {
			this.anInt1831 = arg1.method8578();
		} else if (arg0 == 4) {
			this.anInt1834 = arg1.method8578();
		}
	}
}
