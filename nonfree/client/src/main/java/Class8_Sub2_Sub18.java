import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class8_Sub2_Sub18 extends Class8_Sub2 {

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "I")
	private int anInt5085 = 1;

	@OriginalMember(owner = "client!ida", name = "M", descriptor = "I")
	private int anInt5090 = 204;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "I")
	private int anInt5089 = 1;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt5089 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt5085 = arg1.method8525();
		} else if (arg0 == 2) {
			this.anInt5090 = arg1.method8578();
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			for (@Pc(22) int local22 = 0; local22 < Static538.anInt9297; local22++) {
				@Pc(28) int local28 = Static93.anIntArray111[local22];
				@Pc(32) int local32 = Static426.anIntArray424[arg0];
				@Pc(39) int local39 = this.anInt5089 * local28 >> 12;
				@Pc(46) int local46 = local32 * this.anInt5085 >> 12;
				@Pc(56) int local56 = this.anInt5089 * (local28 % (4096 / this.anInt5089));
				@Pc(66) int local66 = local32 % (4096 / this.anInt5085) * this.anInt5085;
				if (this.anInt5090 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (local56 < this.anInt5090) {
						local11[local22] = 0;
						continue;
					}
				}
				if (local56 < this.anInt5090) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}
}
