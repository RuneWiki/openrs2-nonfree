import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class6_Sub8_Sub31 extends Class6_Sub8 {

	@OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
	private int[] anIntArray589;

	@OriginalMember(owner = "client!sg", name = "C", descriptor = "[I")
	private int[] anIntArray590;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
	private int anInt8988 = 2048;

	@OriginalMember(owner = "client!sg", name = "E", descriptor = "I")
	private int anInt8994 = 0;

	@OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
	private int anInt8995 = 10;

	static {
		new Class275("", 73);
	}

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
	@Override
	public void method8936() {
		this.method7868();
	}

	@OriginalMember(owner = "client!sg", name = "h", descriptor = "(I)V")
	private void method7868() {
		this.anIntArray589 = new int[this.anInt8995 + 1];
		@Pc(14) int local14 = 0;
		this.anIntArray590 = new int[this.anInt8995 + 1];
		@Pc(26) int local26 = 4096 / this.anInt8995;
		@Pc(33) int local33 = this.anInt8988 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt8995; local35++) {
			this.anIntArray590[local35] = local14;
			this.anIntArray589[local35] = local33 + local14;
			local14 += local26;
		}
		this.anIntArray590[this.anInt8995] = 4096;
		this.anIntArray589[this.anInt8995] = this.anIntArray589[0] + 4096;
	}

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method8935(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass325_41.method7756(arg0);
		if (super.aClass325_41.aBoolean671) {
			@Pc(19) int local19 = Static424.anIntArray466[arg0];
			@Pc(28) int local28;
			if (this.anInt8994 == 0) {
				@Pc(159) short local159 = 0;
				for (local28 = 0; local28 < this.anInt8995; local28++) {
					if (this.anIntArray590[local28] <= local19 && this.anIntArray590[local28 + 1] > local19) {
						if (this.anIntArray589[local28] > local19) {
							local159 = 4096;
						}
						break;
					}
				}
				Static695.method5644(local11, 0, Static83.anInt1268, local159);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static83.anInt1268; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static2.anIntArray1[local24];
					@Pc(37) int local37 = this.anInt8994;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local34 + local19 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt8995; local37++) {
						if (this.anIntArray590[local37] <= local28 && this.anIntArray590[local37 + 1] > local28) {
							if (this.anIntArray589[local37] > local28) {
								local30 = 4096;
							}
							break;
						}
					}
					local11[local24] = local30;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method8929(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 0) {
			this.anInt8995 = arg1.method3030();
		} else if (arg0 == 1) {
			this.anInt8988 = arg1.method3018();
		} else if (arg0 == 2) {
			this.anInt8994 = arg1.method3030();
		}
	}
}
