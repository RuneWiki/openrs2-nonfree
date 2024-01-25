import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public final class Class251 {

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	public int anInt7061;

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "I")
	public int anInt7063;

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "I")
	public int anInt7064;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "I")
	private int anInt7065;

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "I")
	private int anInt7066;

	@OriginalMember(owner = "client!nj", name = "i", descriptor = "I")
	private int anInt7067;

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "I")
	private int anInt7068;

	@OriginalMember(owner = "client!nj", name = "k", descriptor = "I")
	private int anInt7069;

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
	private int anInt7062 = 2;

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "[I")
	private int[] anIntArray401 = new int[2];

	@OriginalMember(owner = "client!nj", name = "f", descriptor = "[I")
	private int[] anIntArray402 = new int[2];

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V")
	public Class251() {
		this.anIntArray401[0] = 0;
		this.anIntArray401[1] = 65535;
		this.anIntArray402[0] = 0;
		this.anIntArray402[1] = 65535;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)I")
	public int method5860(@OriginalArg(0) int arg0) {
		if (this.anInt7067 >= this.anInt7065) {
			this.anInt7069 = this.anIntArray402[this.anInt7068++] << 15;
			if (this.anInt7068 >= this.anInt7062) {
				this.anInt7068 = this.anInt7062 - 1;
			}
			this.anInt7065 = (int) ((double) this.anIntArray401[this.anInt7068] / 65536.0D * (double) arg0);
			if (this.anInt7065 > this.anInt7067) {
				this.anInt7066 = ((this.anIntArray402[this.anInt7068] << 15) - this.anInt7069) / (this.anInt7065 - this.anInt7067);
			}
		}
		this.anInt7069 += this.anInt7066;
		this.anInt7067++;
		return this.anInt7069 - this.anInt7066 >> 15;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lclient!mc;)V")
	public void method5861(@OriginalArg(0) Class5_Sub41 arg0) {
		this.anInt7062 = arg0.method7816();
		this.anIntArray401 = new int[this.anInt7062];
		this.anIntArray402 = new int[this.anInt7062];
		for (@Pc(16) int local16 = 0; local16 < this.anInt7062; local16++) {
			this.anIntArray401[local16] = arg0.method7860();
			this.anIntArray402[local16] = arg0.method7860();
		}
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "()V")
	public void method5862() {
		this.anInt7065 = 0;
		this.anInt7068 = 0;
		this.anInt7066 = 0;
		this.anInt7069 = 0;
		this.anInt7067 = 0;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(Lclient!mc;)V")
	public void method5863(@OriginalArg(0) Class5_Sub41 arg0) {
		this.anInt7064 = arg0.method7816();
		this.anInt7063 = arg0.method7804();
		this.anInt7061 = arg0.method7804();
		this.method5861(arg0);
	}
}
