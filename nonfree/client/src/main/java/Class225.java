import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class225 {

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "I")
	public int anInt7142;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	public int anInt7143;

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "I")
	public int anInt7144;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	private int anInt7145;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	private int anInt7146;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	private int anInt7147;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	private int anInt7148;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	private int anInt7149;

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	private int anInt7141 = 2;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "[I")
	private int[] anIntArray339 = new int[2];

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "[I")
	private int[] anIntArray338 = new int[2];

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class225() {
		this.anIntArray339[0] = 0;
		this.anIntArray339[1] = 65535;
		this.anIntArray338[0] = 0;
		this.anIntArray338[1] = 65535;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public void method5978() {
		this.anInt7147 = 0;
		this.anInt7145 = 0;
		this.anInt7148 = 0;
		this.anInt7146 = 0;
		this.anInt7149 = 0;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method5979(@OriginalArg(0) int arg0) {
		if (this.anInt7149 >= this.anInt7147) {
			this.anInt7146 = this.anIntArray338[this.anInt7145++] << 15;
			if (this.anInt7145 >= this.anInt7141) {
				this.anInt7145 = this.anInt7141 - 1;
			}
			this.anInt7147 = (int) ((double) this.anIntArray339[this.anInt7145] / 65536.0D * (double) arg0);
			if (this.anInt7147 > this.anInt7149) {
				this.anInt7148 = ((this.anIntArray338[this.anInt7145] << 15) - this.anInt7146) / (this.anInt7147 - this.anInt7149);
			}
		}
		this.anInt7146 += this.anInt7148;
		this.anInt7149++;
		return this.anInt7146 - this.anInt7148 >> 15;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!ji;)V")
	public void method5980(@OriginalArg(0) Class6_Sub8 arg0) {
		this.anInt7143 = arg0.method8246();
		this.anInt7144 = arg0.method8236();
		this.anInt7142 = arg0.method8236();
		this.method5981(arg0);
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lclient!ji;)V")
	public void method5981(@OriginalArg(0) Class6_Sub8 arg0) {
		this.anInt7141 = arg0.method8246();
		this.anIntArray339 = new int[this.anInt7141];
		this.anIntArray338 = new int[this.anInt7141];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7141; local16++) {
			this.anIntArray339[local16] = arg0.method8220();
			this.anIntArray338[local16] = arg0.method8220();
		}
	}
}
