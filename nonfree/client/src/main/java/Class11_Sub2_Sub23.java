import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class11_Sub2_Sub23 extends Class11_Sub2 {

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
	private int anInt3848 = 2048;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "I")
	private int anInt3850 = 0;

	@OriginalMember(owner = "client!mb", name = "Q", descriptor = "I")
	private int anInt3857 = 10;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub23() {
		super(0, true);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method5716(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass124_41.method2853(arg0);
		if (super.aClass124_41.aBoolean221) {
			@Pc(24) int local24 = Static155.anIntArray196[arg0];
			@Pc(33) int local33;
			if (this.anInt3850 == 0) {
				@Pc(135) short local135 = 0;
				for (local33 = 0; local33 < this.anInt3857; local33++) {
					if (this.anIntArray296[local33] <= local24 && local24 < this.anIntArray296[local33 + 1]) {
						if (this.anIntArray297[local33] > local24) {
							local135 = 4096;
						}
						break;
					}
				}
				Static363.method1670(local11, 0, Static339.anInt6549, local135);
			} else {
				for (@Pc(29) int local29 = 0; local29 < Static339.anInt6549; local29++) {
					local33 = 0;
					@Pc(35) short local35 = 0;
					@Pc(39) int local39 = Static73.anIntArray91[local29];
					@Pc(42) int local42 = this.anInt3850;
					if (local42 == 1) {
						local33 = local39;
					} else if (local42 == 2) {
						local33 = (local24 + local39 - 4096 >> 1) + 2048;
					} else if (local42 == 3) {
						local33 = (local39 - local24 >> 1) + 2048;
					}
					for (local42 = 0; local42 < this.anInt3857; local42++) {
						if (local33 >= this.anIntArray296[local42] && this.anIntArray296[local42 + 1] > local33) {
							if (this.anIntArray297[local42] > local33) {
								local35 = 4096;
							}
							break;
						}
					}
					local11[local29] = local35;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	@Override
	public void method5708() {
		this.method3469();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!kh;BI)V")
	@Override
	public void method5711(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3857 = arg0.method5185();
		} else if (arg1 == 1) {
			this.anInt3848 = arg0.method5187();
		} else if (arg1 == 2) {
			this.anInt3850 = arg0.method5185();
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	private void method3469() {
		this.anIntArray296 = new int[this.anInt3857 + 1];
		this.anIntArray297 = new int[this.anInt3857 + 1];
		@Pc(29) int local29 = 0;
		@Pc(34) int local34 = 4096 / this.anInt3857;
		@Pc(41) int local41 = this.anInt3848 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt3857; local43++) {
			this.anIntArray296[local43] = local29;
			this.anIntArray297[local43] = local41 + local29;
			local29 += local34;
		}
		this.anIntArray296[this.anInt3857] = 4096;
		this.anIntArray297[this.anInt3857] = this.anIntArray297[0] + 4096;
	}
}
