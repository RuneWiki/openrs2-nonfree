import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class65 {

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
	public int anInt2298;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
	public int anInt2300;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	private int anInt2301;

	@OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
	private int anInt2302;

	@OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
	private int anInt2303;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "I")
	private int anInt2304;

	@OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
	private int anInt2305;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
	private int anInt2297 = 2;

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "[I")
	private int[] anIntArray309 = new int[2];

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "[I")
	private int[] anIntArray310 = new int[2];

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class65() {
		this.anIntArray309[0] = 0;
		this.anIntArray309[1] = 65535;
		this.anIntArray310[0] = 0;
		this.anIntArray310[1] = 65535;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
	public int method1623(@OriginalArg(0) int arg0) {
		if (this.anInt2302 >= this.anInt2301) {
			this.anInt2305 = this.anIntArray310[this.anInt2304++] << 15;
			if (this.anInt2304 >= this.anInt2297) {
				this.anInt2304 = this.anInt2297 - 1;
			}
			this.anInt2301 = (int) ((double) this.anIntArray309[this.anInt2304] / 65536.0D * (double) arg0);
			if (this.anInt2301 > this.anInt2302) {
				this.anInt2303 = ((this.anIntArray310[this.anInt2304] << 15) - this.anInt2305) / (this.anInt2301 - this.anInt2302);
			}
		}
		this.anInt2305 += this.anInt2303;
		this.anInt2302++;
		return this.anInt2305 - this.anInt2303 >> 15;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ob;)V")
	public void method1624(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt2298 = arg0.method647();
		this.anInt2299 = arg0.method638();
		this.anInt2300 = arg0.method638();
		this.method1626(arg0);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "()V")
	public void method1625() {
		this.anInt2301 = 0;
		this.anInt2304 = 0;
		this.anInt2303 = 0;
		this.anInt2305 = 0;
		this.anInt2302 = 0;
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(Lclient!ob;)V")
	public void method1626(@OriginalArg(0) Class3_Sub7 arg0) {
		this.anInt2297 = arg0.method647();
		this.anIntArray309 = new int[this.anInt2297];
		this.anIntArray310 = new int[this.anInt2297];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2297; local16++) {
			this.anIntArray309[local16] = arg0.method602();
			this.anIntArray310[local16] = arg0.method602();
		}
	}
}
