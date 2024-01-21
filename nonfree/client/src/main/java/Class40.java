import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SSKEPHYP")
public final class Class40 {

	@OriginalMember(owner = "client!SSKEPHYP", name = "c", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!SSKEPHYP", name = "d", descriptor = "[I")
	private int[] anIntArray158;

	@OriginalMember(owner = "client!SSKEPHYP", name = "e", descriptor = "[I")
	private int[] anIntArray159;

	@OriginalMember(owner = "client!SSKEPHYP", name = "f", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!SSKEPHYP", name = "g", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!SSKEPHYP", name = "h", descriptor = "I")
	public int anInt631;

	@OriginalMember(owner = "client!SSKEPHYP", name = "i", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!SSKEPHYP", name = "j", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!SSKEPHYP", name = "k", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!SSKEPHYP", name = "l", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!SSKEPHYP", name = "m", descriptor = "I")
	private int anInt636;

	@OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "Z")
	private boolean aBoolean132 = true;

	@OriginalMember(owner = "client!SSKEPHYP", name = "b", descriptor = "I")
	private int anInt627 = 21057;

	@OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(Lclient!JHKSAGUC;I)V")
	public void method440(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt631 = arg0.method238();
			this.anInt629 = arg0.method243();
			this.anInt630 = arg0.method243();
			this.method441(arg0, 8);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("15429, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSKEPHYP", name = "b", descriptor = "(Lclient!JHKSAGUC;I)V")
	public void method441(@OriginalArg(0) Class1_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt628 = arg0.method238();
			this.anIntArray158 = new int[this.anInt628];
			this.anIntArray159 = new int[this.anInt628];
			@Pc(17) boolean local17 = true;
			for (@Pc(19) int local19 = 0; local19 < this.anInt628; local19++) {
				this.anIntArray158[local19] = arg0.method240();
				this.anIntArray159[local19] = arg0.method240();
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("5275, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(I)V")
	public void method442() {
		try {
			this.anInt632 = 0;
			this.anInt633 = 0;
			this.anInt634 = 0;
			this.anInt635 = 0;
			this.anInt636 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("37321, " + -580 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SSKEPHYP", name = "a", descriptor = "(IZ)I")
	public int method443(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt636 >= this.anInt632) {
				this.anInt635 = this.anIntArray159[this.anInt633++] << 15;
				if (this.anInt633 >= this.anInt628) {
					this.anInt633 = this.anInt628 - 1;
				}
				this.anInt632 = (int) ((double) this.anIntArray158[this.anInt633] / 65536.0D * (double) arg0);
				if (this.anInt632 > this.anInt636) {
					this.anInt634 = ((this.anIntArray159[this.anInt633] << 15) - this.anInt635) / (this.anInt632 - this.anInt636);
				}
			}
			this.anInt635 += this.anInt634;
			this.anInt636++;
			return this.anInt635 - this.anInt634 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("62002, " + arg0 + ", " + true + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
