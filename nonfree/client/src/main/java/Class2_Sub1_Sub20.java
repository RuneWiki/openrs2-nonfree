import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class2_Sub1_Sub20 extends Class2_Sub1 {

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
	private int anInt3269 = 8192;

	@OriginalMember(owner = "client!m", name = "U", descriptor = "I")
	private int anInt3271 = 0;

	@OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
	private int anInt3274 = 2048;

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	private int anInt3277 = 12288;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	private int anInt3279 = 4096;

	@OriginalMember(owner = "client!m", name = "gb", descriptor = "I")
	private int anInt3281 = 0;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
	private int anInt3282 = 2048;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IBI)Z")
	private boolean method2675(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3277 >> 12;
		@Pc(31) int local31 = Static201.anIntArray347[local13 * 255 >> 12 & 0xFF];
		@Pc(38) int local38 = (local31 << 12) / this.anInt3277;
		@Pc(45) int local45 = (local38 << 12) / this.anInt3269;
		@Pc(52) int local52 = this.anInt3279 * local45 >> 12;
		return arg1 + arg0 < local52 && -local52 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3274 = arg0.method4242();
		} else if (arg1 == 1) {
			this.anInt3271 = arg0.method4242();
		} else if (arg1 == 2) {
			this.anInt3281 = arg0.method4242();
		} else if (arg1 == 3) {
			this.anInt3282 = arg0.method4242();
		} else if (arg1 == 4) {
			this.anInt3277 = arg0.method4242();
		} else if (arg1 == 5) {
			this.anInt3279 = arg0.method4242();
		} else if (arg1 == 6) {
			this.anInt3269 = arg0.method4242();
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(III)Z")
	private boolean method2676(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = (arg0 + arg1) * this.anInt3277 >> 12;
		@Pc(22) int local22 = Static201.anIntArray347[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt3277;
		@Pc(36) int local36 = (local29 << 12) / this.anInt3269;
		@Pc(43) int local43 = this.anInt3279 * local36 >> 12;
		return arg1 - arg0 < local43 && arg1 - arg0 > -local43;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4940(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = this.aClass136_41.method3410(arg0);
		if (this.aClass136_41.aBoolean349) {
			@Pc(21) int local21 = Static234.anIntArray435[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static114.anInt1359; local23++) {
				@Pc(32) int local32 = Static281.anIntArray506[local23] - 2048;
				@Pc(37) int local37 = local32 + this.anInt3274;
				@Pc(46) int local46 = local37 < -2048 ? local37 + 4096 : local37;
				@Pc(51) int local51 = local32 + this.anInt3281;
				@Pc(57) int local57 = local21 + this.anInt3271;
				@Pc(68) int local68 = local57 >= -2048 ? local57 : local57 + 4096;
				@Pc(79) int local79 = local68 <= 2048 ? local68 : local68 - 4096;
				@Pc(90) int local90 = local51 >= -2048 ? local51 : local51 + 4096;
				@Pc(99) int local99 = local90 > 2048 ? local90 - 4096 : local90;
				@Pc(104) int local104 = this.anInt3282 + local21;
				@Pc(113) int local113 = local104 >= -2048 ? local104 : local104 + 4096;
				@Pc(122) int local122 = local113 <= 2048 ? local113 : local113 - 4096;
				@Pc(131) int local131 = local46 > 2048 ? local46 - 4096 : local46;
				local11[local23] = this.method2675(local79, local131) || this.method2676(local99, local122) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	@Override
	public void method4934() {
		Static216.method3645();
	}
}
