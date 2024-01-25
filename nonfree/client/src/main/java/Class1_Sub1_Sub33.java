import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class1_Sub1_Sub33 extends Class1_Sub1 {

	@OriginalMember(owner = "client!so", name = "O", descriptor = "I")
	private int anInt5708 = 4096;

	@OriginalMember(owner = "client!so", name = "I", descriptor = "I")
	private int anInt5703 = 409;

	@OriginalMember(owner = "client!so", name = "K", descriptor = "I")
	private int anInt5705 = 4096;

	@OriginalMember(owner = "client!so", name = "M", descriptor = "I")
	private int anInt5706 = 4096;

	@OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
	private final int[] anIntArray442 = new int[3];

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub33() {
		super(1, false);
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5703 = arg1.method2161();
		} else if (arg0 == 1) {
			this.anInt5706 = arg1.method2161();
		} else if (arg0 == 2) {
			this.anInt5708 = arg1.method2161();
		} else if (arg0 == 3) {
			this.anInt5705 = arg1.method2161();
		} else if (arg0 == 4) {
			@Pc(61) int local61 = arg1.method2119();
			this.anIntArray442[2] = local61 >> 12 & 0x0;
			this.anIntArray442[0] = (local61 & 0xFF0000) << 4;
			this.anIntArray442[1] = local61 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(27) int[][] local27 = this.method6006(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static85.anInt1910; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray442[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt5703 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(101) int local101 = local35[local53];
					local67 = local101 - this.anIntArray442[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt5703) {
						local43[local53] = local59;
						local47[local53] = local101;
						local51[local53] = local39[local53];
					} else {
						@Pc(142) int local142 = local39[local53];
						local67 = local142 - this.anIntArray442[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt5703 < local67) {
							local43[local53] = local59;
							local47[local53] = local101;
							local51[local53] = local142;
						} else {
							local43[local53] = local59 * this.anInt5705 >> 12;
							local47[local53] = this.anInt5708 * local101 >> 12;
							local51[local53] = this.anInt5706 * local142 >> 12;
						}
					}
				}
			}
		}
		return local11;
	}
}
