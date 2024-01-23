import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub30 extends Class1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "G", descriptor = "[I")
	private int[] anIntArray516;

	@OriginalMember(owner = "client!sf", name = "V", descriptor = "[I")
	private int[] anIntArray517;

	@OriginalMember(owner = "client!sf", name = "F", descriptor = "I")
	private int anInt4635 = 2048;

	@OriginalMember(owner = "client!sf", name = "K", descriptor = "I")
	private int anInt4636 = 10;

	@OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
	private int anInt4644 = 0;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method4465(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass190_41.method4648(arg0);
		if (this.aClass190_41.aBoolean527) {
			@Pc(27) int local27 = Static10.anIntArray604[arg0];
			@Pc(37) int local37;
			if (this.anInt4644 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt4636; local37++) {
					if (local27 >= this.anIntArray517[local37] && local27 < this.anIntArray517[local37 + 1]) {
						if (local27 < this.anIntArray516[local37]) {
							local35 = 4096;
						}
						break;
					}
				}
				Static317.method1052(local18, 0, Static6.anInt4960, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static6.anInt4960; local85++) {
					local37 = 0;
					@Pc(96) short local96 = 0;
					@Pc(100) int local100 = Static298.anIntArray589[local85];
					@Pc(103) int local103 = this.anInt4644;
					if (local103 == 1) {
						local37 = local100;
					} else if (local103 == 2) {
						local37 = (local27 + local100 - 4096 >> 1) + 2048;
					} else if (local103 == 3) {
						local37 = (local100 - local27 >> 1) + 2048;
					}
					for (local103 = 0; local103 < this.anInt4636; local103++) {
						if (this.anIntArray517[local103] <= local37 && local37 < this.anIntArray517[local103 + 1]) {
							if (this.anIntArray516[local103] > local37) {
								local96 = 4096;
							}
							break;
						}
					}
					local18[local85] = local96;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4636 = arg0.method1853();
		} else if (arg1 == 1) {
			this.anInt4635 = arg0.method1879();
		} else if (arg1 == 2) {
			this.anInt4644 = arg0.method1853();
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(B)V")
	@Override
	public void method4460() {
		this.method3953();
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "(I)V")
	private void method3953() {
		this.anIntArray517 = new int[this.anInt4636 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray516 = new int[this.anInt4636 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4636;
		@Pc(33) int local33 = this.anInt4635 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4636; local35++) {
			this.anIntArray517[local35] = local14;
			this.anIntArray516[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray517[this.anInt4636] = 4096;
		this.anIntArray516[this.anInt4636] = this.anIntArray516[0] + 4096;
	}
}
