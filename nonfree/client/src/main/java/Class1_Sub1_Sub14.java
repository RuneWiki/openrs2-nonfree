import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
	private int anInt2279 = 12288;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
	private int anInt2281 = 0;

	@OriginalMember(owner = "client!hf", name = "Y", descriptor = "I")
	private int anInt2285 = 8192;

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
	private int anInt2284 = 2048;

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	private int anInt2274 = 0;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	private int anInt2278 = 4096;

	@OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
	private int anInt2287 = 2048;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(0, true);
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
	@Override
	public void method4720() {
		Static275.method4162();
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lclient!qm;II)V")
	@Override
	public void method4712(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2287 = arg0.method2244();
		} else if (arg1 == 1) {
			this.anInt2281 = arg0.method2244();
		} else if (arg1 == 2) {
			this.anInt2274 = arg0.method2244();
		} else if (arg1 == 3) {
			this.anInt2284 = arg0.method2244();
		} else if (arg1 == 4) {
			this.anInt2279 = arg0.method2244();
		} else if (arg1 == 5) {
			this.anInt2278 = arg0.method2244();
		} else if (arg1 == 6) {
			this.anInt2285 = arg0.method2244();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4717(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = this.aClass194_41.method4738(arg0);
		if (this.aClass194_41.aBoolean411) {
			@Pc(22) int local22 = Static256.anIntArray474[arg0] - 2048;
			for (@Pc(24) int local24 = 0; local24 < Static62.anInt1350; local24++) {
				@Pc(37) int local37 = Static3.anIntArray3[local24] - 2048;
				@Pc(42) int local42 = this.anInt2287 + local37;
				@Pc(51) int local51 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(56) int local56 = this.anInt2274 + local37;
				@Pc(65) int local65 = local51 <= 2048 ? local51 : local51 - 4096;
				@Pc(74) int local74 = local56 < -2048 ? local56 + 4096 : local56;
				@Pc(79) int local79 = local22 + this.anInt2284;
				@Pc(85) int local85 = local22 + this.anInt2281;
				@Pc(96) int local96 = local85 < -2048 ? local85 + 4096 : local85;
				@Pc(105) int local105 = local74 > 2048 ? local74 - 4096 : local74;
				@Pc(116) int local116 = local79 >= -2048 ? local79 : local79 + 4096;
				@Pc(127) int local127 = local96 > 2048 ? local96 - 4096 : local96;
				@Pc(136) int local136 = local116 <= 2048 ? local116 : local116 - 4096;
				local11[local24] = this.method1683(local127, local65) || this.method1682(local136, local105) ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIB)Z")
	private boolean method1682(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) int local20 = this.anInt2279 * (arg1 + arg0) >> 12;
		@Pc(30) int local30 = Static170.anIntArray340[local20 * 255 >> 12 & 0xFF];
		@Pc(37) int local37 = (local30 << 12) / this.anInt2279;
		@Pc(44) int local44 = (local37 << 12) / this.anInt2285;
		@Pc(51) int local51 = this.anInt2278 * local44 >> 12;
		return local51 > arg0 - arg1 && -local51 < arg0 - arg1;
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(III)Z")
	private boolean method1683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anInt2279 * (arg0 - arg1) >> 12;
		@Pc(22) int local22 = Static170.anIntArray340[local8 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt2279;
		@Pc(36) int local36 = (local29 << 12) / this.anInt2285;
		@Pc(43) int local43 = this.anInt2278 * local36 >> 12;
		return arg0 + arg1 < local43 && arg0 + arg1 > -local43;
	}
}
