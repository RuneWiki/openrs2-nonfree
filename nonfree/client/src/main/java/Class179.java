import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class179 {

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
	public int anInt5311;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
	public int anInt5313;

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
	public int anInt5314;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
	private int anInt5315;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
	private int anInt5316;

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	private int anInt5317;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
	private int anInt5318;

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
	private int anInt5319;

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
	private int anInt5312 = 2;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "[I")
	private int[] anIntArray585 = new int[2];

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "[I")
	private int[] anIntArray584 = new int[2];

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
	public Class179() {
		this.anIntArray585[0] = 0;
		this.anIntArray585[1] = 65535;
		this.anIntArray584[0] = 0;
		this.anIntArray584[1] = 65535;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()V")
	public void method4420() {
		this.anInt5319 = 0;
		this.anInt5317 = 0;
		this.anInt5316 = 0;
		this.anInt5315 = 0;
		this.anInt5318 = 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!fh;)V")
	public void method4421(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt5312 = arg0.method1853();
		this.anIntArray585 = new int[this.anInt5312];
		this.anIntArray584 = new int[this.anInt5312];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5312; local16++) {
			this.anIntArray585[local16] = arg0.method1879();
			this.anIntArray584[local16] = arg0.method1879();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
	public int method4422(@OriginalArg(0) int arg0) {
		if (this.anInt5318 >= this.anInt5319) {
			this.anInt5315 = this.anIntArray584[this.anInt5317++] << 15;
			if (this.anInt5317 >= this.anInt5312) {
				this.anInt5317 = this.anInt5312 - 1;
			}
			this.anInt5319 = (int) ((double) this.anIntArray585[this.anInt5317] / 65536.0D * (double) arg0);
			if (this.anInt5319 > this.anInt5318) {
				this.anInt5316 = ((this.anIntArray584[this.anInt5317] << 15) - this.anInt5315) / (this.anInt5319 - this.anInt5318);
			}
		}
		this.anInt5315 += this.anInt5316;
		this.anInt5318++;
		return this.anInt5315 - this.anInt5316 >> 15;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lclient!fh;)V")
	public void method4423(@OriginalArg(0) Class1_Sub13 arg0) {
		this.anInt5311 = arg0.method1853();
		this.anInt5313 = arg0.method1860();
		this.anInt5314 = arg0.method1860();
		this.method4421(arg0);
	}
}
