import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class45 {

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
	public int anInt1882;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "I")
	public int anInt1884;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "I")
	public int anInt1885;

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	private int anInt1886;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	private int anInt1887;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	private int anInt1888;

	@OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
	private int anInt1889;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	private int anInt1890;

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "I")
	private int anInt1883 = 2;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	private int[] anIntArray184 = new int[2];

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "[I")
	private int[] anIntArray185 = new int[2];

	@OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
	public Class45() {
		this.anIntArray184[0] = 0;
		this.anIntArray184[1] = 65535;
		this.anIntArray185[0] = 0;
		this.anIntArray185[1] = 65535;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ce;)V")
	public void method1460(@OriginalArg(0) Class5_Sub6 arg0) {
		this.anInt1883 = arg0.method3062();
		this.anIntArray184 = new int[this.anInt1883];
		this.anIntArray185 = new int[this.anInt1883];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1883; local16++) {
			this.anIntArray184[local16] = arg0.method3077();
			this.anIntArray185[local16] = arg0.method3077();
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "()V")
	public void method1461() {
		this.anInt1886 = 0;
		this.anInt1890 = 0;
		this.anInt1889 = 0;
		this.anInt1887 = 0;
		this.anInt1888 = 0;
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(Lclient!ce;)V")
	public void method1462(@OriginalArg(0) Class5_Sub6 arg0) {
		this.anInt1885 = arg0.method3062();
		this.anInt1884 = arg0.method3073();
		this.anInt1882 = arg0.method3073();
		this.method1460(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)I")
	public int method1463(@OriginalArg(0) int arg0) {
		if (this.anInt1888 >= this.anInt1886) {
			this.anInt1887 = this.anIntArray185[this.anInt1890++] << 15;
			if (this.anInt1890 >= this.anInt1883) {
				this.anInt1890 = this.anInt1883 - 1;
			}
			this.anInt1886 = (int) ((double) this.anIntArray184[this.anInt1890] / 65536.0D * (double) arg0);
			if (this.anInt1886 > this.anInt1888) {
				this.anInt1889 = ((this.anIntArray185[this.anInt1890] << 15) - this.anInt1887) / (this.anInt1886 - this.anInt1888);
			}
		}
		this.anInt1887 += this.anInt1889;
		this.anInt1888++;
		return this.anInt1887 - this.anInt1889 >> 15;
	}
}
