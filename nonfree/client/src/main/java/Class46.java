import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oc")
public final class Class46 {

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
	public int anInt2088;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public int anInt2089;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
	public int anInt2090;

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	private int anInt2092;

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	private int anInt2093;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
	private int anInt2094;

	@OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
	private int anInt2095;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
	private int anInt2096;

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
	private int anInt2091 = 2;

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "[I")
	private int[] anIntArray326 = new int[2];

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
	private int[] anIntArray327 = new int[2];

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
	public Class46() {
		this.anIntArray326[0] = 0;
		this.anIntArray326[1] = 65535;
		this.anIntArray327[0] = 0;
		this.anIntArray327[1] = 65535;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "()V")
	public void method1483() {
		this.anInt2094 = 0;
		this.anInt2093 = 0;
		this.anInt2092 = 0;
		this.anInt2095 = 0;
		this.anInt2096 = 0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!wd;)V")
	public void method1484(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt2090 = arg0.method1421();
		this.anInt2088 = arg0.method1444();
		this.anInt2089 = arg0.method1444();
		this.method1486(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
	public int method1485(@OriginalArg(0) int arg0) {
		if (this.anInt2096 >= this.anInt2094) {
			this.anInt2095 = this.anIntArray327[this.anInt2093++] << 15;
			if (this.anInt2093 >= this.anInt2091) {
				this.anInt2093 = this.anInt2091 - 1;
			}
			this.anInt2094 = (int) ((double) this.anIntArray326[this.anInt2093] / 65536.0D * (double) arg0);
			if (this.anInt2094 > this.anInt2096) {
				this.anInt2092 = ((this.anIntArray327[this.anInt2093] << 15) - this.anInt2095) / (this.anInt2094 - this.anInt2096);
			}
		}
		this.anInt2095 += this.anInt2092;
		this.anInt2096++;
		return this.anInt2095 - this.anInt2092 >> 15;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(Lclient!wd;)V")
	public void method1486(@OriginalArg(0) Class3_Sub11 arg0) {
		this.anInt2091 = arg0.method1421();
		this.anIntArray326 = new int[this.anInt2091];
		this.anIntArray327 = new int[this.anInt2091];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2091; local16++) {
			this.anIntArray326[local16] = arg0.method1451();
			this.anIntArray327[local16] = arg0.method1451();
		}
	}
}
