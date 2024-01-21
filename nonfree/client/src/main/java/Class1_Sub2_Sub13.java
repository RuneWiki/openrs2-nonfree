import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!di", name = "ib", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "I")
	private int anInt1369;

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
	private int anInt1371;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
	private int anInt1373;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IILclient!fa;)V")
	@Override
	public void method3393(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub9 arg1) {
		if (arg0 == 0) {
			this.anInt1371 = arg1.method1234();
		} else if (arg0 == 1) {
			this.anInt1369 = arg1.method1280();
		} else if (arg0 == 2) {
			this.anInt1373 = arg1.method1234();
		}
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3398(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass85_41.method3438(arg0);
		if (super.aClass85_41.aBoolean177) {
			@Pc(23) int local23 = Static160.anIntArray399[arg0];
			@Pc(34) int local34;
			if (this.anInt1373 == 0) {
				@Pc(144) short local144 = 0;
				for (local34 = 0; local34 < this.anInt1371; local34++) {
					if (this.anIntArray126[local34] <= local23 && this.anIntArray126[local34 + 1] > local23) {
						if (this.anIntArray127[local34] > local23) {
							local144 = 4096;
						}
						break;
					}
				}
				Static188.method2301(local15, 0, Static22.anInt596, local144);
			} else {
				for (@Pc(28) int local28 = 0; local28 < Static22.anInt596; local28++) {
					@Pc(32) short local32 = 0;
					local34 = 0;
					@Pc(38) int local38 = Static167.anIntArray417[local28];
					@Pc(41) int local41 = this.anInt1373;
					if (local41 == 1) {
						local34 = local38;
					} else if (local41 == 2) {
						local34 = (local38 + local23 - 4096 >> 1) + 2048;
					} else if (local41 == 3) {
						local34 = (local38 - local23 >> 1) + 2048;
					}
					for (local41 = 0; local41 < this.anInt1371; local41++) {
						if (this.anIntArray126[local41] <= local34 && this.anIntArray126[local41 + 1] > local34) {
							if (local34 < this.anIntArray127[local41]) {
								local32 = 4096;
							}
							break;
						}
					}
					local15[local28] = local32;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V")
	@Override
	public void method3389() {
		this.method1008();
	}

	@OriginalMember(owner = "client!di", name = "g", descriptor = "(I)V")
	private void method1008() {
		this.anIntArray127 = new int[this.anInt1371 + 1];
		@Pc(10) int local10 = 0;
		this.anIntArray126 = new int[this.anInt1371 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1371;
		@Pc(33) int local33 = this.anInt1369 * local26 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt1371; local39++) {
			this.anIntArray126[local39] = local10;
			this.anIntArray127[local39] = local10 + local33;
			local10 += local26;
		}
		this.anIntArray126[this.anInt1371] = 4096;
		this.anIntArray127[this.anInt1371] = this.anIntArray127[0] + 4096;
	}
}
