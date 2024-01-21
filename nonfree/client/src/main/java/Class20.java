import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MMADHCLT")
public final class Class20 {

	@OriginalMember(owner = "client!MMADHCLT", name = "f", descriptor = "I")
	private int anInt444;

	@OriginalMember(owner = "client!MMADHCLT", name = "g", descriptor = "[I")
	private int[] anIntArray97;

	@OriginalMember(owner = "client!MMADHCLT", name = "h", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!MMADHCLT", name = "i", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!MMADHCLT", name = "j", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!MMADHCLT", name = "k", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!MMADHCLT", name = "l", descriptor = "I")
	private int anInt448;

	@OriginalMember(owner = "client!MMADHCLT", name = "m", descriptor = "I")
	private int anInt449;

	@OriginalMember(owner = "client!MMADHCLT", name = "n", descriptor = "I")
	private int anInt450;

	@OriginalMember(owner = "client!MMADHCLT", name = "o", descriptor = "I")
	private int anInt451;

	@OriginalMember(owner = "client!MMADHCLT", name = "p", descriptor = "I")
	private int anInt452;

	@OriginalMember(owner = "client!MMADHCLT", name = "a", descriptor = "I")
	private int anInt440 = 1;

	@OriginalMember(owner = "client!MMADHCLT", name = "b", descriptor = "I")
	private int anInt441 = -799;

	@OriginalMember(owner = "client!MMADHCLT", name = "c", descriptor = "I")
	private int anInt442 = 3;

	@OriginalMember(owner = "client!MMADHCLT", name = "d", descriptor = "I")
	private int anInt443 = 18;

	@OriginalMember(owner = "client!MMADHCLT", name = "e", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!MMADHCLT", name = "a", descriptor = "(ILclient!UAWAYCTK;)V")
	public void method283(@OriginalArg(1) Class6_Sub2_Sub3 arg0) {
		try {
			this.anInt447 = arg0.method402();
			this.anInt445 = arg0.method407();
			this.anInt446 = arg0.method407();
			this.method284(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("34979, " + -7321 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMADHCLT", name = "a", descriptor = "(Lclient!UAWAYCTK;I)V")
	public void method284(@OriginalArg(0) Class6_Sub2_Sub3 arg0) {
		try {
			this.anInt444 = arg0.method402();
			this.anIntArray97 = new int[this.anInt444];
			this.anIntArray98 = new int[this.anInt444];
			for (@Pc(25) int local25 = 0; local25 < this.anInt444; local25++) {
				this.anIntArray97[local25] = arg0.method404();
				this.anIntArray98[local25] = arg0.method404();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("41290, " + arg0 + ", " + -799 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMADHCLT", name = "a", descriptor = "(I)V")
	public void method285() {
		try {
			this.anInt448 = 0;
			this.anInt449 = 0;
			if (this.anInt442 > 3 || this.anInt442 < 3) {
				for (@Pc(15) int local15 = 1; local15 > 0; local15++) {
				}
			}
			this.anInt450 = 0;
			this.anInt451 = 0;
			this.anInt452 = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("6947, " + 3 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MMADHCLT", name = "a", descriptor = "(BI)I")
	public int method286(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt452 >= this.anInt448) {
				this.anInt451 = this.anIntArray98[this.anInt449++] << 15;
				if (this.anInt449 >= this.anInt444) {
					this.anInt449 = this.anInt444 - 1;
				}
				this.anInt448 = (int) ((double) this.anIntArray97[this.anInt449] / 65536.0D * (double) arg1);
				if (this.anInt448 > this.anInt452) {
					this.anInt450 = ((this.anIntArray98[this.anInt449] << 15) - this.anInt451) / (this.anInt448 - this.anInt452);
				}
			}
			this.anInt451 += this.anInt450;
			@Pc(78) boolean local78 = false;
			this.anInt452++;
			return this.anInt451 - this.anInt450 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("28084, " + arg0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
