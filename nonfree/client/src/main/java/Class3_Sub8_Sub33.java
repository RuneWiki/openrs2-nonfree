import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class3_Sub8_Sub33 extends Class3_Sub8 {

	@OriginalMember(owner = "client!to", name = "F", descriptor = "[I")
	private int[] anIntArray514;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "[I")
	private int[] anIntArray515;

	@OriginalMember(owner = "client!to", name = "L", descriptor = "I")
	private int anInt9522 = 10;

	@OriginalMember(owner = "client!to", name = "Q", descriptor = "I")
	private int anInt9527 = 2048;

	@OriginalMember(owner = "client!to", name = "M", descriptor = "I")
	private int anInt9523 = 0;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "()V")
	public Class3_Sub8_Sub33() {
		super(0, true);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!dt;Z)V")
	@Override
	public void method8785(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1) {
		if (arg0 == 0) {
			this.anInt9522 = arg1.method7954();
		} else if (arg0 == 1) {
			this.anInt9527 = arg1.method7951();
		} else if (arg0 == 2) {
			this.anInt9523 = arg1.method7954();
		}
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	@Override
	public void method8780() {
		this.method7773();
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method8784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass87_41.method1796(arg0);
		if (super.aClass87_41.aBoolean163) {
			@Pc(25) int local25 = Static510.anIntArray172[arg0];
			@Pc(32) int local32;
			if (this.anInt9523 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt9522; local32++) {
					if (this.anIntArray515[local32] <= local25 && local25 < this.anIntArray515[local32 + 1]) {
						if (local25 < this.anIntArray514[local32]) {
							local30 = 4096;
						}
						break;
					}
				}
				Static681.method4032(local11, 0, Static91.anInt1849, local30);
			} else {
				for (@Pc(76) int local76 = 0; local76 < Static91.anInt1849; local76++) {
					local32 = 0;
					@Pc(82) short local82 = 0;
					@Pc(86) int local86 = Static13.anIntArray11[local76];
					@Pc(89) int local89 = this.anInt9523;
					if (local89 == 1) {
						local32 = local86;
					} else if (local89 == 2) {
						local32 = (local25 + local86 - 4096 >> 1) + 2048;
					} else if (local89 == 3) {
						local32 = (local86 - local25 >> 1) + 2048;
					}
					for (local89 = 0; local89 < this.anInt9522; local89++) {
						if (local32 >= this.anIntArray515[local89] && this.anIntArray515[local89 + 1] > local32) {
							if (this.anIntArray514[local89] > local32) {
								local82 = 4096;
							}
							break;
						}
					}
					local11[local76] = local82;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	private void method7773() {
		this.anIntArray515 = new int[this.anInt9522 + 1];
		this.anIntArray514 = new int[this.anInt9522 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt9522;
		@Pc(33) int local33 = this.anInt9527 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt9522; local35++) {
			this.anIntArray515[local35] = local21;
			this.anIntArray514[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray515[this.anInt9522] = 4096;
		this.anIntArray514[this.anInt9522] = this.anIntArray514[0] + 4096;
	}
}
