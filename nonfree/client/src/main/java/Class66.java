import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class66 {

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public int anInt2754;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
	public int anInt2756;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt2758;

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
	private int anInt2759;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	private int anInt2760;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
	private int anInt2761;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
	private int anInt2762;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	private int anInt2757 = 2;

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
	private int[] anIntArray198 = new int[2];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
	private int[] anIntArray199 = new int[2];

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
	public Class66() {
		this.anIntArray198[0] = 0;
		this.anIntArray198[1] = 65535;
		this.anIntArray199[0] = 0;
		this.anIntArray199[1] = 65535;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ce;)V")
	public void method1936(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt2757 = arg0.method1278();
		this.anIntArray198 = new int[this.anInt2757];
		this.anIntArray199 = new int[this.anInt2757];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2757; local16++) {
			this.anIntArray198[local16] = arg0.method1270();
			this.anIntArray199[local16] = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I")
	public int method1937(@OriginalArg(0) int arg0) {
		if (this.anInt2758 >= this.anInt2760) {
			this.anInt2761 = this.anIntArray199[this.anInt2762++] << 15;
			if (this.anInt2762 >= this.anInt2757) {
				this.anInt2762 = this.anInt2757 - 1;
			}
			this.anInt2760 = (int) ((double) this.anIntArray198[this.anInt2762] / 65536.0D * (double) arg0);
			if (this.anInt2760 > this.anInt2758) {
				this.anInt2759 = ((this.anIntArray199[this.anInt2762] << 15) - this.anInt2761) / (this.anInt2760 - this.anInt2758);
			}
		}
		this.anInt2761 += this.anInt2759;
		this.anInt2758++;
		return this.anInt2761 - this.anInt2759 >> 15;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Lclient!ce;)V")
	public void method1938(@OriginalArg(0) Class3_Sub4 arg0) {
		this.anInt2756 = arg0.method1278();
		this.anInt2755 = arg0.method1245();
		this.anInt2754 = arg0.method1245();
		this.method1936(arg0);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "()V")
	public void method1939() {
		this.anInt2760 = 0;
		this.anInt2762 = 0;
		this.anInt2759 = 0;
		this.anInt2761 = 0;
		this.anInt2758 = 0;
	}
}
