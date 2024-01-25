import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class47 {

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!df", name = "c", descriptor = "I")
	public int anInt1206;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "I")
	public int anInt1208;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt1209;

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	private int anInt1210;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "I")
	private int anInt1211;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "I")
	private int anInt1212;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "I")
	private int anInt1213;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	private int anInt1207 = 2;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "[I")
	private int[] anIntArray135 = new int[2];

	@OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
	private int[] anIntArray136 = new int[2];

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
	public Class47() {
		this.anIntArray135[0] = 0;
		this.anIntArray135[1] = 65535;
		this.anIntArray136[0] = 0;
		this.anIntArray136[1] = 65535;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
	public void method1004() {
		this.anInt1211 = 0;
		this.anInt1209 = 0;
		this.anInt1213 = 0;
		this.anInt1212 = 0;
		this.anInt1210 = 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!tq;)V")
	public void method1005(@OriginalArg(0) Class4_Sub7 arg0) {
		this.anInt1205 = arg0.method2380();
		this.anInt1206 = arg0.method2389();
		this.anInt1208 = arg0.method2389();
		this.method1006(arg0);
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!tq;)V")
	public void method1006(@OriginalArg(0) Class4_Sub7 arg0) {
		this.anInt1207 = arg0.method2380();
		this.anIntArray135 = new int[this.anInt1207];
		this.anIntArray136 = new int[this.anInt1207];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1207; local16++) {
			this.anIntArray135[local16] = arg0.method2404();
			this.anIntArray136[local16] = arg0.method2404();
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method1007(@OriginalArg(0) int arg0) {
		if (this.anInt1210 >= this.anInt1211) {
			this.anInt1212 = this.anIntArray136[this.anInt1209++] << 15;
			if (this.anInt1209 >= this.anInt1207) {
				this.anInt1209 = this.anInt1207 - 1;
			}
			this.anInt1211 = (int) ((double) this.anIntArray135[this.anInt1209] / 65536.0D * (double) arg0);
			if (this.anInt1211 > this.anInt1210) {
				this.anInt1213 = ((this.anIntArray136[this.anInt1209] << 15) - this.anInt1212) / (this.anInt1211 - this.anInt1210);
			}
		}
		this.anInt1212 += this.anInt1213;
		this.anInt1210++;
		return this.anInt1212 - this.anInt1213 >> 15;
	}
}
