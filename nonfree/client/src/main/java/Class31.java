import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TMVRZUVH")
public final class Class31 {

	@OriginalMember(owner = "client!TMVRZUVH", name = "c", descriptor = "I")
	private int anInt678;

	@OriginalMember(owner = "client!TMVRZUVH", name = "d", descriptor = "[I")
	private int[] anIntArray169;

	@OriginalMember(owner = "client!TMVRZUVH", name = "e", descriptor = "[I")
	private int[] anIntArray170;

	@OriginalMember(owner = "client!TMVRZUVH", name = "f", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!TMVRZUVH", name = "g", descriptor = "I")
	public int anInt680;

	@OriginalMember(owner = "client!TMVRZUVH", name = "h", descriptor = "I")
	public int anInt681;

	@OriginalMember(owner = "client!TMVRZUVH", name = "i", descriptor = "I")
	private int anInt682;

	@OriginalMember(owner = "client!TMVRZUVH", name = "j", descriptor = "I")
	private int anInt683;

	@OriginalMember(owner = "client!TMVRZUVH", name = "k", descriptor = "I")
	private int anInt684;

	@OriginalMember(owner = "client!TMVRZUVH", name = "l", descriptor = "I")
	private int anInt685;

	@OriginalMember(owner = "client!TMVRZUVH", name = "m", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!TMVRZUVH", name = "a", descriptor = "I")
	private int anInt677 = 5;

	@OriginalMember(owner = "client!TMVRZUVH", name = "b", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!TMVRZUVH", name = "a", descriptor = "(Lclient!GHHPHSRU;I)V")
	public void method455(@OriginalArg(0) Class3_Sub1_Sub2 arg0) {
		try {
			this.anInt681 = arg0.method89();
			this.anInt679 = arg0.method94();
			this.anInt680 = arg0.method94();
			this.method456(arg0, (byte) 8);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("38769, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMVRZUVH", name = "a", descriptor = "(Lclient!GHHPHSRU;B)V")
	public void method456(@OriginalArg(0) Class3_Sub1_Sub2 arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt678 = arg0.method89();
			this.anIntArray169 = new int[this.anInt678];
			this.anIntArray170 = new int[this.anInt678];
			@Pc(20) boolean local20 = false;
			for (@Pc(27) int local27 = 0; local27 < this.anInt678; local27++) {
				this.anIntArray169[local27] = arg0.method91();
				this.anIntArray170[local27] = arg0.method91();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("92152, " + arg0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMVRZUVH", name = "a", descriptor = "(Z)V")
	public void method457(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt682 = 0;
			this.anInt683 = 0;
			this.anInt684 = 0;
			this.anInt685 = 0;
			this.anInt686 = 0;
			if (arg0) {
				;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("43235, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TMVRZUVH", name = "a", descriptor = "(ZI)I")
	public int method458(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt686 >= this.anInt682) {
				this.anInt685 = this.anIntArray170[this.anInt683++] << 15;
				if (this.anInt683 >= this.anInt678) {
					this.anInt683 = this.anInt678 - 1;
				}
				this.anInt682 = (int) ((double) this.anIntArray169[this.anInt683] / 65536.0D * (double) arg0);
				if (this.anInt682 > this.anInt686) {
					this.anInt684 = ((this.anIntArray170[this.anInt683] << 15) - this.anInt685) / (this.anInt682 - this.anInt686);
				}
			}
			this.anInt685 += this.anInt684;
			this.anInt686++;
			return this.anInt685 - this.anInt684 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("90204, " + true + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
