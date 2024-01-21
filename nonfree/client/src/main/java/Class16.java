import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HCHPPCNY")
public final class Class16 {

	@OriginalMember(owner = "client!HCHPPCNY", name = "d", descriptor = "I")
	private int anInt179;

	@OriginalMember(owner = "client!HCHPPCNY", name = "e", descriptor = "[I")
	private int[] anIntArray43;

	@OriginalMember(owner = "client!HCHPPCNY", name = "f", descriptor = "[I")
	private int[] anIntArray44;

	@OriginalMember(owner = "client!HCHPPCNY", name = "g", descriptor = "I")
	public int anInt180;

	@OriginalMember(owner = "client!HCHPPCNY", name = "h", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!HCHPPCNY", name = "i", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!HCHPPCNY", name = "j", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!HCHPPCNY", name = "k", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!HCHPPCNY", name = "l", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!HCHPPCNY", name = "m", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!HCHPPCNY", name = "n", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "I")
	private int anInt177 = 779;

	@OriginalMember(owner = "client!HCHPPCNY", name = "b", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!HCHPPCNY", name = "c", descriptor = "I")
	private int anInt178 = -48151;

	@OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(ILclient!BSNPYLEV;)V")
	public void method224(@OriginalArg(1) Class2_Sub1_Sub2 arg0) {
		try {
			this.anInt182 = arg0.method94();
			this.anInt180 = arg0.method99();
			this.anInt181 = arg0.method99();
			this.method225(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("32730, " + 7 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(Lclient!BSNPYLEV;I)V")
	public void method225(@OriginalArg(0) Class2_Sub1_Sub2 arg0) {
		try {
			this.anInt179 = arg0.method94();
			this.anIntArray43 = new int[this.anInt179];
			this.anIntArray44 = new int[this.anInt179];
			for (@Pc(15) int local15 = 0; local15 < this.anInt179; local15++) {
				this.anIntArray43[local15] = arg0.method96();
				this.anIntArray44[local15] = arg0.method96();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("50342, " + arg0 + ", " + 779 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(I)V")
	public void method226() {
		try {
			this.anInt183 = 0;
			this.anInt184 = 0;
			this.anInt185 = 0;
			this.anInt186 = 0;
			this.anInt187 = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68781, " + 7 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HCHPPCNY", name = "a", descriptor = "(IB)I")
	public int method227(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt187 >= this.anInt183) {
				this.anInt186 = this.anIntArray44[this.anInt184++] << 15;
				if (this.anInt184 >= this.anInt179) {
					this.anInt184 = this.anInt179 - 1;
				}
				this.anInt183 = (int) ((double) this.anIntArray43[this.anInt184] / 65536.0D * (double) arg0);
				if (this.anInt183 > this.anInt187) {
					this.anInt185 = ((this.anIntArray44[this.anInt184] << 15) - this.anInt186) / (this.anInt183 - this.anInt187);
				}
			}
			this.anInt186 += this.anInt185;
			this.anInt187++;
			return this.anInt186 - this.anInt185 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("53776, " + arg0 + ", " + 81 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
