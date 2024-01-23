import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class1_Sub2_Sub37 extends Class1_Sub2 {

	@OriginalMember(owner = "client!vd", name = "U", descriptor = "[I")
	private int[] anIntArray505;

	@OriginalMember(owner = "client!vd", name = "V", descriptor = "[I")
	private int[] anIntArray506;

	@OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
	private int anInt5576 = 2048;

	@OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
	private int anInt5579 = 10;

	@OriginalMember(owner = "client!vd", name = "M", descriptor = "I")
	private int anInt5575 = 0;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub37() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method4577(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = this.aClass65_41.method1368(arg0);
		if (this.aClass65_41.aBoolean137) {
			@Pc(24) int local24 = Static7.anIntArray13[arg0];
			@Pc(35) int local35;
			if (this.anInt5575 == 0) {
				@Pc(141) short local141 = 0;
				for (local35 = 0; local35 < this.anInt5579; local35++) {
					if (local24 >= this.anIntArray506[local35] && local24 < this.anIntArray506[local35 + 1]) {
						if (this.anIntArray505[local35] > local24) {
							local141 = 4096;
						}
						break;
					}
				}
				Static319.method514(local16, 0, Static299.anInt5670, local141);
			} else {
				for (@Pc(30) int local30 = 0; local30 < Static299.anInt5670; local30++) {
					local35 = 0;
					@Pc(37) short local37 = 0;
					@Pc(41) int local41 = Static310.anIntArray108[local30];
					@Pc(44) int local44 = this.anInt5575;
					if (local44 == 1) {
						local35 = local41;
					} else if (local44 == 2) {
						local35 = (local24 + local41 - 4096 >> 1) + 2048;
					} else if (local44 == 3) {
						local35 = (local41 - local24 >> 1) + 2048;
					}
					for (local44 = 0; local44 < this.anInt5579; local44++) {
						if (this.anIntArray506[local44] <= local35 && local35 < this.anIntArray506[local44 + 1]) {
							if (this.anIntArray505[local44] > local35) {
								local37 = 4096;
							}
							break;
						}
					}
					local16[local30] = local37;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "(I)V")
	private void method4391() {
		this.anIntArray505 = new int[this.anInt5579 + 1];
		this.anIntArray506 = new int[this.anInt5579 + 1];
		@Pc(21) int local21 = 0;
		@Pc(30) int local30 = 4096 / this.anInt5579;
		@Pc(37) int local37 = this.anInt5576 * local30 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt5579; local39++) {
			this.anIntArray506[local39] = local21;
			this.anIntArray505[local39] = local21 + local37;
			local21 += local30;
		}
		this.anIntArray506[this.anInt5579] = 4096;
		this.anIntArray505[this.anInt5579] = this.anIntArray505[0] + 4096;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!sb;I)V")
	@Override
	public void method4582(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5579 = arg0.method2595();
		} else if (arg1 == 1) {
			this.anInt5576 = arg0.method2593();
		} else if (arg1 == 2) {
			this.anInt5575 = arg0.method2595();
		}
	}

	@OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)V")
	@Override
	public void method4578() {
		this.method4391();
	}
}
