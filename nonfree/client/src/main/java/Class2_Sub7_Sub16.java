import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub7_Sub16 extends Class2_Sub7 {

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "[I")
	private int[] anIntArray385;

	@OriginalMember(owner = "client!ic", name = "T", descriptor = "[I")
	private int[] anIntArray386;

	@OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
	private int anInt3581 = 10;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
	private int anInt3584 = 2048;

	@OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
	private int anInt3585 = 0;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class2_Sub7_Sub16() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
	private void method3199() {
		@Pc(7) int local7 = 0;
		this.anIntArray385 = new int[this.anInt3581 + 1];
		this.anIntArray386 = new int[this.anInt3581 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3581;
		@Pc(33) int local33 = this.anInt3584 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3581; local35++) {
			this.anIntArray386[local35] = local7;
			this.anIntArray385[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray386[this.anInt3581] = 4096;
		this.anIntArray385[this.anInt3581] = this.anIntArray385[0] + 4096;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void method7583() {
		this.method3199();
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method7587(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass221_41.method5903(arg0);
		if (super.aClass221_41.aBoolean523) {
			@Pc(27) int local27 = Static313.anIntArray521[arg0];
			@Pc(37) int local37;
			if (this.anInt3585 == 0) {
				@Pc(35) short local35 = 0;
				for (local37 = 0; local37 < this.anInt3581; local37++) {
					if (this.anIntArray386[local37] <= local27 && this.anIntArray386[local37 + 1] > local27) {
						if (this.anIntArray385[local37] > local27) {
							local35 = 4096;
						}
						break;
					}
				}
				Static553.method3371(local11, 0, Static352.anInt6485, local35);
			} else {
				for (@Pc(85) int local85 = 0; local85 < Static352.anInt6485; local85++) {
					local37 = 0;
					@Pc(91) short local91 = 0;
					@Pc(95) int local95 = Static427.anIntArray602[local85];
					@Pc(98) int local98 = this.anInt3585;
					if (local98 == 1) {
						local37 = local95;
					} else if (local98 == 2) {
						local37 = (local95 + local27 - 4096 >> 1) + 2048;
					} else if (local98 == 3) {
						local37 = (local95 - local27 >> 1) + 2048;
					}
					for (local98 = 0; local98 < this.anInt3581; local98++) {
						if (this.anIntArray386[local98] <= local37 && this.anIntArray386[local98 + 1] > local37) {
							if (local37 < this.anIntArray385[local98]) {
								local91 = 4096;
							}
							break;
						}
					}
					local11[local85] = local91;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLclient!ps;)V")
	@Override
	public void method7582(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub29 arg1) {
		if (arg0 == 0) {
			this.anInt3581 = arg1.method5170();
		} else if (arg0 == 1) {
			this.anInt3584 = arg1.method5229();
		} else if (arg0 == 2) {
			this.anInt3585 = arg1.method5170();
		}
	}
}
