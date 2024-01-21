import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TPZZASFL")
public final class Class42 {

	@OriginalMember(owner = "client!TPZZASFL", name = "b", descriptor = "I")
	private int anInt747;

	@OriginalMember(owner = "client!TPZZASFL", name = "c", descriptor = "[I")
	private int[] anIntArray201;

	@OriginalMember(owner = "client!TPZZASFL", name = "d", descriptor = "[I")
	private int[] anIntArray202;

	@OriginalMember(owner = "client!TPZZASFL", name = "e", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!TPZZASFL", name = "f", descriptor = "I")
	public int anInt749;

	@OriginalMember(owner = "client!TPZZASFL", name = "g", descriptor = "I")
	public int anInt750;

	@OriginalMember(owner = "client!TPZZASFL", name = "h", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!TPZZASFL", name = "i", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!TPZZASFL", name = "j", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!TPZZASFL", name = "k", descriptor = "I")
	private int anInt754;

	@OriginalMember(owner = "client!TPZZASFL", name = "l", descriptor = "I")
	private int anInt755;

	@OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "I")
	private int anInt746 = 10831;

	@OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(ILclient!MVHXDWGI;)V")
	public void method541(@OriginalArg(1) Class1_Sub1_Sub4 arg0) {
		try {
			this.anInt750 = arg0.method294();
			this.anInt748 = arg0.method299();
			this.anInt749 = arg0.method299();
			this.method542(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("88898, " + 403 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(Lclient!MVHXDWGI;I)V")
	public void method542(@OriginalArg(0) Class1_Sub1_Sub4 arg0) {
		try {
			this.anInt747 = arg0.method294();
			this.anIntArray201 = new int[this.anInt747];
			this.anIntArray202 = new int[this.anInt747];
			if (this.anInt746 == 10831) {
				for (@Pc(20) int local20 = 0; local20 < this.anInt747; local20++) {
					this.anIntArray201[local20] = arg0.method296();
					this.anIntArray202[local20] = arg0.method296();
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("28810, " + arg0 + ", " + 10831 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(B)V")
	public void method543() {
		try {
			this.anInt751 = 0;
			this.anInt752 = 0;
			this.anInt753 = 0;
			this.anInt754 = 0;
			this.anInt755 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("31756, " + 2 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPZZASFL", name = "a", descriptor = "(IB)I")
	public int method544(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt755 >= this.anInt751) {
				this.anInt754 = this.anIntArray202[this.anInt752++] << 15;
				if (this.anInt752 >= this.anInt747) {
					this.anInt752 = this.anInt747 - 1;
				}
				this.anInt751 = (int) ((double) this.anIntArray201[this.anInt752] / 65536.0D * (double) arg0);
				if (this.anInt751 > this.anInt755) {
					this.anInt753 = ((this.anIntArray202[this.anInt752] << 15) - this.anInt754) / (this.anInt751 - this.anInt755);
				}
			}
			this.anInt754 += this.anInt753;
			this.anInt755++;
			return this.anInt754 - this.anInt753 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("95335, " + arg0 + ", " + 6 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
