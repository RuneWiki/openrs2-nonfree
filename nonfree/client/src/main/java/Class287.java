import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class287 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
	public int anInt8563;

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
	public int anInt8564;

	@OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
	public int anInt8566;

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
	private int anInt8567;

	@OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
	private int anInt8568;

	@OriginalMember(owner = "client!rc", name = "i", descriptor = "I")
	private int anInt8569;

	@OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
	private int anInt8570;

	@OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
	private int anInt8571;

	@OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
	private int anInt8565 = 2;

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "[I")
	private int[] anIntArray496 = new int[2];

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
	private int[] anIntArray497 = new int[2];

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
	public Class287() {
		this.anIntArray496[0] = 0;
		this.anIntArray496[1] = 65535;
		this.anIntArray497[0] = 0;
		this.anIntArray497[1] = 65535;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!ek;)V")
	public void method6623(@OriginalArg(0) Class4_Sub13 arg0) {
		this.anInt8565 = arg0.method7004();
		this.anIntArray496 = new int[this.anInt8565];
		this.anIntArray497 = new int[this.anInt8565];
		for (@Pc(16) int local16 = 0; local16 < this.anInt8565; local16++) {
			this.anIntArray496[local16] = arg0.method7054();
			this.anIntArray497[local16] = arg0.method7054();
		}
	}

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(Lclient!ek;)V")
	public void method6624(@OriginalArg(0) Class4_Sub13 arg0) {
		this.anInt8564 = arg0.method7004();
		this.anInt8563 = arg0.method6990();
		this.anInt8566 = arg0.method6990();
		this.method6623(arg0);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)I")
	public int method6625(@OriginalArg(0) int arg0) {
		if (this.anInt8567 >= this.anInt8571) {
			this.anInt8569 = this.anIntArray497[this.anInt8568++] << 15;
			if (this.anInt8568 >= this.anInt8565) {
				this.anInt8568 = this.anInt8565 - 1;
			}
			this.anInt8571 = (int) ((double) this.anIntArray496[this.anInt8568] / 65536.0D * (double) arg0);
			if (this.anInt8571 > this.anInt8567) {
				this.anInt8570 = ((this.anIntArray497[this.anInt8568] << 15) - this.anInt8569) / (this.anInt8571 - this.anInt8567);
			}
		}
		this.anInt8569 += this.anInt8570;
		this.anInt8567++;
		return this.anInt8569 - this.anInt8570 >> 15;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "()V")
	public void method6626() {
		this.anInt8571 = 0;
		this.anInt8568 = 0;
		this.anInt8570 = 0;
		this.anInt8569 = 0;
		this.anInt8567 = 0;
	}
}
