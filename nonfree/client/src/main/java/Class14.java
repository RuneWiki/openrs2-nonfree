import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ENGZWEMK")
public final class Class14 {

	@OriginalMember(owner = "client!ENGZWEMK", name = "d", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ENGZWEMK", name = "e", descriptor = "[I")
	private int[] anIntArray46;

	@OriginalMember(owner = "client!ENGZWEMK", name = "f", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!ENGZWEMK", name = "g", descriptor = "I")
	public int anInt149;

	@OriginalMember(owner = "client!ENGZWEMK", name = "h", descriptor = "I")
	public int anInt150;

	@OriginalMember(owner = "client!ENGZWEMK", name = "i", descriptor = "I")
	public int anInt151;

	@OriginalMember(owner = "client!ENGZWEMK", name = "j", descriptor = "I")
	private int anInt152;

	@OriginalMember(owner = "client!ENGZWEMK", name = "k", descriptor = "I")
	private int anInt153;

	@OriginalMember(owner = "client!ENGZWEMK", name = "l", descriptor = "I")
	private int anInt154;

	@OriginalMember(owner = "client!ENGZWEMK", name = "m", descriptor = "I")
	private int anInt155;

	@OriginalMember(owner = "client!ENGZWEMK", name = "n", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!ENGZWEMK", name = "a", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!ENGZWEMK", name = "b", descriptor = "I")
	private int anInt147 = 649;

	@OriginalMember(owner = "client!ENGZWEMK", name = "c", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!ENGZWEMK", name = "a", descriptor = "(Lclient!PKHWFJLM;Z)V")
	public void method102(@OriginalArg(0) Class5_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt151 = arg0.method240();
			this.anInt149 = arg0.method245();
			this.anInt150 = arg0.method245();
			this.method103(arg0);
			if (!arg1) {
				this.aBoolean46 = !this.aBoolean46;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("54660, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENGZWEMK", name = "b", descriptor = "(Lclient!PKHWFJLM;Z)V")
	public void method103(@OriginalArg(0) Class5_Sub1_Sub4 arg0) {
		try {
			this.anInt148 = arg0.method240();
			this.anIntArray46 = new int[this.anInt148];
			this.anIntArray47 = new int[this.anInt148];
			for (@Pc(20) int local20 = 0; local20 < this.anInt148; local20++) {
				this.anIntArray46[local20] = arg0.method242();
				this.anIntArray47[local20] = arg0.method242();
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("75020, " + arg0 + ", " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENGZWEMK", name = "a", descriptor = "(B)V")
	public void method104() {
		try {
			this.anInt152 = 0;
			this.anInt153 = 0;
			this.anInt154 = 0;
			this.anInt155 = 0;
			this.anInt156 = 0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("40261, " + -88 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ENGZWEMK", name = "a", descriptor = "(II)I")
	public int method105(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt156 >= this.anInt152) {
				this.anInt155 = this.anIntArray47[this.anInt153++] << 15;
				if (this.anInt153 >= this.anInt148) {
					this.anInt153 = this.anInt148 - 1;
				}
				this.anInt152 = (int) ((double) this.anIntArray46[this.anInt153] / 65536.0D * (double) arg0);
				if (this.anInt152 > this.anInt156) {
					this.anInt154 = ((this.anIntArray47[this.anInt153] << 15) - this.anInt155) / (this.anInt152 - this.anInt156);
				}
			}
			this.anInt155 += this.anInt154;
			this.anInt156++;
			return this.anInt155 - this.anInt154 >> 15;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("17027, " + 9 + ", " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}
}
