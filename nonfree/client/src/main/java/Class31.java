import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OZKFTHAD")
public final class Class31 {

	@OriginalMember(owner = "client!OZKFTHAD", name = "e", descriptor = "I")
	private int anInt586;

	@OriginalMember(owner = "client!OZKFTHAD", name = "f", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!OZKFTHAD", name = "g", descriptor = "[I")
	private int[] anIntArray109;

	@OriginalMember(owner = "client!OZKFTHAD", name = "h", descriptor = "I")
	public int anInt587;

	@OriginalMember(owner = "client!OZKFTHAD", name = "i", descriptor = "I")
	public int anInt588;

	@OriginalMember(owner = "client!OZKFTHAD", name = "j", descriptor = "I")
	public int anInt589;

	@OriginalMember(owner = "client!OZKFTHAD", name = "k", descriptor = "I")
	private int anInt590;

	@OriginalMember(owner = "client!OZKFTHAD", name = "l", descriptor = "I")
	private int anInt591;

	@OriginalMember(owner = "client!OZKFTHAD", name = "m", descriptor = "I")
	private int anInt592;

	@OriginalMember(owner = "client!OZKFTHAD", name = "n", descriptor = "I")
	private int anInt593;

	@OriginalMember(owner = "client!OZKFTHAD", name = "o", descriptor = "I")
	private int anInt594;

	@OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "Z")
	private boolean aBoolean147 = false;

	@OriginalMember(owner = "client!OZKFTHAD", name = "b", descriptor = "B")
	private byte aByte17 = -112;

	@OriginalMember(owner = "client!OZKFTHAD", name = "c", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!OZKFTHAD", name = "d", descriptor = "Z")
	private boolean aBoolean149 = true;

	@OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(ZLclient!MBMGIXGO;)V")
	public void method404(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt589 = arg0.method268();
			this.anInt587 = arg0.method273();
			this.anInt588 = arg0.method273();
			this.method405(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("70259, " + true + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(BLclient!MBMGIXGO;)V")
	public void method405(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			if (this.aByte17 != -112) {
				this.aBoolean148 = !this.aBoolean148;
			}
			this.anInt586 = arg0.method268();
			this.anIntArray108 = new int[this.anInt586];
			this.anIntArray109 = new int[this.anInt586];
			for (@Pc(27) int local27 = 0; local27 < this.anInt586; local27++) {
				this.anIntArray108[local27] = arg0.method270();
				this.anIntArray109[local27] = arg0.method270();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("22533, " + -112 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(B)V")
	public void method406(@OriginalArg(0) byte arg0) {
		try {
			this.anInt590 = 0;
			@Pc(7) boolean local7 = false;
			this.anInt591 = 0;
			this.anInt592 = 0;
			this.anInt593 = 0;
			this.anInt594 = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("98303, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OZKFTHAD", name = "a", descriptor = "(ZI)I")
	public int method407(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt594 >= this.anInt590) {
				this.anInt593 = this.anIntArray109[this.anInt591++] << 15;
				if (this.anInt591 >= this.anInt586) {
					this.anInt591 = this.anInt586 - 1;
				}
				this.anInt590 = (int) ((double) this.anIntArray108[this.anInt591] / 65536.0D * (double) arg0);
				if (this.anInt590 > this.anInt594) {
					this.anInt592 = ((this.anIntArray109[this.anInt591] << 15) - this.anInt593) / (this.anInt590 - this.anInt594);
				}
			}
			this.anInt593 += this.anInt592;
			this.anInt594++;
			return this.anInt593 - this.anInt592 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("64313, " + true + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
