import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class2_Sub1_Sub26 extends Class2_Sub1 {

	@OriginalMember(owner = "client!pd", name = "U", descriptor = "I")
	private int anInt3411;

	@OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
	private int anInt3412;

	@OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
	private int anInt3413;

	@OriginalMember(owner = "client!pd", name = "Y", descriptor = "I")
	private int anInt3414;

	@OriginalMember(owner = "client!pd", name = "bb", descriptor = "I")
	private int anInt3416;

	@OriginalMember(owner = "client!pd", name = "mb", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
	private int anInt3410 = 0;

	@OriginalMember(owner = "client!pd", name = "gb", descriptor = "I")
	private int anInt3419 = 0;

	@OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
	private int anInt3423 = 0;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub26() {
		super(1, false);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3423 = arg0.method196();
		} else if (arg1 == 1) {
			this.anInt3419 = (arg0.method186() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3410 = (arg0.method186() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(7) int[][] local7 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(17) int[][] local17 = this.method3205(0, arg0);
			@Pc(21) int[] local21 = local17[1];
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[2];
			@Pc(33) int[] local33 = local7[0];
			@Pc(37) int[] local37 = local7[1];
			@Pc(41) int[] local41 = local7[2];
			for (@Pc(43) int local43 = 0; local43 < Static62.anInt1675; local43++) {
				this.method2350(local21[local43], local25[local43], local29[local43]);
				this.anInt3416 += this.anInt3410;
				if (this.anInt3416 < 0) {
					this.anInt3416 = 0;
				}
				for (this.anInt3413 += this.anInt3423; this.anInt3413 < 0; this.anInt3413 += 4096) {
				}
				if (this.anInt3416 > 4096) {
					this.anInt3416 = 4096;
				}
				while (this.anInt3413 > 4096) {
					this.anInt3413 -= 4096;
				}
				this.anInt3411 += this.anInt3419;
				if (this.anInt3411 < 0) {
					this.anInt3411 = 0;
				}
				if (this.anInt3411 > 4096) {
					this.anInt3411 = 4096;
				}
				this.method2349(this.anInt3411, this.anInt3413, this.anInt3416);
				local33[local43] = this.anInt3414;
				local37[local43] = this.anInt3412;
				local41[local43] = this.anInt3421;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIII)V")
	private void method2349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(32) int local32 = arg2 > 2048 ? arg2 + arg0 - (arg0 * arg2 >> 12) : (4096 - -arg0) * arg2 >> 12;
		if (local32 <= 0) {
			this.anInt3414 = this.anInt3412 = this.anInt3421 = arg2;
			return;
		}
		@Pc(42) int local42 = arg2 + arg2 - local32;
		@Pc(46) int local46 = arg1 * 6;
		@Pc(54) int local54 = (local32 - local42 << 12) / local32;
		@Pc(58) int local58 = local46 >> 12;
		@Pc(65) int local65 = local46 - (local58 << 12);
		@Pc(73) int local73 = local32 * local54 >> 12;
		@Pc(79) int local79 = local65 * local73 >> 12;
		@Pc(84) int local84 = local32 - local79;
		@Pc(88) int local88 = local42 + local79;
		if (local58 == 0) {
			this.anInt3412 = local88;
			this.anInt3421 = local42;
			this.anInt3414 = local32;
			return;
		}
		if (local58 == 1) {
			this.anInt3421 = local42;
			this.anInt3412 = local32;
			this.anInt3414 = local84;
			return;
		}
		if (local58 == 2) {
			this.anInt3421 = local88;
			this.anInt3412 = local32;
			this.anInt3414 = local42;
			return;
		}
		if (local58 == 3) {
			this.anInt3414 = local42;
			this.anInt3421 = local32;
			this.anInt3412 = local84;
			return;
		}
		if (local58 == 4) {
			this.anInt3414 = local88;
			this.anInt3421 = local32;
			this.anInt3412 = local42;
			return;
		}
		if (local58 == 5) {
			this.anInt3414 = local32;
			this.anInt3412 = local42;
			this.anInt3421 = local84;
			return;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V")
	private void method2350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(23) int local23 = local12 >= arg2 ? local12 : arg2;
		@Pc(30) int local30 = arg0 > arg1 ? arg1 : arg0;
		@Pc(37) int local37 = local30 <= arg2 ? local30 : arg2;
		this.anInt3416 = (local23 + local37) / 2;
		@Pc(49) int local49 = local23 - local37;
		if (local49 <= 0) {
			this.anInt3413 = 0;
		} else {
			@Pc(65) int local65 = (local23 - arg0 << 12) / local49;
			@Pc(74) int local74 = (local23 - arg1 << 12) / local49;
			@Pc(82) int local82 = (local23 - arg2 << 12) / local49;
			if (local23 == arg1) {
				this.anInt3413 = arg0 == local37 ? local82 + 20480 : 4096 - local65;
			} else if (local23 == arg0) {
				this.anInt3413 = arg2 == local37 ? local74 + 4096 : 12288 - local82;
			} else {
				this.anInt3413 = local37 == arg1 ? local65 + 12288 : -local74 + 20480;
			}
			this.anInt3413 /= 6;
		}
		if (this.anInt3416 > 0 && this.anInt3416 < 4096) {
			this.anInt3411 = (local49 << 12) / (this.anInt3416 <= 2048 ? this.anInt3416 * 2 : 8192 - (this.anInt3416 * 2));
		} else {
			this.anInt3411 = 0;
		}
	}
}
