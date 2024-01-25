import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class3_Sub2_Sub10 extends Class3_Sub2 {

	@OriginalMember(owner = "client!hfa", name = "z", descriptor = "I")
	private int anInt4037 = 204;

	@OriginalMember(owner = "client!hfa", name = "y", descriptor = "I")
	private int anInt4036 = 1;

	@OriginalMember(owner = "client!hfa", name = "B", descriptor = "I")
	private int anInt4039 = 1;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!fca;II)V")
	@Override
	public void method8709(@OriginalArg(0) Class3_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4039 = arg0.method4888();
		} else if (arg1 == 1) {
			this.anInt4036 = arg0.method4888();
		} else if (arg1 == 2) {
			this.anInt4037 = arg0.method4858();
		}
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8710(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass340_41.method7837(arg0);
		if (super.aClass340_41.aBoolean687) {
			for (@Pc(23) int local23 = 0; local23 < Static30.anInt908; local23++) {
				@Pc(29) int local29 = Static26.anIntArray20[local23];
				@Pc(33) int local33 = Static201.anIntArray251[arg0];
				@Pc(40) int local40 = local29 * this.anInt4039 >> 12;
				@Pc(47) int local47 = this.anInt4036 * local33 >> 12;
				@Pc(57) int local57 = this.anInt4039 * (local29 % (4096 / this.anInt4039));
				@Pc(67) int local67 = local33 % (4096 / this.anInt4036) * this.anInt4036;
				if (this.anInt4037 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local11[local23] = 0;
						continue;
					}
					if (local57 < this.anInt4037) {
						local11[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt4037) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local11[local23] = 0;
						continue;
					}
				}
				local11[local23] = 4096;
			}
		}
		return local11;
	}
}
