import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class6_Sub1_Sub32 extends Class6_Sub1 {

	@OriginalMember(owner = "client!sd", name = "J", descriptor = "I")
	private int anInt9013 = 1;

	@OriginalMember(owner = "client!sd", name = "L", descriptor = "I")
	private int anInt9015 = 1;

	@OriginalMember(owner = "client!sd", name = "M", descriptor = "I")
	private int anInt9016 = 204;

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8721(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass24_41.method788(arg0);
		if (super.aClass24_41.aBoolean80) {
			for (@Pc(23) int local23 = 0; local23 < Static53.anInt1787; local23++) {
				@Pc(29) int local29 = Static12.anIntArray15[local23];
				@Pc(33) int local33 = Static603.anIntArray549[arg0];
				@Pc(40) int local40 = this.anInt9015 * local29 >> 12;
				@Pc(47) int local47 = local33 * this.anInt9013 >> 12;
				@Pc(57) int local57 = local29 % (4096 / this.anInt9015) * this.anInt9015;
				@Pc(67) int local67 = local33 % (4096 / this.anInt9013) * this.anInt9013;
				if (local67 < this.anInt9016) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local11[local23] = 0;
						continue;
					}
					if (this.anInt9016 > local57) {
						local11[local23] = 0;
						continue;
					}
				}
				if (local57 < this.anInt9016) {
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

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILclient!ji;B)V")
	@Override
	public void method8722(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9015 = arg1.method8246();
		} else if (arg0 == 1) {
			this.anInt9013 = arg1.method8246();
		} else if (arg0 == 2) {
			this.anInt9016 = arg1.method8220();
		}
	}
}
