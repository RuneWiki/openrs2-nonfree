import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class53 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	public int anInt2066;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "I")
	public int anInt2067;

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	public int anInt2068;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
	private int anInt2070;

	@OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
	private int anInt2071;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt2072;

	@OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
	private int anInt2073;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	private int anInt2074;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
	private int anInt2069 = 2;

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "[I")
	private int[] anIntArray181 = new int[2];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	private int[] anIntArray180 = new int[2];

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V")
	public Class53() {
		this.anIntArray181[0] = 0;
		this.anIntArray181[1] = 65535;
		this.anIntArray180[0] = 0;
		this.anIntArray180[1] = 65535;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!b;)V")
	public void method1369(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2069 = arg0.method270();
		this.anIntArray181 = new int[this.anInt2069];
		this.anIntArray180 = new int[this.anInt2069];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2069; local16++) {
			this.anIntArray181[local16] = arg0.method276();
			this.anIntArray180[local16] = arg0.method276();
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Lclient!b;)V")
	public void method1370(@OriginalArg(0) Class3_Sub2 arg0) {
		this.anInt2068 = arg0.method270();
		this.anInt2067 = arg0.method278();
		this.anInt2066 = arg0.method278();
		this.method1369(arg0);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)I")
	public int method1371(@OriginalArg(0) int arg0) {
		if (this.anInt2074 >= this.anInt2070) {
			this.anInt2072 = this.anIntArray180[this.anInt2073++] << 15;
			if (this.anInt2073 >= this.anInt2069) {
				this.anInt2073 = this.anInt2069 - 1;
			}
			this.anInt2070 = (int) ((double) this.anIntArray181[this.anInt2073] / 65536.0D * (double) arg0);
			if (this.anInt2070 > this.anInt2074) {
				this.anInt2071 = ((this.anIntArray180[this.anInt2073] << 15) - this.anInt2072) / (this.anInt2070 - this.anInt2074);
			}
		}
		this.anInt2072 += this.anInt2071;
		this.anInt2074++;
		return this.anInt2072 - this.anInt2071 >> 15;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	public void method1372() {
		this.anInt2070 = 0;
		this.anInt2073 = 0;
		this.anInt2071 = 0;
		this.anInt2072 = 0;
		this.anInt2074 = 0;
	}
}
