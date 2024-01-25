import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class2_Sub2_Sub20 extends Class2_Sub2 {

	@OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
	private int anInt3188 = 12288;

	@OriginalMember(owner = "client!jk", name = "D", descriptor = "I")
	private int anInt3187 = 2048;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
	private int anInt3189 = 4096;

	@OriginalMember(owner = "client!jk", name = "H", descriptor = "I")
	private int anInt3191 = 2048;

	@OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
	private int anInt3197 = 0;

	@OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
	private int anInt3198 = 8192;

	@OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
	private int anInt3193 = 0;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub20() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V")
	@Override
	public void method5475() {
		Static51.method703();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)Z")
	private boolean method2586(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt3188 * (arg1 + arg0) >> 12;
		@Pc(32) int local32 = Static412.anIntArray564[local13 * 255 >> 12 & 0xFF];
		@Pc(39) int local39 = (local32 << 12) / this.anInt3188;
		@Pc(46) int local46 = (local39 << 12) / this.anInt3198;
		@Pc(53) int local53 = this.anInt3189 * local46 >> 12;
		return local53 > arg1 - arg0 && arg1 - arg0 > -local53;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!sv;II)V")
	@Override
	public void method5470(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3191 = arg0.method3555();
		} else if (arg1 == 1) {
			this.anInt3197 = arg0.method3555();
		} else if (arg1 == 2) {
			this.anInt3193 = arg0.method3555();
		} else if (arg1 == 3) {
			this.anInt3187 = arg0.method3555();
		} else if (arg1 == 4) {
			this.anInt3188 = arg0.method3555();
		} else if (arg1 == 5) {
			this.anInt3189 = arg0.method3555();
		} else if (arg1 == 6) {
			this.anInt3198 = arg0.method3555();
		}
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(III)Z")
	private boolean method2587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = (arg0 - arg1) * this.anInt3188 >> 12;
		@Pc(23) int local23 = Static412.anIntArray564[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt3188;
		@Pc(37) int local37 = (local30 << 12) / this.anInt3198;
		@Pc(44) int local44 = local37 * this.anInt3189 >> 12;
		return local44 > arg0 + arg1 && arg1 + arg0 > -local44;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method5465(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method3645(arg0);
		if (super.aClass170_41.aBoolean317) {
			@Pc(21) int local21 = Static405.anIntArray555[arg0] - 2048;
			for (@Pc(23) int local23 = 0; local23 < Static217.anInt3574; local23++) {
				@Pc(31) int local31 = Static145.anIntArray199[local23] - 2048;
				@Pc(36) int local36 = local31 + this.anInt3191;
				@Pc(45) int local45 = local36 >= -2048 ? local36 : local36 + 4096;
				@Pc(56) int local56 = local45 <= 2048 ? local45 : local45 - 4096;
				@Pc(61) int local61 = this.anInt3197 + local21;
				@Pc(72) int local72 = local61 < -2048 ? local61 + 4096 : local61;
				@Pc(83) int local83 = local72 > 2048 ? local72 - 4096 : local72;
				@Pc(88) int local88 = this.anInt3193 + local31;
				@Pc(97) int local97 = local88 >= -2048 ? local88 : local88 + 4096;
				@Pc(106) int local106 = local97 <= 2048 ? local97 : local97 - 4096;
				@Pc(111) int local111 = this.anInt3187 + local21;
				@Pc(122) int local122 = local111 >= -2048 ? local111 : local111 + 4096;
				@Pc(133) int local133 = local122 > 2048 ? local122 - 4096 : local122;
				local11[local23] = this.method2587(local83, local56) || this.method2586(local106, local133) ? 4096 : 0;
			}
		}
		return local11;
	}
}
