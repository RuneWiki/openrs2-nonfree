import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ISLGIOFS")
public final class Class16 {

	@OriginalMember(owner = "client!ISLGIOFS", name = "c", descriptor = "I")
	private int anInt181;

	@OriginalMember(owner = "client!ISLGIOFS", name = "d", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!ISLGIOFS", name = "e", descriptor = "[I")
	private int[] anIntArray80;

	@OriginalMember(owner = "client!ISLGIOFS", name = "f", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!ISLGIOFS", name = "g", descriptor = "I")
	public int anInt183;

	@OriginalMember(owner = "client!ISLGIOFS", name = "h", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!ISLGIOFS", name = "i", descriptor = "I")
	private int anInt185;

	@OriginalMember(owner = "client!ISLGIOFS", name = "j", descriptor = "I")
	private int anInt186;

	@OriginalMember(owner = "client!ISLGIOFS", name = "k", descriptor = "I")
	private int anInt187;

	@OriginalMember(owner = "client!ISLGIOFS", name = "l", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!ISLGIOFS", name = "m", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "Z")
	private boolean aBoolean88 = false;

	@OriginalMember(owner = "client!ISLGIOFS", name = "b", descriptor = "I")
	private int anInt180 = -5335;

	@OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(ILclient!EMWAMCXW;)V")
	public void method179(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			this.anInt184 = arg0.method97();
			this.anInt182 = arg0.method102();
			this.anInt183 = arg0.method102();
			this.method180(arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("60842, " + 1016 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISLGIOFS", name = "b", descriptor = "(ILclient!EMWAMCXW;)V")
	public void method180(@OriginalArg(1) Class2_Sub1_Sub3 arg0) {
		try {
			this.anInt181 = arg0.method97();
			this.anIntArray79 = new int[this.anInt181];
			if (this.anInt180 != -5335) {
				this.aBoolean88 = !this.aBoolean88;
			}
			this.anIntArray80 = new int[this.anInt181];
			for (@Pc(27) int local27 = 0; local27 < this.anInt181; local27++) {
				this.anIntArray79[local27] = arg0.method99();
				this.anIntArray80[local27] = arg0.method99();
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("47349, " + -5335 + ", " + arg0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(I)V")
	public void method181() {
		try {
			this.anInt185 = 0;
			this.anInt186 = 0;
			this.anInt187 = 0;
			this.anInt188 = 0;
			this.anInt189 = 0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("34076, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISLGIOFS", name = "a", descriptor = "(II)I")
	public int method182(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt189 >= this.anInt185) {
				this.anInt188 = this.anIntArray80[this.anInt186++] << 15;
				if (this.anInt186 >= this.anInt181) {
					this.anInt186 = this.anInt181 - 1;
				}
				this.anInt185 = (int) ((double) this.anIntArray79[this.anInt186] / 65536.0D * (double) arg0);
				if (this.anInt185 > this.anInt189) {
					this.anInt187 = ((this.anIntArray80[this.anInt186] << 15) - this.anInt188) / (this.anInt185 - this.anInt189);
				}
			}
			this.anInt188 += this.anInt187;
			this.anInt189++;
			return this.anInt188 - this.anInt187 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("42987, " + 510 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
