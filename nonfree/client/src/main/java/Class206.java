import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class206 {

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
	public int anInt6290;

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public int anInt6291;

	@OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
	public int anInt6292;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
	private int anInt6293;

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
	private int anInt6294;

	@OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
	private int anInt6295;

	@OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
	private int anInt6296;

	@OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
	private int anInt6297;

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
	private int anInt6289 = 2;

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
	private int[] anIntArray812 = new int[2];

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "[I")
	private int[] anIntArray811 = new int[2];

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
	public Class206() {
		this.anIntArray812[0] = 0;
		this.anIntArray812[1] = 65535;
		this.anIntArray811[0] = 0;
		this.anIntArray811[1] = 65535;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "()V")
	public void method5309() {
		this.anInt6293 = 0;
		this.anInt6297 = 0;
		this.anInt6296 = 0;
		this.anInt6295 = 0;
		this.anInt6294 = 0;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!ap;)V")
	public void method5310(@OriginalArg(0) Class7_Sub3 arg0) {
		this.anInt6290 = arg0.method2772();
		this.anInt6291 = arg0.method2767();
		this.anInt6292 = arg0.method2767();
		this.method5311(arg0);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(Lclient!ap;)V")
	public void method5311(@OriginalArg(0) Class7_Sub3 arg0) {
		this.anInt6289 = arg0.method2772();
		this.anIntArray812 = new int[this.anInt6289];
		this.anIntArray811 = new int[this.anInt6289];
		for (@Pc(16) int local16 = 0; local16 < this.anInt6289; local16++) {
			this.anIntArray812[local16] = arg0.method2764();
			this.anIntArray811[local16] = arg0.method2764();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	public int method5312(@OriginalArg(0) int arg0) {
		if (this.anInt6294 >= this.anInt6293) {
			this.anInt6295 = this.anIntArray811[this.anInt6297++] << 15;
			if (this.anInt6297 >= this.anInt6289) {
				this.anInt6297 = this.anInt6289 - 1;
			}
			this.anInt6293 = (int) ((double) this.anIntArray812[this.anInt6297] / 65536.0D * (double) arg0);
			if (this.anInt6293 > this.anInt6294) {
				this.anInt6296 = ((this.anIntArray811[this.anInt6297] << 15) - this.anInt6295) / (this.anInt6293 - this.anInt6294);
			}
		}
		this.anInt6295 += this.anInt6296;
		this.anInt6294++;
		return this.anInt6295 - this.anInt6296 >> 15;
	}
}
