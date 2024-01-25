import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bv")
public final class Class8_Sub2_Sub5 extends Class8_Sub2 {

	@OriginalMember(owner = "client!bv", name = "H", descriptor = "[I")
	private int[] anIntArray72;

	@OriginalMember(owner = "client!bv", name = "K", descriptor = "[I")
	private int[] anIntArray73;

	@OriginalMember(owner = "client!bv", name = "F", descriptor = "I")
	private int anInt1859 = 2048;

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "I")
	private int anInt1862 = 10;

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "I")
	private int anInt1861 = 0;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!bv", name = "f", descriptor = "(I)V")
	private void method1615() {
		@Pc(7) int local7 = 0;
		this.anIntArray73 = new int[this.anInt1862 + 1];
		this.anIntArray72 = new int[this.anInt1862 + 1];
		@Pc(26) int local26 = 4096 / this.anInt1862;
		@Pc(33) int local33 = this.anInt1859 * local26 >> 12;
		for (@Pc(35) int local35 = 0; local35 < this.anInt1862; local35++) {
			this.anIntArray72[local35] = local7;
			this.anIntArray73[local35] = local33 + local7;
			local7 += local26;
		}
		this.anIntArray72[this.anInt1862] = 4096;
		this.anIntArray73[this.anInt1862] = this.anIntArray73[0] + 4096;
	}

	@OriginalMember(owner = "client!bv", name = "c", descriptor = "(B)V")
	@Override
	public void method8508() {
		this.method1615();
	}

	@OriginalMember(owner = "client!bv", name = "b", descriptor = "(BI)[I")
	@Override
	public int[] method8507(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass50_41.method1685(arg0);
		if (super.aClass50_41.aBoolean135) {
			@Pc(24) int local24 = Static426.anIntArray424[arg0];
			@Pc(36) int local36;
			if (this.anInt1861 == 0) {
				@Pc(142) short local142 = 0;
				for (local36 = 0; local36 < this.anInt1862; local36++) {
					if (this.anIntArray72[local36] <= local24 && this.anIntArray72[local36 + 1] > local24) {
						if (local24 < this.anIntArray73[local36]) {
							local142 = 4096;
						}
						break;
					}
				}
				Static649.method5534(local16, 0, Static538.anInt9297, local142);
			} else {
				for (@Pc(32) int local32 = 0; local32 < Static538.anInt9297; local32++) {
					local36 = 0;
					@Pc(38) short local38 = 0;
					@Pc(42) int local42 = Static93.anIntArray111[local32];
					@Pc(45) int local45 = this.anInt1861;
					if (local45 == 1) {
						local36 = local42;
					} else if (local45 == 2) {
						local36 = (local24 + local42 - 4096 >> 1) + 2048;
					} else if (local45 == 3) {
						local36 = (local42 - local24 >> 1) + 2048;
					}
					for (local45 = 0; local45 < this.anInt1862; local45++) {
						if (this.anIntArray72[local45] <= local36 && local36 < this.anIntArray72[local45 + 1]) {
							if (this.anIntArray73[local45] > local36) {
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

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!ig;Z)V")
	@Override
	public void method8501(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1862 = arg1.method8525();
		} else if (arg0 == 1) {
			this.anInt1859 = arg1.method8578();
		} else if (arg0 == 2) {
			this.anInt1861 = arg1.method8525();
		}
	}
}
