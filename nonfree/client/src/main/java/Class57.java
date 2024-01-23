import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class57 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
	public int anInt2355;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
	public int anInt2356;

	@OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
	public int anInt2358;

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
	private int anInt2359;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
	private int anInt2360;

	@OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
	private int anInt2361;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
	private int anInt2362;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
	private int anInt2363;

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
	private int anInt2357 = 2;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "[I")
	private int[] anIntArray300 = new int[2];

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "[I")
	private int[] anIntArray301 = new int[2];

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
	public Class57() {
		this.anIntArray300[0] = 0;
		this.anIntArray300[1] = 65535;
		this.anIntArray301[0] = 0;
		this.anIntArray301[1] = 65535;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)I")
	public int method1764(@OriginalArg(0) int arg0) {
		if (this.anInt2359 >= this.anInt2363) {
			this.anInt2361 = this.anIntArray301[this.anInt2360++] << 15;
			if (this.anInt2360 >= this.anInt2357) {
				this.anInt2360 = this.anInt2357 - 1;
			}
			this.anInt2363 = (int) ((double) this.anIntArray300[this.anInt2360] / 65536.0D * (double) arg0);
			if (this.anInt2363 > this.anInt2359) {
				this.anInt2362 = ((this.anIntArray301[this.anInt2360] << 15) - this.anInt2361) / (this.anInt2363 - this.anInt2359);
			}
		}
		this.anInt2361 += this.anInt2362;
		this.anInt2359++;
		return this.anInt2361 - this.anInt2362 >> 15;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!nc;)V")
	public void method1765(@OriginalArg(0) Class1_Sub9 arg0) {
		this.anInt2357 = arg0.method895();
		this.anIntArray300 = new int[this.anInt2357];
		this.anIntArray301 = new int[this.anInt2357];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2357; local16++) {
			this.anIntArray300[local16] = arg0.method946();
			this.anIntArray301[local16] = arg0.method946();
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lclient!nc;)V")
	public void method1766(@OriginalArg(0) Class1_Sub9 arg0) {
		this.anInt2356 = arg0.method895();
		this.anInt2355 = arg0.method915();
		this.anInt2358 = arg0.method915();
		this.method1765(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "()V")
	public void method1767() {
		this.anInt2363 = 0;
		this.anInt2360 = 0;
		this.anInt2362 = 0;
		this.anInt2361 = 0;
		this.anInt2359 = 0;
	}
}
