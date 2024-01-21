import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class42 {

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
	public int anInt1725;

	@OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
	public int anInt1727;

	@OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
	public int anInt1728;

	@OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
	private int anInt1729;

	@OriginalMember(owner = "client!ii", name = "h", descriptor = "I")
	private int anInt1730;

	@OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
	private int anInt1731;

	@OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
	private int anInt1732;

	@OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
	private int anInt1733;

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
	private int anInt1726 = 2;

	@OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
	private int[] anIntArray213 = new int[2];

	@OriginalMember(owner = "client!ii", name = "f", descriptor = "[I")
	private int[] anIntArray214 = new int[2];

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class42() {
		this.anIntArray213[0] = 0;
		this.anIntArray213[1] = 65535;
		this.anIntArray214[0] = 0;
		this.anIntArray214[1] = 65535;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)I")
	public int method1195(@OriginalArg(0) int arg0) {
		if (this.anInt1733 >= this.anInt1729) {
			this.anInt1730 = this.anIntArray214[this.anInt1732++] << 15;
			if (this.anInt1732 >= this.anInt1726) {
				this.anInt1732 = this.anInt1726 - 1;
			}
			this.anInt1729 = (int) ((double) this.anIntArray213[this.anInt1732] / 65536.0D * (double) arg0);
			if (this.anInt1729 > this.anInt1733) {
				this.anInt1731 = ((this.anIntArray214[this.anInt1732] << 15) - this.anInt1730) / (this.anInt1729 - this.anInt1733);
			}
		}
		this.anInt1730 += this.anInt1731;
		this.anInt1733++;
		return this.anInt1730 - this.anInt1731 >> 15;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lclient!mb;)V")
	public void method1196(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt1726 = arg0.method2107();
		this.anIntArray213 = new int[this.anInt1726];
		this.anIntArray214 = new int[this.anInt1726];
		for (@Pc(16) int local16 = 0; local16 < this.anInt1726; local16++) {
			this.anIntArray213[local16] = arg0.method2111();
			this.anIntArray214[local16] = arg0.method2111();
		}
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "()V")
	public void method1197() {
		this.anInt1729 = 0;
		this.anInt1732 = 0;
		this.anInt1731 = 0;
		this.anInt1730 = 0;
		this.anInt1733 = 0;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(Lclient!mb;)V")
	public void method1198(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt1725 = arg0.method2107();
		this.anInt1728 = arg0.method2132();
		this.anInt1727 = arg0.method2132();
		this.method1196(arg0);
	}
}
