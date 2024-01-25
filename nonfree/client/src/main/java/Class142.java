import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class142 {

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
	public int anInt4109;

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
	public int anInt4112;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
	private int anInt4113;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
	private int anInt4114;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
	private int anInt4115;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	private int anInt4116;

	@OriginalMember(owner = "client!ir", name = "k", descriptor = "I")
	private int anInt4117;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	private int anInt4110 = 2;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "[I")
	private int[] anIntArray328 = new int[2];

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "[I")
	private int[] anIntArray329 = new int[2];

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "()V")
	public Class142() {
		this.anIntArray328[0] = 0;
		this.anIntArray328[1] = 65535;
		this.anIntArray329[0] = 0;
		this.anIntArray329[1] = 65535;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!os;)V")
	public void method3851(@OriginalArg(0) Class1_Sub17 arg0) {
		this.anInt4112 = arg0.method4487();
		this.anInt4109 = arg0.method4481();
		this.anInt4111 = arg0.method4481();
		this.method3854(arg0);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
	public void method3852() {
		this.anInt4116 = 0;
		this.anInt4114 = 0;
		this.anInt4113 = 0;
		this.anInt4115 = 0;
		this.anInt4117 = 0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	public int method3853(@OriginalArg(0) int arg0) {
		if (this.anInt4117 >= this.anInt4116) {
			this.anInt4115 = this.anIntArray329[this.anInt4114++] << 15;
			if (this.anInt4114 >= this.anInt4110) {
				this.anInt4114 = this.anInt4110 - 1;
			}
			this.anInt4116 = (int) ((double) this.anIntArray328[this.anInt4114] / 65536.0D * (double) arg0);
			if (this.anInt4116 > this.anInt4117) {
				this.anInt4113 = ((this.anIntArray329[this.anInt4114] << 15) - this.anInt4115) / (this.anInt4116 - this.anInt4117);
			}
		}
		this.anInt4115 += this.anInt4113;
		this.anInt4117++;
		return this.anInt4115 - this.anInt4113 >> 15;
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(Lclient!os;)V")
	public void method3854(@OriginalArg(0) Class1_Sub17 arg0) {
		this.anInt4110 = arg0.method4487();
		this.anIntArray328 = new int[this.anInt4110];
		this.anIntArray329 = new int[this.anInt4110];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4110; local16++) {
			this.anIntArray328[local16] = arg0.method4494();
			this.anIntArray329[local16] = arg0.method4494();
		}
	}
}
