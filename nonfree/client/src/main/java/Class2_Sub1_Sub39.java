import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class2_Sub1_Sub39 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
	private int anInt4302 = 409;

	@OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
	private int anInt4299 = 4096;

	@OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
	private int anInt4305 = 4096;

	@OriginalMember(owner = "client!wi", name = "Y", descriptor = "[I")
	private final int[] anIntArray405 = new int[3];

	@OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
	private int anInt4304 = 4096;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4302 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt4304 = arg0.method269();
		} else if (arg1 == 2) {
			this.anInt4305 = arg0.method269();
		} else if (arg1 == 3) {
			this.anInt4299 = arg0.method269();
		} else if (arg1 == 4) {
			@Pc(58) int local58 = arg0.method261();
			this.anIntArray405[2] = local58 >> 12 & 0x0;
			this.anIntArray405[0] = (local58 & 0xFF0000) << 4;
			this.anIntArray405[1] = local58 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(27) int[][] local27 = this.method3259(arg0, 0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[1];
			@Pc(47) int[] local47 = local17[2];
			@Pc(51) int[] local51 = local17[0];
			for (@Pc(53) int local53 = 0; local53 < Static135.anInt2897; local53++) {
				@Pc(59) int local59 = local35[local53];
				@Pc(67) int local67 = local59 - this.anIntArray405[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt4302) {
					local51[local53] = local59;
					local43[local53] = local31[local53];
					local47[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local31[local53];
					local67 = local105 - this.anIntArray405[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt4302 < local67) {
						local51[local53] = local59;
						local43[local53] = local105;
						local47[local53] = local39[local53];
					} else {
						@Pc(145) int local145 = local39[local53];
						local67 = local145 - this.anIntArray405[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt4302 < local67) {
							local51[local53] = local59;
							local43[local53] = local105;
							local47[local53] = local145;
						} else {
							local51[local53] = local59 * this.anInt4299 >> 12;
							local43[local53] = local105 * this.anInt4305 >> 12;
							local47[local53] = this.anInt4304 * local145 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
