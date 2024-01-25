import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class203 {

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
	public int anInt5100;

	@OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
	public int anInt5102;

	@OriginalMember(owner = "client!pq", name = "f", descriptor = "I")
	public int anInt5103;

	@OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
	private int anInt5104;

	@OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
	private int anInt5105;

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
	private int anInt5106;

	@OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
	private int anInt5107;

	@OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
	private int anInt5108;

	@OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
	private int anInt5101 = 2;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "[I")
	private int[] anIntArray457 = new int[2];

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "[I")
	private int[] anIntArray458 = new int[2];

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "()V")
	public Class203() {
		this.anIntArray457[0] = 0;
		this.anIntArray457[1] = 65535;
		this.anIntArray458[0] = 0;
		this.anIntArray458[1] = 65535;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
	public void method4478() {
		this.anInt5105 = 0;
		this.anInt5106 = 0;
		this.anInt5108 = 0;
		this.anInt5104 = 0;
		this.anInt5107 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	public int method4479(@OriginalArg(0) int arg0) {
		if (this.anInt5107 >= this.anInt5105) {
			this.anInt5104 = this.anIntArray458[this.anInt5106++] << 15;
			if (this.anInt5106 >= this.anInt5101) {
				this.anInt5106 = this.anInt5101 - 1;
			}
			this.anInt5105 = (int) ((double) this.anIntArray457[this.anInt5106] / 65536.0D * (double) arg0);
			if (this.anInt5105 > this.anInt5107) {
				this.anInt5108 = ((this.anIntArray458[this.anInt5106] << 15) - this.anInt5104) / (this.anInt5105 - this.anInt5107);
			}
		}
		this.anInt5104 += this.anInt5108;
		this.anInt5107++;
		return this.anInt5104 - this.anInt5108 >> 15;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ha;)V")
	public void method4480(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt5102 = arg0.method3111();
		this.anInt5100 = arg0.method3109();
		this.anInt5103 = arg0.method3109();
		this.method4481(arg0);
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Lclient!ha;)V")
	public void method4481(@OriginalArg(0) Class6_Sub15 arg0) {
		this.anInt5101 = arg0.method3111();
		this.anIntArray457 = new int[this.anInt5101];
		this.anIntArray458 = new int[this.anInt5101];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5101; local16++) {
			this.anIntArray457[local16] = arg0.method3108();
			this.anIntArray458[local16] = arg0.method3108();
		}
	}
}
