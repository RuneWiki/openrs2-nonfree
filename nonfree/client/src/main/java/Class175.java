import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class175 {

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	public int anInt5365;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	public int anInt5366;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	public int anInt5367;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "I")
	private int anInt5369;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "I")
	private int anInt5370;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	private int anInt5371;

	@OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
	private int anInt5372;

	@OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
	private int anInt5373;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "I")
	private int anInt5368 = 2;

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "[I")
	private int[] anIntArray451 = new int[2];

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "[I")
	private int[] anIntArray452 = new int[2];

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class175() {
		this.anIntArray451[0] = 0;
		this.anIntArray451[1] = 65535;
		this.anIntArray452[0] = 0;
		this.anIntArray452[1] = 65535;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "()V")
	public void method4660() {
		this.anInt5372 = 0;
		this.anInt5369 = 0;
		this.anInt5371 = 0;
		this.anInt5373 = 0;
		this.anInt5370 = 0;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(Lclient!bg;)V")
	public void method4661(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt5365 = arg0.method4532();
		this.anInt5367 = arg0.method4545();
		this.anInt5366 = arg0.method4545();
		this.method4663(arg0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
	public int method4662(@OriginalArg(0) int arg0) {
		if (this.anInt5370 >= this.anInt5372) {
			this.anInt5373 = this.anIntArray452[this.anInt5369++] << 15;
			if (this.anInt5369 >= this.anInt5368) {
				this.anInt5369 = this.anInt5368 - 1;
			}
			this.anInt5372 = (int) ((double) this.anIntArray451[this.anInt5369] / 65536.0D * (double) arg0);
			if (this.anInt5372 > this.anInt5370) {
				this.anInt5371 = ((this.anIntArray452[this.anInt5369] << 15) - this.anInt5373) / (this.anInt5372 - this.anInt5370);
			}
		}
		this.anInt5373 += this.anInt5371;
		this.anInt5370++;
		return this.anInt5373 - this.anInt5371 >> 15;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(Lclient!bg;)V")
	public void method4663(@OriginalArg(0) Class1_Sub8 arg0) {
		this.anInt5368 = arg0.method4532();
		this.anIntArray451 = new int[this.anInt5368];
		this.anIntArray452 = new int[this.anInt5368];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5368; local16++) {
			this.anIntArray451[local16] = arg0.method4556();
			this.anIntArray452[local16] = arg0.method4556();
		}
	}
}
