import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class68 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
	public int anInt1861;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
	public int anInt1862;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	public int anInt1863;

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
	private int anInt1866;

	@OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
	private int anInt1867;

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
	private int anInt1868;

	@OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
	private int anInt1869;

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
	private int anInt1864 = 2;

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
	private int[] anIntArray249 = new int[2];

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "[I")
	private int[] anIntArray248 = new int[2];

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class68() {
		this.anIntArray249[0] = 0;
		this.anIntArray249[1] = 65535;
		this.anIntArray248[0] = 0;
		this.anIntArray248[1] = 65535;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!jj;)V")
	public void method1598(@OriginalArg(0) Class1_Sub18 arg0) {
		this.anInt1864 = arg0.method3122();
		this.anIntArray249 = new int[this.anInt1864];
		this.anIntArray248 = new int[this.anInt1864];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1864; local16++) {
			this.anIntArray249[local16] = arg0.method3107();
			this.anIntArray248[local16] = arg0.method3107();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	public int method1599(@OriginalArg(0) int arg0) {
		if (this.anInt1865 >= this.anInt1869) {
			this.anInt1868 = this.anIntArray248[this.anInt1867++] << 15;
			if (this.anInt1867 >= this.anInt1864) {
				this.anInt1867 = this.anInt1864 - 1;
			}
			this.anInt1869 = (int) ((double) this.anIntArray249[this.anInt1867] / 65536.0D * (double) arg0);
			if (this.anInt1869 > this.anInt1865) {
				this.anInt1866 = ((this.anIntArray248[this.anInt1867] << 15) - this.anInt1868) / (this.anInt1869 - this.anInt1865);
			}
		}
		this.anInt1868 += this.anInt1866;
		this.anInt1865++;
		return this.anInt1868 - this.anInt1866 >> 15;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	public void method1600() {
		this.anInt1869 = 0;
		this.anInt1867 = 0;
		this.anInt1866 = 0;
		this.anInt1868 = 0;
		this.anInt1865 = 0;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!jj;)V")
	public void method1601(@OriginalArg(0) Class1_Sub18 arg0) {
		this.anInt1862 = arg0.method3122();
		this.anInt1863 = arg0.method3074();
		this.anInt1861 = arg0.method3074();
		this.method1598(arg0);
	}
}
