import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XJOITHUI")
public final class Class45 {

	@OriginalMember(owner = "client!XJOITHUI", name = "c", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!XJOITHUI", name = "d", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!XJOITHUI", name = "e", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!XJOITHUI", name = "f", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!XJOITHUI", name = "g", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!XJOITHUI", name = "h", descriptor = "I")
	public int anInt748;

	@OriginalMember(owner = "client!XJOITHUI", name = "i", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!XJOITHUI", name = "j", descriptor = "I")
	private int anInt750;

	@OriginalMember(owner = "client!XJOITHUI", name = "k", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!XJOITHUI", name = "l", descriptor = "I")
	private int anInt752;

	@OriginalMember(owner = "client!XJOITHUI", name = "m", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!XJOITHUI", name = "a", descriptor = "I")
	private int anInt744 = 5;

	@OriginalMember(owner = "client!XJOITHUI", name = "b", descriptor = "B")
	private byte aByte28 = 5;

	@OriginalMember(owner = "client!XJOITHUI", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	public void method496(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			this.anInt748 = arg0.method22();
			this.anInt746 = arg0.method27();
			this.anInt747 = arg0.method27();
			this.method497(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("24311, " + 674 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJOITHUI", name = "a", descriptor = "(Lclient!BJPWOXRJ;B)V")
	public void method497(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			this.anInt745 = arg0.method22();
			this.anIntArray187 = new int[this.anInt745];
			@Pc(16) int local16;
			if (this.aByte28 != 5) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			this.anIntArray188 = new int[this.anInt745];
			for (local16 = 0; local16 < this.anInt745; local16++) {
				this.anIntArray187[local16] = arg0.method24();
				this.anIntArray188[local16] = arg0.method24();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("29970, " + arg0 + ", " + 5 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJOITHUI", name = "a", descriptor = "(I)V")
	public void method498() {
		try {
			this.anInt749 = 0;
			this.anInt750 = 0;
			this.anInt751 = 0;
			this.anInt752 = 0;
			this.anInt753 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("73259, " + 2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJOITHUI", name = "a", descriptor = "(ZI)I")
	public int method499(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt753 >= this.anInt749) {
				this.anInt752 = this.anIntArray188[this.anInt750++] << 15;
				if (this.anInt750 >= this.anInt745) {
					this.anInt750 = this.anInt745 - 1;
				}
				this.anInt749 = (int) ((double) this.anIntArray187[this.anInt750] / 65536.0D * (double) arg1);
				if (this.anInt749 > this.anInt753) {
					this.anInt751 = ((this.anIntArray188[this.anInt750] << 15) - this.anInt752) / (this.anInt749 - this.anInt753);
				}
			}
			this.anInt752 += this.anInt751;
			if (arg0) {
				this.anInt744 = -391;
			}
			this.anInt753++;
			return this.anInt752 - this.anInt751 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("92507, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
