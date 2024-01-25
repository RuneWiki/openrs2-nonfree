import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jca")
public final class Class1_Sub3_Sub19 extends Class1_Sub3 {

	@OriginalMember(owner = "client!jca", name = "E", descriptor = "I")
	private int anInt4382 = 409;

	@OriginalMember(owner = "client!jca", name = "H", descriptor = "I")
	private int anInt4384 = 4096;

	@OriginalMember(owner = "client!jca", name = "K", descriptor = "[I")
	private final int[] anIntArray431 = new int[3];

	@OriginalMember(owner = "client!jca", name = "L", descriptor = "I")
	private int anInt4386 = 4096;

	@OriginalMember(owner = "client!jca", name = "M", descriptor = "I")
	private int anInt4387 = 4096;

	@OriginalMember(owner = "client!jca", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub19() {
		super(1, false);
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7125(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass225_41.method5319(arg0);
		if (super.aClass225_41.aBoolean456) {
			@Pc(27) int[][] local27 = this.method7130(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static452.anInt7734; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray431[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt4382 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local35[local53];
					local67 = local105 - this.anIntArray431[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt4382 < local67) {
						local43[local53] = local59;
						local47[local53] = local105;
						local51[local53] = local39[local53];
					} else {
						@Pc(148) int local148 = local39[local53];
						local67 = local148 - this.anIntArray431[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt4382) {
							local43[local53] = local59;
							local47[local53] = local105;
							local51[local53] = local148;
						} else {
							local43[local53] = local59 * this.anInt4387 >> 12;
							local47[local53] = this.anInt4386 * local105 >> 12;
							local51[local53] = this.anInt4384 * local148 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(ILclient!ge;I)V")
	@Override
	public void method7121(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4382 = arg0.method3967();
		} else if (arg1 == 1) {
			this.anInt4384 = arg0.method3967();
		} else if (arg1 == 2) {
			this.anInt4386 = arg0.method3967();
		} else if (arg1 == 3) {
			this.anInt4387 = arg0.method3967();
		} else if (arg1 == 4) {
			@Pc(59) int local59 = arg0.method3920();
			this.anIntArray431[2] = local59 >> 12 & 0x0;
			this.anIntArray431[0] = (local59 & 0xFF0000) << 4;
			this.anIntArray431[1] = local59 >> 4 & 0xFF0;
		}
	}
}
