import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aba")
public final class Class5 {

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "I")
	public int anInt27;

	@OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	private int anInt30;

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
	private int anInt31;

	@OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
	private int anInt32;

	@OriginalMember(owner = "client!aba", name = "j", descriptor = "I")
	private int anInt33;

	@OriginalMember(owner = "client!aba", name = "k", descriptor = "I")
	private int anInt34;

	@OriginalMember(owner = "client!aba", name = "e", descriptor = "I")
	private int anInt28 = 2;

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "[I")
	private int[] anIntArray4 = new int[2];

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "[I")
	private int[] anIntArray3 = new int[2];

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "()V")
	public Class5() {
		this.anIntArray4[0] = 0;
		this.anIntArray4[1] = 65535;
		this.anIntArray3[0] = 0;
		this.anIntArray3[1] = 65535;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)I")
	public int method29(@OriginalArg(0) int arg0) {
		if (this.anInt31 >= this.anInt30) {
			this.anInt33 = this.anIntArray3[this.anInt32++] << 15;
			if (this.anInt32 >= this.anInt28) {
				this.anInt32 = this.anInt28 - 1;
			}
			this.anInt30 = (int) ((double) this.anIntArray4[this.anInt32] / 65536.0D * (double) arg0);
			if (this.anInt30 > this.anInt31) {
				this.anInt34 = ((this.anIntArray3[this.anInt32] << 15) - this.anInt33) / (this.anInt30 - this.anInt31);
			}
		}
		this.anInt33 += this.anInt34;
		this.anInt31++;
		return this.anInt33 - this.anInt34 >> 15;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "()V")
	public void method30() {
		this.anInt30 = 0;
		this.anInt32 = 0;
		this.anInt34 = 0;
		this.anInt33 = 0;
		this.anInt31 = 0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(Lclient!es;)V")
	public void method31(@OriginalArg(0) Class2_Sub15 arg0) {
		this.anInt28 = arg0.method4325();
		this.anIntArray4 = new int[this.anInt28];
		this.anIntArray3 = new int[this.anInt28];
		for (@Pc(16) int local16 = 0; local16 < this.anInt28; local16++) {
			this.anIntArray4[local16] = arg0.method4294();
			this.anIntArray3[local16] = arg0.method4294();
		}
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(Lclient!es;)V")
	public void method32(@OriginalArg(0) Class2_Sub15 arg0) {
		this.anInt29 = arg0.method4325();
		this.anInt27 = arg0.method4307();
		this.anInt26 = arg0.method4307();
		this.method31(arg0);
	}
}
