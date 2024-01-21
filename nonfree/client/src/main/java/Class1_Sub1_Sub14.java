import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public final class Class1_Sub1_Sub14 extends Class1_Sub1 {

	@OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
	private int anInt1757;

	@OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
	private int anInt1758;

	@OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
	private int anInt1763;

	@OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
	private int anInt1765;

	@OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
	private int anInt1766;

	@OriginalMember(owner = "client!hc", name = "hb", descriptor = "I")
	private int anInt1768;

	@OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
	private int anInt1762 = 0;

	@OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
	private int anInt1756 = 0;

	@OriginalMember(owner = "client!hc", name = "gb", descriptor = "I")
	private int anInt1767 = 0;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub14() {
		super(1, false);
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIII)V")
	private void method1388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(36) int local36 = arg2 <= 2048 ? (arg1 + 4096) * arg2 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local36 <= 0) {
			this.anInt1757 = this.anInt1765 = this.anInt1768 = arg2;
			return;
		}
		@Pc(52) int local52 = arg0 * 6;
		@Pc(60) int local60 = arg2 + arg2 - local36;
		@Pc(69) int local69 = (local36 - local60 << 12) / local36;
		@Pc(73) int local73 = local52 >> 12;
		@Pc(80) int local80 = local52 - (local73 << 12);
		@Pc(88) int local88 = local69 * local36 >> 12;
		@Pc(94) int local94 = local88 * local80 >> 12;
		@Pc(99) int local99 = local36 - local94;
		@Pc(104) int local104 = local60 + local94;
		if (local73 == 0) {
			this.anInt1757 = local36;
			this.anInt1765 = local104;
			this.anInt1768 = local60;
		} else if (local73 == 1) {
			this.anInt1757 = local99;
			this.anInt1768 = local60;
			this.anInt1765 = local36;
		} else if (local73 == 2) {
			this.anInt1768 = local104;
			this.anInt1757 = local60;
			this.anInt1765 = local36;
		} else if (local73 == 3) {
			this.anInt1757 = local60;
			this.anInt1765 = local99;
			this.anInt1768 = local36;
		} else if (local73 == 4) {
			this.anInt1765 = local60;
			this.anInt1768 = local36;
			this.anInt1757 = local104;
		} else if (local73 == 5) {
			this.anInt1765 = local60;
			this.anInt1757 = local36;
			this.anInt1768 = local99;
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)V")
	private void method1389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 < arg1 ? arg2 : arg1;
		@Pc(19) int local19 = arg1 < arg2 ? arg2 : arg1;
		@Pc(26) int local26 = local19 >= arg0 ? local19 : arg0;
		@Pc(45) int local45 = local12 <= arg0 ? local12 : arg0;
		@Pc(50) int local50 = local26 - local45;
		this.anInt1763 = (local45 + local26) / 2;
		if (this.anInt1763 > 0 && this.anInt1763 < 4096) {
			this.anInt1758 = (local50 << 12) / (this.anInt1763 > 2048 ? 8192 - this.anInt1763 * 2 : this.anInt1763 * 2);
		} else {
			this.anInt1758 = 0;
		}
		if (local50 <= 0) {
			this.anInt1766 = 0;
			return;
		}
		@Pc(111) int local111 = (local26 - arg1 << 12) / local50;
		@Pc(120) int local120 = (local26 - arg2 << 12) / local50;
		@Pc(129) int local129 = (local26 - arg0 << 12) / local50;
		if (local26 == arg2) {
			this.anInt1766 = local45 == arg1 ? local129 + 20480 : -local111 + 4096;
		} else if (local26 == arg1) {
			this.anInt1766 = local45 == arg0 ? local120 + 4096 : -local129 + 12288;
		} else {
			this.anInt1766 = arg2 == local45 ? local111 + 12288 : -local120 + 20480;
		}
		this.anInt1766 /= 6;
	}

	@OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method3576(@OriginalArg(1) int arg0) {
		@Pc(15) int[][] local15 = super.aClass33_41.method1274(arg0);
		if (super.aClass33_41.aBoolean80) {
			@Pc(25) int[][] local25 = this.method3579(arg0, 0);
			@Pc(29) int[] local29 = local25[1];
			@Pc(33) int[] local33 = local25[2];
			@Pc(37) int[] local37 = local25[0];
			@Pc(41) int[] local41 = local15[0];
			@Pc(45) int[] local45 = local15[1];
			@Pc(49) int[] local49 = local15[2];
			for (@Pc(51) int local51 = 0; local51 < Static115.anInt2578; local51++) {
				this.method1389(local33[local51], local29[local51], local37[local51]);
				this.anInt1758 += this.anInt1756;
				if (this.anInt1758 < 0) {
					this.anInt1758 = 0;
				}
				this.anInt1763 += this.anInt1767;
				this.anInt1766 += this.anInt1762;
				if (this.anInt1763 < 0) {
					this.anInt1763 = 0;
				}
				while (this.anInt1766 < 0) {
					this.anInt1766 += 4096;
				}
				while (this.anInt1766 > 4096) {
					this.anInt1766 -= 4096;
				}
				if (this.anInt1758 > 4096) {
					this.anInt1758 = 4096;
				}
				if (this.anInt1763 > 4096) {
					this.anInt1763 = 4096;
				}
				this.method1388(this.anInt1766, this.anInt1758, this.anInt1763);
				local41[local51] = this.anInt1757;
				local45[local51] = this.anInt1765;
				local49[local51] = this.anInt1768;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!fj;IB)V")
	@Override
	public void method3573(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1762 = arg0.method2779();
		} else if (arg1 == 1) {
			this.anInt1756 = (arg0.method2770() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1767 = (arg0.method2770() << 12) / 100;
		}
	}
}
