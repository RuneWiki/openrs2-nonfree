import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class3_Sub2_Sub35 extends Class3_Sub2 {

	@OriginalMember(owner = "client!rr", name = "F", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!rr", name = "I", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!rr", name = "H", descriptor = "I")
	private int anInt8489 = 0;

	@OriginalMember(owner = "client!rr", name = "G", descriptor = "I")
	private int anInt8488 = 10;

	@OriginalMember(owner = "client!rr", name = "M", descriptor = "I")
	private int anInt8493 = 2048;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub35() {
		super(0, true);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8664(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass84_41.method2125(arg0);
		if (super.aClass84_41.aBoolean201) {
			@Pc(25) int local25 = Static376.anIntArray665[arg0];
			@Pc(32) int local32;
			if (this.anInt8489 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt8488; local32++) {
					if (this.anIntArray534[local32] <= local25 && this.anIntArray534[local32 + 1] > local25) {
						if (this.anIntArray533[local32] > local25) {
							local30 = 4096;
						}
						break;
					}
				}
				Static651.method751(local17, 0, Static201.anInt3738, local30);
			} else {
				for (@Pc(80) int local80 = 0; local80 < Static201.anInt3738; local80++) {
					local32 = 0;
					@Pc(86) short local86 = 0;
					@Pc(90) int local90 = Static57.anIntArray536[local80];
					@Pc(93) int local93 = this.anInt8489;
					if (local93 == 1) {
						local32 = local90;
					} else if (local93 == 2) {
						local32 = (local90 + local25 - 4096 >> 1) + 2048;
					} else if (local93 == 3) {
						local32 = (local90 - local25 >> 1) + 2048;
					}
					for (local93 = 0; local93 < this.anInt8488; local93++) {
						if (local32 >= this.anIntArray534[local93] && local32 < this.anIntArray534[local93 + 1]) {
							if (local32 < this.anIntArray533[local93]) {
								local86 = 4096;
							}
							break;
						}
					}
					local17[local80] = local86;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(Lclient!dc;II)V")
	@Override
	public void method8663(@OriginalArg(0) Class3_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8488 = arg0.method5633();
		} else if (arg1 == 1) {
			this.anInt8493 = arg0.method5610();
		} else if (arg1 == 2) {
			this.anInt8489 = arg0.method5633();
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
	@Override
	public void method8673() {
		this.method7323();
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(Z)V")
	private void method7323() {
		@Pc(7) int local7 = 0;
		this.anIntArray534 = new int[this.anInt8488 + 1];
		this.anIntArray533 = new int[this.anInt8488 + 1];
		@Pc(26) int local26 = 4096 / this.anInt8488;
		@Pc(39) int local39 = local26 * this.anInt8493 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt8488; local41++) {
			this.anIntArray534[local41] = local7;
			this.anIntArray533[local41] = local39 + local7;
			local7 += local26;
		}
		this.anIntArray534[this.anInt8488] = 4096;
		this.anIntArray533[this.anInt8488] = this.anIntArray533[0] + 4096;
	}
}
