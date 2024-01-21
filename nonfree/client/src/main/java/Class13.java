import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class13 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public int anInt380;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
	public int anInt382;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	public int anInt383;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	private int anInt384;

	@OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
	private int anInt385;

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
	private int anInt386;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
	private int anInt387;

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
	private int anInt388;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
	private int anInt381 = 2;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "[I")
	private int[] anIntArray50 = new int[2];

	@OriginalMember(owner = "client!ce", name = "f", descriptor = "[I")
	private int[] anIntArray51 = new int[2];

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class13() {
		this.anIntArray50[0] = 0;
		this.anIntArray50[1] = 65535;
		this.anIntArray51[0] = 0;
		this.anIntArray51[1] = 65535;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)I")
	public int method334(@OriginalArg(0) int arg0) {
		if (this.anInt388 >= this.anInt386) {
			this.anInt387 = this.anIntArray51[this.anInt384++] << 15;
			if (this.anInt384 >= this.anInt381) {
				this.anInt384 = this.anInt381 - 1;
			}
			this.anInt386 = (int) ((double) this.anIntArray50[this.anInt384] / 65536.0D * (double) arg0);
			if (this.anInt386 > this.anInt388) {
				this.anInt385 = ((this.anIntArray51[this.anInt384] << 15) - this.anInt387) / (this.anInt386 - this.anInt388);
			}
		}
		this.anInt387 += this.anInt385;
		this.anInt388++;
		return this.anInt387 - this.anInt385 >> 15;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	public void method335() {
		this.anInt386 = 0;
		this.anInt384 = 0;
		this.anInt385 = 0;
		this.anInt387 = 0;
		this.anInt388 = 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!g;)V")
	public void method336(@OriginalArg(0) Class2_Sub5 arg0) {
		this.anInt381 = arg0.method1281();
		this.anIntArray50 = new int[this.anInt381];
		this.anIntArray51 = new int[this.anInt381];
		for (@Pc(16) int local16 = 0; local16 < this.anInt381; local16++) {
			this.anIntArray50[local16] = arg0.method1273();
			this.anIntArray51[local16] = arg0.method1273();
		}
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lclient!g;)V")
	public void method337(@OriginalArg(0) Class2_Sub5 arg0) {
		this.anInt382 = arg0.method1281();
		this.anInt383 = arg0.method1276();
		this.anInt380 = arg0.method1276();
		this.method336(arg0);
	}
}
