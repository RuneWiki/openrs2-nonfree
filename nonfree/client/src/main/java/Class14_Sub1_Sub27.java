import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class14_Sub1_Sub27 extends Class14_Sub1 {

	@OriginalMember(owner = "client!oc", name = "E", descriptor = "[I")
	private int[] anIntArray553;

	@OriginalMember(owner = "client!oc", name = "F", descriptor = "[I")
	private int[] anIntArray554;

	@OriginalMember(owner = "client!oc", name = "J", descriptor = "I")
	private int anInt7533 = 2048;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
	private int anInt7537 = 10;

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	private int anInt7535 = 0;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class14_Sub1_Sub27() {
		super(0, true);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!so;II)V")
	@Override
	public void method8903(@OriginalArg(0) Class14_Sub29 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7537 = arg0.method5866();
		} else if (arg1 == 1) {
			this.anInt7533 = arg0.method5900();
		} else if (arg1 == 2) {
			this.anInt7535 = arg0.method5866();
		}
	}

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "(B)V")
	private void method6204() {
		@Pc(7) int local7 = 0;
		this.anIntArray554 = new int[this.anInt7537 + 1];
		this.anIntArray553 = new int[this.anInt7537 + 1];
		@Pc(26) int local26 = 4096 / this.anInt7537;
		@Pc(33) int local33 = local26 * this.anInt7533 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt7537; local35++) {
			this.anIntArray553[local35] = local7;
			this.anIntArray554[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray553[this.anInt7537] = 4096;
		this.anIntArray554[this.anInt7537] = this.anIntArray554[0] + 4096;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	@Override
	public void method8899() {
		this.method6204();
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8898(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass211_41.method5137(arg0);
		if (super.aClass211_41.aBoolean432) {
			@Pc(25) int local25 = Static336.anIntArray458[arg0];
			@Pc(35) int local35;
			if (this.anInt7535 == 0) {
				@Pc(33) short local33 = 0;
				for (local35 = 0; local35 < this.anInt7537; local35++) {
					if (local25 >= this.anIntArray553[local35] && local25 < this.anIntArray553[local35 + 1]) {
						if (this.anIntArray554[local35] > local25) {
							local33 = 4096;
						}
						break;
					}
				}
				Static681.method2479(local11, 0, Static371.anInt6835, local33);
			} else {
				for (@Pc(83) int local83 = 0; local83 < Static371.anInt6835; local83++) {
					local35 = 0;
					@Pc(89) short local89 = 0;
					@Pc(93) int local93 = Static160.anIntArray258[local83];
					@Pc(96) int local96 = this.anInt7535;
					if (local96 == 1) {
						local35 = local93;
					} else if (local96 == 2) {
						local35 = (local93 + local25 - 4096 >> 1) + 2048;
					} else if (local96 == 3) {
						local35 = (local93 - local25 >> 1) + 2048;
					}
					for (local96 = 0; local96 < this.anInt7537; local96++) {
						if (local35 >= this.anIntArray553[local96] && this.anIntArray553[local96 + 1] > local35) {
							if (local35 < this.anIntArray554[local96]) {
								local89 = 4096;
							}
							break;
						}
					}
					local11[local83] = local89;
				}
			}
		}
		return local11;
	}
}
