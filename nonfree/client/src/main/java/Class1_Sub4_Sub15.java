import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jg")
public final class Class1_Sub4_Sub15 extends Class1_Sub4 {

	@OriginalMember(owner = "client!jg", name = "C", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!jg", name = "G", descriptor = "I")
	private int anInt3321 = 0;

	@OriginalMember(owner = "client!jg", name = "B", descriptor = "I")
	private int anInt3318 = 2048;

	@OriginalMember(owner = "client!jg", name = "I", descriptor = "I")
	private int anInt3323 = 10;

	@OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BILclient!hp;)V")
	@Override
	public void method5949(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub5 arg1) {
		if (arg0 == 0) {
			this.anInt3323 = arg1.method5366();
		} else if (arg0 == 1) {
			this.anInt3318 = arg1.method5362();
		} else if (arg0 == 2) {
			this.anInt3321 = arg1.method5366();
		}
	}

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "(I)V")
	private void method2892() {
		this.anIntArray295 = new int[this.anInt3323 + 1];
		this.anIntArray296 = new int[this.anInt3323 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt3323;
		@Pc(33) int local33 = this.anInt3318 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3323; local35++) {
			this.anIntArray296[local35] = local21;
			this.anIntArray295[local35] = local33 + local21;
			local21 += local26;
		}
		this.anIntArray296[this.anInt3323] = 4096;
		this.anIntArray295[this.anInt3323] = this.anIntArray295[0] + 4096;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	@Override
	public void method5950() {
		this.method2892();
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5957(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass15_41.method508(arg0);
		if (super.aClass15_41.aBoolean17) {
			@Pc(24) int local24 = Static266.anIntArray628[arg0];
			@Pc(31) int local31;
			if (this.anInt3321 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt3323; local31++) {
					if (local24 >= this.anIntArray296[local31] && local24 < this.anIntArray296[local31 + 1]) {
						if (local24 < this.anIntArray295[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static468.method4333(local16, 0, Static66.anInt1511, local29);
			} else {
				for (@Pc(79) int local79 = 0; local79 < Static66.anInt1511; local79++) {
					local31 = 0;
					@Pc(85) short local85 = 0;
					@Pc(89) int local89 = Static121.anIntArray197[local79];
					@Pc(92) int local92 = this.anInt3321;
					if (local92 == 1) {
						local31 = local89;
					} else if (local92 == 2) {
						local31 = (local24 + local89 - 4096 >> 1) + 2048;
					} else if (local92 == 3) {
						local31 = (local89 - local24 >> 1) + 2048;
					}
					for (local92 = 0; local92 < this.anInt3323; local92++) {
						if (this.anIntArray296[local92] <= local31 && this.anIntArray296[local92 + 1] > local31) {
							if (this.anIntArray295[local92] > local31) {
								local85 = 4096;
							}
							break;
						}
					}
					local16[local79] = local85;
				}
			}
		}
		return local16;
	}
}
