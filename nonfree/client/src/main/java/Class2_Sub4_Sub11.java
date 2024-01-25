import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fj")
public final class Class2_Sub4_Sub11 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "[I")
	private int[] anIntArray217;

	@OriginalMember(owner = "client!fj", name = "N", descriptor = "[I")
	private int[] anIntArray218;

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
	private int anInt3312 = 0;

	@OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
	private int anInt3310 = 2048;

	@OriginalMember(owner = "client!fj", name = "P", descriptor = "I")
	private int anInt3314 = 10;

	@OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub11() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3314 = arg0.method2859();
		} else if (arg1 == 1) {
			this.anInt3310 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt3312 = arg0.method2859();
		}
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8900(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass348_41.method8072(arg0);
		if (super.aClass348_41.aBoolean680) {
			@Pc(24) int local24 = Static415.anIntArray482[arg0];
			@Pc(33) int local33;
			if (this.anInt3312 == 0) {
				@Pc(141) short local141 = 0;
				for (local33 = 0; local33 < this.anInt3314; local33++) {
					if (this.anIntArray217[local33] <= local24 && this.anIntArray217[local33 + 1] > local24) {
						if (local24 < this.anIntArray218[local33]) {
							local141 = 4096;
						}
						break;
					}
				}
				Static650.method2272(local16, 0, Static395.anInt6816, local141);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static395.anInt6816; local29++) {
					local33 = 0;
					@Pc(35) short local35 = 0;
					@Pc(39) int local39 = Static20.anIntArray40[local29];
					@Pc(42) int local42 = this.anInt3312;
					if (local42 == 1) {
						local33 = local39;
					} else if (local42 == 2) {
						local33 = (local39 + local24 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local33 = (local39 - local24 >> 1) + 2048;
					}
					for (local42 = 0; local42 < this.anInt3314; local42++) {
						if (local33 >= this.anIntArray217[local42] && local33 < this.anIntArray217[local42 + 1]) {
							if (local33 < this.anIntArray218[local42]) {
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

	@OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)V")
	@Override
	public void method8902() {
		this.method2806();
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
	private void method2806() {
		@Pc(7) int local7 = 0;
		this.anIntArray218 = new int[this.anInt3314 + 1];
		this.anIntArray217 = new int[this.anInt3314 + 1];
		@Pc(26) int local26 = 4096 / this.anInt3314;
		@Pc(33) int local33 = this.anInt3310 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3314; local35++) {
			this.anIntArray217[local35] = local7;
			this.anIntArray218[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray217[this.anInt3314] = 4096;
		this.anIntArray218[this.anInt3314] = this.anIntArray218[0] + 4096;
	}
}
