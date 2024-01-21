import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class3_Sub2_Sub23 extends Class3_Sub2 {

	@OriginalMember(owner = "client!od", name = "db", descriptor = "I")
	private int anInt2934 = 4096;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "[I")
	private final int[] anIntArray203 = new int[3];

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
	private int anInt2935 = 4096;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
	private int anInt2931 = 4096;

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "I")
	private int anInt2942 = 409;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2942 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt2935 = arg0.method1270();
		} else if (arg1 == 2) {
			this.anInt2934 = arg0.method1270();
		} else if (arg1 == 3) {
			this.anInt2931 = arg0.method1270();
		} else if (arg1 == 4) {
			@Pc(53) int local53 = arg0.method1271();
			this.anIntArray203[2] = local53 >> 12 & 0x0;
			this.anIntArray203[0] = (local53 & 0xFF0000) << 4;
			this.anIntArray203[1] = local53 >> 4 & 0xFF0;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(27) int[][] local27 = this.method3332(0, arg0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[2];
			@Pc(39) int[] local39 = local17[1];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local27[0];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static190.anInt3865; local53++) {
				@Pc(59) int local59 = local47[local53];
				@Pc(67) int local67 = local59 - this.anIntArray203[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt2942 < local67) {
					local43[local53] = local59;
					local39[local53] = local31[local53];
					local51[local53] = local35[local53];
				} else {
					@Pc(98) int local98 = local31[local53];
					local67 = local98 - this.anIntArray203[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt2942) {
						local43[local53] = local59;
						local39[local53] = local98;
						local51[local53] = local35[local53];
					} else {
						@Pc(134) int local134 = local35[local53];
						local67 = local134 - this.anIntArray203[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (local67 > this.anInt2942) {
							local43[local53] = local59;
							local39[local53] = local98;
							local51[local53] = local134;
						} else {
							local43[local53] = local59 * this.anInt2931 >> 12;
							local39[local53] = local98 * this.anInt2934 >> 12;
							local51[local53] = this.anInt2935 * local134 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
