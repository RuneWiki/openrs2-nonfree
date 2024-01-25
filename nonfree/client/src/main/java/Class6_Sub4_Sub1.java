import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class6_Sub4_Sub1 extends Class6_Sub4 {

	@OriginalMember(owner = "client!an", name = "E", descriptor = "I")
	private int anInt511 = 204;

	@OriginalMember(owner = "client!an", name = "O", descriptor = "I")
	private int anInt520 = 1;

	@OriginalMember(owner = "client!an", name = "I", descriptor = "I")
	private int anInt514 = 1;

	@OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub1() {
		super(0, true);
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7753(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass187_41.method4558(arg0);
		if (super.aClass187_41.aBoolean374) {
			for (@Pc(25) int local25 = 0; local25 < Static408.anInt7209; local25++) {
				@Pc(31) int local31 = Static398.anIntArray514[local25];
				@Pc(35) int local35 = Static501.anIntArray637[arg0];
				@Pc(42) int local42 = local31 * this.anInt514 >> 12;
				@Pc(49) int local49 = this.anInt520 * local35 >> 12;
				@Pc(59) int local59 = this.anInt514 * (local31 % (4096 / this.anInt514));
				@Pc(69) int local69 = local35 % (4096 / this.anInt520) * this.anInt520;
				if (this.anInt511 > local69) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt511 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt511) {
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

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!ji;)V")
	@Override
	public void method7750(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt514 = arg1.method6069();
		} else if (arg0 == 1) {
			this.anInt520 = arg1.method6069();
		} else if (arg0 == 2) {
			this.anInt511 = arg1.method6003();
		}
	}
}
