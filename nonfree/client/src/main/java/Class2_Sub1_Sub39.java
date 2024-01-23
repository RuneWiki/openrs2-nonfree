import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!vl", name = "I", descriptor = "[I")
	private int[] anIntArray569;

	@OriginalMember(owner = "client!vl", name = "U", descriptor = "[I")
	private int[] anIntArray570;

	@OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
	private int anInt5840 = 10;

	@OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
	private int anInt5841 = 0;

	@OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
	private int anInt5838 = 2048;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(0, true);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method4587(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = this.aClass174_41.method4334(arg0);
		if (this.aClass174_41.aBoolean364) {
			@Pc(27) int local27 = Static272.anIntArray521[arg0];
			@Pc(48) int local48;
			if (this.anInt5841 == 0) {
				@Pc(144) short local144 = 0;
				for (local48 = 0; local48 < this.anInt5840; local48++) {
					if (this.anIntArray570[local48] <= local27 && this.anIntArray570[local48 + 1] > local27) {
						if (this.anIntArray569[local48] > local27) {
							local144 = 4096;
						}
						break;
					}
				}
				Static323.method3553(local18, 0, Static281.anInt5558, local144);
			} else {
				for (@Pc(33) int local33 = 0; local33 < Static281.anInt5558; local33++) {
					@Pc(42) short local42 = 0;
					@Pc(46) int local46 = Static234.anIntArray462[local33];
					local48 = 0;
					@Pc(51) int local51 = this.anInt5841;
					if (local51 == 1) {
						local48 = local46;
					} else if (local51 == 2) {
						local48 = (local46 + local27 - 4096 >> 1) + 2048;
					} else if (local51 == 3) {
						local48 = (local46 - local27 >> 1) + 2048;
					}
					for (local51 = 0; local51 < this.anInt5840; local51++) {
						if (this.anIntArray570[local51] <= local48 && this.anIntArray570[local51 + 1] > local48) {
							if (local48 < this.anIntArray569[local51]) {
								local42 = 4096;
							}
							break;
						}
					}
					local18[local33] = local42;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
	@Override
	public void method4595() {
		this.method4604();
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lclient!oe;IB)V")
	@Override
	public void method4594(@OriginalArg(0) Class2_Sub16 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5840 = arg0.method2146();
		} else if (arg1 == 1) {
			this.anInt5838 = arg0.method2130();
		} else if (arg1 == 2) {
			this.anInt5841 = arg0.method2146();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(Z)V")
	private void method4604() {
		this.anIntArray569 = new int[this.anInt5840 + 1];
		this.anIntArray570 = new int[this.anInt5840 + 1];
		@Pc(21) int local21 = 0;
		@Pc(26) int local26 = 4096 / this.anInt5840;
		@Pc(33) int local33 = local26 * this.anInt5838 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt5840; local35++) {
			this.anIntArray570[local35] = local21;
			this.anIntArray569[local35] = local21 + local33;
			local21 += local26;
		}
		this.anIntArray570[this.anInt5840] = 4096;
		this.anIntArray569[this.anInt5840] = this.anIntArray569[0] + 4096;
	}
}
