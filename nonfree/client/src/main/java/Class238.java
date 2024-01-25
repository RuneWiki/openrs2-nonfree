import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class238 {

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "I")
	public int anInt6610;

	@OriginalMember(owner = "client!mv", name = "e", descriptor = "I")
	public int anInt6612;

	@OriginalMember(owner = "client!mv", name = "f", descriptor = "I")
	public int anInt6613;

	@OriginalMember(owner = "client!mv", name = "g", descriptor = "I")
	private int anInt6614;

	@OriginalMember(owner = "client!mv", name = "h", descriptor = "I")
	private int anInt6615;

	@OriginalMember(owner = "client!mv", name = "i", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!mv", name = "j", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!mv", name = "k", descriptor = "I")
	private int anInt6618;

	@OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
	private int anInt6611 = 2;

	@OriginalMember(owner = "client!mv", name = "c", descriptor = "[I")
	private int[] anIntArray373 = new int[2];

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "[I")
	private int[] anIntArray372 = new int[2];

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class238() {
		this.anIntArray373[0] = 0;
		this.anIntArray373[1] = 65535;
		this.anIntArray372[0] = 0;
		this.anIntArray372[1] = 65535;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!rv;)V")
	public void method5574(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt6610 = arg0.method3642();
		this.anInt6613 = arg0.method3671();
		this.anInt6612 = arg0.method3671();
		this.method5575(arg0);
	}

	@OriginalMember(owner = "client!mv", name = "b", descriptor = "(Lclient!rv;)V")
	public void method5575(@OriginalArg(0) Class5_Sub15 arg0) {
		this.anInt6611 = arg0.method3642();
		this.anIntArray373 = new int[this.anInt6611];
		this.anIntArray372 = new int[this.anInt6611];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6611; local16++) {
			this.anIntArray373[local16] = arg0.method3698();
			this.anIntArray372[local16] = arg0.method3698();
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)I")
	public int method5576(@OriginalArg(0) int arg0) {
		if (this.anInt6618 >= this.anInt6614) {
			this.anInt6615 = this.anIntArray372[this.anInt6616++] << 15;
			if (this.anInt6616 >= this.anInt6611) {
				this.anInt6616 = this.anInt6611 - 1;
			}
			this.anInt6614 = (int) ((double) this.anIntArray373[this.anInt6616] / 65536.0D * (double) arg0);
			if (this.anInt6614 > this.anInt6618) {
				this.anInt6617 = ((this.anIntArray372[this.anInt6616] << 15) - this.anInt6615) / (this.anInt6614 - this.anInt6618);
			}
		}
		this.anInt6615 += this.anInt6617;
		this.anInt6618++;
		return this.anInt6615 - this.anInt6617 >> 15;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "()V")
	public void method5577() {
		this.anInt6614 = 0;
		this.anInt6616 = 0;
		this.anInt6617 = 0;
		this.anInt6615 = 0;
		this.anInt6618 = 0;
	}
}
