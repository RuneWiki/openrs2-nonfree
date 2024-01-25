import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class362 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "I")
	public int anInt10025;

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "I")
	public int anInt10027;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	public int anInt10028;

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "I")
	private int anInt10029;

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	private int anInt10030;

	@OriginalMember(owner = "client!vca", name = "i", descriptor = "I")
	private int anInt10031;

	@OriginalMember(owner = "client!vca", name = "j", descriptor = "I")
	private int anInt10032;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private int anInt10033;

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "I")
	private int anInt10026 = 2;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "[I")
	private int[] anIntArray868 = new int[2];

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "[I")
	private int[] anIntArray869 = new int[2];

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "()V")
	public Class362() {
		this.anIntArray868[0] = 0;
		this.anIntArray868[1] = 65535;
		this.anIntArray869[0] = 0;
		this.anIntArray869[1] = 65535;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!jp;)V")
	public void method8781(@OriginalArg(0) Class3_Sub25 arg0) {
		this.anInt10026 = arg0.method8632();
		this.anIntArray868 = new int[this.anInt10026];
		this.anIntArray869 = new int[this.anInt10026];
		for (@Pc(16) int local16 = 0; local16 < this.anInt10026; local16++) {
			this.anIntArray868[local16] = arg0.method8593();
			this.anIntArray869[local16] = arg0.method8593();
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(Lclient!jp;)V")
	public void method8782(@OriginalArg(0) Class3_Sub25 arg0) {
		this.anInt10025 = arg0.method8632();
		this.anInt10028 = arg0.method8618();
		this.anInt10027 = arg0.method8618();
		this.method8781(arg0);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)I")
	public int method8783(@OriginalArg(0) int arg0) {
		if (this.anInt10029 >= this.anInt10030) {
			this.anInt10033 = this.anIntArray869[this.anInt10032++] << 15;
			if (this.anInt10032 >= this.anInt10026) {
				this.anInt10032 = this.anInt10026 - 1;
			}
			this.anInt10030 = (int) ((double) this.anIntArray868[this.anInt10032] / 65536.0D * (double) arg0);
			if (this.anInt10030 > this.anInt10029) {
				this.anInt10031 = ((this.anIntArray869[this.anInt10032] << 15) - this.anInt10033) / (this.anInt10030 - this.anInt10029);
			}
		}
		this.anInt10033 += this.anInt10031;
		this.anInt10029++;
		return this.anInt10033 - this.anInt10031 >> 15;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "()V")
	public void method8784() {
		this.anInt10030 = 0;
		this.anInt10032 = 0;
		this.anInt10031 = 0;
		this.anInt10033 = 0;
		this.anInt10029 = 0;
	}
}
