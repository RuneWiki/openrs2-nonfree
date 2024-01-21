import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class27 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public int anInt958;

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
	public int anInt959;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
	public int anInt960;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt961;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	private int anInt962;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	private int anInt963;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	private int anInt964;

	@OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
	private int anInt965;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	private int anInt957 = 2;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
	private int[] anIntArray160 = new int[2];

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "[I")
	private int[] anIntArray161 = new int[2];

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class27() {
		this.anIntArray160[0] = 0;
		this.anIntArray160[1] = 65535;
		this.anIntArray161[0] = 0;
		this.anIntArray161[1] = 65535;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!hb;)V")
	public void method692(@OriginalArg(0) Class5_Sub9 arg0) {
		this.anInt957 = arg0.method1408();
		this.anIntArray160 = new int[this.anInt957];
		this.anIntArray161 = new int[this.anInt957];
		for (@Pc(16) int local16 = 0; local16 < this.anInt957; local16++) {
			this.anIntArray160[local16] = arg0.method1418();
			this.anIntArray161[local16] = arg0.method1418();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	public void method693() {
		this.anInt961 = 0;
		this.anInt965 = 0;
		this.anInt963 = 0;
		this.anInt964 = 0;
		this.anInt962 = 0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
	public int method694(@OriginalArg(0) int arg0) {
		if (this.anInt962 >= this.anInt961) {
			this.anInt964 = this.anIntArray161[this.anInt965++] << 15;
			if (this.anInt965 >= this.anInt957) {
				this.anInt965 = this.anInt957 - 1;
			}
			this.anInt961 = (int) ((double) this.anIntArray160[this.anInt965] / 65536.0D * (double) arg0);
			if (this.anInt961 > this.anInt962) {
				this.anInt963 = ((this.anIntArray161[this.anInt965] << 15) - this.anInt964) / (this.anInt961 - this.anInt962);
			}
		}
		this.anInt964 += this.anInt963;
		this.anInt962++;
		return this.anInt964 - this.anInt963 >> 15;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(Lclient!hb;)V")
	public void method695(@OriginalArg(0) Class5_Sub9 arg0) {
		this.anInt959 = arg0.method1408();
		this.anInt960 = arg0.method1434();
		this.anInt958 = arg0.method1434();
		this.method692(arg0);
	}
}
