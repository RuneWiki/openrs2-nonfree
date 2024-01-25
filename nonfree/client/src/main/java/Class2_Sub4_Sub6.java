import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class2_Sub4_Sub6 extends Class2_Sub4 {

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
	private int anInt1892;

	@OriginalMember(owner = "client!cga", name = "F", descriptor = "I")
	private int anInt1893;

	@OriginalMember(owner = "client!cga", name = "L", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!cga", name = "Q", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!cga", name = "R", descriptor = "I")
	private int anInt1903;

	@OriginalMember(owner = "client!cga", name = "S", descriptor = "I")
	private int anInt1904;

	@OriginalMember(owner = "client!cga", name = "N", descriptor = "I")
	private int anInt1899 = 0;

	@OriginalMember(owner = "client!cga", name = "G", descriptor = "I")
	private int anInt1894 = 0;

	@OriginalMember(owner = "client!cga", name = "T", descriptor = "I")
	private int anInt1905 = 0;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class2_Sub4_Sub6() {
		super(1, false);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)V")
	private void method1613(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg2 <= arg0 ? arg0 : arg2;
		@Pc(27) int local27 = arg1 > local12 ? arg1 : local12;
		@Pc(34) int local34 = arg0 > arg2 ? arg2 : arg0;
		@Pc(45) int local45 = local34 <= arg1 ? local34 : arg1;
		@Pc(50) int local50 = local27 - local45;
		this.anInt1893 = (local45 + local27) / 2;
		if (local50 <= 0) {
			this.anInt1898 = 0;
		} else {
			@Pc(76) int local76 = (local27 - arg2 << 12) / local50;
			@Pc(85) int local85 = (local27 - arg0 << 12) / local50;
			@Pc(94) int local94 = (local27 - arg1 << 12) / local50;
			if (arg2 == local27) {
				this.anInt1898 = local45 == arg0 ? local94 + 20480 : 4096 - local85;
			} else if (local27 == arg0) {
				this.anInt1898 = arg1 == local45 ? local76 + 4096 : 12288 - local94;
			} else {
				this.anInt1898 = local45 == arg2 ? local85 + 12288 : -local76 + 20480;
			}
			this.anInt1898 /= 6;
		}
		if (this.anInt1893 > 0 && this.anInt1893 < 4096) {
			this.anInt1904 = (local50 << 12) / (this.anInt1893 <= 2048 ? this.anInt1893 * 2 : 8192 - (this.anInt1893 * 2));
		} else {
			this.anInt1904 = 0;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method8901(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass68_41.method1901(arg0);
		if (super.aClass68_41.aBoolean188) {
			@Pc(27) int[][] local27 = this.method8898(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static395.anInt6816; local53++) {
				this.method1613(local35[local53], local39[local53], local31[local53]);
				this.anInt1904 += this.anInt1894;
				this.anInt1893 += this.anInt1899;
				for (this.anInt1898 += this.anInt1905; this.anInt1898 < 0; this.anInt1898 += 4096) {
				}
				while (this.anInt1898 > 4096) {
					this.anInt1898 -= 4096;
				}
				if (this.anInt1904 < 0) {
					this.anInt1904 = 0;
				}
				if (this.anInt1893 < 0) {
					this.anInt1893 = 0;
				}
				if (this.anInt1904 > 4096) {
					this.anInt1904 = 4096;
				}
				if (this.anInt1893 > 4096) {
					this.anInt1893 = 4096;
				}
				this.method1615(this.anInt1898, this.anInt1893, this.anInt1904);
				local43[local53] = this.anInt1903;
				local47[local53] = this.anInt1902;
				local51[local53] = this.anInt1892;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!sl;II)V")
	@Override
	public void method8895(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt1905 = arg0.method2836();
		} else if (arg1 == 1) {
			this.anInt1894 = (arg0.method2860() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt1899 = (arg0.method2860() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZIII)V")
	private void method1615(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 > 2048 ? arg1 + arg2 - (arg2 * arg1 >> 12) : (arg2 + 4096) * arg1 >> 12;
		if (local27 <= 0) {
			this.anInt1903 = this.anInt1902 = this.anInt1892 = arg1;
			return;
		}
		@Pc(51) int local51 = arg0 * 6;
		@Pc(58) int local58 = arg1 + arg1 - local27;
		@Pc(66) int local66 = (local27 - local58 << 12) / local27;
		@Pc(70) int local70 = local51 >> 12;
		@Pc(76) int local76 = local51 - (local70 << 12);
		@Pc(84) int local84 = local66 * local27 >> 12;
		@Pc(90) int local90 = local84 * local76 >> 12;
		@Pc(95) int local95 = local58 + local90;
		@Pc(100) int local100 = local27 - local90;
		if (local70 == 0) {
			this.anInt1903 = local27;
			this.anInt1902 = local95;
			this.anInt1892 = local58;
		} else if (local70 == 1) {
			this.anInt1903 = local100;
			this.anInt1892 = local58;
			this.anInt1902 = local27;
		} else if (local70 == 2) {
			this.anInt1903 = local58;
			this.anInt1902 = local27;
			this.anInt1892 = local95;
		} else if (local70 == 3) {
			this.anInt1902 = local100;
			this.anInt1903 = local58;
			this.anInt1892 = local27;
		} else if (local70 == 4) {
			this.anInt1903 = local95;
			this.anInt1902 = local58;
			this.anInt1892 = local27;
		} else if (local70 == 5) {
			this.anInt1892 = local100;
			this.anInt1902 = local58;
			this.anInt1903 = local27;
		}
	}
}
