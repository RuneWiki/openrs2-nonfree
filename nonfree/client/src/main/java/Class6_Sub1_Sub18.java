import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ik")
public final class Class6_Sub1_Sub18 extends Class6_Sub1 {

	@OriginalMember(owner = "client!ik", name = "N", descriptor = "[I")
	private int[] anIntArray320;

	@OriginalMember(owner = "client!ik", name = "P", descriptor = "[I")
	private int[] anIntArray321;

	@OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
	private int anInt2443 = 0;

	@OriginalMember(owner = "client!ik", name = "Q", descriptor = "I")
	private int anInt2446 = 2048;

	@OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
	private int anInt2449 = 10;

	@OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BLclient!ec;I)V")
	@Override
	public void method5617(@OriginalArg(1) Class6_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2449 = arg0.method3972();
		} else if (arg1 == 1) {
			this.anInt2446 = arg0.method4021();
		} else if (arg1 == 2) {
			this.anInt2443 = arg0.method3972();
		}
	}

	@OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
	private void method2593() {
		this.anIntArray320 = new int[this.anInt2449 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray321 = new int[this.anInt2449 + 1];
		@Pc(26) int local26 = 4096 / this.anInt2449;
		@Pc(33) int local33 = this.anInt2446 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt2449; local35++) {
			this.anIntArray320[local35] = local14;
			this.anIntArray321[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray320[this.anInt2449] = 4096;
		this.anIntArray321[this.anInt2449] = this.anIntArray321[0] + 4096;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5616(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass140_41.method3664(arg0);
		if (super.aClass140_41.aBoolean287) {
			@Pc(19) int local19 = Static273.anIntArray703[arg0];
			@Pc(31) int local31;
			if (this.anInt2443 == 0) {
				@Pc(132) short local132 = 0;
				for (local31 = 0; local31 < this.anInt2449; local31++) {
					if (this.anIntArray320[local31] <= local19 && this.anIntArray320[local31 + 1] > local19) {
						if (this.anIntArray321[local31] > local19) {
							local132 = 4096;
						}
						break;
					}
				}
				Static358.method955(local11, 0, Static299.anInt5659, local132);
			} else {
				for (@Pc(27) int local27 = 0; local27 < Static299.anInt5659; local27++) {
					local31 = 0;
					@Pc(33) short local33 = 0;
					@Pc(37) int local37 = Static18.anIntArray32[local27];
					@Pc(40) int local40 = this.anInt2443;
					if (local40 == 1) {
						local31 = local37;
					} else if (local40 == 2) {
						local31 = (local37 + local19 - 4096 >> 1) + 2048;
					} else if (local40 == 3) {
						local31 = (local37 - local19 >> 1) + 2048;
					}
					for (local40 = 0; local40 < this.anInt2449; local40++) {
						if (this.anIntArray320[local40] <= local31 && local31 < this.anIntArray320[local40 + 1]) {
							if (local31 < this.anIntArray321[local40]) {
								local33 = 4096;
							}
							break;
						}
					}
					local11[local27] = local33;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V")
	@Override
	public void method5611() {
		this.method2593();
	}
}
