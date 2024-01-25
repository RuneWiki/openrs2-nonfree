import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hf")
public final class Class6_Sub5_Sub17 extends Class6_Sub5 {

	@OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
	private int anInt3051;

	@OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
	private int anInt3052;

	@OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
	private int anInt3053;

	@OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
	private int anInt3055;

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
	private int anInt3059;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
	private int anInt3060;

	@OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
	private int anInt3054 = 0;

	@OriginalMember(owner = "client!hf", name = "Z", descriptor = "I")
	private int anInt3061 = 0;

	@OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
	private int anInt3058 = 0;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
	public Class6_Sub5_Sub17() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBLclient!ae;)V")
	@Override
	public void method6540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 0) {
			this.anInt3058 = arg1.method6428();
		} else if (arg0 == 1) {
			this.anInt3054 = (arg1.method6438() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt3061 = (arg1.method6438() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
	private void method2549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(23) int local23 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(30) int local30 = local16 < arg0 ? arg0 : local16;
		@Pc(37) int local37 = local23 > arg0 ? arg0 : local23;
		@Pc(42) int local42 = local30 - local37;
		this.anInt3060 = (local37 + local30) / 2;
		if (this.anInt3060 > 0 && this.anInt3060 < 4096) {
			this.anInt3051 = (local42 << 12) / (this.anInt3060 <= 2048 ? this.anInt3060 * 2 : 8192 - this.anInt3060 * 2);
		} else {
			this.anInt3051 = 0;
		}
		if (local42 <= 0) {
			this.anInt3055 = 0;
			return;
		}
		@Pc(102) int local102 = (local30 - arg2 << 12) / local42;
		@Pc(111) int local111 = (local30 - arg1 << 12) / local42;
		@Pc(119) int local119 = (local30 - arg0 << 12) / local42;
		if (arg2 == local30) {
			this.anInt3055 = arg1 == local37 ? local119 + 20480 : 4096 - local111;
		} else if (local30 == arg1) {
			this.anInt3055 = local37 == arg0 ? local102 + 4096 : -local119 + 12288;
		} else {
			this.anInt3055 = local37 == arg2 ? local111 + 12288 : -local102 + 20480;
		}
		this.anInt3055 /= 6;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method6545(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass162_41.method3811(arg0);
		if (super.aClass162_41.aBoolean291) {
			@Pc(26) int[][] local26 = this.method6544(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static240.anInt4386; local52++) {
				this.method2549(local38[local52], local34[local52], local30[local52]);
				this.anInt3060 += this.anInt3061;
				this.anInt3055 += this.anInt3058;
				this.anInt3051 += this.anInt3054;
				while (this.anInt3055 < 0) {
					this.anInt3055 += 4096;
				}
				while (this.anInt3055 > 4096) {
					this.anInt3055 -= 4096;
				}
				if (this.anInt3051 < 0) {
					this.anInt3051 = 0;
				}
				if (this.anInt3060 < 0) {
					this.anInt3060 = 0;
				}
				if (this.anInt3051 > 4096) {
					this.anInt3051 = 4096;
				}
				if (this.anInt3060 > 4096) {
					this.anInt3060 = 4096;
				}
				this.method2551(this.anInt3055, this.anInt3051, this.anInt3060);
				local42[local52] = this.anInt3059;
				local46[local52] = this.anInt3053;
				local50[local52] = this.anInt3052;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
	private void method2551(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg2 > 2048 ? arg2 + arg1 - (arg2 * arg1 >> 12) : (4096 - -arg1) * arg2 >> 12;
		if (local28 <= 0) {
			this.anInt3059 = this.anInt3053 = this.anInt3052 = arg2;
			return;
		}
		@Pc(55) int local55 = arg0 * 6;
		@Pc(62) int local62 = arg2 + arg2 - local28;
		@Pc(71) int local71 = (local28 - local62 << 12) / local28;
		@Pc(75) int local75 = local55 >> 12;
		@Pc(82) int local82 = local55 - (local75 << 12);
		@Pc(90) int local90 = local28 * local71 >> 12;
		@Pc(96) int local96 = local90 * local82 >> 12;
		@Pc(100) int local100 = local96 + local62;
		@Pc(105) int local105 = local28 - local96;
		if (local75 == 0) {
			this.anInt3053 = local100;
			this.anInt3059 = local28;
			this.anInt3052 = local62;
		} else if (local75 == 1) {
			this.anInt3053 = local28;
			this.anInt3052 = local62;
			this.anInt3059 = local105;
		} else if (local75 == 2) {
			this.anInt3059 = local62;
			this.anInt3052 = local100;
			this.anInt3053 = local28;
		} else if (local75 == 3) {
			this.anInt3053 = local105;
			this.anInt3052 = local28;
			this.anInt3059 = local62;
		} else if (local75 == 4) {
			this.anInt3053 = local62;
			this.anInt3052 = local28;
			this.anInt3059 = local100;
		} else if (local75 == 5) {
			this.anInt3052 = local105;
			this.anInt3053 = local62;
			this.anInt3059 = local28;
		}
	}
}
