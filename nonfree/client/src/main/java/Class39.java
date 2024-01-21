import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VJXKRAVR")
public final class Class39 {

	@OriginalMember(owner = "client!VJXKRAVR", name = "c", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!VJXKRAVR", name = "d", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!VJXKRAVR", name = "e", descriptor = "[I")
	private int[] anIntArray195;

	@OriginalMember(owner = "client!VJXKRAVR", name = "f", descriptor = "[I")
	private int[] anIntArray196;

	@OriginalMember(owner = "client!VJXKRAVR", name = "g", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!VJXKRAVR", name = "h", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!VJXKRAVR", name = "i", descriptor = "I")
	public int anInt722;

	@OriginalMember(owner = "client!VJXKRAVR", name = "j", descriptor = "I")
	private int anInt723;

	@OriginalMember(owner = "client!VJXKRAVR", name = "k", descriptor = "I")
	private int anInt724;

	@OriginalMember(owner = "client!VJXKRAVR", name = "l", descriptor = "I")
	private int anInt725;

	@OriginalMember(owner = "client!VJXKRAVR", name = "m", descriptor = "I")
	private int anInt726;

	@OriginalMember(owner = "client!VJXKRAVR", name = "n", descriptor = "I")
	private int anInt727;

	@OriginalMember(owner = "client!VJXKRAVR", name = "a", descriptor = "Z")
	private boolean aBoolean191 = false;

	@OriginalMember(owner = "client!VJXKRAVR", name = "b", descriptor = "B")
	private byte aByte36 = 6;

	@OriginalMember(owner = "client!VJXKRAVR", name = "a", descriptor = "(Lclient!MLYYHULT;B)V")
	public void method527(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			this.anInt722 = arg0.method200();
			this.anInt720 = arg0.method205();
			this.anInt721 = arg0.method205();
			this.method528(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("62188, " + arg0 + ", " + 2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJXKRAVR", name = "a", descriptor = "(Lclient!MLYYHULT;I)V")
	public void method528(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			this.anInt719 = arg0.method200();
			this.anIntArray195 = new int[this.anInt719];
			this.anIntArray196 = new int[this.anInt719];
			for (@Pc(21) int local21 = 0; local21 < this.anInt719; local21++) {
				this.anIntArray195[local21] = arg0.method202();
				this.anIntArray196[local21] = arg0.method202();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("3311, " + arg0 + ", " + -39134 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJXKRAVR", name = "a", descriptor = "(I)V")
	public void method529() {
		try {
			this.anInt723 = 0;
			this.anInt724 = 0;
			this.anInt725 = 0;
			this.anInt726 = 0;
			this.anInt727 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("31090, " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VJXKRAVR", name = "a", descriptor = "(BI)I")
	public int method530(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt727 >= this.anInt723) {
				this.anInt726 = this.anIntArray196[this.anInt724++] << 15;
				if (this.anInt724 >= this.anInt719) {
					this.anInt724 = this.anInt719 - 1;
				}
				this.anInt723 = (int) ((double) this.anIntArray195[this.anInt724] / 65536.0D * (double) arg1);
				if (this.anInt723 > this.anInt727) {
					this.anInt725 = ((this.anIntArray196[this.anInt724] << 15) - this.anInt726) / (this.anInt723 - this.anInt727);
				}
			}
			this.anInt726 += this.anInt725;
			this.anInt727++;
			if (arg0 == this.aByte36) {
				@Pc(87) boolean local87 = false;
			} else {
				for (@Pc(91) int local91 = 1; local91 > 0; local91++) {
				}
			}
			return this.anInt726 - this.anInt725 >> 15;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("55802, " + arg0 + ", " + arg1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}
}
