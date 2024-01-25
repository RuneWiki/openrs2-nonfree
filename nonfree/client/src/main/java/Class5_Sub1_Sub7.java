import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class5_Sub1_Sub7 extends Class5_Sub1 {

	@OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
	private int anInt661 = 1;

	@OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
	private int anInt663 = 1;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "I")
	private int anInt664 = 204;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5770(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass239_41.method5400(arg0);
		if (super.aClass239_41.aBoolean460) {
			for (@Pc(25) int local25 = 0; local25 < Static148.anInt2666; local25++) {
				@Pc(31) int local31 = Static224.anIntArray234[local25];
				@Pc(35) int local35 = Static346.anIntArray401[arg0];
				@Pc(42) int local42 = this.anInt661 * local31 >> 12;
				@Pc(49) int local49 = this.anInt663 * local35 >> 12;
				@Pc(59) int local59 = this.anInt661 * (local31 % (4096 / this.anInt661));
				@Pc(69) int local69 = this.anInt663 * (local35 % (4096 / this.anInt663));
				if (local69 < this.anInt664) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local13[local25] = 0;
						continue;
					}
					if (local59 < this.anInt664) {
						local13[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt664) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 > 0) {
						local13[local25] = 0;
						continue;
					}
				}
				local13[local25] = 4096;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!fh;B)V")
	@Override
	public void method5771(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt661 = arg1.method5539();
		} else if (arg0 == 1) {
			this.anInt663 = arg1.method5539();
		} else if (arg0 == 2) {
			this.anInt664 = arg1.method5598();
		}
	}
}
