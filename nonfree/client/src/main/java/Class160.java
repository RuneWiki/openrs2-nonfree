import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class160 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
	public int anInt5044;

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
	public int anInt5045;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
	public int anInt5047;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
	private int anInt5048;

	@OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
	private int anInt5049;

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
	private int anInt5050;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
	private int anInt5051;

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
	private int anInt5052;

	@OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
	private int anInt5046 = 2;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
	private int[] anIntArray450 = new int[2];

	@OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
	private int[] anIntArray451 = new int[2];

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class160() {
		this.anIntArray450[0] = 0;
		this.anIntArray450[1] = 65535;
		this.anIntArray451[0] = 0;
		this.anIntArray451[1] = 65535;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I")
	public int method4232(@OriginalArg(0) int arg0) {
		if (this.anInt5050 >= this.anInt5051) {
			this.anInt5052 = this.anIntArray451[this.anInt5049++] << 15;
			if (this.anInt5049 >= this.anInt5046) {
				this.anInt5049 = this.anInt5046 - 1;
			}
			this.anInt5051 = (int) ((double) this.anIntArray450[this.anInt5049] / 65536.0D * (double) arg0);
			if (this.anInt5051 > this.anInt5050) {
				this.anInt5048 = ((this.anIntArray451[this.anInt5049] << 15) - this.anInt5052) / (this.anInt5051 - this.anInt5050);
			}
		}
		this.anInt5052 += this.anInt5048;
		this.anInt5050++;
		return this.anInt5052 - this.anInt5048 >> 15;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!rt;)V")
	public void method4233(@OriginalArg(0) Class3_Sub27 arg0) {
		this.anInt5046 = arg0.method7548();
		this.anIntArray450 = new int[this.anInt5046];
		this.anIntArray451 = new int[this.anInt5046];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5046; local16++) {
			this.anIntArray450[local16] = arg0.method7591();
			this.anIntArray451[local16] = arg0.method7591();
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
	public void method4234() {
		this.anInt5051 = 0;
		this.anInt5049 = 0;
		this.anInt5048 = 0;
		this.anInt5052 = 0;
		this.anInt5050 = 0;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(Lclient!rt;)V")
	public void method4235(@OriginalArg(0) Class3_Sub27 arg0) {
		this.anInt5047 = arg0.method7548();
		this.anInt5044 = arg0.method7549();
		this.anInt5045 = arg0.method7549();
		this.method4233(arg0);
	}
}
