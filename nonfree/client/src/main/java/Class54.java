import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class54 {

	@OriginalMember(owner = "client!de", name = "a", descriptor = "I")
	public int anInt1227;

	@OriginalMember(owner = "client!de", name = "c", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!de", name = "e", descriptor = "I")
	public int anInt1230;

	@OriginalMember(owner = "client!de", name = "g", descriptor = "I")
	private int anInt1231;

	@OriginalMember(owner = "client!de", name = "h", descriptor = "I")
	private int anInt1232;

	@OriginalMember(owner = "client!de", name = "i", descriptor = "I")
	private int anInt1233;

	@OriginalMember(owner = "client!de", name = "j", descriptor = "I")
	private int anInt1234;

	@OriginalMember(owner = "client!de", name = "k", descriptor = "I")
	private int anInt1235;

	@OriginalMember(owner = "client!de", name = "d", descriptor = "I")
	private int anInt1229 = 2;

	@OriginalMember(owner = "client!de", name = "b", descriptor = "[I")
	private int[] anIntArray57 = new int[2];

	@OriginalMember(owner = "client!de", name = "f", descriptor = "[I")
	private int[] anIntArray58 = new int[2];

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class54() {
		this.anIntArray57[0] = 0;
		this.anIntArray57[1] = 65535;
		this.anIntArray58[0] = 0;
		this.anIntArray58[1] = 65535;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Lclient!ti;)V")
	public void method1002(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1229 = arg0.method4548();
		this.anIntArray57 = new int[this.anInt1229];
		this.anIntArray58 = new int[this.anInt1229];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1229; local16++) {
			this.anIntArray57[local16] = arg0.method4498();
			this.anIntArray58[local16] = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!de", name = "b", descriptor = "(Lclient!ti;)V")
	public void method1003(@OriginalArg(0) Class1_Sub14 arg0) {
		this.anInt1230 = arg0.method4548();
		this.anInt1227 = arg0.method4500();
		this.anInt1228 = arg0.method4500();
		this.method1002(arg0);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
	public int method1004(@OriginalArg(0) int arg0) {
		if (this.anInt1233 >= this.anInt1234) {
			this.anInt1232 = this.anIntArray58[this.anInt1235++] << 15;
			if (this.anInt1235 >= this.anInt1229) {
				this.anInt1235 = this.anInt1229 - 1;
			}
			this.anInt1234 = (int) ((double) this.anIntArray57[this.anInt1235] / 65536.0D * (double) arg0);
			if (this.anInt1234 > this.anInt1233) {
				this.anInt1231 = ((this.anIntArray58[this.anInt1235] << 15) - this.anInt1232) / (this.anInt1234 - this.anInt1233);
			}
		}
		this.anInt1232 += this.anInt1231;
		this.anInt1233++;
		return this.anInt1232 - this.anInt1231 >> 15;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "()V")
	public void method1005() {
		this.anInt1234 = 0;
		this.anInt1235 = 0;
		this.anInt1231 = 0;
		this.anInt1232 = 0;
		this.anInt1233 = 0;
	}
}
