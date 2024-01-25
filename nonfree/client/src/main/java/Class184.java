import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class184 {

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	public int anInt5012;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public int anInt5013;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	public int anInt5014;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt5015;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
	private int anInt5016;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	private int anInt5017;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
	private int anInt5018;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	private int anInt5019;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt5011 = 2;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
	private int[] anIntArray248 = new int[2];

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[I")
	private int[] anIntArray249 = new int[2];

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
	public Class184() {
		this.anIntArray248[0] = 0;
		this.anIntArray248[1] = 65535;
		this.anIntArray249[0] = 0;
		this.anIntArray249[1] = 65535;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!un;)V")
	public void method4413(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt5011 = arg0.method4905();
		this.anIntArray248 = new int[this.anInt5011];
		this.anIntArray249 = new int[this.anInt5011];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5011; local16++) {
			this.anIntArray248[local16] = arg0.method4936();
			this.anIntArray249[local16] = arg0.method4936();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	public void method4414() {
		this.anInt5015 = 0;
		this.anInt5019 = 0;
		this.anInt5016 = 0;
		this.anInt5017 = 0;
		this.anInt5018 = 0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
	public int method4415(@OriginalArg(0) int arg0) {
		if (this.anInt5018 >= this.anInt5015) {
			this.anInt5017 = this.anIntArray249[this.anInt5019++] << 15;
			if (this.anInt5019 >= this.anInt5011) {
				this.anInt5019 = this.anInt5011 - 1;
			}
			this.anInt5015 = (int) ((double) this.anIntArray248[this.anInt5019] / 65536.0D * (double) arg0);
			if (this.anInt5015 > this.anInt5018) {
				this.anInt5016 = ((this.anIntArray249[this.anInt5019] << 15) - this.anInt5017) / (this.anInt5015 - this.anInt5018);
			}
		}
		this.anInt5017 += this.anInt5016;
		this.anInt5018++;
		return this.anInt5017 - this.anInt5016 >> 15;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lclient!un;)V")
	public void method4416(@OriginalArg(0) Class4_Sub11 arg0) {
		this.anInt5014 = arg0.method4905();
		this.anInt5012 = arg0.method4931();
		this.anInt5013 = arg0.method4931();
		this.method4413(arg0);
	}
}
