import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class70 {

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
	public int anInt2114;

	@OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
	public int anInt2116;

	@OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
	private int anInt2117;

	@OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
	private int anInt2118;

	@OriginalMember(owner = "client!gh", name = "i", descriptor = "I")
	private int anInt2119;

	@OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
	private int anInt2121;

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
	private int anInt2113 = 2;

	@OriginalMember(owner = "client!gh", name = "e", descriptor = "[I")
	private int[] anIntArray255 = new int[2];

	@OriginalMember(owner = "client!gh", name = "f", descriptor = "[I")
	private int[] anIntArray256 = new int[2];

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class70() {
		this.anIntArray255[0] = 0;
		this.anIntArray255[1] = 65535;
		this.anIntArray256[0] = 0;
		this.anIntArray256[1] = 65535;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "()V")
	public void method1926() {
		this.anInt2117 = 0;
		this.anInt2120 = 0;
		this.anInt2119 = 0;
		this.anInt2118 = 0;
		this.anInt2121 = 0;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(Lclient!eb;)V")
	public void method1927(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt2115 = arg0.method3141();
		this.anInt2114 = arg0.method3125();
		this.anInt2116 = arg0.method3125();
		this.method1928(arg0);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(Lclient!eb;)V")
	public void method1928(@OriginalArg(0) Class1_Sub7 arg0) {
		this.anInt2113 = arg0.method3141();
		this.anIntArray255 = new int[this.anInt2113];
		this.anIntArray256 = new int[this.anInt2113];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2113; local16++) {
			this.anIntArray255[local16] = arg0.method3115();
			this.anIntArray256[local16] = arg0.method3115();
		}
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)I")
	public int method1929(@OriginalArg(0) int arg0) {
		if (this.anInt2121 >= this.anInt2117) {
			this.anInt2118 = this.anIntArray256[this.anInt2120++] << 15;
			if (this.anInt2120 >= this.anInt2113) {
				this.anInt2120 = this.anInt2113 - 1;
			}
			this.anInt2117 = (int) ((double) this.anIntArray255[this.anInt2120] / 65536.0D * (double) arg0);
			if (this.anInt2117 > this.anInt2121) {
				this.anInt2119 = ((this.anIntArray256[this.anInt2120] << 15) - this.anInt2118) / (this.anInt2117 - this.anInt2121);
			}
		}
		this.anInt2118 += this.anInt2119;
		this.anInt2121++;
		return this.anInt2118 - this.anInt2119 >> 15;
	}
}
