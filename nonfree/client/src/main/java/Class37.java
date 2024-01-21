import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class37 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public int anInt2137;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
	public int anInt2138;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public int anInt2140;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	private int anInt2141;

	@OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
	private int anInt2142;

	@OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
	private int anInt2143;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
	private int anInt2144;

	@OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
	private int anInt2145;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
	private int anInt2139 = 2;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
	private int[] anIntArray228 = new int[2];

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[I")
	private int[] anIntArray229 = new int[2];

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
	public Class37() {
		this.anIntArray228[0] = 0;
		this.anIntArray228[1] = 65535;
		this.anIntArray229[0] = 0;
		this.anIntArray229[1] = 65535;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)I")
	public int method1569(@OriginalArg(0) int arg0) {
		if (this.anInt2143 >= this.anInt2141) {
			this.anInt2145 = this.anIntArray229[this.anInt2142++] << 15;
			if (this.anInt2142 >= this.anInt2139) {
				this.anInt2142 = this.anInt2139 - 1;
			}
			this.anInt2141 = (int) ((double) this.anIntArray228[this.anInt2142] / 65536.0D * (double) arg0);
			if (this.anInt2141 > this.anInt2143) {
				this.anInt2144 = ((this.anIntArray229[this.anInt2142] << 15) - this.anInt2145) / (this.anInt2141 - this.anInt2143);
			}
		}
		this.anInt2145 += this.anInt2144;
		this.anInt2143++;
		return this.anInt2145 - this.anInt2144 >> 15;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!ce;)V")
	public void method1570(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt2138 = arg0.method1607();
		this.anInt2140 = arg0.method1626();
		this.anInt2137 = arg0.method1626();
		this.method1572(arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "()V")
	public void method1571() {
		this.anInt2141 = 0;
		this.anInt2142 = 0;
		this.anInt2144 = 0;
		this.anInt2145 = 0;
		this.anInt2143 = 0;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(Lclient!ce;)V")
	public void method1572(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt2139 = arg0.method1607();
		this.anIntArray228 = new int[this.anInt2139];
		this.anIntArray229 = new int[this.anInt2139];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2139; local16++) {
			this.anIntArray228[local16] = arg0.method1642();
			this.anIntArray229[local16] = arg0.method1642();
		}
	}
}
