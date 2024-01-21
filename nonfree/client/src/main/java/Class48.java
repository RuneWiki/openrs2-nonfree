import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZBHVITZX")
public final class Class48 {

	@OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!ZBHVITZX", name = "c", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!ZBHVITZX", name = "d", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!ZBHVITZX", name = "e", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!ZBHVITZX", name = "f", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!ZBHVITZX", name = "g", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!ZBHVITZX", name = "h", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!ZBHVITZX", name = "i", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!ZBHVITZX", name = "j", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!ZBHVITZX", name = "k", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!ZBHVITZX", name = "l", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!ZBHVITZX", name = "m", descriptor = "I")
	private int anInt726;

	@OriginalMember(owner = "client!ZBHVITZX", name = "b", descriptor = "I")
	private int anInt717 = 4;

	@OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(Lclient!LBBVYYXO;B)V")
	public void method518(@OriginalArg(0) Class2_Sub1_Sub3 arg0) {
		try {
			this.anInt721 = arg0.method267();
			this.anInt719 = arg0.method272();
			this.anInt720 = arg0.method272();
			this.method519(arg0, this.anInt716);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64491, " + arg0 + ", " + 59 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(Lclient!LBBVYYXO;I)V")
	public void method519(@OriginalArg(0) Class2_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt718 = arg0.method267();
			this.anIntArray176 = new int[this.anInt718];
			if (arg1 == 0) {
				this.anIntArray177 = new int[this.anInt718];
				for (@Pc(18) int local18 = 0; local18 < this.anInt718; local18++) {
					this.anIntArray176[local18] = arg0.method269();
					this.anIntArray177[local18] = arg0.method269();
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("80542, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(B)V")
	public void method520() {
		try {
			this.anInt722 = 0;
			this.anInt723 = 0;
			this.anInt724 = 0;
			this.anInt725 = 0;
			this.anInt726 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("93860, " + 2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZBHVITZX", name = "a", descriptor = "(II)I")
	public int method521(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt726 >= this.anInt722) {
				this.anInt725 = this.anIntArray177[this.anInt723++] << 15;
				if (this.anInt723 >= this.anInt718) {
					this.anInt723 = this.anInt718 - 1;
				}
				this.anInt722 = (int) ((double) this.anIntArray176[this.anInt723] / 65536.0D * (double) arg0);
				if (this.anInt722 > this.anInt726) {
					this.anInt724 = ((this.anIntArray177[this.anInt723] << 15) - this.anInt725) / (this.anInt722 - this.anInt726);
				}
			}
			this.anInt725 += this.anInt724;
			this.anInt726++;
			return this.anInt725 - this.anInt724 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("58117, " + arg0 + ", " + -783 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
