import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NXAZLFDC")
public final class Class27 {

	@OriginalMember(owner = "client!NXAZLFDC", name = "c", descriptor = "I")
	private int anInt520;

	@OriginalMember(owner = "client!NXAZLFDC", name = "d", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!NXAZLFDC", name = "e", descriptor = "[I")
	private int[] anIntArray127;

	@OriginalMember(owner = "client!NXAZLFDC", name = "f", descriptor = "I")
	public int anInt521;

	@OriginalMember(owner = "client!NXAZLFDC", name = "g", descriptor = "I")
	public int anInt522;

	@OriginalMember(owner = "client!NXAZLFDC", name = "h", descriptor = "I")
	public int anInt523;

	@OriginalMember(owner = "client!NXAZLFDC", name = "i", descriptor = "I")
	private int anInt524;

	@OriginalMember(owner = "client!NXAZLFDC", name = "j", descriptor = "I")
	private int anInt525;

	@OriginalMember(owner = "client!NXAZLFDC", name = "k", descriptor = "I")
	private int anInt526;

	@OriginalMember(owner = "client!NXAZLFDC", name = "l", descriptor = "I")
	private int anInt527;

	@OriginalMember(owner = "client!NXAZLFDC", name = "m", descriptor = "I")
	private int anInt528;

	@OriginalMember(owner = "client!NXAZLFDC", name = "a", descriptor = "I")
	private int anInt519 = 16191;

	@OriginalMember(owner = "client!NXAZLFDC", name = "b", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "client!NXAZLFDC", name = "a", descriptor = "(Lclient!LDILQFVA;I)V")
	public void method473(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt523 = arg0.method359();
			if (this.anInt519 != 16191) {
				this.aBoolean142 = !this.aBoolean142;
			}
			this.anInt521 = arg0.method364();
			this.anInt522 = arg0.method364();
			this.method474(arg0);
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("13165, " + arg0 + ", " + 16191 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXAZLFDC", name = "a", descriptor = "(Lclient!LDILQFVA;Z)V")
	public void method474(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt520 = arg0.method359();
			this.anIntArray126 = new int[this.anInt520];
			this.anIntArray127 = new int[this.anInt520];
			for (@Pc(25) int local25 = 0; local25 < this.anInt520; local25++) {
				this.anIntArray126[local25] = arg0.method361();
				this.anIntArray127[local25] = arg0.method361();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("56967, " + arg0 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXAZLFDC", name = "a", descriptor = "(I)V")
	public void method475() {
		try {
			this.anInt524 = 0;
			this.anInt525 = 0;
			this.anInt526 = 0;
			this.anInt527 = 0;
			this.anInt528 = 0;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("31064, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NXAZLFDC", name = "a", descriptor = "(IB)I")
	public int method476(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt528 >= this.anInt524) {
				this.anInt527 = this.anIntArray127[this.anInt525++] << 15;
				if (this.anInt525 >= this.anInt520) {
					this.anInt525 = this.anInt520 - 1;
				}
				this.anInt524 = (int) ((double) this.anIntArray126[this.anInt525] / 65536.0D * (double) arg0);
				if (this.anInt524 > this.anInt528) {
					this.anInt526 = ((this.anIntArray127[this.anInt525] << 15) - this.anInt527) / (this.anInt524 - this.anInt528);
				}
			}
			this.anInt527 += this.anInt526;
			this.anInt528++;
			return this.anInt527 - this.anInt526 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("17357, " + arg0 + ", " + -106 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
