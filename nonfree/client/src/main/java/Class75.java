import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class75 {

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
	public int anInt2100;

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
	public int anInt2103;

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
	private int anInt2104;

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
	private int anInt2105;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	private int anInt2106;

	@OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
	private int anInt2107;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
	private int anInt2108;

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
	private int anInt2101 = 2;

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
	private int[] anIntArray168 = new int[2];

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "[I")
	private int[] anIntArray167 = new int[2];

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
	public Class75() {
		this.anIntArray168[0] = 0;
		this.anIntArray168[1] = 65535;
		this.anIntArray167[0] = 0;
		this.anIntArray167[1] = 65535;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ef;)V")
	public void method2014(@OriginalArg(0) Class2_Sub12 arg0) {
		this.anInt2100 = arg0.method3124();
		this.anInt2103 = arg0.method3135();
		this.anInt2102 = arg0.method3135();
		this.method2015(arg0);
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Lclient!ef;)V")
	public void method2015(@OriginalArg(0) Class2_Sub12 arg0) {
		this.anInt2101 = arg0.method3124();
		this.anIntArray168 = new int[this.anInt2101];
		this.anIntArray167 = new int[this.anInt2101];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2101; local16++) {
			this.anIntArray168[local16] = arg0.method3104();
			this.anIntArray167[local16] = arg0.method3104();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	public void method2016() {
		this.anInt2107 = 0;
		this.anInt2106 = 0;
		this.anInt2105 = 0;
		this.anInt2104 = 0;
		this.anInt2108 = 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)I")
	public int method2017(@OriginalArg(0) int arg0) {
		if (this.anInt2108 >= this.anInt2107) {
			this.anInt2104 = this.anIntArray167[this.anInt2106++] << 15;
			if (this.anInt2106 >= this.anInt2101) {
				this.anInt2106 = this.anInt2101 - 1;
			}
			this.anInt2107 = (int) ((double) this.anIntArray168[this.anInt2106] / 65536.0D * (double) arg0);
			if (this.anInt2107 > this.anInt2108) {
				this.anInt2105 = ((this.anIntArray167[this.anInt2106] << 15) - this.anInt2104) / (this.anInt2107 - this.anInt2108);
			}
		}
		this.anInt2104 += this.anInt2105;
		this.anInt2108++;
		return this.anInt2104 - this.anInt2105 >> 15;
	}
}
