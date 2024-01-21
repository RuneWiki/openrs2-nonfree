import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SHSBXUIJ")
public final class Class37 {

	@OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "I")
	private int anInt709;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "b", descriptor = "I")
	private int anInt710;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "c", descriptor = "[I")
	private int[] anIntArray192;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "d", descriptor = "[I")
	private int[] anIntArray193;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "e", descriptor = "I")
	public int anInt711;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "f", descriptor = "I")
	public int anInt712;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "g", descriptor = "I")
	public int anInt713;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "h", descriptor = "I")
	private int anInt714;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "i", descriptor = "I")
	private int anInt715;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "j", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "k", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "l", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(ILclient!RGCGKKUR;)V")
	public void method449(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			this.anInt713 = arg0.method411();
			this.anInt711 = arg0.method416();
			this.anInt712 = arg0.method416();
			this.method450(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("97637, " + 5 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHSBXUIJ", name = "b", descriptor = "(ILclient!RGCGKKUR;)V")
	public void method450(@OriginalArg(1) Class6_Sub1_Sub4 arg0) {
		try {
			this.anInt710 = arg0.method411();
			this.anIntArray192 = new int[this.anInt710];
			this.anIntArray193 = new int[this.anInt710];
			for (@Pc(15) int local15 = 0; local15 < this.anInt710; local15++) {
				this.anIntArray192[local15] = arg0.method413();
				this.anIntArray193[local15] = arg0.method413();
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("76751, " + 0 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(I)V")
	public void method451() {
		try {
			this.anInt714 = 0;
			this.anInt715 = 0;
			this.anInt716 = 0;
			this.anInt717 = 0;
			this.anInt718 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("49088, " + -560 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SHSBXUIJ", name = "a", descriptor = "(II)I")
	public int method452(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt718 >= this.anInt714) {
				this.anInt717 = this.anIntArray193[this.anInt715++] << 15;
				if (this.anInt715 >= this.anInt710) {
					this.anInt715 = this.anInt710 - 1;
				}
				this.anInt714 = (int) ((double) this.anIntArray192[this.anInt715] / 65536.0D * (double) arg0);
				if (this.anInt714 > this.anInt718) {
					this.anInt716 = ((this.anIntArray193[this.anInt715] << 15) - this.anInt717) / (this.anInt714 - this.anInt718);
				}
			}
			this.anInt717 += this.anInt716;
			this.anInt718++;
			return this.anInt717 - this.anInt716 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("61333, " + arg0 + ", " + -16419 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
