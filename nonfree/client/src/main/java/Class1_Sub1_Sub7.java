import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class1_Sub1_Sub7 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ee", name = "ib", descriptor = "I")
	private int anInt1196 = 0;

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "I")
	private int anInt1199 = 8192;

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "I")
	private int anInt1200 = 4096;

	@OriginalMember(owner = "client!ee", name = "tb", descriptor = "I")
	private int anInt1202 = 2048;

	@OriginalMember(owner = "client!ee", name = "rb", descriptor = "I")
	private int anInt1201 = 12288;

	@OriginalMember(owner = "client!ee", name = "zb", descriptor = "I")
	private int anInt1207 = 2048;

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "I")
	private int anInt1208 = 0;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub7() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt1202 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt1196 = arg1.method1753();
		} else if (arg0 == 2) {
			this.anInt1208 = arg1.method1753();
		} else if (arg0 == 3) {
			this.anInt1207 = arg1.method1753();
		} else if (arg0 == 4) {
			this.anInt1201 = arg1.method1753();
		} else if (arg0 == 5) {
			this.anInt1200 = arg1.method1753();
		} else if (arg0 == 6) {
			this.anInt1199 = arg1.method1753();
		}
	}

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "(III)Z")
	private boolean method784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18 = (arg0 + arg1) * this.anInt1201 >> 12;
		@Pc(28) int local28 = Static143.anIntArray158[local18 * 255 >> 12 & 0xFF];
		@Pc(35) int local35 = (local28 << 12) / this.anInt1201;
		@Pc(42) int local42 = (local35 << 12) / this.anInt1199;
		@Pc(49) int local49 = local42 * this.anInt1200 >> 12;
		return arg0 - arg1 < local49 && arg0 - arg1 > -local49;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)V")
	@Override
	public void method3301() {
		Static161.method2763();
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(III)Z")
	private boolean method787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22 = this.anInt1201 * (arg0 - arg1) >> 12;
		@Pc(32) int local32 = Static143.anIntArray158[local22 * 255 >> 12 & 0xFF];
		@Pc(39) int local39 = (local32 << 12) / this.anInt1201;
		@Pc(46) int local46 = (local39 << 12) / this.anInt1199;
		@Pc(53) int local53 = local46 * this.anInt1200 >> 12;
		return local53 > arg1 + arg0 && arg1 + arg0 > -local53;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(20) int[] local20 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(30) int local30 = Static22.anIntArray68[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static176.anInt3921; local32++) {
				@Pc(40) int local40 = Static171.anIntArray439[local32] - 2048;
				@Pc(45) int local45 = this.anInt1208 + local40;
				@Pc(56) int local56 = local45 >= -2048 ? local45 : local45 + 4096;
				@Pc(61) int local61 = this.anInt1202 + local40;
				@Pc(70) int local70 = local56 <= 2048 ? local56 : local56 - 4096;
				@Pc(79) int local79 = local61 >= -2048 ? local61 : local61 + 4096;
				@Pc(84) int local84 = this.anInt1196 + local30;
				@Pc(95) int local95 = local79 > 2048 ? local79 - 4096 : local79;
				@Pc(101) int local101 = local30 + this.anInt1207;
				@Pc(112) int local112 = local101 >= -2048 ? local101 : local101 + 4096;
				@Pc(123) int local123 = local84 >= -2048 ? local84 : local84 + 4096;
				@Pc(132) int local132 = local123 > 2048 ? local123 - 4096 : local123;
				@Pc(141) int local141 = local112 > 2048 ? local112 - 4096 : local112;
				local20[local32] = this.method787(local132, local95) || this.method784(local141, local70) ? 4096 : 0;
			}
		}
		return local20;
	}
}
