import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub1_Sub30 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ud", name = "R", descriptor = "[I")
	private int[] anIntArray372;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "[I")
	private int[] anIntArray373;

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
	private int anInt3811 = 0;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
	private int anInt3813 = 10;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
	private int anInt3814 = 2048;

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
	@Override
	public void method3260() {
		this.method2893();
	}

	@OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
	private void method2893() {
		this.anIntArray373 = new int[this.anInt3813 + 1];
		this.anIntArray372 = new int[this.anInt3813 + 1];
		@Pc(28) int local28 = 4096 / this.anInt3813;
		@Pc(35) int local35 = this.anInt3814 * local28 >> 12;
		@Pc(37) int local37 = 0;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3813; local39++) {
			this.anIntArray372[local39] = local37;
			this.anIntArray373[local39] = local37 + local35;
			local37 += local28;
		}
		this.anIntArray372[this.anInt3813] = 4096;
		this.anIntArray373[this.anInt3813] = this.anIntArray373[0] + 4096;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(24) int local24 = Static81.anIntArray174[arg0];
			@Pc(33) int local33;
			if (this.anInt3811 == 0) {
				@Pc(133) short local133 = 0;
				for (local33 = 0; local33 < this.anInt3813; local33++) {
					if (local24 >= this.anIntArray372[local33] && this.anIntArray372[local33 + 1] > local24) {
						if (this.anIntArray373[local33] > local24) {
							local133 = 4096;
						}
						break;
					}
				}
				Static222.method2223(local16, 0, Static135.anInt2897, local133);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static135.anInt2897; local29++) {
					local33 = 0;
					@Pc(37) int local37 = Static107.anIntArray304[local29];
					@Pc(39) short local39 = 0;
					@Pc(42) int local42 = this.anInt3811;
					if (local42 == 1) {
						local33 = local37;
					} else if (local42 == 2) {
						local33 = (local24 + local37 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local33 = (local37 - local24 >> 1) + 2048;
					}
					for (local42 = 0; local42 < this.anInt3813; local42++) {
						if (local33 >= this.anIntArray372[local42] && local33 < this.anIntArray372[local42 + 1]) {
							if (this.anIntArray373[local42] > local33) {
								local39 = 4096;
							}
							break;
						}
					}
					local16[local29] = local39;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3813 = arg0.method260();
		} else if (arg1 == 1) {
			this.anInt3814 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt3811 = arg0.method260();
		}
	}
}
