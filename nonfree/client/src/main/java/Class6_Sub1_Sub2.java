import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "[I")
	private int[] anIntArray103;

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "[I")
	private int[] anIntArray104;

	@OriginalMember(owner = "client!ch", name = "F", descriptor = "I")
	private int anInt1532 = 2048;

	@OriginalMember(owner = "client!ch", name = "G", descriptor = "I")
	private int anInt1533 = 0;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	private int anInt1537 = 10;

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(25) int local25 = Static346.anIntArray472[arg0];
			@Pc(34) int local34;
			if (this.anInt1533 == 0) {
				@Pc(142) short local142 = 0;
				for (local34 = 0; local34 < this.anInt1537; local34++) {
					if (local25 >= this.anIntArray104[local34] && this.anIntArray104[local34 + 1] > local25) {
						if (local25 < this.anIntArray103[local34]) {
							local142 = 4096;
						}
						break;
					}
				}
				Static589.method5379(local17, 0, Static289.anInt5549, local142);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static289.anInt5549; local30++) {
					local34 = 0;
					@Pc(36) short local36 = 0;
					@Pc(40) int local40 = Static473.anIntArray730[local30];
					@Pc(43) int local43 = this.anInt1533;
					if (local43 == 1) {
						local34 = local40;
					} else if (local43 == 2) {
						local34 = (local40 + local25 - 4096 >> 1) + 2048;
					} else if (local43 == 3) {
						local34 = (local40 - local25 >> 1) + 2048;
					}
					for (local43 = 0; local43 < this.anInt1537; local43++) {
						if (this.anIntArray104[local43] <= local34 && local34 < this.anIntArray104[local43 + 1]) {
							if (this.anIntArray103[local43] > local34) {
								local36 = 4096;
							}
							break;
						}
					}
					local17[local30] = local36;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
	@Override
	public void method8160() {
		this.method1365();
	}

	@OriginalMember(owner = "client!ch", name = "d", descriptor = "(B)V")
	private void method1365() {
		this.anIntArray103 = new int[this.anInt1537 + 1];
		this.anIntArray104 = new int[this.anInt1537 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt1537;
		@Pc(33) int local33 = local26 * this.anInt1532 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt1537; local43++) {
			this.anIntArray104[local43] = local21;
			this.anIntArray103[local43] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray104[this.anInt1537] = 4096;
		this.anIntArray103[this.anInt1537] = this.anIntArray103[0] + 4096;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt1537 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt1532 = arg1.method4999();
		} else if (arg0 == 2) {
			this.anInt1533 = arg1.method4966();
		}
	}
}
