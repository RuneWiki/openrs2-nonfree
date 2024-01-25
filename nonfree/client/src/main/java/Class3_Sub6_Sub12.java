import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fp")
public final class Class3_Sub6_Sub12 extends Class3_Sub6 {

	@OriginalMember(owner = "client!fp", name = "D", descriptor = "[I")
	private int[] anIntArray153;

	@OriginalMember(owner = "client!fp", name = "P", descriptor = "[I")
	private int[] anIntArray154;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private int anInt3238 = 10;

	@OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
	private int anInt3244 = 2048;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub12() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILclient!np;I)V")
	@Override
	public void method7771(@OriginalArg(1) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3238 = arg0.method5175();
		} else if (arg1 == 1) {
			this.anInt3244 = arg0.method5198();
		} else if (arg1 == 2) {
			this.anInt3240 = arg0.method5175();
		}
	}

	@OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
	private void method2916() {
		this.anIntArray153 = new int[this.anInt3238 + 1];
		@Pc(20) int local20 = 0;
		this.anIntArray154 = new int[this.anInt3238 + 1];
		@Pc(32) int local32 = 4096 / this.anInt3238;
		@Pc(39) int local39 = local32 * this.anInt3244 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt3238; local41++) {
			this.anIntArray154[local41] = local20;
			this.anIntArray153[local41] = local39 + local20;
			local20 += local32;
		}
		this.anIntArray154[this.anInt3238] = 4096;
		this.anIntArray153[this.anInt3238] = this.anIntArray153[0] + 4096;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V")
	@Override
	public void method7768() {
		this.method2916();
	}

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method7775(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass213_41.method4803(arg0);
		if (super.aClass213_41.aBoolean407) {
			@Pc(24) int local24 = Static525.anIntArray553[arg0];
			@Pc(31) int local31;
			if (this.anInt3240 == 0) {
				@Pc(29) short local29 = 0;
				for (local31 = 0; local31 < this.anInt3238; local31++) {
					if (local24 >= this.anIntArray154[local31] && local24 < this.anIntArray154[local31 + 1]) {
						if (local24 < this.anIntArray153[local31]) {
							local29 = 4096;
						}
						break;
					}
				}
				Static601.method2820(local16, 0, Static521.anInt8383, local29);
			} else {
				for (@Pc(79) int local79 = 0; local79 < Static521.anInt8383; local79++) {
					local31 = 0;
					@Pc(85) short local85 = 0;
					@Pc(89) int local89 = Static73.anIntArray76[local79];
					@Pc(92) int local92 = this.anInt3240;
					if (local92 == 1) {
						local31 = local89;
					} else if (local92 == 2) {
						local31 = (local24 + local89 - 4096 >> 1) + 2048;
					} else if (local92 == 3) {
						local31 = (local89 - local24 >> 1) + 2048;
					}
					for (local92 = 0; local92 < this.anInt3238; local92++) {
						if (this.anIntArray154[local92] <= local31 && local31 < this.anIntArray154[local92 + 1]) {
							if (this.anIntArray153[local92] > local31) {
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
