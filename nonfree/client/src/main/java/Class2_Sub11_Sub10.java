import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class2_Sub11_Sub10 extends Class2_Sub11 {

	@OriginalMember(owner = "client!jda", name = "I", descriptor = "I")
	private int anInt4522 = 1;

	@OriginalMember(owner = "client!jda", name = "E", descriptor = "I")
	private int anInt4524 = 1;

	@OriginalMember(owner = "client!jda", name = "F", descriptor = "I")
	private int anInt4523 = 204;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method9531(@OriginalArg(0) int arg0) {
		@Pc(19) int[] local19 = super.aClass174_41.method3748(arg0, 1);
		if (super.aClass174_41.aBoolean369) {
			for (@Pc(25) int local25 = 0; local25 < Static301.anInt10214; local25++) {
				@Pc(31) int local31 = Static523.anIntArray461[local25];
				@Pc(35) int local35 = Static137.anIntArray170[arg0];
				@Pc(42) int local42 = this.anInt4522 * local31 >> 12;
				@Pc(49) int local49 = this.anInt4524 * local35 >> 12;
				@Pc(59) int local59 = this.anInt4522 * (local31 % (4096 / this.anInt4522));
				@Pc(69) int local69 = local35 % (4096 / this.anInt4524) * this.anInt4524;
				if (local69 < this.anInt4523) {
					for (local42 -= local49; local42 < 0; local42 += 4) {
					}
					while (local42 > 3) {
						local42 -= 4;
					}
					if (local42 != 1) {
						local19[local25] = 0;
						continue;
					}
					if (this.anInt4523 > local59) {
						local19[local25] = 0;
						continue;
					}
				}
				if (local59 < this.anInt4523) {
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

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!et;Z)V")
	@Override
	public void method9532(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt4522 = arg1.method8581(-17416);
		} else if (arg0 == 1) {
			this.anInt4524 = arg1.method8581(-17416);
		} else if (arg0 == 2) {
			this.anInt4523 = arg1.method8575();
		}
	}
}
