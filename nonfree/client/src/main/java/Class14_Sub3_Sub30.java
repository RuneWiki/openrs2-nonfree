import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class14_Sub3_Sub30 extends Class14_Sub3 {

	@OriginalMember(owner = "client!qk", name = "U", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!qk", name = "W", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
	private int anInt5034 = 0;

	@OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
	private int anInt5033 = 10;

	@OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
	private int anInt5038 = 2048;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub30() {
		super(0, true);
	}

	@OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		this.method4512();
	}

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V")
	private void method4512() {
		@Pc(7) int local7 = 0;
		this.anIntArray458 = new int[this.anInt5033 + 1];
		this.anIntArray459 = new int[this.anInt5033 + 1];
		@Pc(32) int local32 = 4096 / this.anInt5033;
		@Pc(39) int local39 = this.anInt5038 * local32 >> 12;
		for (@Pc(41) int local41 = 0; local41 < this.anInt5033; local41++) {
			this.anIntArray459[local41] = local7;
			this.anIntArray458[local41] = local7 + local39;
			local7 += local32;
		}
		this.anIntArray459[this.anInt5033] = 4096;
		this.anIntArray458[this.anInt5033] = this.anIntArray458[0] + 4096;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5033 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt5038 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt5034 = arg0.method2548();
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(28) int[] local28 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(36) int local36 = Static213.anIntArray381[arg0];
			@Pc(48) int local48;
			if (this.anInt5034 == 0) {
				@Pc(151) short local151 = 0;
				for (local48 = 0; local48 < this.anInt5033; local48++) {
					if (this.anIntArray459[local48] <= local36 && this.anIntArray459[local48 + 1] > local36) {
						if (this.anIntArray458[local48] > local36) {
							local151 = 4096;
						}
						break;
					}
				}
				Static358.method768(local28, 0, Static294.anInt5657, local151);
			} else {
				for (@Pc(44) int local44 = 0; local44 < Static294.anInt5657; local44++) {
					local48 = 0;
					@Pc(50) short local50 = 0;
					@Pc(54) int local54 = Static346.anIntArray638[local44];
					@Pc(57) int local57 = this.anInt5034;
					if (local57 == 1) {
						local48 = local54;
					} else if (local57 == 2) {
						local48 = (local54 + local36 - 4096 >> 1) + 2048;
					} else if (local57 == 3) {
						local48 = (local54 - local36 >> 1) + 2048;
					}
					for (local57 = 0; local57 < this.anInt5033; local57++) {
						if (local48 >= this.anIntArray459[local57] && local48 < this.anIntArray459[local57 + 1]) {
							if (local48 < this.anIntArray458[local57]) {
								local50 = 4096;
							}
							break;
						}
					}
					local28[local44] = local50;
				}
			}
		}
		return local28;
	}
}
