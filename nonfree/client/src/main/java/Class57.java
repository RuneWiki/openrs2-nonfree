import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public final class Class57 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "I")
	public int anInt2112;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
	public int anInt2113;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public int anInt2115;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
	private int anInt2116;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	private int anInt2117;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	private int anInt2118;

	@OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
	private int anInt2119;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	private int anInt2120;

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
	private int anInt2114 = 2;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[I")
	private int[] anIntArray136 = new int[2];

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "[I")
	private int[] anIntArray135 = new int[2];

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
	public Class57() {
		this.anIntArray136[0] = 0;
		this.anIntArray136[1] = 65535;
		this.anIntArray135[0] = 0;
		this.anIntArray135[1] = 65535;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lclient!k;)V")
	public void method1607(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt2112 = arg0.method3793();
		this.anInt2115 = arg0.method3784();
		this.anInt2113 = arg0.method3784();
		this.method1609(arg0);
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
	public void method1608() {
		this.anInt2118 = 0;
		this.anInt2116 = 0;
		this.anInt2117 = 0;
		this.anInt2120 = 0;
		this.anInt2119 = 0;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(Lclient!k;)V")
	public void method1609(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt2114 = arg0.method3793();
		this.anIntArray136 = new int[this.anInt2114];
		this.anIntArray135 = new int[this.anInt2114];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2114; local16++) {
			this.anIntArray136[local16] = arg0.method3805();
			this.anIntArray135[local16] = arg0.method3805();
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)I")
	public int method1610(@OriginalArg(0) int arg0) {
		if (this.anInt2119 >= this.anInt2118) {
			this.anInt2120 = this.anIntArray135[this.anInt2116++] << 15;
			if (this.anInt2116 >= this.anInt2114) {
				this.anInt2116 = this.anInt2114 - 1;
			}
			this.anInt2118 = (int) ((double) this.anIntArray136[this.anInt2116] / 65536.0D * (double) arg0);
			if (this.anInt2118 > this.anInt2119) {
				this.anInt2117 = ((this.anIntArray135[this.anInt2116] << 15) - this.anInt2120) / (this.anInt2118 - this.anInt2119);
			}
		}
		this.anInt2120 += this.anInt2117;
		this.anInt2119++;
		return this.anInt2120 - this.anInt2117 >> 15;
	}
}
