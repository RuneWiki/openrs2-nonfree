import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sk")
public final class Class1_Sub3_Sub32 extends Class1_Sub3 {

	@OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
	private int anInt4796 = 204;

	@OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
	private int anInt4799 = 1;

	@OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
	private int anInt4798 = 1;

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub32() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4123(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass8_41.method111(arg0);
		if (super.aClass8_41.aBoolean6) {
			for (@Pc(23) int local23 = 0; local23 < Static110.anInt2934; local23++) {
				@Pc(29) int local29 = Static175.anIntArray302[local23];
				@Pc(33) int local33 = Static94.anIntArray321[arg0];
				@Pc(40) int local40 = local29 * this.anInt4798 >> 12;
				@Pc(47) int local47 = this.anInt4799 * local33 >> 12;
				@Pc(57) int local57 = this.anInt4798 * (local29 % (4096 / this.anInt4798));
				@Pc(67) int local67 = this.anInt4799 * (local33 % (4096 / this.anInt4799));
				if (this.anInt4796 > local67) {
					for (local40 -= local47; local40 < 0; local40 += 4) {
					}
					while (local40 > 3) {
						local40 -= 4;
					}
					if (local40 != 1) {
						local17[local23] = 0;
						continue;
					}
					if (this.anInt4796 > local57) {
						local17[local23] = 0;
						continue;
					}
				}
				if (this.anInt4796 > local57) {
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

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method4121(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4798 = arg0.method1772();
		} else if (arg1 == 1) {
			this.anInt4799 = arg0.method1772();
		} else if (arg1 == 2) {
			this.anInt4796 = arg0.method1764();
		}
	}
}
