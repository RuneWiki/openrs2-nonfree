import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fd")
public final class Class2_Sub4_Sub10 extends Class2_Sub4 {

	@OriginalMember(owner = "client!fd", name = "E", descriptor = "I")
	private int anInt3127 = 4096;

	@OriginalMember(owner = "client!fd", name = "G", descriptor = "I")
	private int anInt3128 = 409;

	@OriginalMember(owner = "client!fd", name = "L", descriptor = "[I")
	private final int[] anIntArray204 = new int[3];

	@OriginalMember(owner = "client!fd", name = "K", descriptor = "I")
	private int anInt3131 = 4096;

	@OriginalMember(owner = "client!fd", name = "M", descriptor = "I")
	private int anInt3132 = 4096;

	@OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(27) int[][] local27 = this.method8898(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static395.anInt6816; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray204[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt3128 < local67) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local35[local53];
					local67 = local105 - this.anIntArray204[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt3128 < local67) {
						local43[local53] = local59;
						local47[local53] = local105;
						local51[local53] = local39[local53];
					} else {
						@Pc(149) int local149 = local39[local53];
						local67 = local149 - this.anIntArray204[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt3128 < local67) {
							local43[local53] = local59;
							local47[local53] = local105;
							local51[local53] = local149;
						} else {
							local43[local53] = local59 * this.anInt3127 >> 12;
							local47[local53] = local105 * this.anInt3132 >> 12;
							local51[local53] = this.anInt3131 * local149 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3128 = arg0.method2825();
		} else if (arg1 == 1) {
			this.anInt3131 = arg0.method2825();
		} else if (arg1 == 2) {
			this.anInt3132 = arg0.method2825();
		} else if (arg1 == 3) {
			this.anInt3127 = arg0.method2825();
		} else if (arg1 == 4) {
			@Pc(62) int local62 = arg0.method2835();
			this.anIntArray204[1] = local62 >> 4 & 0xFF0;
			this.anIntArray204[0] = (local62 & 0xFF0000) << 4;
			this.anIntArray204[2] = local62 >> 12 & 0x0;
		}
	}
}
