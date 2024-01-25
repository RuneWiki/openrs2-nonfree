import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dla")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!dla", name = "E", descriptor = "[I")
	private final int[] anIntArray140 = new int[3];

	@OriginalMember(owner = "client!dla", name = "I", descriptor = "I")
	private int anInt2433 = 409;

	@OriginalMember(owner = "client!dla", name = "H", descriptor = "I")
	private int anInt2431 = 4096;

	@OriginalMember(owner = "client!dla", name = "z", descriptor = "I")
	private int anInt2432 = 4096;

	@OriginalMember(owner = "client!dla", name = "B", descriptor = "I")
	private int anInt2436 = 4096;

	@OriginalMember(owner = "client!dla", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub7() {
		super(1, false);
	}

	@OriginalMember(owner = "client!dla", name = "b", descriptor = "(BI)[[I")
	@Override
	public int[][] method9580(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass281_41.method6493(arg0);
		if (super.aClass281_41.aBoolean509) {
			@Pc(27) int[][] local27 = this.method9576(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static379.anInt5859; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(67) int local67 = local59 - this.anIntArray140[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (local67 > this.anInt2433) {
					local43[local53] = local59;
					local47[local53] = local35[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(100) int local100 = local35[local53];
					local67 = local100 - this.anIntArray140[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (local67 > this.anInt2433) {
						local43[local53] = local59;
						local47[local53] = local100;
						local51[local53] = local39[local53];
					} else {
						@Pc(139) int local139 = local39[local53];
						local67 = local139 - this.anIntArray140[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt2433 < local67) {
							local43[local53] = local59;
							local47[local53] = local100;
							local51[local53] = local139;
						} else {
							local43[local53] = local59 * this.anInt2432 >> 12;
							local47[local53] = local100 * this.anInt2431 >> 12;
							local51[local53] = this.anInt2436 * local139 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!dla", name = "a", descriptor = "(IILclient!ika;)V")
	@Override
	public void method9582(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt2433 = arg1.method2028(-14795);
		} else if (arg0 == 1) {
			this.anInt2436 = arg1.method2028(-14795);
		} else if (arg0 == 2) {
			this.anInt2431 = arg1.method2028(-14795);
		} else if (arg0 == 3) {
			this.anInt2432 = arg1.method2028(-14795);
		} else if (arg0 == 4) {
			@Pc(84) int local84 = arg1.method2061();
			this.anIntArray140[2] = local84 >> 12 & 0x0;
			this.anIntArray140[0] = (local84 & 0xFF0000) << 4;
			this.anIntArray140[1] = local84 >> 4 & 0xFF0;
		}
	}
}
