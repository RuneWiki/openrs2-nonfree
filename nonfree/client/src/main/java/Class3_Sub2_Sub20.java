import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ofa")
public final class Class3_Sub2_Sub20 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
	private int anInt7398 = 4096;

	@OriginalMember(owner = "client!ofa", name = "D", descriptor = "[I")
	private final int[] anIntArray454 = new int[3];

	@OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
	private int anInt7396 = 4096;

	@OriginalMember(owner = "client!ofa", name = "K", descriptor = "I")
	private int anInt7402 = 4096;

	@OriginalMember(owner = "client!ofa", name = "L", descriptor = "I")
	private int anInt7403 = 409;

	@OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ofa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method8604(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass193_41.method4800(arg0);
		if (super.aClass193_41.aBoolean358) {
			@Pc(27) int[][] local27 = this.method8595(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static491.anInt8519; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray454[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt7403 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(102) int local102 = local35[local53];
					local67 = local102 - this.anIntArray454[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt7403 < local67) {
						local43[local53] = local59;
						local47[local53] = local102;
						local51[local53] = local39[local53];
					} else {
						@Pc(146) int local146 = local39[local53];
						local67 = local146 - this.anIntArray454[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt7403 < local67) {
							local43[local53] = local59;
							local47[local53] = local102;
							local51[local53] = local146;
						} else {
							local43[local53] = this.anInt7402 * local59 >> 12;
							local47[local53] = this.anInt7398 * local102 >> 12;
							local51[local53] = this.anInt7396 * local146 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Lclient!sl;IB)V")
	@Override
	public void method8600(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt7403 = arg0.method4221();
		} else if (arg1 == 1) {
			this.anInt7396 = arg0.method4221();
		} else if (arg1 == 2) {
			this.anInt7398 = arg0.method4221();
		} else if (arg1 == 3) {
			this.anInt7402 = arg0.method4221();
		} else if (arg1 == 4) {
			@Pc(61) int local61 = arg0.method4204();
			this.anIntArray454[1] = local61 >> 4 & 0xFF0;
			this.anIntArray454[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray454[2] = local61 >> 12 & 0x0;
		}
	}
}
