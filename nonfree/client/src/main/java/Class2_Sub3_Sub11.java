import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ia")
public final class Class2_Sub3_Sub11 extends Class2_Sub3 {

	@OriginalMember(owner = "client!ia", name = "gb", descriptor = "I")
	private int anInt1900;

	@OriginalMember(owner = "client!ia", name = "ob", descriptor = "I")
	private int anInt1904;

	@OriginalMember(owner = "client!ia", name = "tb", descriptor = "I")
	private int anInt1908;

	@OriginalMember(owner = "client!ia", name = "wb", descriptor = "I")
	private int anInt1909;

	@OriginalMember(owner = "client!ia", name = "Db", descriptor = "I")
	private int anInt1913;

	@OriginalMember(owner = "client!ia", name = "Fb", descriptor = "I")
	private int anInt1915;

	@OriginalMember(owner = "client!ia", name = "pb", descriptor = "I")
	private int anInt1905;

	@OriginalMember(owner = "client!ia", name = "ib", descriptor = "I")
	private int anInt1901;

	@OriginalMember(owner = "client!ia", name = "zb", descriptor = "I")
	private int anInt1911;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIII)V")
	private void method1330(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg1 >= arg2 ? arg1 : arg2;
		@Pc(27) int local27 = arg0 > local16 ? arg0 : local16;
		@Pc(38) int local38 = arg1 > arg2 ? arg2 : arg1;
		@Pc(45) int local45 = arg0 < local38 ? arg0 : local38;
		@Pc(49) int local49 = local27 - local45;
		this.anInt1900 = (local45 + local27) / 2;
		if (local49 <= 0) {
			return;
		}
		@Pc(72) int local72 = (local27 - arg1 << 12) / local49;
		@Pc(81) int local81 = (local27 - arg2 << 12) / local49;
		if (this.anInt1900 > 0 && this.anInt1900 < 4096) {
			this.anInt1908 = (local49 << 12) / (this.anInt1900 <= 2048 ? this.anInt1900 * 2 : 8192 - (this.anInt1900 * 2));
		}
		@Pc(119) int local119 = (local27 - arg0 << 12) / local49;
		if (arg2 == local27) {
			this.anInt1913 = arg1 == local45 ? local119 + 20480 : 4096 - local72;
		} else if (arg1 == local27) {
			this.anInt1913 = arg0 == local45 ? local81 + 4096 : -local119 + 12288;
		} else {
			this.anInt1913 = arg2 == local45 ? local72 + 12288 : -local81 + 20480;
		}
		this.anInt1913 /= 6;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZII)V")
	private void method1331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(31) int local31 = arg1 > 2048 ? arg2 + arg1 - (arg1 * arg2 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local31 <= 0) {
			this.anInt1909 = this.anInt1915 = this.anInt1904 = arg1;
			return;
		}
		@Pc(40) int local40 = arg0 * 6;
		@Pc(47) int local47 = arg1 + arg1 - local31;
		@Pc(56) int local56 = (local31 - local47 << 12) / local31;
		@Pc(60) int local60 = local40 >> 12;
		@Pc(67) int local67 = local40 - (local60 << 12);
		@Pc(75) int local75 = local31 * local56 >> 12;
		@Pc(81) int local81 = local67 * local75 >> 12;
		@Pc(86) int local86 = local31 - local81;
		@Pc(90) int local90 = local81 + local47;
		if (local60 == 0) {
			this.anInt1909 = local31;
			this.anInt1915 = local90;
			this.anInt1904 = local47;
		} else if (local60 == 1) {
			this.anInt1915 = local31;
			this.anInt1909 = local86;
			this.anInt1904 = local47;
		} else if (local60 == 2) {
			this.anInt1909 = local47;
			this.anInt1904 = local90;
			this.anInt1915 = local31;
		} else if (local60 == 3) {
			this.anInt1904 = local31;
			this.anInt1909 = local47;
			this.anInt1915 = local86;
		} else if (local60 == 4) {
			this.anInt1909 = local90;
			this.anInt1904 = local31;
			this.anInt1915 = local47;
		} else if (local60 == 5) {
			this.anInt1915 = local47;
			this.anInt1909 = local31;
			this.anInt1904 = local86;
		}
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt1911 = arg1.method1659();
		} else if (arg0 == 1) {
			this.anInt1905 = (arg1.method1707() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt1901 = (arg1.method1707() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(26) int[][] local26 = this.method2900(arg0, 0);
			@Pc(30) int[] local30 = local26[0];
			@Pc(34) int[] local34 = local26[1];
			@Pc(38) int[] local38 = local16[0];
			@Pc(42) int[] local42 = local16[1];
			@Pc(46) int[] local46 = local16[2];
			@Pc(50) int[] local50 = local26[2];
			for (@Pc(52) int local52 = 0; local52 < Static54.anInt1423; local52++) {
				this.method1330(local50[local52], local34[local52], local30[local52]);
				this.anInt1900 += this.anInt1901;
				if (this.anInt1900 < 0) {
					this.anInt1900 = 0;
				}
				this.anInt1908 += this.anInt1905;
				this.anInt1913 += this.anInt1911;
				if (this.anInt1908 < 0) {
					this.anInt1908 = 0;
				}
				while (this.anInt1913 < 0) {
					this.anInt1913 += 4096;
				}
				while (this.anInt1913 > 4096) {
					this.anInt1913 -= 4096;
				}
				if (this.anInt1900 > 4096) {
					this.anInt1900 = 4096;
				}
				if (this.anInt1908 > 4096) {
					this.anInt1908 = 4096;
				}
				this.method1331(this.anInt1913, this.anInt1900, this.anInt1908);
				local38[local52] = this.anInt1909;
				local42[local52] = this.anInt1915;
				local46[local52] = this.anInt1904;
			}
		}
		return local16;
	}
}
