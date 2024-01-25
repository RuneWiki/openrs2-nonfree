import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ao")
public final class Class13 {

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public int anInt366;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public int anInt367;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
	public int anInt368;

	@OriginalMember(owner = "client!ao", name = "g", descriptor = "I")
	private int anInt370;

	@OriginalMember(owner = "client!ao", name = "h", descriptor = "I")
	private int anInt371;

	@OriginalMember(owner = "client!ao", name = "i", descriptor = "I")
	private int anInt372;

	@OriginalMember(owner = "client!ao", name = "j", descriptor = "I")
	private int anInt373;

	@OriginalMember(owner = "client!ao", name = "k", descriptor = "I")
	private int anInt374;

	@OriginalMember(owner = "client!ao", name = "f", descriptor = "I")
	private int anInt369 = 2;

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "[I")
	private int[] anIntArray21 = new int[2];

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "[I")
	private int[] anIntArray20 = new int[2];

	@OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V")
	public Class13() {
		this.anIntArray21[0] = 0;
		this.anIntArray21[1] = 65535;
		this.anIntArray20[0] = 0;
		this.anIntArray20[1] = 65535;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)I")
	public int method228(@OriginalArg(0) int arg0) {
		if (this.anInt372 >= this.anInt373) {
			this.anInt370 = this.anIntArray20[this.anInt371++] << 15;
			if (this.anInt371 >= this.anInt369) {
				this.anInt371 = this.anInt369 - 1;
			}
			this.anInt373 = (int) ((double) this.anIntArray21[this.anInt371] / 65536.0D * (double) arg0);
			if (this.anInt373 > this.anInt372) {
				this.anInt374 = ((this.anIntArray20[this.anInt371] << 15) - this.anInt370) / (this.anInt373 - this.anInt372);
			}
		}
		this.anInt370 += this.anInt374;
		this.anInt372++;
		return this.anInt370 - this.anInt374 >> 15;
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lclient!md;)V")
	public void method229(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt366 = arg0.method3737();
		this.anInt368 = arg0.method3731();
		this.anInt367 = arg0.method3731();
		this.method231(arg0);
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "()V")
	public void method230() {
		this.anInt373 = 0;
		this.anInt371 = 0;
		this.anInt374 = 0;
		this.anInt370 = 0;
		this.anInt372 = 0;
	}

	@OriginalMember(owner = "client!ao", name = "b", descriptor = "(Lclient!md;)V")
	public void method231(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt369 = arg0.method3737();
		this.anIntArray21 = new int[this.anInt369];
		this.anIntArray20 = new int[this.anInt369];
		for (@Pc(16) int local16 = 0; local16 < this.anInt369; local16++) {
			this.anIntArray21[local16] = arg0.method3711();
			this.anIntArray20[local16] = arg0.method3711();
		}
	}
}
