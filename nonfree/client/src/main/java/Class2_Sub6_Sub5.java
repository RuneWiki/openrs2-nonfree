import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class2_Sub6_Sub5 extends Class2_Sub6 {

	@OriginalMember(owner = "client!di", name = "K", descriptor = "I")
	private int anInt1875;

	@OriginalMember(owner = "client!di", name = "N", descriptor = "I")
	private int anInt1878;

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "[I")
	private int[] anIntArray133;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!di", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "I")
	private int anInt1885;

	@OriginalMember(owner = "client!di", name = "L", descriptor = "I")
	private int anInt1876 = 0;

	@OriginalMember(owner = "client!di", name = "J", descriptor = "I")
	private int anInt1874 = 4;

	@OriginalMember(owner = "client!di", name = "U", descriptor = "I")
	private int anInt1882 = 204;

	@OriginalMember(owner = "client!di", name = "S", descriptor = "I")
	private int anInt1880 = 1024;

	@OriginalMember(owner = "client!di", name = "P", descriptor = "I")
	private int anInt1879 = 8;

	@OriginalMember(owner = "client!di", name = "X", descriptor = "I")
	private int anInt1884 = 81;

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "I")
	private int anInt1890 = 1024;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "I")
	private int anInt1887 = 409;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub5() {
		super(0, true);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZLclient!vj;)V")
	@Override
	public void method8467(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == 0) {
			this.anInt1874 = arg1.method8547();
		} else if (arg0 == 1) {
			this.anInt1879 = arg1.method8547();
		} else if (arg0 == 2) {
			this.anInt1887 = arg1.method8546();
		} else if (arg0 == 3) {
			this.anInt1882 = arg1.method8546();
		} else if (arg0 == 4) {
			this.anInt1880 = arg1.method8546();
		} else if (arg0 == 5) {
			this.anInt1876 = arg1.method8546();
		} else if (arg0 == 6) {
			this.anInt1884 = arg1.method8546();
		} else if (arg0 == 7) {
			this.anInt1890 = arg1.method8546();
		}
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
	@Override
	public void method8462() {
		this.method1533();
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8469(@OriginalArg(0) int arg0) {
		@Pc(16) int[] local16 = super.aClass377_41.method8586(arg0);
		if (super.aClass377_41.aBoolean746) {
			@Pc(22) int local22 = 0;
			@Pc(29) int local29;
			for (local29 = Static564.anIntArray630[arg0] + this.anInt1876; local29 < 0; local29 += 4096) {
			}
			while (local29 > 4096) {
				local29 -= 4096;
			}
			while (this.anInt1879 > local22 && local29 >= this.anIntArray133[local22]) {
				local22++;
			}
			@Pc(64) int local64 = local22 - 1;
			@Pc(75) boolean local75 = (local22 & 0x1) == 0;
			@Pc(80) int local80 = this.anIntArray133[local22];
			@Pc(87) int local87 = this.anIntArray133[local22 - 1];
			if (local29 > this.anInt1875 + local87 && local80 - this.anInt1875 > local29) {
				for (@Pc(113) int local113 = 0; local113 < Static51.anInt1085; local113++) {
					@Pc(117) int local117 = 0;
					@Pc(126) int local126 = local75 ? this.anInt1880 : -this.anInt1880;
					@Pc(137) int local137;
					for (local137 = (local126 * this.anInt1878 >> 12) + Static586.anIntArray653[local113]; local137 < 0; local137 += 4096) {
					}
					while (local137 > 4096) {
						local137 -= 4096;
					}
					while (local117 < this.anInt1874 && this.anIntArrayArray3[local64][local117] <= local137) {
						local117++;
					}
					@Pc(170) int local170 = local117 - 1;
					@Pc(177) int local177 = this.anIntArrayArray3[local64][local117];
					@Pc(184) int local184 = this.anIntArrayArray3[local64][local170];
					if (this.anInt1875 + local184 < local137 && local177 - this.anInt1875 > local137) {
						local16[local113] = this.anIntArrayArray4[local64][local170];
					} else {
						local16[local113] = 0;
					}
				}
			} else {
				Static653.method5393(local16, 0, Static51.anInt1085, 0);
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
	private void method1533() {
		@Pc(12) Random local12 = new Random((long) this.anInt1879);
		this.anInt1875 = this.anInt1884 / 2;
		this.anInt1878 = 4096 / this.anInt1874;
		this.anInt1885 = 4096 / this.anInt1879;
		@Pc(43) int local43 = this.anInt1878 / 2;
		this.anIntArray133 = new int[this.anInt1879 + 1];
		this.anIntArrayArray3 = new int[this.anInt1879][this.anInt1874 + 1];
		this.anIntArrayArray4 = new int[this.anInt1879][this.anInt1874];
		@Pc(71) int local71 = this.anInt1885 / 2;
		this.anIntArray133[0] = 0;
		for (@Pc(78) int local78 = 0; local78 < this.anInt1879; local78++) {
			@Pc(85) int local85;
			@Pc(97) int local97;
			if (local78 > 0) {
				local85 = this.anInt1885;
				local97 = (Static239.method3351(4096, local12) - 2048) * this.anInt1882 >> 12;
				@Pc(105) int local105 = local85 + (local97 * local71 >> 12);
				this.anIntArray133[local78] = this.anIntArray133[local78 - 1] + local105;
			}
			this.anIntArrayArray3[local78][0] = 0;
			for (local85 = 0; local85 < this.anInt1874; local85++) {
				if (local85 > 0) {
					local97 = this.anInt1878;
					@Pc(145) int local145 = (Static239.method3351(4096, local12) - 2048) * this.anInt1887 >> 12;
					local97 += local43 * local145 >> 12;
					this.anIntArrayArray3[local78][local85] = local97 + this.anIntArrayArray3[local78][local85 - 1];
				}
				this.anIntArrayArray4[local78][local85] = this.anInt1890 <= 0 ? 4096 : 4096 - Static239.method3351(this.anInt1890, local12);
			}
			this.anIntArrayArray3[local78][this.anInt1874] = 4096;
		}
		this.anIntArray133[this.anInt1879] = 4096;
	}
}
