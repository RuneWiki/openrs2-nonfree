import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class2_Sub2_Sub15 extends Class2_Sub2 {

	@OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
	private int anInt2375 = 2048;

	@OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
	private int anInt2377 = 12288;

	@OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
	private int anInt2374 = 8192;

	@OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
	private int anInt2380 = 0;

	@OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
	private int anInt2371 = 4096;

	@OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
	private int anInt2369 = 0;

	@OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
	private int anInt2366 = 2048;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub15() {
		super(0, true);
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5883(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass137_41.method3812(arg0);
		if (super.aClass137_41.aBoolean369) {
			@Pc(30) int local30 = Class208.lb[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static339.anInt6735; local32++) {
				@Pc(40) int local40 = Static212.anIntArray325[local32] - 2048;
				@Pc(46) int local46 = local40 + this.anInt2375;
				@Pc(57) int local57 = local46 < -2048 ? local46 + 4096 : local46;
				@Pc(68) int local68 = local57 <= 2048 ? local57 : local57 - 4096;
				@Pc(73) int local73 = this.anInt2380 + local30;
				@Pc(82) int local82 = local73 >= -2048 ? local73 : local73 + 4096;
				@Pc(93) int local93 = local82 <= 2048 ? local82 : local82 - 4096;
				@Pc(98) int local98 = this.anInt2369 + local40;
				@Pc(107) int local107 = local98 >= -2048 ? local98 : local98 + 4096;
				@Pc(116) int local116 = local107 <= 2048 ? local107 : local107 - 4096;
				@Pc(121) int local121 = local30 + this.anInt2366;
				@Pc(132) int local132 = local121 < -2048 ? local121 + 4096 : local121;
				@Pc(141) int local141 = local132 > 2048 ? local132 - 4096 : local132;
				local11[local32] = this.method2329(local93, local68) || this.method2330(local141, local116) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILclient!dg;I)V")
	@Override
	public void method5882(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub10 arg1) {
		if (arg0 == 0) {
			this.anInt2375 = arg1.method4464();
		} else if (arg0 == 1) {
			this.anInt2380 = arg1.method4464();
		} else if (arg0 == 2) {
			this.anInt2369 = arg1.method4464();
		} else if (arg0 == 3) {
			this.anInt2366 = arg1.method4464();
		} else if (arg0 == 4) {
			this.anInt2377 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt2371 = arg1.method4464();
		} else if (arg0 == 6) {
			this.anInt2374 = arg1.method4464();
		}
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(IBI)Z")
	private boolean method2329(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt2377 * (arg0 - arg1) >> 12;
		@Pc(23) int local23 = Static296.anIntArray435[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2377;
		@Pc(45) int local45 = (local30 << 12) / this.anInt2374;
		@Pc(52) int local52 = this.anInt2371 * local45 >> 12;
		return arg0 + arg1 < local52 && arg0 + arg1 > -local52;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V")
	@Override
	public void method5877() {
		Static71.method1639();
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)Z")
	private boolean method2330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = this.anInt2377 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static296.anIntArray435[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2377;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2374;
		@Pc(49) int local49 = this.anInt2371 * local37 >> 12;
		return arg0 - arg1 < local49 && arg0 - arg1 > -local49;
	}
}
