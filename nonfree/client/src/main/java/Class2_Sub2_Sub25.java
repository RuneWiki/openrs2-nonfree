import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pj")
public final class Class2_Sub2_Sub25 extends Class2_Sub2 {

	@OriginalMember(owner = "client!pj", name = "I", descriptor = "I")
	private int anInt5288 = 204;

	@OriginalMember(owner = "client!pj", name = "G", descriptor = "I")
	private int anInt5286 = 1;

	@OriginalMember(owner = "client!pj", name = "F", descriptor = "I")
	private int anInt5285 = 1;

	@OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub25() {
		super(0, true);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			for (@Pc(23) int local23 = 0; local23 < Static217.anInt3574; local23++) {
				@Pc(29) int local29 = Static145.anIntArray199[local23];
				@Pc(33) int local33 = Static405.anIntArray555[arg0];
				@Pc(40) int local40 = this.anInt5286 * local29 >> 12;
				@Pc(47) int local47 = this.anInt5285 * local33 >> 12;
				@Pc(57) int local57 = local29 % (4096 / this.anInt5286) * this.anInt5286;
				@Pc(67) int local67 = local33 % (4096 / this.anInt5285) * this.anInt5285;
				if (local67 < this.anInt5288) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local11[local23] = 0;
						continue;
					}
					if (this.anInt5288 > local57) {
						local11[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt5288) {
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

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5286 = arg0.method3580();
		} else if (arg1 == 1) {
			this.anInt5285 = arg0.method3580();
		} else if (arg1 == 2) {
			this.anInt5288 = arg0.method3555();
		}
	}
}
