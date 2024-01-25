import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class181 {

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "I")
	public int anInt5305;

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "I")
	public int anInt5307;

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "I")
	public int anInt5308;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "I")
	private int anInt5309;

	@OriginalMember(owner = "client!ov", name = "h", descriptor = "I")
	private int anInt5310;

	@OriginalMember(owner = "client!ov", name = "i", descriptor = "I")
	private int anInt5311;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "I")
	private int anInt5312;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	private int anInt5313;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	private int anInt5306 = 2;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "[I")
	private int[] anIntArray463 = new int[2];

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "[I")
	private int[] anIntArray464 = new int[2];

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "()V")
	public Class181() {
		this.anIntArray463[0] = 0;
		this.anIntArray463[1] = 65535;
		this.anIntArray464[0] = 0;
		this.anIntArray464[1] = 65535;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Lclient!tl;)V")
	public void method4073(@OriginalArg(0) Class4_Sub30 arg0) {
		this.anInt5305 = arg0.method4864();
		this.anInt5307 = arg0.method4872();
		this.anInt5308 = arg0.method4872();
		this.method4074(arg0);
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(Lclient!tl;)V")
	public void method4074(@OriginalArg(0) Class4_Sub30 arg0) {
		this.anInt5306 = arg0.method4864();
		this.anIntArray463 = new int[this.anInt5306];
		this.anIntArray464 = new int[this.anInt5306];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5306; local16++) {
			this.anIntArray463[local16] = arg0.method4877();
			this.anIntArray464[local16] = arg0.method4877();
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "()V")
	public void method4075() {
		this.anInt5311 = 0;
		this.anInt5310 = 0;
		this.anInt5309 = 0;
		this.anInt5312 = 0;
		this.anInt5313 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)I")
	public int method4076(@OriginalArg(0) int arg0) {
		if (this.anInt5313 >= this.anInt5311) {
			this.anInt5312 = this.anIntArray464[this.anInt5310++] << 15;
			if (this.anInt5310 >= this.anInt5306) {
				this.anInt5310 = this.anInt5306 - 1;
			}
			this.anInt5311 = (int) ((double) this.anIntArray463[this.anInt5310] / 65536.0D * (double) arg0);
			if (this.anInt5311 > this.anInt5313) {
				this.anInt5309 = ((this.anIntArray464[this.anInt5310] << 15) - this.anInt5312) / (this.anInt5311 - this.anInt5313);
			}
		}
		this.anInt5312 += this.anInt5309;
		this.anInt5313++;
		return this.anInt5312 - this.anInt5309 >> 15;
	}
}
