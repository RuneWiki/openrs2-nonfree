import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class1_Sub1_Sub8 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fo", name = "Q", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!fo", name = "T", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
	private int anInt1885 = 0;

	@OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
	private int anInt1889 = 2048;

	@OriginalMember(owner = "client!fo", name = "X", descriptor = "I")
	private int anInt1891 = 10;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub8() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		this.method1382();
	}

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "(I)V")
	private void method1382() {
		this.anIntArray194 = new int[this.anInt1891 + 1];
		this.anIntArray195 = new int[this.anInt1891 + 1];
		@Pc(21) int local21 = 0;
		@Pc(33) int local33 = 4096 / this.anInt1891;
		@Pc(40) int local40 = this.anInt1889 * local33 >> 12;
		for (@Pc(42) int local42 = 0; local42 < this.anInt1891; local42++) {
			this.anIntArray194[local42] = local21;
			this.anIntArray195[local42] = local40 + local21;
			local21 += local33;
		}
		this.anIntArray194[this.anInt1891] = 4096;
		this.anIntArray195[this.anInt1891] = this.anIntArray195[0] + 4096;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(18) int[] local18 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(30) int local30 = Static256.anIntArray474[arg0];
			@Pc(49) int local49;
			if (this.anInt1885 == 0) {
				@Pc(151) short local151 = 0;
				for (local49 = 0; local49 < this.anInt1891; local49++) {
					if (this.anIntArray194[local49] <= local30 && local30 < this.anIntArray194[local49 + 1]) {
						if (this.anIntArray195[local49] > local30) {
							local151 = 4096;
						}
						break;
					}
				}
				Static319.method1417(local18, 0, Static62.anInt1350, local151);
			} else {
				for (@Pc(38) int local38 = 0; local38 < Static62.anInt1350; local38++) {
					@Pc(47) short local47 = 0;
					local49 = 0;
					@Pc(53) int local53 = Static3.anIntArray3[local38];
					@Pc(56) int local56 = this.anInt1885;
					if (local56 == 1) {
						local49 = local53;
					} else if (local56 == 2) {
						local49 = (local53 + local30 - 4096 >> 1) + 2048;
					} else if (local56 == 3) {
						local49 = (local53 - local30 >> 1) + 2048;
					}
					for (local56 = 0; local56 < this.anInt1891; local56++) {
						if (this.anIntArray194[local56] <= local49 && local49 < this.anIntArray194[local56 + 1]) {
							if (local49 < this.anIntArray195[local56]) {
								local47 = 4096;
							}
							break;
						}
					}
					local18[local38] = local47;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1891 = arg0.method2199();
		} else if (arg1 == 1) {
			this.anInt1889 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt1885 = arg0.method2199();
		}
	}
}
