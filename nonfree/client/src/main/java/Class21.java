import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class21 {

	@OriginalMember(owner = "client!df", name = "a", descriptor = "I")
	public int anInt882;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public int anInt885;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	private int anInt883 = 2;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
	private int[] anIntArray74 = new int[2];

	@OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
	private int[] anIntArray73 = new int[2];

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class21() {
		this.anIntArray74[0] = 0;
		this.anIntArray74[1] = 65535;
		this.anIntArray73[0] = 0;
		this.anIntArray73[1] = 65535;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method570() {
		this.anInt888 = 0;
		this.anInt887 = 0;
		this.anInt889 = 0;
		this.anInt886 = 0;
		this.anInt890 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method571(@OriginalArg(0) int arg0) {
		if (this.anInt890 >= this.anInt888) {
			this.anInt886 = this.anIntArray73[this.anInt887++] << 15;
			if (this.anInt887 >= this.anInt883) {
				this.anInt887 = this.anInt883 - 1;
			}
			this.anInt888 = (int) ((double) this.anIntArray74[this.anInt887] / 65536.0D * (double) arg0);
			if (this.anInt888 > this.anInt890) {
				this.anInt889 = ((this.anIntArray73[this.anInt887] << 15) - this.anInt886) / (this.anInt888 - this.anInt890);
			}
		}
		this.anInt886 += this.anInt889;
		this.anInt890++;
		return this.anInt886 - this.anInt889 >> 15;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!h;)V")
	public void method572(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt883 = arg0.method1253();
		this.anIntArray74 = new int[this.anInt883];
		this.anIntArray73 = new int[this.anInt883];
		for (@Pc(16) int local16 = 0; local16 < this.anInt883; local16++) {
			this.anIntArray74[local16] = arg0.method1252();
			this.anIntArray73[local16] = arg0.method1252();
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!h;)V")
	public void method573(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt885 = arg0.method1253();
		this.anInt884 = arg0.method1263();
		this.anInt882 = arg0.method1263();
		this.method572(arg0);
	}
}
