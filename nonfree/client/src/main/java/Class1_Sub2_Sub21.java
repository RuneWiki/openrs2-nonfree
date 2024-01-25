import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class1_Sub2_Sub21 extends Class1_Sub2 {

	@OriginalMember(owner = "client!iq", name = "L", descriptor = "[I")
	private final int[] anIntArray349 = new int[3];

	@OriginalMember(owner = "client!iq", name = "O", descriptor = "I")
	private int anInt2926 = 409;

	@OriginalMember(owner = "client!iq", name = "M", descriptor = "I")
	private int anInt2924 = 4096;

	@OriginalMember(owner = "client!iq", name = "N", descriptor = "I")
	private int anInt2925 = 4096;

	@OriginalMember(owner = "client!iq", name = "R", descriptor = "I")
	private int anInt2928 = 4096;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBLclient!re;)V")
	@Override
	public void method5502(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub33 arg1) {
		if (arg0 == 0) {
			this.anInt2926 = arg1.method5177();
		} else if (arg0 == 1) {
			this.anInt2924 = arg1.method5177();
		} else if (arg0 == 2) {
			this.anInt2925 = arg1.method5177();
		} else if (arg0 == 3) {
			this.anInt2928 = arg1.method5177();
		} else if (arg0 == 4) {
			@Pc(57) int local57 = arg1.method5159();
			this.anIntArray349[1] = local57 >> 4 & 0xFF0;
			this.anIntArray349[2] = local57 >> 12 & 0x0;
			this.anIntArray349[0] = (local57 & 0xFF0000) << 4;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method5504(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass228_41.method4874(arg0);
		if (super.aClass228_41.aBoolean523) {
			@Pc(27) int[][] local27 = this.method5514(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static158.anInt2658; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray349[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt2926) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(98) int local98 = local35[local53];
					local67 = local98 - this.anIntArray349[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt2926 < local67) {
						local43[local53] = local59;
						local47[local53] = local98;
						local51[local53] = local39[local53];
					} else {
						@Pc(135) int local135 = local39[local53];
						local67 = local135 - this.anIntArray349[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt2926) {
							local43[local53] = local59;
							local47[local53] = local98;
							local51[local53] = local135;
						} else {
							local43[local53] = this.anInt2928 * local59 >> 12;
							local47[local53] = local98 * this.anInt2925 >> 12;
							local51[local53] = local135 * this.anInt2924 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
