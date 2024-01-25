import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class217 {

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "I")
	public int anInt5520;

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
	public int anInt5521;

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
	public int anInt5522;

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
	private int anInt5523;

	@OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
	private int anInt5524;

	@OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
	private int anInt5525;

	@OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
	private int anInt5526;

	@OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
	private int anInt5519 = 2;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "[I")
	private int[] anIntArray640 = new int[2];

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "[I")
	private int[] anIntArray641 = new int[2];

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class217() {
		this.anIntArray640[0] = 0;
		this.anIntArray640[1] = 65535;
		this.anIntArray641[0] = 0;
		this.anIntArray641[1] = 65535;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)I")
	public int method4764(@OriginalArg(0) int arg0) {
		if (this.anInt5524 >= this.anInt5525) {
			this.anInt5523 = this.anIntArray641[this.anInt5526++] << 15;
			if (this.anInt5526 >= this.anInt5519) {
				this.anInt5526 = this.anInt5519 - 1;
			}
			this.anInt5525 = (int) ((double) this.anIntArray640[this.anInt5526] / 65536.0D * (double) arg0);
			if (this.anInt5525 > this.anInt5524) {
				this.anInt5527 = ((this.anIntArray641[this.anInt5526] << 15) - this.anInt5523) / (this.anInt5525 - this.anInt5524);
			}
		}
		this.anInt5523 += this.anInt5527;
		this.anInt5524++;
		return this.anInt5523 - this.anInt5527 >> 15;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!re;)V")
	public void method4765(@OriginalArg(0) Class1_Sub33 arg0) {
		this.anInt5519 = arg0.method5174();
		this.anIntArray640 = new int[this.anInt5519];
		this.anIntArray641 = new int[this.anInt5519];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5519; local16++) {
			this.anIntArray640[local16] = arg0.method5177();
			this.anIntArray641[local16] = arg0.method5177();
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(Lclient!re;)V")
	public void method4766(@OriginalArg(0) Class1_Sub33 arg0) {
		this.anInt5520 = arg0.method5174();
		this.anInt5522 = arg0.method5150();
		this.anInt5521 = arg0.method5150();
		this.method4765(arg0);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "()V")
	public void method4767() {
		this.anInt5525 = 0;
		this.anInt5526 = 0;
		this.anInt5527 = 0;
		this.anInt5523 = 0;
		this.anInt5524 = 0;
	}
}
