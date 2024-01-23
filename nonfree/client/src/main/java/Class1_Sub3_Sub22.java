import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class1_Sub3_Sub22 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kf", name = "S", descriptor = "I")
	private int anInt2201 = 4096;

	@OriginalMember(owner = "client!kf", name = "W", descriptor = "[I")
	private int[] anIntArray234 = new int[3];

	@OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
	private int anInt2202 = 4096;

	@OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
	private int anInt2203 = 409;

	@OriginalMember(owner = "client!kf", name = "cb", descriptor = "I")
	private int anInt2208 = 4096;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
	public Class1_Sub3_Sub22() {
		super(1, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!pg;)V")
	@Override
	public void method3466(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub17 arg1) {
		if (arg0 == 0) {
			this.anInt2203 = arg1.method2178();
		} else if (arg0 == 1) {
			this.anInt2202 = arg1.method2178();
		} else if (arg0 == 2) {
			this.anInt2201 = arg1.method2178();
		} else if (arg0 == 3) {
			this.anInt2208 = arg1.method2178();
		} else if (arg0 == 4) {
			@Pc(65) int local65 = arg1.method2135();
			this.anIntArray234[0] = (local65 & 0xFF0000) << 4;
			this.anIntArray234[1] = local65 >> 4 & 0xFF0;
			this.anIntArray234[2] = local65 >> 12 & 0x0;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3467(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass56_41.method1552(arg0);
		if (super.aClass56_41.aBoolean90) {
			@Pc(27) int[][] local27 = this.method3465(arg0, 0);
			@Pc(31) int[] local31 = local27[1];
			@Pc(35) int[] local35 = local27[0];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static76.anInt1531; local53++) {
				@Pc(59) int local59 = local35[local53];
				@Pc(67) int local67 = local59 - this.anIntArray234[0];
				if (local67 < 0) {
					local67 = -local67;
				}
				if (this.anInt2203 < local67) {
					local43[local53] = local59;
					local47[local53] = local31[local53];
					local51[local53] = local39[local53];
				} else {
					@Pc(105) int local105 = local31[local53];
					local67 = local105 - this.anIntArray234[1];
					if (local67 < 0) {
						local67 = -local67;
					}
					if (this.anInt2203 < local67) {
						local43[local53] = local59;
						local47[local53] = local105;
						local51[local53] = local39[local53];
					} else {
						@Pc(149) int local149 = local39[local53];
						local67 = local149 - this.anIntArray234[2];
						if (local67 < 0) {
							local67 = -local67;
						}
						if (this.anInt2203 < local67) {
							local43[local53] = local59;
							local47[local53] = local105;
							local51[local53] = local149;
						} else {
							local43[local53] = local59 * this.anInt2208 >> 12;
							local47[local53] = local105 * this.anInt2201 >> 12;
							local51[local53] = this.anInt2202 * local149 >> 12;
						}
					}
				}
			}
		}
		return local17;
	}
}
