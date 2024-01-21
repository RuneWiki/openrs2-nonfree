import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class11 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
	public int anInt309;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public int anInt310;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt311;

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
	private int anInt313;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	private int anInt314;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	private int anInt312 = 2;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
	private int[] anIntArray52 = new int[2];

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "[I")
	private int[] anIntArray53 = new int[2];

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class11() {
		this.anIntArray52[0] = 0;
		this.anIntArray52[1] = 65535;
		this.anIntArray53[0] = 0;
		this.anIntArray53[1] = 65535;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()V")
	public void method250() {
		this.anInt317 = 0;
		this.anInt315 = 0;
		this.anInt313 = 0;
		this.anInt314 = 0;
		this.anInt316 = 0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!na;)V")
	public void method251(@OriginalArg(0) Class2_Sub9 arg0) {
		this.anInt309 = arg0.method640();
		this.anInt310 = arg0.method622();
		this.anInt311 = arg0.method622();
		this.method253(arg0);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)I")
	public int method252(@OriginalArg(0) int arg0) {
		if (this.anInt316 >= this.anInt317) {
			this.anInt314 = this.anIntArray53[this.anInt315++] << 15;
			if (this.anInt315 >= this.anInt312) {
				this.anInt315 = this.anInt312 - 1;
			}
			this.anInt317 = (int) ((double) this.anIntArray52[this.anInt315] / 65536.0D * (double) arg0);
			if (this.anInt317 > this.anInt316) {
				this.anInt313 = ((this.anIntArray53[this.anInt315] << 15) - this.anInt314) / (this.anInt317 - this.anInt316);
			}
		}
		this.anInt314 += this.anInt313;
		this.anInt316++;
		return this.anInt314 - this.anInt313 >> 15;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lclient!na;)V")
	public void method253(@OriginalArg(0) Class2_Sub9 arg0) {
		this.anInt312 = arg0.method640();
		this.anIntArray52 = new int[this.anInt312];
		this.anIntArray53 = new int[this.anInt312];
		for (@Pc(16) int local16 = 0; local16 < this.anInt312; local16++) {
			this.anIntArray52[local16] = arg0.method632();
			this.anIntArray53[local16] = arg0.method632();
		}
	}
}
