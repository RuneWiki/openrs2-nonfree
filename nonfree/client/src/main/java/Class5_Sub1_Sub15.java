import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class5_Sub1_Sub15 extends Class5_Sub1 {

	@OriginalMember(owner = "client!kt", name = "M", descriptor = "I")
	private int anInt5788 = 1;

	@OriginalMember(owner = "client!kt", name = "I", descriptor = "I")
	private int anInt5789 = 204;

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "I")
	private int anInt5793 = 1;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method9212(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass83_41.method1414((byte) -64, arg0);
		if (super.aClass83_41.aBoolean148) {
			for (@Pc(23) int local23 = 0; local23 < Static648.anInt9588; local23++) {
				@Pc(29) int local29 = Static293.anIntArray288[local23];
				@Pc(33) int local33 = Static23.anIntArray27[arg0];
				@Pc(40) int local40 = local29 * this.anInt5793 >> 12;
				@Pc(47) int local47 = local33 * this.anInt5788 >> 12;
				@Pc(57) int local57 = this.anInt5793 * (local29 % (4096 / this.anInt5793));
				@Pc(67) int local67 = this.anInt5788 * (local33 % (4096 / this.anInt5788));
				if (this.anInt5789 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local11[local23] = 0;
						continue;
					}
					if (this.anInt5789 > local57) {
						local11[local23] = 0;
						continue;
					}
				}
				if (this.anInt5789 > local57) {
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

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BILclient!ib;)V")
	@Override
	public void method9209(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub23 arg1) {
		if (arg0 == 0) {
			this.anInt5793 = arg1.method8529();
		} else if (arg0 == 1) {
			this.anInt5788 = arg1.method8529();
		} else if (arg0 == 2) {
			this.anInt5789 = arg1.method8519();
		}
	}
}
