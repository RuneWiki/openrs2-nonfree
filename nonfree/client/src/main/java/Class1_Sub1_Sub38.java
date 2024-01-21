import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!w", name = "R", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!w", name = "ab", descriptor = "[I")
	private int[] anIntArray403;

	@OriginalMember(owner = "client!w", name = "P", descriptor = "I")
	private int anInt4552 = 2048;

	@OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
	private int anInt4562 = 0;

	@OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
	private int anInt4563 = 10;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3571(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass40_41.method1362(arg0);
		if (super.aClass40_41.aBoolean86) {
			@Pc(24) int local24 = Static187.anIntArray362[arg0];
			@Pc(36) int local36;
			if (this.anInt4562 == 0) {
				@Pc(139) short local139 = 0;
				for (local36 = 0; local36 < this.anInt4563; local36++) {
					if (this.anIntArray401[local36] <= local24 && local24 < this.anIntArray401[local36 + 1]) {
						if (local24 < this.anIntArray403[local36]) {
							local139 = 4096;
						}
						break;
					}
				}
				Static214.method349(local16, 0, Static115.anInt2578, local139);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static115.anInt2578; local32++) {
					local36 = 0;
					@Pc(40) int local40 = Static45.anIntArray97[local32];
					@Pc(42) short local42 = 0;
					@Pc(45) int local45 = this.anInt4562;
					if (local45 == 1) {
						local36 = local40;
					} else if (local45 == 2) {
						local36 = (local40 + local24 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local40 - local24 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt4563; local45++) {
						if (local36 >= this.anIntArray401[local45] && this.anIntArray401[local45 + 1] > local36) {
							if (local36 < this.anIntArray403[local45]) {
								local42 = 4096;
							}
							break;
						}
					}
					local16[local32] = local42;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!w", name = "g", descriptor = "(I)V")
	private void method3449() {
		this.anIntArray403 = new int[this.anInt4563 + 1];
		this.anIntArray401 = new int[this.anInt4563 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt4563;
		@Pc(33) int local33 = this.anInt4552 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4563; local35++) {
			this.anIntArray401[local35] = local21;
			this.anIntArray403[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray401[this.anInt4563] = 4096;
		this.anIntArray403[this.anInt4563] = this.anIntArray403[0] + 4096;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4563 = arg0.method2771();
		} else if (arg1 == 1) {
			this.anInt4552 = arg0.method2765();
		} else if (arg1 == 2) {
			this.anInt4562 = arg0.method2771();
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V")
	@Override
	public void method3569() {
		this.method3449();
	}
}
