import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!so")
public final class Class2_Sub2_Sub31 extends Class2_Sub2 {

	@OriginalMember(owner = "client!so", name = "Q", descriptor = "[I")
	private int[] anIntArray425;

	@OriginalMember(owner = "client!so", name = "S", descriptor = "[I")
	private int[] anIntArray426;

	@OriginalMember(owner = "client!so", name = "U", descriptor = "I")
	private int anInt5914 = 0;

	@OriginalMember(owner = "client!so", name = "V", descriptor = "I")
	private int anInt5915 = 2048;

	@OriginalMember(owner = "client!so", name = "T", descriptor = "I")
	private int anInt5913 = 10;

	@OriginalMember(owner = "client!so", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub31() {
		super(0, true);
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		this.method5188();
	}

	@OriginalMember(owner = "client!so", name = "g", descriptor = "(B)V")
	private void method5188() {
		@Pc(7) int local7 = 0;
		this.anIntArray425 = new int[this.anInt5913 + 1];
		this.anIntArray426 = new int[this.anInt5913 + 1];
		@Pc(30) int local30 = 4096 / this.anInt5913;
		@Pc(37) int local37 = local30 * this.anInt5915 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt5913; local39++) {
			this.anIntArray426[local39] = local7;
			this.anIntArray425[local39] = local37 + local7;
			local7 += local30;
		}
		this.anIntArray426[this.anInt5913] = 4096;
		this.anIntArray425[this.anInt5913] = this.anIntArray425[0] + 4096;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(24) int local24 = Class208.lb[arg0];
			@Pc(36) int local36;
			if (this.anInt5914 == 0) {
				@Pc(136) short local136 = 0;
				for (local36 = 0; local36 < this.anInt5913; local36++) {
					if (local24 >= this.anIntArray426[local36] && local24 < this.anIntArray426[local36 + 1]) {
						if (this.anIntArray425[local36] > local24) {
							local136 = 4096;
						}
						break;
					}
				}
				Static359.method685(local16, 0, Static339.anInt6735, local136);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static339.anInt6735; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static212.anIntArray325[local32];
					@Pc(45) int local45 = this.anInt5914;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local42 + local24 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local24 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt5913; local45++) {
						if (local36 >= this.anIntArray426[local45] && this.anIntArray426[local45 + 1] > local36) {
							if (local36 < this.anIntArray425[local45]) {
								local38 = 4096;
							}
							break;
						}
					}
					local16[local32] = local38;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt5913 = arg1.method4421();
		} else if (arg0 == 1) {
			this.anInt5915 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt5914 = arg1.method4421();
		}
	}
}
