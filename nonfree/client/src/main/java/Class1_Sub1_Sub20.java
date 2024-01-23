import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class1_Sub1_Sub20 extends Class1_Sub1 {

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "[I")
	private int[] anIntArray290;

	@OriginalMember(owner = "client!oa", name = "gb", descriptor = "I")
	private int anInt3330 = 0;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "I")
	private int anInt3321 = 2048;

	@OriginalMember(owner = "client!oa", name = "cb", descriptor = "I")
	private int anInt3326 = 10;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!vf;II)V")
	@Override
	public void method3711(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3326 = arg0.method2945();
		} else if (arg1 == 1) {
			this.anInt3321 = arg0.method2964();
		} else if (arg1 == 2) {
			this.anInt3330 = arg0.method2945();
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3705(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass37_41.method1168(arg0);
		if (super.aClass37_41.aBoolean131) {
			@Pc(21) int local21 = Static187.anIntArray345[arg0];
			@Pc(30) int local30;
			if (this.anInt3330 == 0) {
				@Pc(131) short local131 = 0;
				for (local30 = 0; local30 < this.anInt3326; local30++) {
					if (local21 >= this.anIntArray290[local30] && local21 < this.anIntArray290[local30 + 1]) {
						if (local21 < this.anIntArray289[local30]) {
							local131 = 4096;
						}
						break;
					}
				}
				Static236.method301(local13, 0, Static11.anInt294, local131);
			} else {
				for (@Pc(26) int local26 = 0; local26 < Static11.anInt294; local26++) {
					local30 = 0;
					@Pc(32) short local32 = 0;
					@Pc(36) int local36 = Static36.anIntArray81[local26];
					@Pc(39) int local39 = this.anInt3330;
					if (local39 == 1) {
						local30 = local36;
					} else if (local39 == 2) {
						local30 = (local36 + local21 - 4096 >> 1) + 2048;
					} else if (local39 == 3) {
						local30 = (local36 - local21 >> 1) + 2048;
					}
					for (local39 = 0; local39 < this.anInt3326; local39++) {
						if (this.anIntArray290[local39] <= local30 && this.anIntArray290[local39 + 1] > local30) {
							if (this.anIntArray289[local39] > local30) {
								local32 = 4096;
							}
							break;
						}
					}
					local13[local26] = local32;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	@Override
	public void method3716() {
		this.method2475();
	}

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
	private void method2475() {
		this.anIntArray290 = new int[this.anInt3326 + 1];
		@Pc(14) int local14 = 0;
		@Pc(23) int local23 = 4096 / this.anInt3326;
		this.anIntArray289 = new int[this.anInt3326 + 1];
		@Pc(37) int local37 = local23 * this.anInt3321 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt3326; local39++) {
			this.anIntArray290[local39] = local14;
			this.anIntArray289[local39] = local14 + local37;
			local14 += local23;
		}
		this.anIntArray290[this.anInt3326] = 4096;
		this.anIntArray289[this.anInt3326] = this.anIntArray289[0] + 4096;
	}
}
