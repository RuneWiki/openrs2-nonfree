import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class14_Sub3_Sub26 extends Class14_Sub3 {

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
	private int anInt4326 = 0;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	private int anInt4327 = 4096;

	@OriginalMember(owner = "client!nn", name = "S", descriptor = "I")
	private int anInt4333 = 0;

	@OriginalMember(owner = "client!nn", name = "bb", descriptor = "I")
	private int anInt4340 = 2048;

	@OriginalMember(owner = "client!nn", name = "cb", descriptor = "I")
	private int anInt4341 = 12288;

	@OriginalMember(owner = "client!nn", name = "X", descriptor = "I")
	private int anInt4337 = 2048;

	@OriginalMember(owner = "client!nn", name = "P", descriptor = "I")
	private int anInt4331 = 8192;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class14_Sub3_Sub26() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(BII)Z")
	private boolean method3893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = this.anInt4341 * (arg0 + arg1) >> 12;
		@Pc(23) int local23 = Static153.anIntArray287[local13 * 255 >> 12 & 0xFF];
		@Pc(30) int local30 = (local23 << 12) / this.anInt4341;
		@Pc(37) int local37 = (local30 << 12) / this.anInt4331;
		@Pc(44) int local44 = local37 * this.anInt4327 >> 12;
		return arg0 - arg1 < local44 && arg0 - arg1 > -local44;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(B)V")
	@Override
	public void method5998() {
		Static74.method4762();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method6000(@OriginalArg(0) Class14_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4340 = arg0.method2498();
		} else if (arg1 == 1) {
			this.anInt4333 = arg0.method2498();
		} else if (arg1 == 2) {
			this.anInt4326 = arg0.method2498();
		} else if (arg1 == 3) {
			this.anInt4337 = arg0.method2498();
		} else if (arg1 == 4) {
			this.anInt4341 = arg0.method2498();
		} else if (arg1 == 5) {
			this.anInt4327 = arg0.method2498();
		} else if (arg1 == 6) {
			this.anInt4331 = arg0.method2498();
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(ZII)Z")
	private boolean method3897(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = (arg1 - arg0) * this.anInt4341 >> 12;
		@Pc(22) int local22 = Static153.anIntArray287[local12 * 255 >> 12 & 0xFF];
		@Pc(29) int local29 = (local22 << 12) / this.anInt4341;
		@Pc(42) int local42 = (local29 << 12) / this.anInt4331;
		@Pc(49) int local49 = local42 * this.anInt4327 >> 12;
		return arg0 + arg1 < local49 && -local49 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method6003(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass157_41.method4026(arg0);
		if (super.aClass157_41.aBoolean296) {
			@Pc(27) int local27 = Static213.anIntArray381[arg0] - 2048;
			for (@Pc(29) int local29 = 0; local29 < Static294.anInt5657; local29++) {
				@Pc(37) int local37 = Static346.anIntArray638[local29] - 2048;
				@Pc(42) int local42 = local37 + this.anInt4340;
				@Pc(53) int local53 = local42 >= -2048 ? local42 : local42 + 4096;
				@Pc(62) int local62 = local53 <= 2048 ? local53 : local53 - 4096;
				@Pc(67) int local67 = local27 + this.anInt4333;
				@Pc(76) int local76 = local67 < -2048 ? local67 + 4096 : local67;
				@Pc(85) int local85 = local76 > 2048 ? local76 - 4096 : local76;
				@Pc(90) int local90 = this.anInt4326 + local37;
				@Pc(101) int local101 = local90 >= -2048 ? local90 : local90 + 4096;
				@Pc(110) int local110 = local101 > 2048 ? local101 - 4096 : local101;
				@Pc(115) int local115 = this.anInt4337 + local27;
				@Pc(124) int local124 = local115 < -2048 ? local115 + 4096 : local115;
				@Pc(133) int local133 = local124 <= 2048 ? local124 : local124 - 4096;
				local11[local29] = this.method3897(local62, local85) || this.method3893(local133, local110) ? 4096 : 0;
			}
		}
		return local11;
	}
}
