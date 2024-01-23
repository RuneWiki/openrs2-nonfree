import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class2_Sub1_Sub38 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vc", name = "Q", descriptor = "[I")
	private int[] anIntArray475;

	@OriginalMember(owner = "client!vc", name = "Z", descriptor = "[I")
	private int[] anIntArray476;

	@OriginalMember(owner = "client!vc", name = "X", descriptor = "I")
	private int anInt4607 = 2048;

	@OriginalMember(owner = "client!vc", name = "bb", descriptor = "I")
	private int anInt4610 = 10;

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "I")
	private int anInt4606 = 0;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub38() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	@Override
	public void method3207() {
		this.method3191();
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V")
	private void method3191() {
		this.anIntArray476 = new int[this.anInt4610 + 1];
		this.anIntArray475 = new int[this.anInt4610 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt4610;
		@Pc(33) int local33 = this.anInt4607 * local26 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt4610; local41++) {
			this.anIntArray475[local41] = local21;
			this.anIntArray476[local41] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray475[this.anInt4610] = 4096;
		this.anIntArray476[this.anInt4610] = this.anIntArray476[0] + 4096;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			@Pc(20) int local20 = Static97.anIntArray240[arg0];
			@Pc(30) int local30;
			if (this.anInt4606 == 0) {
				@Pc(28) short local28 = 0;
				for (local30 = 0; local30 < this.anInt4610; local30++) {
					if (local20 >= this.anIntArray475[local30] && local20 < this.anIntArray475[local30 + 1]) {
						if (this.anIntArray476[local30] > local20) {
							local28 = 4096;
						}
						break;
					}
				}
				Static225.method1840(local7, 0, Static62.anInt1675, local28);
			} else {
				for (@Pc(74) int local74 = 0; local74 < Static62.anInt1675; local74++) {
					local30 = 0;
					@Pc(80) short local80 = 0;
					@Pc(84) int local84 = Static20.anIntArray45[local74];
					@Pc(87) int local87 = this.anInt4606;
					if (local87 == 1) {
						local30 = local84;
					} else if (local87 == 2) {
						local30 = (local20 + local84 - 4096 >> 1) + 2048;
					} else if (local87 == 3) {
						local30 = (local84 - local20 >> 1) + 2048;
					}
					for (local87 = 0; local87 < this.anInt4610; local87++) {
						if (local30 >= this.anIntArray475[local87] && this.anIntArray475[local87 + 1] > local30) {
							if (this.anIntArray476[local87] > local30) {
								local80 = 4096;
							}
							break;
						}
					}
					local7[local74] = local80;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4610 = arg0.method209();
		} else if (arg1 == 1) {
			this.anInt4607 = arg0.method163();
		} else if (arg1 == 2) {
			this.anInt4606 = arg0.method209();
		}
	}
}
