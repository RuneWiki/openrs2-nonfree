import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class58 {

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
	public int anInt2046;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public int anInt2049;

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
	private int anInt2050;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
	private int anInt2051;

	@OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
	private int anInt2052;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
	private int anInt2053;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	private int anInt2054;

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
	private int anInt2048 = 2;

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "[I")
	private int[] anIntArray194 = new int[2];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "[I")
	private int[] anIntArray193 = new int[2];

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
	public Class58() {
		this.anIntArray194[0] = 0;
		this.anIntArray194[1] = 65535;
		this.anIntArray193[0] = 0;
		this.anIntArray193[1] = 65535;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)I")
	public int method1580(@OriginalArg(0) int arg0) {
		if (this.anInt2051 >= this.anInt2052) {
			this.anInt2050 = this.anIntArray193[this.anInt2054++] << 15;
			if (this.anInt2054 >= this.anInt2048) {
				this.anInt2054 = this.anInt2048 - 1;
			}
			this.anInt2052 = (int) ((double) this.anIntArray194[this.anInt2054] / 65536.0D * (double) arg0);
			if (this.anInt2052 > this.anInt2051) {
				this.anInt2053 = ((this.anIntArray193[this.anInt2054] << 15) - this.anInt2050) / (this.anInt2052 - this.anInt2051);
			}
		}
		this.anInt2050 += this.anInt2053;
		this.anInt2051++;
		return this.anInt2050 - this.anInt2053 >> 15;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!pg;)V")
	public void method1581(@OriginalArg(0) Class1_Sub17 arg0) {
		this.anInt2049 = arg0.method2142();
		this.anInt2046 = arg0.method2140();
		this.anInt2047 = arg0.method2140();
		this.method1582(arg0);
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(Lclient!pg;)V")
	public void method1582(@OriginalArg(0) Class1_Sub17 arg0) {
		this.anInt2048 = arg0.method2142();
		this.anIntArray194 = new int[this.anInt2048];
		this.anIntArray193 = new int[this.anInt2048];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2048; local16++) {
			this.anIntArray194[local16] = arg0.method2178();
			this.anIntArray193[local16] = arg0.method2178();
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	public void method1583() {
		this.anInt2052 = 0;
		this.anInt2054 = 0;
		this.anInt2053 = 0;
		this.anInt2050 = 0;
		this.anInt2051 = 0;
	}
}
