import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class1_Sub2_Sub34 extends Class1_Sub2 {

	@OriginalMember(owner = "client!sa", name = "bb", descriptor = "[I")
	private int[] anIntArray487;

	@OriginalMember(owner = "client!sa", name = "ib", descriptor = "[I")
	private int[] anIntArray488;

	@OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
	private int anInt3707;

	@OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
	private int anInt3709;

	@OriginalMember(owner = "client!sa", name = "ab", descriptor = "I")
	private int anInt3704;

	@OriginalMember(owner = "client!sa", name = "d", descriptor = "(I)V")
	@Override
	public void method3125() {
		this.method2551();
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3709 = arg0.method861();
		} else if (arg1 == 1) {
			this.anInt3707 = arg0.method878();
		} else if (arg1 == 2) {
			this.anInt3704 = arg0.method861();
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(Z)V")
	private void method2551() {
		this.anIntArray488 = new int[this.anInt3709 + 1];
		this.anIntArray487 = new int[this.anInt3709 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt3709;
		@Pc(33) int local33 = this.anInt3707 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt3709; local35++) {
			this.anIntArray487[local35] = local21;
			this.anIntArray488[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray487[this.anInt3709] = 4096;
		this.anIntArray488[this.anInt3709] = this.anIntArray488[0] + 4096;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3126(@OriginalArg(1) int arg0) {
		@Pc(7) int[] local7 = super.aClass5_39.method168(arg0);
		if (super.aClass5_39.aBoolean16) {
			@Pc(15) int local15 = Static37.anIntArray125[arg0];
			@Pc(22) int local22;
			if (this.anInt3704 == 0) {
				@Pc(20) short local20 = 0;
				for (local22 = 0; local22 < this.anInt3709; local22++) {
					if (this.anIntArray487[local22] <= local15 && local15 < this.anIntArray487[local22 + 1]) {
						if (local15 < this.anIntArray488[local22]) {
							local20 = 4096;
						}
						break;
					}
				}
				Static184.method627(local7, 0, Static110.anInt2825, local20);
			} else {
				for (@Pc(66) int local66 = 0; local66 < Static110.anInt2825; local66++) {
					local22 = 0;
					@Pc(72) short local72 = 0;
					@Pc(76) int local76 = Static86.anIntArray294[local66];
					@Pc(79) int local79 = this.anInt3704;
					if (local79 == 1) {
						local22 = local76;
					} else if (local79 == 2) {
						local22 = (local15 + local76 - 4096 >> 1) + 2048;
					} else if (local79 == 3) {
						local22 = (local76 - local15 >> 1) + 2048;
					}
					for (local79 = 0; local79 < this.anInt3709; local79++) {
						if (local22 >= this.anIntArray487[local79] && this.anIntArray487[local79 + 1] > local22) {
							if (this.anIntArray488[local79] > local22) {
								local72 = 4096;
							}
							break;
						}
					}
					local7[local66] = local72;
				}
			}
		}
		return local7;
	}
}
