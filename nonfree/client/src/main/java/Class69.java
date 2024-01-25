import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fs")
public final class Class69 {

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
	public int anInt2078;

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "I")
	public int anInt2079;

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
	public int anInt2080;

	@OriginalMember(owner = "client!fs", name = "g", descriptor = "I")
	private int anInt2082;

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "I")
	private int anInt2083;

	@OriginalMember(owner = "client!fs", name = "i", descriptor = "I")
	private int anInt2084;

	@OriginalMember(owner = "client!fs", name = "j", descriptor = "I")
	private int anInt2085;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "I")
	private int anInt2086;

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	private int anInt2081 = 2;

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "[I")
	private int[] anIntArray123 = new int[2];

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "[I")
	private int[] anIntArray122 = new int[2];

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "()V")
	public Class69() {
		this.anIntArray123[0] = 0;
		this.anIntArray123[1] = 65535;
		this.anIntArray122[0] = 0;
		this.anIntArray122[1] = 65535;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)I")
	public int method1681(@OriginalArg(0) int arg0) {
		if (this.anInt2084 >= this.anInt2083) {
			this.anInt2086 = this.anIntArray122[this.anInt2082++] << 15;
			if (this.anInt2082 >= this.anInt2081) {
				this.anInt2082 = this.anInt2081 - 1;
			}
			this.anInt2083 = (int) ((double) this.anIntArray123[this.anInt2082] / 65536.0D * (double) arg0);
			if (this.anInt2083 > this.anInt2084) {
				this.anInt2085 = ((this.anIntArray122[this.anInt2082] << 15) - this.anInt2086) / (this.anInt2083 - this.anInt2084);
			}
		}
		this.anInt2086 += this.anInt2085;
		this.anInt2084++;
		return this.anInt2086 - this.anInt2085 >> 15;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!fb;)V")
	public void method1682(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt2079 = arg0.method3643();
		this.anInt2080 = arg0.method3642();
		this.anInt2078 = arg0.method3642();
		this.method1684(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "()V")
	public void method1683() {
		this.anInt2083 = 0;
		this.anInt2082 = 0;
		this.anInt2085 = 0;
		this.anInt2086 = 0;
		this.anInt2084 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(Lclient!fb;)V")
	public void method1684(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt2081 = arg0.method3643();
		this.anIntArray123 = new int[this.anInt2081];
		this.anIntArray122 = new int[this.anInt2081];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2081; local16++) {
			this.anIntArray123[local16] = arg0.method3649();
			this.anIntArray122[local16] = arg0.method3649();
		}
	}
}
