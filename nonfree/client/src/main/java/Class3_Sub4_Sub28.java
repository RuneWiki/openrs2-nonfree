import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class3_Sub4_Sub28 extends Class3_Sub4 {

	@OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
	private int anInt5576 = 1;

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
	private int anInt5578 = 1;

	@OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
	private int anInt5577 = 204;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
	public Class3_Sub4_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method6134(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass109_41.method2831(arg0);
		if (super.aClass109_41.aBoolean250) {
			for (@Pc(23) int local23 = 0; local23 < Static148.anInt2687; local23++) {
				@Pc(29) int local29 = Static401.anIntArray419[local23];
				@Pc(33) int local33 = Static317.anIntArray337[arg0];
				@Pc(40) int local40 = this.anInt5578 * local29 >> 12;
				@Pc(47) int local47 = local33 * this.anInt5576 >> 12;
				@Pc(57) int local57 = local29 % (4096 / this.anInt5578) * this.anInt5578;
				@Pc(67) int local67 = this.anInt5576 * (local33 % (4096 / this.anInt5576));
				if (local67 < this.anInt5577) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (local57 < this.anInt5577) {
						local17[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt5577) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 > 0) {
						local17[local23] = 0;
						continue;
					}
				}
				local17[local23] = 4096;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method6141(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5578 = arg0.method4096();
		} else if (arg1 == 1) {
			this.anInt5576 = arg0.method4096();
		} else if (arg1 == 2) {
			this.anInt5577 = arg0.method4083();
		}
	}
}
