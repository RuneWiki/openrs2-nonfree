import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class6_Sub8_Sub7 extends Class6_Sub8 {

	@OriginalMember(owner = "client!fi", name = "E", descriptor = "I")
	private int anInt3385 = 204;

	@OriginalMember(owner = "client!fi", name = "I", descriptor = "I")
	private int anInt3390 = 1;

	@OriginalMember(owner = "client!fi", name = "C", descriptor = "I")
	private int anInt3393 = 1;

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			for (@Pc(25) int local25 = 0; local25 < Static83.anInt1268; local25++) {
				@Pc(31) int local31 = Static2.anIntArray1[local25];
				@Pc(35) int local35 = Static424.anIntArray466[arg0];
				@Pc(42) int local42 = this.anInt3390 * local31 >> 12;
				@Pc(49) int local49 = local35 * this.anInt3393 >> 12;
				@Pc(59) int local59 = this.anInt3390 * (local31 % (4096 / this.anInt3390));
				@Pc(69) int local69 = this.anInt3393 * (local35 % (4096 / this.anInt3393));
				if (local69 < this.anInt3385) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local11[local25] = 0;
						continue;
					}
					if (local59 < this.anInt3385) {
						local11[local25] = 0;
						continue;
					}
				}
				if (this.anInt3385 > local59) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local11[local25] = 0;
						continue;
					}
				}
				local11[local25] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt3390 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt3393 = arg1.method3030();
		} else if (arg0 == 2) {
			this.anInt3385 = arg1.method3018();
		}
	}
}
