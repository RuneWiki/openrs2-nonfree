import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class71 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	public int anInt2168;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!i", name = "g", descriptor = "I")
	private int anInt2171;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "I")
	private int anInt2172;

	@OriginalMember(owner = "client!i", name = "i", descriptor = "I")
	private int anInt2173;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	private int anInt2174;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	private int anInt2175;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private int anInt2170 = 2;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	private int[] anIntArray189 = new int[2];

	@OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
	private int[] anIntArray190 = new int[2];

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
	public Class71() {
		this.anIntArray189[0] = 0;
		this.anIntArray189[1] = 65535;
		this.anIntArray190[0] = 0;
		this.anIntArray190[1] = 65535;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "()V")
	public void method1847() {
		this.anInt2173 = 0;
		this.anInt2175 = 0;
		this.anInt2174 = 0;
		this.anInt2172 = 0;
		this.anInt2171 = 0;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)I")
	public int method1848(@OriginalArg(0) int arg0) {
		if (this.anInt2171 >= this.anInt2173) {
			this.anInt2172 = this.anIntArray190[this.anInt2175++] << 15;
			if (this.anInt2175 >= this.anInt2170) {
				this.anInt2175 = this.anInt2170 - 1;
			}
			this.anInt2173 = (int) ((double) this.anIntArray189[this.anInt2175] / 65536.0D * (double) arg0);
			if (this.anInt2173 > this.anInt2171) {
				this.anInt2174 = ((this.anIntArray190[this.anInt2175] << 15) - this.anInt2172) / (this.anInt2173 - this.anInt2171);
			}
		}
		this.anInt2172 += this.anInt2174;
		this.anInt2171++;
		return this.anInt2172 - this.anInt2174 >> 15;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pi;)V")
	public void method1849(@OriginalArg(0) Class4_Sub24 arg0) {
		this.anInt2167 = arg0.method3110();
		this.anInt2168 = arg0.method3084();
		this.anInt2169 = arg0.method3084();
		this.method1850(arg0);
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(Lclient!pi;)V")
	public void method1850(@OriginalArg(0) Class4_Sub24 arg0) {
		this.anInt2170 = arg0.method3110();
		this.anIntArray189 = new int[this.anInt2170];
		this.anIntArray190 = new int[this.anInt2170];
		for (@Pc(16) int local16 = 0; local16 < this.anInt2170; local16++) {
			this.anIntArray189[local16] = arg0.method3085();
			this.anIntArray190[local16] = arg0.method3085();
		}
	}
}
