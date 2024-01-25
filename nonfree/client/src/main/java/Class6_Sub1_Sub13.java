import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class6_Sub1_Sub13 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
	private int anInt3384 = 1;

	@OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
	private int anInt3389 = 204;

	@OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
	private int anInt3386 = 1;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			for (@Pc(22) int local22 = 0; local22 < Static289.anInt5549; local22++) {
				@Pc(28) int local28 = Static473.anIntArray730[local22];
				@Pc(32) int local32 = Static346.anIntArray472[arg0];
				@Pc(39) int local39 = local28 * this.anInt3386 >> 12;
				@Pc(46) int local46 = this.anInt3384 * local32 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt3386) * this.anInt3386;
				@Pc(66) int local66 = local32 % (4096 / this.anInt3384) * this.anInt3384;
				if (this.anInt3389 > local66) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt3389 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt3389 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt3386 = arg1.method4966();
		} else if (arg0 == 1) {
			this.anInt3384 = arg1.method4966();
		} else if (arg0 == 2) {
			this.anInt3389 = arg1.method4999();
		}
	}
}
