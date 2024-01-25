import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ns")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ns", name = "F", descriptor = "[I")
	private int[] anIntArray364;

	@OriginalMember(owner = "client!ns", name = "N", descriptor = "[I")
	private int[] anIntArray365;

	@OriginalMember(owner = "client!ns", name = "L", descriptor = "I")
	private int anInt4833 = 2048;

	@OriginalMember(owner = "client!ns", name = "P", descriptor = "I")
	private int anInt4836 = 10;

	@OriginalMember(owner = "client!ns", name = "G", descriptor = "I")
	private int anInt4829 = 0;

	@OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ns", name = "h", descriptor = "(I)V")
	private void method3827() {
		@Pc(7) int local7 = 0;
		this.anIntArray365 = new int[this.anInt4836 + 1];
		this.anIntArray364 = new int[this.anInt4836 + 1];
		@Pc(26) int local26 = 4096 / this.anInt4836;
		@Pc(33) int local33 = this.anInt4833 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt4836; local35++) {
			this.anIntArray365[local35] = local7;
			this.anIntArray364[local35] = local7 + local33;
			local7 += local26;
		}
		this.anIntArray365[this.anInt4836] = 4096;
		this.anIntArray364[this.anInt4836] = this.anIntArray364[0] + 4096;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5961(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass22_41.method312(arg0);
		if (super.aClass22_41.aBoolean44) {
			@Pc(25) int local25 = Static258.anIntArray335[arg0];
			@Pc(32) int local32;
			if (this.anInt4829 == 0) {
				@Pc(30) short local30 = 0;
				for (local32 = 0; local32 < this.anInt4836; local32++) {
					if (local25 >= this.anIntArray365[local32] && this.anIntArray365[local32 + 1] > local25) {
						if (this.anIntArray364[local32] > local25) {
							local30 = 4096;
						}
						break;
					}
				}
				Static471.method3064(local17, 0, Static218.anInt3990, local30);
			} else {
				for (@Pc(84) int local84 = 0; local84 < Static218.anInt3990; local84++) {
					local32 = 0;
					@Pc(90) short local90 = 0;
					@Pc(94) int local94 = Static434.anIntArray495[local84];
					@Pc(97) int local97 = this.anInt4829;
					if (local97 == 1) {
						local32 = local94;
					} else if (local97 == 2) {
						local32 = (local25 + local94 - 4096 >> 1) + 2048;
					} else if (local97 == 3) {
						local32 = (local94 - local25 >> 1) + 2048;
					}
					for (local97 = 0; local97 < this.anInt4836; local97++) {
						if (this.anIntArray365[local97] <= local32 && this.anIntArray365[local97 + 1] > local32) {
							if (this.anIntArray364[local97] > local32) {
								local90 = 4096;
							}
							break;
						}
					}
					local17[local84] = local90;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method5962(@OriginalArg(0) Class1_Sub19 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4836 = arg0.method2915();
		} else if (arg1 == 1) {
			this.anInt4833 = arg0.method2896();
		} else if (arg1 == 2) {
			this.anInt4829 = arg0.method2915();
		}
	}

	@OriginalMember(owner = "client!ns", name = "g", descriptor = "(I)V")
	@Override
	public void method5967() {
		this.method3827();
	}
}
