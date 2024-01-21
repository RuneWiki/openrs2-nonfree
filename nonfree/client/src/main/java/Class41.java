import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UPKVWWFD")
public final class Class41 {

	@OriginalMember(owner = "client!UPKVWWFD", name = "b", descriptor = "I")
	private int anInt735;

	@OriginalMember(owner = "client!UPKVWWFD", name = "e", descriptor = "I")
	private int anInt737;

	@OriginalMember(owner = "client!UPKVWWFD", name = "f", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!UPKVWWFD", name = "g", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!UPKVWWFD", name = "h", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!UPKVWWFD", name = "i", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!UPKVWWFD", name = "j", descriptor = "I")
	public int anInt740;

	@OriginalMember(owner = "client!UPKVWWFD", name = "k", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!UPKVWWFD", name = "l", descriptor = "I")
	private int anInt742;

	@OriginalMember(owner = "client!UPKVWWFD", name = "m", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!UPKVWWFD", name = "n", descriptor = "I")
	private int anInt744;

	@OriginalMember(owner = "client!UPKVWWFD", name = "o", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!UPKVWWFD", name = "a", descriptor = "I")
	private int anInt734 = 28175;

	@OriginalMember(owner = "client!UPKVWWFD", name = "c", descriptor = "B")
	private byte aByte25 = 3;

	@OriginalMember(owner = "client!UPKVWWFD", name = "d", descriptor = "I")
	private int anInt736 = 202;

	@OriginalMember(owner = "client!UPKVWWFD", name = "a", descriptor = "(Lclient!EGCCHUZS;Z)V")
	public void method521(@OriginalArg(0) Class4_Sub1_Sub3 arg0) {
		try {
			this.anInt740 = arg0.method167();
			this.anInt738 = arg0.method172();
			this.anInt739 = arg0.method172();
			this.method522(arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("31369, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UPKVWWFD", name = "a", descriptor = "(ILclient!EGCCHUZS;)V")
	public void method522(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			this.anInt737 = arg0.method167();
			this.anIntArray193 = new int[this.anInt737];
			this.anIntArray194 = new int[this.anInt737];
			for (@Pc(24) int local24 = 0; local24 < this.anInt737; local24++) {
				this.anIntArray193[local24] = arg0.method169();
				this.anIntArray194[local24] = arg0.method169();
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("8529, " + -267 + ", " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UPKVWWFD", name = "a", descriptor = "(B)V")
	public void method523() {
		try {
			this.anInt741 = 0;
			this.anInt742 = 0;
			this.anInt743 = 0;
			if (this.aByte25 != 3) {
				this.anInt734 = 419;
			}
			this.anInt744 = 0;
			this.anInt745 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("3120, " + 3 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UPKVWWFD", name = "a", descriptor = "(II)I")
	public int method524(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt745 >= this.anInt741) {
				this.anInt744 = this.anIntArray194[this.anInt742++] << 15;
				if (this.anInt742 >= this.anInt737) {
					this.anInt742 = this.anInt737 - 1;
				}
				this.anInt741 = (int) ((double) this.anIntArray193[this.anInt742] / 65536.0D * (double) arg0);
				if (this.anInt741 > this.anInt745) {
					this.anInt743 = ((this.anIntArray194[this.anInt742] << 15) - this.anInt744) / (this.anInt741 - this.anInt745);
				}
			}
			this.anInt744 += this.anInt743;
			this.anInt745++;
			return this.anInt744 - this.anInt743 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("45118, " + arg0 + ", " + 202 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
