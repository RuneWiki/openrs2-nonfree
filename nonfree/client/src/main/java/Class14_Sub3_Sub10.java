import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class14_Sub3_Sub10 extends Class14_Sub3 {

	@OriginalMember(owner = "client!fc", name = "Q", descriptor = "[I")
	public static final int[] anIntArray181 = new int[99];

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
	private int anInt1998 = 204;

	@OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
	private int anInt2001 = 1;

	@OriginalMember(owner = "client!fc", name = "T", descriptor = "I")
	private int anInt1999 = 1;

	static {
		@Pc(8) int local8 = 0;
		for (@Pc(10) int local10 = 0; local10 < 99; local10++) {
			@Pc(15) int local15 = local10 + 1;
			@Pc(28) int local28 = (int) ((double) local15 + Math.pow(2.0D, (double) local15 / 7.0D) * 300.0D);
			local8 += local28;
			anIntArray181[local10] = local8 / 4;
		}
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			for (@Pc(22) int local22 = 0; local22 < Static294.anInt5657; local22++) {
				@Pc(28) int local28 = Static346.anIntArray638[local22];
				@Pc(32) int local32 = Static213.anIntArray381[arg0];
				@Pc(39) int local39 = local28 * this.anInt2001 >> 12;
				@Pc(46) int local46 = local32 * this.anInt1999 >> 12;
				@Pc(56) int local56 = local28 % (4096 / this.anInt2001) * this.anInt2001;
				@Pc(66) int local66 = local32 % (4096 / this.anInt1999) * this.anInt1999;
				if (local66 < this.anInt1998) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 != 1) {
						local11[local22] = 0;
						continue;
					}
					if (this.anInt1998 > local56) {
						local11[local22] = 0;
						continue;
					}
				}
				if (this.anInt1998 > local56) {
					for (local39 -= local46; local39 < 0; local39 += 4) {
					}
					while (local39 > 3) {
						local39 -= 4;
					}
					if (local39 > 0) {
						local11[local22] = 0;
						continue;
					}
				}
				local11[local22] = 4096;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2001 = arg0.method2548();
		} else if (arg1 == 1) {
			this.anInt1999 = arg0.method2548();
		} else if (arg1 == 2) {
			this.anInt1998 = arg0.method2498();
		}
	}
}
