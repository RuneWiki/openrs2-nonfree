import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ah", name = "ib", descriptor = "I")
	private int anInt237 = 1;

	@OriginalMember(owner = "client!ah", name = "ob", descriptor = "I")
	private int anInt239 = 1;

	@OriginalMember(owner = "client!ah", name = "sb", descriptor = "I")
	private int anInt241 = 204;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub2() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt239 = arg1.method1738();
		} else if (arg0 == 1) {
			this.anInt237 = arg1.method1738();
		} else if (arg0 == 2) {
			this.anInt241 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			for (@Pc(17) int local17 = 0; local17 < Static176.anInt3921; local17++) {
				@Pc(23) int local23 = Static22.anIntArray68[arg0];
				@Pc(27) int local27 = Static171.anIntArray439[local17];
				@Pc(34) int local34 = local27 * this.anInt239 >> 12;
				@Pc(41) int local41 = this.anInt237 * local23 >> 12;
				@Pc(51) int local51 = local23 % (4096 / this.anInt237) * this.anInt237;
				@Pc(61) int local61 = local27 % (4096 / this.anInt239) * this.anInt239;
				if (local51 < this.anInt241) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 != 1) {
						local11[local17] = 0;
						continue;
					}
					if (this.anInt241 > local61) {
						local11[local17] = 0;
						continue;
					}
				}
				if (this.anInt241 > local61) {
					for (local34 -= local41; local34 < 0; local34 += 4) {
					}
					while (local34 > 3) {
						local34 -= 4;
					}
					if (local34 > 0) {
						local11[local17] = 0;
						continue;
					}
				}
				local11[local17] = 4096;
			}
		}
		return local11;
	}
}
