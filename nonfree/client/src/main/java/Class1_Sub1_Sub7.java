import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "[I")
	private int[] anIntArray185;

	@OriginalMember(owner = "client!ff", name = "eb", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!ff", name = "Z", descriptor = "I")
	private int anInt1815 = 10;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	private int anInt1813 = 2048;

	@OriginalMember(owner = "client!ff", name = "U", descriptor = "I")
	private int anInt1811 = 0;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(ZI)[I")
	@Override
	public int[] method4757(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = this.aClass114_41.method3364(arg0);
		if (this.aClass114_41.aBoolean211) {
			@Pc(25) int local25 = Static98.anIntArray221[arg0];
			@Pc(35) int local35;
			if (this.anInt1811 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt1815; local35++) {
					if (this.anIntArray185[local35] <= local25 && local25 < this.anIntArray185[local35 + 1]) {
						if (local25 < this.anIntArray187[local35]) {
							local33 = 4096;
						}
						break;
					}
				}
				Static302.method1371(local17, 0, Static75.anInt1848, local33);
			} else {
				for (@Pc(84) int local84 = 0; local84 < Static75.anInt1848; local84++) {
					local35 = 0;
					@Pc(95) short local95 = 0;
					@Pc(99) int local99 = Static157.anIntArray331[local84];
					@Pc(102) int local102 = this.anInt1811;
					if (local102 == 1) {
						local35 = local99;
					} else if (local102 == 2) {
						local35 = (local99 + local25 - 4096 >> 1) + 2048;
					} else if (local102 == 3) {
						local35 = (local99 - local25 >> 1) + 2048;
					}
					for (local102 = 0; local102 < this.anInt1815; local102++) {
						if (this.anIntArray185[local102] <= local35 && this.anIntArray185[local102 + 1] > local35) {
							if (local35 < this.anIntArray187[local102]) {
								local95 = 4096;
							}
							break;
						}
					}
					local17[local84] = local95;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!im;I)V")
	@Override
	public void method4760(@OriginalArg(1) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1815 = arg0.method2655();
		} else if (arg1 == 1) {
			this.anInt1813 = arg0.method2652();
		} else if (arg1 == 2) {
			this.anInt1811 = arg0.method2655();
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)V")
	@Override
	public void method4756() {
		this.method1366();
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V")
	private void method1366() {
		this.anIntArray185 = new int[this.anInt1815 + 1];
		@Pc(17) int local17 = 4096 / this.anInt1815;
		@Pc(24) int local24 = local17 * this.anInt1813 >> 12;
		this.anIntArray187 = new int[this.anInt1815 + 1];
		@Pc(41) int local41 = 0;
		for (@Pc(43) int local43 = 0; local43 < this.anInt1815; local43++) {
			this.anIntArray185[local43] = local41;
			this.anIntArray187[local43] = local41 + local24;
			local41 += local17;
		}
		this.anIntArray185[this.anInt1815] = 4096;
		this.anIntArray187[this.anInt1815] = this.anIntArray187[0] + 4096;
	}
}
