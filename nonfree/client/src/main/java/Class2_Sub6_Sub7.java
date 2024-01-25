import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public final class Class2_Sub6_Sub7 extends Class2_Sub6 {

	@OriginalMember(owner = "client!eq", name = "K", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!eq", name = "M", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!eq", name = "N", descriptor = "I")
	private int anInt1597 = 10;

	@OriginalMember(owner = "client!eq", name = "U", descriptor = "I")
	private int anInt1603 = 0;

	@OriginalMember(owner = "client!eq", name = "T", descriptor = "I")
	private int anInt1602 = 2048;

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)V")
	private void method1485() {
		this.anIntArray212 = new int[this.anInt1597 + 1];
		this.anIntArray211 = new int[this.anInt1597 + 1];
		@Pc(21) int local21 = 0;
		@Pc(30) int local30 = 4096 / this.anInt1597;
		@Pc(37) int local37 = local30 * this.anInt1602 >> 12;
		for (@Pc(39) int local39 = 0; local39 < this.anInt1597; local39++) {
			this.anIntArray211[local39] = local21;
			this.anIntArray212[local39] = local21 + local37;
			local21 += local30;
		}
		this.anIntArray211[this.anInt1597] = 4096;
		this.anIntArray212[this.anInt1597] = this.anIntArray212[0] + 4096;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1597 = arg0.method4240();
		} else if (arg1 == 1) {
			this.anInt1602 = arg0.method4245();
		} else if (arg1 == 2) {
			this.anInt1603 = arg0.method4240();
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(24) int local24 = Static138.anIntArray291[arg0];
			@Pc(34) int local34;
			if (this.anInt1603 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt1597; local34++) {
					if (local24 >= this.anIntArray211[local34] && local24 < this.anIntArray211[local34 + 1]) {
						if (local24 < this.anIntArray212[local34]) {
							local32 = 4096;
						}
						break;
					}
				}
				Static406.method5655(local11, 0, Static151.anInt2711, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static151.anInt2711; local78++) {
					local34 = 0;
					@Pc(84) short local84 = 0;
					@Pc(88) int local88 = Static160.anIntArray329[local78];
					@Pc(91) int local91 = this.anInt1603;
					if (local91 == 1) {
						local34 = local88;
					} else if (local91 == 2) {
						local34 = (local88 + local24 - 4096 >> 1) + 2048;
					} else if (local91 == 3) {
						local34 = (local88 - local24 >> 1) + 2048;
					}
					for (local91 = 0; local91 < this.anInt1597; local91++) {
						if (local34 >= this.anIntArray211[local91] && local34 < this.anIntArray211[local91 + 1]) {
							if (this.anIntArray212[local91] > local34) {
								local84 = 4096;
							}
							break;
						}
					}
					local11[local78] = local84;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	@Override
	public void method5639() {
		this.method1485();
	}
}
