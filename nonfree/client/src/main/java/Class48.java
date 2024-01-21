import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class48 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	public int anInt1894;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
	public int anInt1895;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	public int anInt1897;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private int anInt1899;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt1900;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt1901;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt1902;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt1896 = 2;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
	private int[] anIntArray261 = new int[2];

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "[I")
	private int[] anIntArray262 = new int[2];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
	public Class48() {
		this.anIntArray261[0] = 0;
		this.anIntArray261[1] = 65535;
		this.anIntArray262[0] = 0;
		this.anIntArray262[1] = 65535;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I")
	public int method1296(@OriginalArg(0) int arg0) {
		if (this.anInt1898 >= this.anInt1899) {
			this.anInt1901 = this.anIntArray262[this.anInt1902++] << 15;
			if (this.anInt1902 >= this.anInt1896) {
				this.anInt1902 = this.anInt1896 - 1;
			}
			this.anInt1899 = (int) ((double) this.anIntArray261[this.anInt1902] / 65536.0D * (double) arg0);
			if (this.anInt1899 > this.anInt1898) {
				this.anInt1900 = ((this.anIntArray262[this.anInt1902] << 15) - this.anInt1901) / (this.anInt1899 - this.anInt1898);
			}
		}
		this.anInt1901 += this.anInt1900;
		this.anInt1898++;
		return this.anInt1901 - this.anInt1900 >> 15;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!qc;)V")
	public void method1297(@OriginalArg(0) Class1_Sub18 arg0) {
		this.anInt1896 = arg0.method2169();
		this.anIntArray261 = new int[this.anInt1896];
		this.anIntArray262 = new int[this.anInt1896];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1896; local16++) {
			this.anIntArray261[local16] = arg0.method2156();
			this.anIntArray262[local16] = arg0.method2156();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!qc;)V")
	public void method1298(@OriginalArg(0) Class1_Sub18 arg0) {
		this.anInt1895 = arg0.method2169();
		this.anInt1894 = arg0.method2185();
		this.anInt1897 = arg0.method2185();
		this.method1297(arg0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "()V")
	public void method1299() {
		this.anInt1899 = 0;
		this.anInt1902 = 0;
		this.anInt1900 = 0;
		this.anInt1901 = 0;
		this.anInt1898 = 0;
	}
}
