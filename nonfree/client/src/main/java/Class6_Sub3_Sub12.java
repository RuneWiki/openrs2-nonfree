import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class6_Sub3_Sub12 extends Class6_Sub3 {

	@OriginalMember(owner = "client!hr", name = "B", descriptor = "I")
	private int anInt3384 = 204;

	@OriginalMember(owner = "client!hr", name = "F", descriptor = "I")
	private int anInt3387 = 1;

	@OriginalMember(owner = "client!hr", name = "I", descriptor = "I")
	private int anInt3389 = 1;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7828(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3731(arg0);
		if (super.aClass174_41.aBoolean271) {
			for (@Pc(25) int local25 = 0; local25 < Static447.anInt8568; local25++) {
				@Pc(31) int local31 = Static157.anIntArray321[local25];
				@Pc(35) int local35 = Static564.anIntArray703[arg0];
				@Pc(42) int local42 = this.anInt3389 * local31 >> 12;
				@Pc(49) int local49 = this.anInt3387 * local35 >> 12;
				@Pc(59) int local59 = local31 % (4096 / this.anInt3389) * this.anInt3389;
				@Pc(69) int local69 = this.anInt3387 * (local35 % (4096 / this.anInt3387));
				if (local69 < this.anInt3384) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt3384 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (this.anInt3384 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local19[local25] = 0;
						continue;
					}
				}
				local19[local25] = 4096;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!dga;)V")
	@Override
	public void method7831(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt3389 = arg1.method6041();
		} else if (arg0 == 1) {
			this.anInt3387 = arg1.method6041();
		} else if (arg0 == 2) {
			this.anInt3384 = arg1.method6006();
		}
	}
}
