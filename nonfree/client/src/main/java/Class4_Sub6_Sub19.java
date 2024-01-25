import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ma")
public final class Class4_Sub6_Sub19 extends Class4_Sub6 {

	@OriginalMember(owner = "client!ma", name = "L", descriptor = "[I")
	private int[] anIntArray338;

	@OriginalMember(owner = "client!ma", name = "N", descriptor = "[I")
	private int[] anIntArray339;

	@OriginalMember(owner = "client!ma", name = "M", descriptor = "I")
	private int anInt4007 = 2048;

	@OriginalMember(owner = "client!ma", name = "Y", descriptor = "I")
	private int anInt4018 = 10;

	@OriginalMember(owner = "client!ma", name = "ab", descriptor = "I")
	private int anInt4019 = 0;

	@OriginalMember(owner = "client!ma", name = "<init>", descriptor = "()V")
	public Class4_Sub6_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ma", name = "g", descriptor = "(B)V")
	@Override
	public void method5700() {
		this.method3631();
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	private void method3631() {
		@Pc(7) int local7 = 0;
		this.anIntArray339 = new int[this.anInt4018 + 1];
		this.anIntArray338 = new int[this.anInt4018 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4018;
		@Pc(33) int local33 = this.anInt4007 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4018; local35++) {
			this.anIntArray339[local35] = local7;
			this.anIntArray338[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray339[this.anInt4018] = 4096;
		this.anIntArray338[this.anInt4018] = this.anIntArray338[0] + 4096;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILclient!lf;)V")
	@Override
	public void method5697(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt4018 = arg1.method3440();
		} else if (arg0 == 1) {
			this.anInt4007 = arg1.method3401();
		} else if (arg0 == 2) {
			this.anInt4019 = arg1.method3440();
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5698(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass133_41.method3738(arg0);
		if (super.aClass133_41.aBoolean318) {
			@Pc(19) int local19 = Static128.anIntArray265[arg0];
			@Pc(28) int local28;
			if (this.anInt4019 == 0) {
				@Pc(130) short local130 = 0;
				for (local28 = 0; local28 < this.anInt4018; local28++) {
					if (this.anIntArray339[local28] <= local19 && this.anIntArray339[local28 + 1] > local19) {
						if (local19 < this.anIntArray338[local28]) {
							local130 = 4096;
						}
						break;
					}
				}
				Static359.method763(local11, 0, Static31.anInt797, local130);
			} else {
				for (@Pc(24) int local24 = 0; local24 < Static31.anInt797; local24++) {
					local28 = 0;
					@Pc(30) short local30 = 0;
					@Pc(34) int local34 = Static339.anIntArray4[local24];
					@Pc(37) int local37 = this.anInt4019;
					if (local37 == 1) {
						local28 = local34;
					} else if (local37 == 2) {
						local28 = (local34 + local19 - 4096 >> 1) + 2048;
					} else if (local37 == 3) {
						local28 = (local34 - local19 >> 1) + 2048;
					}
					for (local37 = 0; local37 < this.anInt4018; local37++) {
						if (local28 >= this.anIntArray339[local37] && this.anIntArray339[local37 + 1] > local28) {
							if (this.anIntArray338[local37] > local28) {
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
}
