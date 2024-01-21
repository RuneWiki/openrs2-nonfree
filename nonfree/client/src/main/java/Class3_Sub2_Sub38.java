import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class3_Sub2_Sub38 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ve", name = "Z", descriptor = "I")
	private int anInt4099;

	@OriginalMember(owner = "client!ve", name = "ab", descriptor = "I")
	private int anInt4100;

	@OriginalMember(owner = "client!ve", name = "bb", descriptor = "I")
	private int anInt4101;

	@OriginalMember(owner = "client!ve", name = "db", descriptor = "I")
	private int anInt4102;

	@OriginalMember(owner = "client!ve", name = "gb", descriptor = "I")
	private int anInt4104;

	@OriginalMember(owner = "client!ve", name = "ob", descriptor = "I")
	private int anInt4111;

	@OriginalMember(owner = "client!ve", name = "kb", descriptor = "I")
	private int anInt4107 = 0;

	@OriginalMember(owner = "client!ve", name = "pb", descriptor = "I")
	private int anInt4112 = 0;

	@OriginalMember(owner = "client!ve", name = "rb", descriptor = "I")
	private int anInt4113 = 0;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub38() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3326(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass67_41.method1940(arg0);
		if (super.aClass67_41.aBoolean135) {
			@Pc(30) int[][] local30 = this.method3332(0, arg0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[2];
			@Pc(42) int[] local42 = local11[0];
			@Pc(46) int[] local46 = local30[1];
			@Pc(50) int[] local50 = local11[1];
			@Pc(54) int[] local54 = local11[2];
			for (@Pc(56) int local56 = 0; local56 < Static190.anInt3865; local56++) {
				this.method3202(local46[local56], local34[local56], local38[local56]);
				for (this.anInt4099 += this.anInt4113; this.anInt4099 < 0; this.anInt4099 += 4096) {
				}
				this.anInt4101 += this.anInt4112;
				if (this.anInt4101 < 0) {
					this.anInt4101 = 0;
				}
				this.anInt4100 += this.anInt4107;
				if (this.anInt4100 < 0) {
					this.anInt4100 = 0;
				}
				if (this.anInt4101 > 4096) {
					this.anInt4101 = 4096;
				}
				while (this.anInt4099 > 4096) {
					this.anInt4099 -= 4096;
				}
				if (this.anInt4100 > 4096) {
					this.anInt4100 = 4096;
				}
				this.method3201(this.anInt4101, this.anInt4099, this.anInt4100);
				local42[local56] = this.anInt4102;
				local50[local56] = this.anInt4111;
				local54[local56] = this.anInt4104;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIBI)V")
	private void method3201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(29) int local29 = arg0 > 2048 ? arg2 + arg0 - (arg2 * arg0 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local29 <= 0) {
			this.anInt4102 = this.anInt4111 = this.anInt4104 = arg0;
			return;
		}
		@Pc(35) int local35 = arg1 * 6;
		@Pc(42) int local42 = arg0 + arg0 - local29;
		@Pc(50) int local50 = (local29 - local42 << 12) / local29;
		@Pc(54) int local54 = local35 >> 12;
		@Pc(61) int local61 = local35 - (local54 << 12);
		@Pc(69) int local69 = local50 * local29 >> 12;
		@Pc(75) int local75 = local61 * local69 >> 12;
		@Pc(79) int local79 = local42 + local75;
		@Pc(84) int local84 = local29 - local75;
		if (local54 == 0) {
			this.anInt4111 = local79;
			this.anInt4104 = local42;
			this.anInt4102 = local29;
			return;
		}
		if (local54 == 1) {
			this.anInt4104 = local42;
			this.anInt4102 = local84;
			this.anInt4111 = local29;
			return;
		}
		if (local54 == 2) {
			this.anInt4102 = local42;
			this.anInt4104 = local79;
			this.anInt4111 = local29;
			return;
		}
		if (local54 == 3) {
			this.anInt4104 = local29;
			this.anInt4102 = local42;
			this.anInt4111 = local84;
			return;
		}
		if (local54 == 4) {
			this.anInt4102 = local79;
			this.anInt4111 = local42;
			this.anInt4104 = local29;
			return;
		}
		if (local54 == 5) {
			this.anInt4111 = local42;
			this.anInt4104 = local84;
			this.anInt4102 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BIII)V")
	private void method3202(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0 >= arg1 ? arg0 : arg1;
		@Pc(19) int local19 = local8 < arg2 ? arg2 : local8;
		@Pc(38) int local38 = arg0 > arg1 ? arg1 : arg0;
		@Pc(45) int local45 = arg2 >= local38 ? local38 : arg2;
		this.anInt4101 = (local45 + local19) / 2;
		@Pc(58) int local58 = local19 - local45;
		if (this.anInt4101 > 0 && this.anInt4101 < 4096) {
			this.anInt4100 = (local58 << 12) / (this.anInt4101 <= 2048 ? this.anInt4101 * 2 : 8192 - (this.anInt4101 * 2));
		} else {
			this.anInt4100 = 0;
		}
		if (local58 <= 0) {
			this.anInt4099 = 0;
			return;
		}
		@Pc(111) int local111 = (local19 - arg1 << 12) / local58;
		@Pc(120) int local120 = (local19 - arg0 << 12) / local58;
		@Pc(129) int local129 = (local19 - arg2 << 12) / local58;
		if (local19 == arg1) {
			this.anInt4099 = arg0 == local45 ? local129 + 20480 : -local120 + 4096;
		} else if (local19 == arg0) {
			this.anInt4099 = arg2 == local45 ? local111 + 4096 : 12288 - local129;
		} else {
			this.anInt4099 = local45 == arg1 ? local120 + 12288 : -local111 + 20480;
		}
		this.anInt4099 /= 6;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4113 = arg0.method1267();
		} else if (arg1 == 1) {
			this.anInt4107 = (arg0.method1248() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt4112 = (arg0.method1248() << 12) / 100;
		}
	}
}
