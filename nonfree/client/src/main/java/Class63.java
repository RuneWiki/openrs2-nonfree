import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class63 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public int anInt1875;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	public int anInt1876;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	public int anInt1878;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
	private int anInt1879;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
	private int anInt1880;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
	private int anInt1881;

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	private int anInt1882;

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
	private int anInt1883;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt1877 = 2;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "[I")
	private int[] anIntArray255 = new int[2];

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "[I")
	private int[] anIntArray254 = new int[2];

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class63() {
		this.anIntArray255[0] = 0;
		this.anIntArray255[1] = 65535;
		this.anIntArray254[0] = 0;
		this.anIntArray254[1] = 65535;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!be;)V")
	public void method1437(@OriginalArg(0) Class2_Sub4 arg0) {
		this.anInt1876 = arg0.method933();
		this.anInt1875 = arg0.method903();
		this.anInt1878 = arg0.method903();
		this.method1440(arg0);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)I")
	public int method1438(@OriginalArg(0) int arg0) {
		if (this.anInt1879 >= this.anInt1881) {
			this.anInt1883 = this.anIntArray254[this.anInt1882++] << 15;
			if (this.anInt1882 >= this.anInt1877) {
				this.anInt1882 = this.anInt1877 - 1;
			}
			this.anInt1881 = (int) ((double) this.anIntArray255[this.anInt1882] / 65536.0D * (double) arg0);
			if (this.anInt1881 > this.anInt1879) {
				this.anInt1880 = ((this.anIntArray254[this.anInt1882] << 15) - this.anInt1883) / (this.anInt1881 - this.anInt1879);
			}
		}
		this.anInt1883 += this.anInt1880;
		this.anInt1879++;
		return this.anInt1883 - this.anInt1880 >> 15;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()V")
	public void method1439() {
		this.anInt1881 = 0;
		this.anInt1882 = 0;
		this.anInt1880 = 0;
		this.anInt1883 = 0;
		this.anInt1879 = 0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Lclient!be;)V")
	public void method1440(@OriginalArg(0) Class2_Sub4 arg0) {
		this.anInt1877 = arg0.method933();
		this.anIntArray255 = new int[this.anInt1877];
		this.anIntArray254 = new int[this.anInt1877];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1877; local16++) {
			this.anIntArray255[local16] = arg0.method896();
			this.anIntArray254[local16] = arg0.method896();
		}
	}
}
