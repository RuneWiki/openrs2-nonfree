import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	private int anInt1586;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
	private int anInt1590;

	@OriginalMember(owner = "client!ha", name = "S", descriptor = "I")
	private int anInt1591;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
	private int anInt1594;

	@OriginalMember(owner = "client!ha", name = "bb", descriptor = "I")
	private int anInt1599;

	@OriginalMember(owner = "client!ha", name = "gb", descriptor = "I")
	private int anInt1602;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
	private int anInt1587 = 0;

	@OriginalMember(owner = "client!ha", name = "W", descriptor = "I")
	private int anInt1595 = 0;

	@OriginalMember(owner = "client!ha", name = "Z", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub10() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1587 = arg0.method242();
		} else if (arg1 == 1) {
			this.anInt1597 = (arg0.method221() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1595 = (arg0.method221() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIB)V")
	private void method1262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0 < arg1 ? arg1 : arg0;
		@Pc(15) int local15 = arg0 > arg1 ? arg1 : arg0;
		@Pc(26) int local26 = arg2 <= local8 ? local8 : arg2;
		@Pc(37) int local37 = local15 <= arg2 ? local15 : arg2;
		this.anInt1586 = (local26 + local37) / 2;
		@Pc(49) int local49 = local26 - local37;
		if (this.anInt1586 > 0 && this.anInt1586 < 4096) {
			this.anInt1590 = (local49 << 12) / (this.anInt1586 > 2048 ? 8192 - (this.anInt1586 * 2) : this.anInt1586 * 2);
		} else {
			this.anInt1590 = 0;
		}
		if (local49 <= 0) {
			this.anInt1591 = 0;
			return;
		}
		@Pc(104) int local104 = (local26 - arg1 << 12) / local49;
		@Pc(113) int local113 = (local26 - arg2 << 12) / local49;
		@Pc(121) int local121 = (local26 - arg0 << 12) / local49;
		if (arg1 == local26) {
			this.anInt1591 = local37 == arg0 ? local113 + 20480 : -local121 + 4096;
		} else if (local26 == arg0) {
			this.anInt1591 = arg2 == local37 ? local104 + 4096 : 12288 - local113;
		} else {
			this.anInt1591 = local37 == arg1 ? local121 + 12288 : 20480 - local104;
		}
		this.anInt1591 /= 6;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3262(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass43_41.method1433(arg0);
		if (super.aClass43_41.aBoolean92) {
			@Pc(28) int[][] local28 = this.method3259(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local16[1];
			@Pc(44) int[] local44 = local16[0];
			@Pc(48) int[] local48 = local16[2];
			@Pc(52) int[] local52 = local28[2];
			for (@Pc(54) int local54 = 0; local54 < Static135.anInt2897; local54++) {
				this.method1262(local36[local54], local32[local54], local52[local54]);
				for (this.anInt1591 += this.anInt1587; this.anInt1591 < 0; this.anInt1591 += 4096) {
				}
				while (this.anInt1591 > 4096) {
					this.anInt1591 -= 4096;
				}
				this.anInt1590 += this.anInt1597;
				this.anInt1586 += this.anInt1595;
				if (this.anInt1590 < 0) {
					this.anInt1590 = 0;
				}
				if (this.anInt1590 > 4096) {
					this.anInt1590 = 4096;
				}
				if (this.anInt1586 < 0) {
					this.anInt1586 = 0;
				}
				if (this.anInt1586 > 4096) {
					this.anInt1586 = 4096;
				}
				this.method1265(this.anInt1586, this.anInt1591, this.anInt1590);
				local44[local54] = this.anInt1599;
				local40[local54] = this.anInt1602;
				local48[local54] = this.anInt1594;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
	private void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(28) int local28 = arg0 > 2048 ? arg0 + arg2 - (arg0 * arg2 >> 12) : (arg2 + 4096) * arg0 >> 12;
		if (local28 <= 0) {
			this.anInt1599 = this.anInt1602 = this.anInt1594 = arg0;
			return;
		}
		@Pc(52) int local52 = arg1 * 6;
		@Pc(60) int local60 = arg0 + arg0 - local28;
		@Pc(64) int local64 = local52 >> 12;
		@Pc(73) int local73 = (local28 - local60 << 12) / local28;
		@Pc(80) int local80 = local52 - (local64 << 12);
		@Pc(88) int local88 = local28 * local73 >> 12;
		@Pc(94) int local94 = local80 * local88 >> 12;
		@Pc(98) int local98 = local60 + local94;
		@Pc(102) int local102 = local28 - local94;
		if (local64 == 0) {
			this.anInt1594 = local60;
			this.anInt1599 = local28;
			this.anInt1602 = local98;
		} else if (local64 == 1) {
			this.anInt1602 = local28;
			this.anInt1594 = local60;
			this.anInt1599 = local102;
		} else if (local64 == 2) {
			this.anInt1602 = local28;
			this.anInt1599 = local60;
			this.anInt1594 = local98;
		} else if (local64 == 3) {
			this.anInt1599 = local60;
			this.anInt1594 = local28;
			this.anInt1602 = local102;
		} else if (local64 == 4) {
			this.anInt1602 = local60;
			this.anInt1594 = local28;
			this.anInt1599 = local98;
		} else if (local64 == 5) {
			this.anInt1599 = local28;
			this.anInt1602 = local60;
			this.anInt1594 = local102;
		}
	}
}
