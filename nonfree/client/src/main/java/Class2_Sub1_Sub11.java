import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class2_Sub1_Sub11 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
	private int anInt1757 = 1;

	@OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
	private int anInt1759 = 1;

	@OriginalMember(owner = "client!ga", name = "cb", descriptor = "I")
	private int anInt1766 = 204;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1757 = arg0.method4261();
		} else if (arg1 == 1) {
			this.anInt1759 = arg0.method4261();
		} else if (arg1 == 2) {
			this.anInt1766 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			for (@Pc(24) int local24 = 0; local24 < Static114.anInt1359; local24++) {
				@Pc(35) int local35 = Static281.anIntArray506[local24];
				@Pc(42) int local42 = local35 * this.anInt1757 >> 12;
				@Pc(46) int local46 = Static234.anIntArray435[arg0];
				@Pc(53) int local53 = this.anInt1759 * local46 >> 12;
				@Pc(63) int local63 = this.anInt1757 * (local35 % (4096 / this.anInt1757));
				@Pc(73) int local73 = this.anInt1759 * (local46 % (4096 / this.anInt1759));
				if (local73 < this.anInt1766) {
					for (local42 -= local53; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local17[local24] = 0;
						continue;
					}
					if (local63 < this.anInt1766) {
						local17[local24] = 0;
						continue;
					}
				}
				if (local63 < this.anInt1766) {
					for (local42 -= local53; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local17[local24] = 0;
						continue;
					}
				}
				local17[local24] = 4096;
			}
		}
		return local17;
	}
}
