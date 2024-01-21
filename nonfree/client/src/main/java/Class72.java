import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class72 {

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
	public int anInt4022;

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
	public int anInt4023;

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
	public int anInt4024;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
	private int anInt4026;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	private int anInt4027;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
	private int anInt4028;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
	private int anInt4029;

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
	private int anInt4030;

	@OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
	private int anInt4025 = 2;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "[I")
	private int[] anIntArray381 = new int[2];

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
	private int[] anIntArray382 = new int[2];

	@OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
	public Class72() {
		this.anIntArray381[0] = 0;
		this.anIntArray381[1] = 65535;
		this.anIntArray382[0] = 0;
		this.anIntArray382[1] = 65535;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)I")
	public int method3073(@OriginalArg(0) int arg0) {
		if (this.anInt4030 >= this.anInt4028) {
			this.anInt4026 = this.anIntArray382[this.anInt4027++] << 15;
			if (this.anInt4027 >= this.anInt4025) {
				this.anInt4027 = this.anInt4025 - 1;
			}
			this.anInt4028 = (int) ((double) this.anIntArray381[this.anInt4027] / 65536.0D * (double) arg0);
			if (this.anInt4028 > this.anInt4030) {
				this.anInt4029 = ((this.anIntArray382[this.anInt4027] << 15) - this.anInt4026) / (this.anInt4028 - this.anInt4030);
			}
		}
		this.anInt4026 += this.anInt4029;
		this.anInt4030++;
		return this.anInt4026 - this.anInt4029 >> 15;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fa;)V")
	public void method3074(@OriginalArg(0) Class1_Sub9 arg0) {
		this.anInt4023 = arg0.method1234();
		this.anInt4022 = arg0.method1273();
		this.anInt4024 = arg0.method1273();
		this.method3075(arg0);
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lclient!fa;)V")
	public void method3075(@OriginalArg(0) Class1_Sub9 arg0) {
		this.anInt4025 = arg0.method1234();
		this.anIntArray381 = new int[this.anInt4025];
		this.anIntArray382 = new int[this.anInt4025];
		for (@Pc(16) int local16 = 0; local16 < this.anInt4025; local16++) {
			this.anIntArray381[local16] = arg0.method1280();
			this.anIntArray382[local16] = arg0.method1280();
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
	public void method3076() {
		this.anInt4028 = 0;
		this.anInt4027 = 0;
		this.anInt4029 = 0;
		this.anInt4026 = 0;
		this.anInt4030 = 0;
	}
}
