import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FGSQUADF")
public final class Class10 {

	@OriginalMember(owner = "client!FGSQUADF", name = "b", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!FGSQUADF", name = "c", descriptor = "[I")
	private int[] anIntArray39;

	@OriginalMember(owner = "client!FGSQUADF", name = "d", descriptor = "[I")
	private int[] anIntArray40;

	@OriginalMember(owner = "client!FGSQUADF", name = "e", descriptor = "I")
	public int anInt188;

	@OriginalMember(owner = "client!FGSQUADF", name = "f", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!FGSQUADF", name = "g", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!FGSQUADF", name = "h", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!FGSQUADF", name = "i", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!FGSQUADF", name = "j", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!FGSQUADF", name = "k", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!FGSQUADF", name = "l", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "I")
	private int anInt186 = 4;

	@OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(BLclient!NQUAUMDT;)V")
	public void method61(@OriginalArg(0) byte arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			this.anInt190 = arg1.method262();
			this.anInt188 = arg1.method267();
			@Pc(12) boolean local12 = false;
			this.anInt189 = arg1.method267();
			this.method62(674, arg1);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("53368, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(ILclient!NQUAUMDT;)V")
	public void method62(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3 arg1) {
		try {
			this.anInt187 = arg1.method262();
			this.anIntArray39 = new int[this.anInt187];
			this.anIntArray40 = new int[this.anInt187];
			for (@Pc(15) int local15 = 0; local15 < this.anInt187; local15++) {
				this.anIntArray39[local15] = arg1.method264();
				this.anIntArray40[local15] = arg1.method264();
			}
			@Pc(38) boolean local38 = false;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("89793, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(Z)V")
	public void method63() {
		try {
			this.anInt191 = 0;
			this.anInt192 = 0;
			this.anInt193 = 0;
			this.anInt194 = 0;
			this.anInt195 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48561, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FGSQUADF", name = "a", descriptor = "(IZ)I")
	public int method64(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt195 >= this.anInt191) {
				this.anInt194 = this.anIntArray40[this.anInt192++] << 15;
				if (this.anInt192 >= this.anInt187) {
					this.anInt192 = this.anInt187 - 1;
				}
				this.anInt191 = (int) ((double) this.anIntArray39[this.anInt192] / 65536.0D * (double) arg0);
				if (this.anInt191 > this.anInt195) {
					this.anInt193 = ((this.anIntArray40[this.anInt192] << 15) - this.anInt194) / (this.anInt191 - this.anInt195);
				}
			}
			this.anInt194 += this.anInt193;
			this.anInt195++;
			return this.anInt194 - this.anInt193 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("51736, " + arg0 + ", " + false + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
