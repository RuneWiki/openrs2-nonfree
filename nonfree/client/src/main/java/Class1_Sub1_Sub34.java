import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	private int anInt5946;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
	private int anInt5947;

	@OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
	private int anInt5949;

	@OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
	private int anInt5952;

	@OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
	private int anInt5953;

	@OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
	private int anInt5955;

	@OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
	private int anInt5954 = 0;

	@OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
	private int anInt5951 = 0;

	@OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
	private int anInt5957 = 0;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIII)V")
	private void method5350(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) int local34 = arg0 > 2048 ? arg0 + arg1 - (arg0 * arg1 >> 12) : (arg1 + 4096) * arg0 >> 12;
		if (local34 <= 0) {
			this.anInt5946 = this.anInt5952 = this.anInt5955 = arg0;
			return;
		}
		@Pc(40) int local40 = arg2 * 6;
		@Pc(47) int local47 = arg0 + arg0 - local34;
		@Pc(55) int local55 = (local34 - local47 << 12) / local34;
		@Pc(59) int local59 = local40 >> 12;
		@Pc(66) int local66 = local40 - (local59 << 12);
		@Pc(74) int local74 = local55 * local34 >> 12;
		@Pc(80) int local80 = local74 * local66 >> 12;
		@Pc(84) int local84 = local80 + local47;
		@Pc(89) int local89 = local34 - local80;
		if (local59 == 0) {
			this.anInt5946 = local34;
			this.anInt5955 = local47;
			this.anInt5952 = local84;
			return;
		}
		if (local59 == 1) {
			this.anInt5952 = local34;
			this.anInt5955 = local47;
			this.anInt5946 = local89;
			return;
		}
		if (local59 == 2) {
			this.anInt5955 = local84;
			this.anInt5952 = local34;
			this.anInt5946 = local47;
			return;
		}
		if (local59 == 3) {
			this.anInt5952 = local89;
			this.anInt5946 = local47;
			this.anInt5955 = local34;
			return;
		}
		if (local59 == 4) {
			this.anInt5955 = local34;
			this.anInt5946 = local84;
			this.anInt5952 = local47;
			return;
		}
		if (local59 == 5) {
			this.anInt5946 = local34;
			this.anInt5952 = local47;
			this.anInt5955 = local89;
			return;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILclient!at;)V")
	@Override
	public void method6002(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt5957 = arg1.method2141();
		} else if (arg0 == 1) {
			this.anInt5951 = (arg1.method2122() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt5954 = (arg1.method2122() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6004(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass34_41.method1356(arg0);
		if (super.aClass34_41.aBoolean100) {
			@Pc(26) int[][] local26 = this.method6006(0, arg0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local26[2];
			@Pc(42) int[] local42 = local16[0];
			@Pc(46) int[] local46 = local16[1];
			@Pc(50) int[] local50 = local16[2];
			for (@Pc(52) int local52 = 0; local52 < Static85.anInt1910; local52++) {
				this.method5352(local34[local52], local30[local52], local38[local52]);
				this.anInt5953 += this.anInt5951;
				this.anInt5949 += this.anInt5954;
				for (this.anInt5947 += this.anInt5957; this.anInt5947 < 0; this.anInt5947 += 4096) {
				}
				if (this.anInt5953 < 0) {
					this.anInt5953 = 0;
				}
				while (this.anInt5947 > 4096) {
					this.anInt5947 -= 4096;
				}
				if (this.anInt5953 > 4096) {
					this.anInt5953 = 4096;
				}
				if (this.anInt5949 < 0) {
					this.anInt5949 = 0;
				}
				if (this.anInt5949 > 4096) {
					this.anInt5949 = 4096;
				}
				this.method5350(this.anInt5949, this.anInt5953, this.anInt5947);
				local42[local52] = this.anInt5946;
				local46[local52] = this.anInt5952;
				local50[local52] = this.anInt5955;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(IIII)V")
	private void method5352(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 < arg1 ? arg1 : arg0;
		@Pc(23) int local23 = arg0 <= arg1 ? arg0 : arg1;
		@Pc(34) int local34 = arg2 <= local16 ? local16 : arg2;
		@Pc(41) int local41 = local23 <= arg2 ? local23 : arg2;
		@Pc(46) int local46 = local34 - local41;
		this.anInt5949 = (local41 + local34) / 2;
		if (this.anInt5949 > 0 && this.anInt5949 < 4096) {
			this.anInt5953 = (local46 << 12) / (this.anInt5949 > 2048 ? 8192 - this.anInt5949 * 2 : this.anInt5949 * 2);
		} else {
			this.anInt5953 = 0;
		}
		if (local46 <= 0) {
			this.anInt5947 = 0;
			return;
		}
		@Pc(106) int local106 = (local34 - arg1 << 12) / local46;
		@Pc(114) int local114 = (local34 - arg0 << 12) / local46;
		@Pc(123) int local123 = (local34 - arg2 << 12) / local46;
		if (local34 == arg1) {
			this.anInt5947 = local41 == arg0 ? local123 + 20480 : -local114 + 4096;
		} else if (local34 == arg0) {
			this.anInt5947 = local41 == arg2 ? local106 + 4096 : 12288 - local123;
		} else {
			this.anInt5947 = local41 == arg1 ? local114 + 12288 : -local106 + 20480;
		}
		this.anInt5947 /= 6;
	}
}
