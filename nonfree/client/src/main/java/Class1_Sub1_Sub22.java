import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class1_Sub1_Sub22 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!lr", name = "X", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!lr", name = "R", descriptor = "I")
	private int anInt3832 = 0;

	@OriginalMember(owner = "client!lr", name = "N", descriptor = "I")
	private int anInt3828 = 10;

	@OriginalMember(owner = "client!lr", name = "Y", descriptor = "I")
	private int anInt3838 = 2048;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub22() {
		super(0, true);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method5627() {
		this.method3112();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!dh;I)V")
	@Override
	public void method5619(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt3828 = arg1.method4463();
		} else if (arg0 == 1) {
			this.anInt3838 = arg1.method4485();
		} else if (arg0 == 2) {
			this.anInt3832 = arg1.method4463();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5622(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass109_41.method2236(arg0);
		if (super.aClass109_41.aBoolean214) {
			@Pc(24) int local24 = Static221.anIntArray194[arg0];
			@Pc(33) int local33;
			if (this.anInt3832 == 0) {
				@Pc(137) short local137 = 0;
				for (local33 = 0; local33 < this.anInt3828; local33++) {
					if (this.anIntArray201[local33] <= local24 && local24 < this.anIntArray201[local33 + 1]) {
						if (this.anIntArray202[local33] > local24) {
							local137 = 4096;
						}
						break;
					}
				}
				Static459.method2113(local16, 0, Static434.anInt4326, local137);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static434.anInt4326; local29++) {
					local33 = 0;
					@Pc(35) short local35 = 0;
					@Pc(39) int local39 = Static280.anIntArray238[local29];
					@Pc(42) int local42 = this.anInt3832;
					if (local42 == 1) {
						local33 = local39;
					} else if (local42 == 2) {
						local33 = (local24 + local39 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local33 = (local39 - local24 >> 1) + 2048;
					}
					for (local42 = 0; local42 < this.anInt3828; local42++) {
						if (local33 >= this.anIntArray201[local42] && local33 < this.anIntArray201[local42 + 1]) {
							if (this.anIntArray202[local42] > local33) {
								local35 = 4096;
							}
							break;
						}
					}
					local16[local29] = local35;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)V")
	private void method3112() {
		this.anIntArray201 = new int[this.anInt3828 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray202 = new int[this.anInt3828 + 1];
		@Pc(36) int local36 = 4096 / this.anInt3828;
		@Pc(43) int local43 = this.anInt3838 * local36 >> 12;
		for (@Pc(45) int local45 = 0; local45 < this.anInt3828; local45++) {
			this.anIntArray201[local45] = local14;
			this.anIntArray202[local45] = local14 + local43;
			local14 += local36;
		}
		this.anIntArray201[this.anInt3828] = 4096;
		this.anIntArray202[this.anInt3828] = this.anIntArray202[0] + 4096;
	}
}
