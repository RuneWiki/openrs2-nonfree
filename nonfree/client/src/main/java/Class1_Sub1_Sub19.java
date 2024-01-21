import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	private int anInt2168 = 0;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	private int anInt2166 = 4096;

	@OriginalMember(owner = "client!kc", name = "sb", descriptor = "I")
	private int anInt2179 = 0;

	@OriginalMember(owner = "client!kc", name = "tb", descriptor = "I")
	private int anInt2180 = 12288;

	@OriginalMember(owner = "client!kc", name = "db", descriptor = "I")
	private int anInt2171 = 2048;

	@OriginalMember(owner = "client!kc", name = "rb", descriptor = "I")
	private int anInt2178 = 2048;

	@OriginalMember(owner = "client!kc", name = "ub", descriptor = "I")
	private int anInt2181 = 8192;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub19() {
		super(0, true);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	@Override
	public void method3388() {
		Static110.method1653();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2178 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt2168 = arg0.method3023();
		} else if (arg1 == 2) {
			this.anInt2179 = arg0.method3023();
		} else if (arg1 == 3) {
			this.anInt2171 = arg0.method3023();
		} else if (arg1 == 4) {
			this.anInt2180 = arg0.method3023();
		} else if (arg1 == 5) {
			this.anInt2166 = arg0.method3023();
		} else if (arg1 == 6) {
			this.anInt2181 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IBI)Z")
	private boolean method1522(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = this.anInt2180 * (arg1 - arg0) >> 12;
		@Pc(23) int local23 = Static7.anIntArray17[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2180;
		@Pc(37) int local37 = (local30 << 12) / this.anInt2181;
		@Pc(52) int local52 = local37 * this.anInt2166 >> 12;
		return local52 > arg1 + arg0 && -local52 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)Z")
	private boolean method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9 = (arg1 + arg0) * this.anInt2180 >> 12;
		@Pc(23) int local23 = Static7.anIntArray17[local9 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt2180;
		@Pc(42) int local42 = (local30 << 12) / this.anInt2181;
		@Pc(49) int local49 = this.anInt2166 * local42 >> 12;
		return arg1 - arg0 < local49 && -local49 < arg1 - arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(13) int[] local13 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(30) int local30 = Static193.anIntArray277[arg0] - 2048;
			for (@Pc(32) int local32 = 0; local32 < Static107.anInt2321; local32++) {
				@Pc(39) int local39 = local30 + this.anInt2168;
				@Pc(45) int local45 = Static204.anIntArray179[local32] - 2048;
				@Pc(54) int local54 = local39 >= -2048 ? local39 : local39 + 4096;
				@Pc(65) int local65 = local54 > 2048 ? local54 - 4096 : local54;
				@Pc(71) int local71 = local45 + this.anInt2178;
				@Pc(80) int local80 = local71 >= -2048 ? local71 : local71 + 4096;
				@Pc(91) int local91 = local80 > 2048 ? local80 - 4096 : local80;
				@Pc(96) int local96 = this.anInt2179 + local45;
				@Pc(105) int local105 = local96 >= -2048 ? local96 : local96 + 4096;
				@Pc(110) int local110 = this.anInt2171 + local30;
				@Pc(121) int local121 = local105 <= 2048 ? local105 : local105 - 4096;
				@Pc(130) int local130 = local110 >= -2048 ? local110 : local110 + 4096;
				@Pc(141) int local141 = local130 > 2048 ? local130 - 4096 : local130;
				local13[local32] = this.method1522(local91, local65) || this.method1523(local121, local141) ? 4096 : 0;
			}
		}
		return local13;
	}
}
