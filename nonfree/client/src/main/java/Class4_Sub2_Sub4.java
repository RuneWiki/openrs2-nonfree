import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cca")
public final class Class4_Sub2_Sub4 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cca", name = "J", descriptor = "I")
	private int anInt1507;

	@OriginalMember(owner = "client!cca", name = "K", descriptor = "I")
	private int anInt1508;

	@OriginalMember(owner = "client!cca", name = "L", descriptor = "I")
	private int anInt1509;

	@OriginalMember(owner = "client!cca", name = "O", descriptor = "I")
	private int anInt1512;

	@OriginalMember(owner = "client!cca", name = "S", descriptor = "I")
	private int anInt1516;

	@OriginalMember(owner = "client!cca", name = "Z", descriptor = "I")
	private int anInt1521;

	@OriginalMember(owner = "client!cca", name = "R", descriptor = "I")
	private int anInt1515 = 0;

	@OriginalMember(owner = "client!cca", name = "Q", descriptor = "I")
	private int anInt1514 = 0;

	@OriginalMember(owner = "client!cca", name = "Y", descriptor = "I")
	private int anInt1520 = 0;

	@OriginalMember(owner = "client!cca", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIII)V")
	private void method1325(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(25) int local25 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local25 <= 0) {
			this.anInt1512 = this.anInt1507 = this.anInt1516 = arg1;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local25;
		@Pc(52) int local52 = (local25 - local43 << 12) / local25;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local25 * local52 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(81) int local81 = local77 + local43;
		@Pc(86) int local86 = local25 - local77;
		if (local56 == 0) {
			this.anInt1512 = local25;
			this.anInt1507 = local81;
			this.anInt1516 = local43;
			return;
		}
		if (local56 == 1) {
			this.anInt1507 = local25;
			this.anInt1516 = local43;
			this.anInt1512 = local86;
			return;
		}
		if (local56 == 2) {
			this.anInt1516 = local81;
			this.anInt1507 = local25;
			this.anInt1512 = local43;
			return;
		}
		if (local56 == 3) {
			this.anInt1512 = local43;
			this.anInt1507 = local86;
			this.anInt1516 = local25;
			return;
		}
		if (local56 == 4) {
			this.anInt1512 = local81;
			this.anInt1507 = local43;
			this.anInt1516 = local25;
			return;
		}
		if (local56 == 5) {
			this.anInt1512 = local25;
			this.anInt1507 = local43;
			this.anInt1516 = local86;
			return;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IIBI)V")
	private void method1326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 < arg2 ? arg2 : arg1;
		@Pc(27) int local27 = local16 < arg0 ? arg0 : local16;
		@Pc(34) int local34 = arg2 >= arg1 ? arg1 : arg2;
		@Pc(45) int local45 = local34 > arg0 ? arg0 : local34;
		@Pc(49) int local49 = local27 - local45;
		this.anInt1508 = (local27 + local45) / 2;
		if (local49 <= 0) {
			this.anInt1509 = 0;
		} else {
			@Pc(75) int local75 = (local27 - arg2 << 12) / local49;
			@Pc(84) int local84 = (local27 - arg1 << 12) / local49;
			@Pc(93) int local93 = (local27 - arg0 << 12) / local49;
			if (arg2 == local27) {
				this.anInt1509 = arg1 == local45 ? local93 + 20480 : -local84 + 4096;
			} else if (arg1 == local27) {
				this.anInt1509 = arg0 == local45 ? local75 + 4096 : -local93 + 12288;
			} else {
				this.anInt1509 = arg2 == local45 ? local84 + 12288 : -local75 + 20480;
			}
			this.anInt1509 /= 6;
		}
		if (this.anInt1508 > 0 && this.anInt1508 < 4096) {
			this.anInt1521 = (local49 << 12) / (this.anInt1508 > 2048 ? 8192 - (this.anInt1508 * 2) : this.anInt1508 * 2);
		} else {
			this.anInt1521 = 0;
		}
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8201(@OriginalArg(1) int arg0) {
		@Pc(20) int[][] local20 = super.aClass64_41.method1614(arg0);
		if (super.aClass64_41.aBoolean154) {
			@Pc(30) int[][] local30 = this.method8202(arg0, 0);
			@Pc(34) int[] local34 = local30[0];
			@Pc(38) int[] local38 = local30[1];
			@Pc(42) int[] local42 = local30[2];
			@Pc(46) int[] local46 = local20[0];
			@Pc(50) int[] local50 = local20[1];
			@Pc(54) int[] local54 = local20[2];
			for (@Pc(56) int local56 = 0; local56 < Static417.anInt5248; local56++) {
				this.method1326(local42[local56], local38[local56], local34[local56]);
				this.anInt1521 += this.anInt1515;
				this.anInt1508 += this.anInt1520;
				for (this.anInt1509 += this.anInt1514; this.anInt1509 < 0; this.anInt1509 += 4096) {
				}
				while (this.anInt1509 > 4096) {
					this.anInt1509 -= 4096;
				}
				if (this.anInt1521 < 0) {
					this.anInt1521 = 0;
				}
				if (this.anInt1521 > 4096) {
					this.anInt1521 = 4096;
				}
				if (this.anInt1508 < 0) {
					this.anInt1508 = 0;
				}
				if (this.anInt1508 > 4096) {
					this.anInt1508 = 4096;
				}
				this.method1325(this.anInt1509, this.anInt1508, this.anInt1521);
				local46[local56] = this.anInt1512;
				local50[local56] = this.anInt1507;
				local54[local56] = this.anInt1516;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method8206(@OriginalArg(0) Class4_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1514 = arg0.method7043();
		} else if (arg1 == 1) {
			this.anInt1515 = (arg0.method7011() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1520 = (arg0.method7011() << 12) / 100;
		}
	}
}
