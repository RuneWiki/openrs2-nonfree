import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public final class Class1_Sub1_Sub10 extends Class1_Sub1 {

	@OriginalMember(owner = "client!eh", name = "V", descriptor = "[I")
	private int[] anIntArray148;

	@OriginalMember(owner = "client!eh", name = "gb", descriptor = "[I")
	private int[] anIntArray150;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
	private int anInt1426;

	@OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
	private int anInt1439;

	@OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
	private int anInt1432;

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3008(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2742(arg0);
		if (super.aClass80_41.aBoolean288) {
			@Pc(24) int local24 = Static18.anIntArray101[arg0];
			@Pc(34) int local34;
			if (this.anInt1426 == 0) {
				@Pc(32) short local32 = 0;
				for (local34 = 0; local34 < this.anInt1432; local34++) {
					if (this.anIntArray150[local34] <= local24 && local24 < this.anIntArray150[local34 + 1]) {
						if (this.anIntArray148[local34] > local24) {
							local32 = 4096;
						}
						break;
					}
				}
				Static193.method2479(local11, 0, Static65.anInt1933, local32);
			} else {
				for (@Pc(78) int local78 = 0; local78 < Static65.anInt1933; local78++) {
					local34 = 0;
					@Pc(86) int local86 = Static106.anIntArray284[local78];
					@Pc(89) int local89 = this.anInt1426;
					if (local89 == 1) {
						local34 = local86;
					} else if (local89 == 2) {
						local34 = (local24 + local86 - 4096 >> 1) + 2048;
					} else if (local89 == 3) {
						local34 = (local86 - local24 >> 1) + 2048;
					}
					@Pc(127) short local127 = 0;
					for (local89 = 0; local89 < this.anInt1432; local89++) {
						if (local34 >= this.anIntArray150[local89] && local34 < this.anIntArray150[local89 + 1]) {
							if (local34 < this.anIntArray148[local89]) {
								local127 = 4096;
							}
							break;
						}
					}
					local11[local78] = local127;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	@Override
	public void method3009() {
		this.method1144();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt1432 = arg1.method1607();
		} else if (arg0 == 1) {
			this.anInt1439 = arg1.method1642();
		} else if (arg0 == 2) {
			this.anInt1426 = arg1.method1607();
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
	private void method1144() {
		this.anIntArray148 = new int[this.anInt1432 + 1];
		this.anIntArray150 = new int[this.anInt1432 + 1];
		@Pc(29) int local29 = 0;
		@Pc(34) int local34 = 4096 / this.anInt1432;
		@Pc(41) int local41 = this.anInt1439 * local34 >> 12;
		for (@Pc(43) int local43 = 0; local43 < this.anInt1432; local43++) {
			this.anIntArray150[local43] = local29;
			this.anIntArray148[local43] = local41 + local29;
			local29 += local34;
		}
		this.anIntArray150[this.anInt1432] = 4096;
		this.anIntArray148[this.anInt1432] = this.anIntArray148[0] + 4096;
	}
}
