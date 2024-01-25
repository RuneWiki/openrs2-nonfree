import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class3_Sub1_Sub28 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
	private int anInt4182 = 0;

	@OriginalMember(owner = "client!nh", name = "Q", descriptor = "I")
	private int anInt4185 = 12288;

	@OriginalMember(owner = "client!nh", name = "O", descriptor = "I")
	private int anInt4183 = 8192;

	@OriginalMember(owner = "client!nh", name = "L", descriptor = "I")
	private int anInt4181 = 2048;

	@OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
	private int anInt4184 = 4096;

	@OriginalMember(owner = "client!nh", name = "T", descriptor = "I")
	private int anInt4188 = 0;

	@OriginalMember(owner = "client!nh", name = "Y", descriptor = "I")
	private int anInt4193 = 2048;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub28() {
		super(0, true);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(III)Z")
	private boolean method3882(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = (arg1 - arg0) * this.anInt4185 >> 12;
		@Pc(27) int local27 = Static81.anIntArray164[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4185;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4183;
		@Pc(48) int local48 = local41 * this.anInt4184 >> 12;
		return arg1 + arg0 < local48 && -local48 < arg1 + arg0;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public void method5552() {
		Static204.method4476();
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(III)Z")
	private boolean method3885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = (arg0 + arg1) * this.anInt4185 >> 12;
		@Pc(27) int local27 = Static81.anIntArray164[local17 * 255 >> 12 & 0xFF];
		@Pc(34) int local34 = (local27 << 12) / this.anInt4185;
		@Pc(41) int local41 = (local34 << 12) / this.anInt4183;
		@Pc(48) int local48 = local41 * this.anInt4184 >> 12;
		return local48 > arg1 - arg0 && arg1 - arg0 > -local48;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method5550(@OriginalArg(0) int arg0) {
		@Pc(13) int[] local13 = super.aClass4_41.method61(arg0);
		if (super.aClass4_41.aBoolean7) {
			@Pc(23) int local23 = Static351.anIntArray371[arg0] - 2048;
			for (@Pc(25) int local25 = 0; local25 < Static238.anInt4221; local25++) {
				@Pc(33) int local33 = Static187.anIntArray379[local25] - 2048;
				@Pc(38) int local38 = this.anInt4193 + local33;
				@Pc(49) int local49 = local38 < -2048 ? local38 + 4096 : local38;
				@Pc(58) int local58 = local49 <= 2048 ? local49 : local49 - 4096;
				@Pc(63) int local63 = this.anInt4188 + local23;
				@Pc(74) int local74 = local63 >= -2048 ? local63 : local63 + 4096;
				@Pc(83) int local83 = local74 <= 2048 ? local74 : local74 - 4096;
				@Pc(89) int local89 = local33 + this.anInt4182;
				@Pc(100) int local100 = local89 < -2048 ? local89 + 4096 : local89;
				@Pc(111) int local111 = local100 > 2048 ? local100 - 4096 : local100;
				@Pc(116) int local116 = this.anInt4181 + local23;
				@Pc(125) int local125 = local116 >= -2048 ? local116 : local116 + 4096;
				@Pc(136) int local136 = local125 <= 2048 ? local125 : local125 - 4096;
				local13[local25] = this.method3882(local58, local83) || this.method3885(local111, local136) ? 4096 : 0;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!rp;BI)V")
	@Override
	public void method5545(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4193 = arg0.method2767();
		} else if (arg1 == 1) {
			this.anInt4188 = arg0.method2767();
		} else if (arg1 == 2) {
			this.anInt4182 = arg0.method2767();
		} else if (arg1 == 3) {
			this.anInt4181 = arg0.method2767();
		} else if (arg1 == 4) {
			this.anInt4185 = arg0.method2767();
		} else if (arg1 == 5) {
			this.anInt4184 = arg0.method2767();
		} else if (arg1 == 6) {
			this.anInt4183 = arg0.method2767();
		}
	}
}
