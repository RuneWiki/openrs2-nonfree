import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class175 {

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
	public int anInt6104;

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
	public int anInt6106;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
	public int anInt6107;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
	private int anInt6108;

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
	private int anInt6109;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt6110;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
	private int anInt6111;

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
	private int anInt6112;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	private int anInt6105 = 2;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "[I")
	private int[] anIntArray604 = new int[2];

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	private int[] anIntArray605 = new int[2];

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class175() {
		this.anIntArray604[0] = 0;
		this.anIntArray604[1] = 65535;
		this.anIntArray605[0] = 0;
		this.anIntArray605[1] = 65535;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()V")
	public void method4734() {
		this.anInt6109 = 0;
		this.anInt6110 = 0;
		this.anInt6111 = 0;
		this.anInt6108 = 0;
		this.anInt6112 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!im;)V")
	public void method4735(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt6105 = arg0.method2655();
		this.anIntArray604 = new int[this.anInt6105];
		this.anIntArray605 = new int[this.anInt6105];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6105; local16++) {
			this.anIntArray604[local16] = arg0.method2652();
			this.anIntArray605[local16] = arg0.method2652();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!im;)V")
	public void method4736(@OriginalArg(0) Class1_Sub16 arg0) {
		this.anInt6106 = arg0.method2655();
		this.anInt6107 = arg0.method2610();
		this.anInt6104 = arg0.method2610();
		this.method4735(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
	public int method4737(@OriginalArg(0) int arg0) {
		if (this.anInt6112 >= this.anInt6109) {
			this.anInt6108 = this.anIntArray605[this.anInt6110++] << 15;
			if (this.anInt6110 >= this.anInt6105) {
				this.anInt6110 = this.anInt6105 - 1;
			}
			this.anInt6109 = (int) ((double) this.anIntArray604[this.anInt6110] / 65536.0D * (double) arg0);
			if (this.anInt6109 > this.anInt6112) {
				this.anInt6111 = ((this.anIntArray605[this.anInt6110] << 15) - this.anInt6108) / (this.anInt6109 - this.anInt6112);
			}
		}
		this.anInt6108 += this.anInt6111;
		this.anInt6112++;
		return this.anInt6108 - this.anInt6111 >> 15;
	}
}
