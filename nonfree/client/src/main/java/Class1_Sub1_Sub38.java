import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vi", name = "W", descriptor = "I")
	private int anInt4385;

	@OriginalMember(owner = "client!vi", name = "X", descriptor = "I")
	private int anInt4386;

	@OriginalMember(owner = "client!vi", name = "bb", descriptor = "I")
	private int anInt4389;

	@OriginalMember(owner = "client!vi", name = "eb", descriptor = "I")
	private int anInt4392;

	@OriginalMember(owner = "client!vi", name = "kb", descriptor = "I")
	private int anInt4396;

	@OriginalMember(owner = "client!vi", name = "sb", descriptor = "I")
	private int anInt4401;

	@OriginalMember(owner = "client!vi", name = "V", descriptor = "I")
	private int anInt4384 = 0;

	@OriginalMember(owner = "client!vi", name = "cb", descriptor = "I")
	private int anInt4390 = 0;

	@OriginalMember(owner = "client!vi", name = "mb", descriptor = "I")
	private int anInt4398 = 0;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4398 = arg0.method3048();
		} else if (arg1 == 1) {
			this.anInt4384 = (arg0.method3009() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4390 = (arg0.method3009() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBI)V")
	private void method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 < arg0 ? arg0 : arg2;
		@Pc(33) int local33 = arg0 >= arg2 ? arg2 : arg0;
		@Pc(44) int local44 = arg1 < local33 ? arg1 : local33;
		@Pc(55) int local55 = local16 >= arg1 ? local16 : arg1;
		this.anInt4389 = (local44 + local55) / 2;
		@Pc(67) int local67 = local55 - local44;
		if (this.anInt4389 > 0 && this.anInt4389 < 4096) {
			this.anInt4396 = (local67 << 12) / (this.anInt4389 > 2048 ? 8192 - (this.anInt4389 * 2) : this.anInt4389 * 2);
		} else {
			this.anInt4396 = 0;
		}
		if (local67 <= 0) {
			this.anInt4392 = 0;
			return;
		}
		@Pc(123) int local123 = (local55 - arg0 << 12) / local67;
		@Pc(131) int local131 = (local55 - arg2 << 12) / local67;
		@Pc(140) int local140 = (local55 - arg1 << 12) / local67;
		if (arg0 == local55) {
			this.anInt4392 = local44 == arg2 ? local140 + 20480 : 4096 - local131;
		} else if (arg2 == local55) {
			this.anInt4392 = local44 == arg1 ? local123 + 4096 : -local140 + 12288;
		} else {
			this.anInt4392 = local44 == arg0 ? local131 + 12288 : -local123 + 20480;
		}
		this.anInt4392 /= 6;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)V")
	private void method3335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(28) int local28 = arg2 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (local28 <= 0) {
			this.anInt4386 = this.anInt4385 = this.anInt4401 = arg2;
			return;
		}
		@Pc(48) int local48 = arg2 + arg2 - local28;
		@Pc(52) int local52 = arg1 * 6;
		@Pc(61) int local61 = (local28 - local48 << 12) / local28;
		@Pc(69) int local69 = local61 * local28 >> 12;
		@Pc(73) int local73 = local52 >> 12;
		@Pc(80) int local80 = local52 - (local73 << 12);
		@Pc(86) int local86 = local80 * local69 >> 12;
		@Pc(91) int local91 = local28 - local86;
		@Pc(95) int local95 = local48 + local86;
		if (local73 == 0) {
			this.anInt4401 = local48;
			this.anInt4385 = local95;
			this.anInt4386 = local28;
		} else if (local73 == 1) {
			this.anInt4385 = local28;
			this.anInt4386 = local91;
			this.anInt4401 = local48;
		} else if (local73 == 2) {
			this.anInt4385 = local28;
			this.anInt4386 = local48;
			this.anInt4401 = local95;
		} else if (local73 == 3) {
			this.anInt4401 = local28;
			this.anInt4385 = local91;
			this.anInt4386 = local48;
		} else if (local73 == 4) {
			this.anInt4385 = local48;
			this.anInt4386 = local95;
			this.anInt4401 = local28;
		} else if (local73 == 5) {
			this.anInt4386 = local28;
			this.anInt4385 = local48;
			this.anInt4401 = local91;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3398(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass75_41.method2104(arg0);
		if (super.aClass75_41.aBoolean166) {
			@Pc(21) int[][] local21 = this.method3397(0, arg0);
			@Pc(25) int[] local25 = local21[0];
			@Pc(29) int[] local29 = local21[1];
			@Pc(33) int[] local33 = local21[2];
			@Pc(37) int[] local37 = local11[1];
			@Pc(41) int[] local41 = local11[0];
			@Pc(45) int[] local45 = local11[2];
			for (@Pc(47) int local47 = 0; local47 < Static107.anInt2321; local47++) {
				this.method3334(local25[local47], local33[local47], local29[local47]);
				this.anInt4389 += this.anInt4390;
				this.anInt4396 += this.anInt4384;
				for (this.anInt4392 += this.anInt4398; this.anInt4392 < 0; this.anInt4392 += 4096) {
				}
				if (this.anInt4389 < 0) {
					this.anInt4389 = 0;
				}
				if (this.anInt4396 < 0) {
					this.anInt4396 = 0;
				}
				if (this.anInt4389 > 4096) {
					this.anInt4389 = 4096;
				}
				if (this.anInt4396 > 4096) {
					this.anInt4396 = 4096;
				}
				while (this.anInt4392 > 4096) {
					this.anInt4392 -= 4096;
				}
				this.method3335(this.anInt4396, this.anInt4392, this.anInt4389);
				local41[local47] = this.anInt4386;
				local37[local47] = this.anInt4385;
				local45[local47] = this.anInt4401;
			}
		}
		return local11;
	}
}
