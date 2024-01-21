import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UHTSXKVU")
public final class Class38 {

	@OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "I")
	private int anInt625;

	@OriginalMember(owner = "client!UHTSXKVU", name = "b", descriptor = "I")
	private int anInt626;

	@OriginalMember(owner = "client!UHTSXKVU", name = "c", descriptor = "[I")
	private int[] anIntArray125;

	@OriginalMember(owner = "client!UHTSXKVU", name = "d", descriptor = "[I")
	private int[] anIntArray126;

	@OriginalMember(owner = "client!UHTSXKVU", name = "e", descriptor = "I")
	public int anInt627;

	@OriginalMember(owner = "client!UHTSXKVU", name = "f", descriptor = "I")
	public int anInt628;

	@OriginalMember(owner = "client!UHTSXKVU", name = "g", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!UHTSXKVU", name = "h", descriptor = "I")
	private int anInt630;

	@OriginalMember(owner = "client!UHTSXKVU", name = "i", descriptor = "I")
	private int anInt631;

	@OriginalMember(owner = "client!UHTSXKVU", name = "j", descriptor = "I")
	private int anInt632;

	@OriginalMember(owner = "client!UHTSXKVU", name = "k", descriptor = "I")
	private int anInt633;

	@OriginalMember(owner = "client!UHTSXKVU", name = "l", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(Lclient!RSWRPCHR;B)V")
	public void method398(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt629 = arg0.method340();
			this.anInt627 = arg0.method345();
			this.anInt628 = arg0.method345();
			this.method399(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("77103, " + arg0 + ", " + 46 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(Lclient!RSWRPCHR;I)V")
	public void method399(@OriginalArg(0) Class2_Sub1_Sub4 arg0) {
		try {
			this.anInt626 = arg0.method340();
			this.anIntArray125 = new int[this.anInt626];
			this.anIntArray126 = new int[this.anInt626];
			for (@Pc(21) int local21 = 0; local21 < this.anInt626; local21++) {
				this.anIntArray125[local21] = arg0.method342();
				this.anIntArray126[local21] = arg0.method342();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("37889, " + arg0 + ", " + -7641 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(I)V")
	public void method400() {
		try {
			this.anInt630 = 0;
			this.anInt631 = 0;
			this.anInt632 = 0;
			this.anInt633 = 0;
			this.anInt634 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("3272, " + -33980 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UHTSXKVU", name = "a", descriptor = "(II)I")
	public int method401(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt634 >= this.anInt630) {
				this.anInt633 = this.anIntArray126[this.anInt631++] << 15;
				if (this.anInt631 >= this.anInt626) {
					this.anInt631 = this.anInt626 - 1;
				}
				this.anInt630 = (int) ((double) this.anIntArray125[this.anInt631] / 65536.0D * (double) arg0);
				if (this.anInt630 > this.anInt634) {
					this.anInt632 = ((this.anIntArray126[this.anInt631] << 15) - this.anInt633) / (this.anInt630 - this.anInt634);
				}
			}
			this.anInt633 += this.anInt632;
			this.anInt634++;
			return this.anInt633 - this.anInt632 >> 15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("95418, " + 0 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}
}
