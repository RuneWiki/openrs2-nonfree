import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub1_Sub15 extends Class1_Sub1 {

	@OriginalMember(owner = "client!i", name = "cb", descriptor = "[I")
	private int[] anIntArray138;

	@OriginalMember(owner = "client!i", name = "gb", descriptor = "[I")
	private int[] anIntArray139;

	@OriginalMember(owner = "client!i", name = "fb", descriptor = "I")
	private int anInt1765 = 10;

	@OriginalMember(owner = "client!i", name = "nb", descriptor = "I")
	private int anInt1769 = 2048;

	@OriginalMember(owner = "client!i", name = "pb", descriptor = "I")
	private int anInt1770 = 0;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!i", name = "h", descriptor = "(I)V")
	private void method1206() {
		this.anIntArray139 = new int[this.anInt1765 + 1];
		this.anIntArray138 = new int[this.anInt1765 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt1765;
		@Pc(33) int local33 = this.anInt1769 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1765; local35++) {
			this.anIntArray139[local35] = local21;
			this.anIntArray138[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray139[this.anInt1765] = 4096;
		this.anIntArray138[this.anInt1765] = this.anIntArray138[0] + 4096;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(23) int local23 = Static193.anIntArray277[arg0];
			@Pc(35) int local35;
			if (this.anInt1770 == 0) {
				@Pc(149) short local149 = 0;
				for (local35 = 0; local35 < this.anInt1765; local35++) {
					if (this.anIntArray139[local35] <= local23 && this.anIntArray139[local35 + 1] > local23) {
						if (this.anIntArray138[local35] > local23) {
							local149 = 4096;
						}
						break;
					}
				}
				Static216.method2202(local11, 0, Static107.anInt2321, local149);
			} else {
				for (@Pc(31) int local31 = 0; local31 < Static107.anInt2321; local31++) {
					local35 = 0;
					@Pc(39) int local39 = Static204.anIntArray179[local31];
					@Pc(42) int local42 = this.anInt1770;
					if (local42 == 1) {
						local35 = local39;
					} else if (local42 == 2) {
						local35 = (local23 + local39 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local35 = (local39 - local23 >> 1) + 2048;
					}
					@Pc(84) short local84 = 0;
					for (local42 = 0; local42 < this.anInt1765; local42++) {
						if (local35 >= this.anIntArray139[local42] && local35 < this.anIntArray139[local42 + 1]) {
							if (local35 < this.anIntArray138[local42]) {
								local84 = 4096;
							}
							break;
						}
					}
					local11[local31] = local84;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1765 = arg0.method3010();
		} else if (arg1 == 1) {
			this.anInt1769 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt1770 = arg0.method3010();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		this.method1206();
	}
}
