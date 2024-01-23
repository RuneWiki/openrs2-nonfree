import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class1_Sub1_Sub24 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
	private int anInt3244 = 1;

	@OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
	private int anInt3245 = 1;

	@OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
	private int anInt3248 = 204;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub24() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			for (@Pc(25) int local25 = 0; local25 < Static157.anInt3431; local25++) {
				@Pc(31) int local31 = Static211.anIntArray334[arg0];
				@Pc(35) int local35 = Static73.anIntArray105[local25];
				@Pc(42) int local42 = local31 * this.anInt3244 >> 12;
				@Pc(49) int local49 = local35 * this.anInt3245 >> 12;
				@Pc(59) int local59 = local35 % (4096 / this.anInt3245) * this.anInt3245;
				@Pc(69) int local69 = this.anInt3244 * (local31 % (4096 / this.anInt3244));
				if (this.anInt3248 > local69) {
					for (local49 -= local42; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (local59 < this.anInt3248) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt3248 > local59) {
					for (local49 -= local42; local49 < 0; local49 += 4) {
					}
					while (local49 > 3) {
						local49 -= 4;
					}
					if (local49 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3245 = arg0.method3793();
		} else if (arg1 == 1) {
			this.anInt3244 = arg0.method3793();
		} else if (arg1 == 2) {
			this.anInt3248 = arg0.method3805();
		}
	}
}
