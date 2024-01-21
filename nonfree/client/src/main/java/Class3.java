import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt198;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public int anInt199;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	public int anInt200;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt203;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private int anInt204;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	private int anInt205;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt196 = -491;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!mb;)V")
	public void method48(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt200 = arg0.method467();
			this.anInt198 = arg0.method472();
			this.anInt199 = arg0.method472();
			this.anInt197 = arg0.method467();
			this.anIntArray11 = new int[this.anInt197];
			this.anIntArray12 = new int[this.anInt197];
			for (@Pc(29) int local29 = 0; local29 < this.anInt197; local29++) {
				this.anIntArray11[local29] = arg0.method469();
				this.anIntArray12[local29] = arg0.method469();
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("8119, " + false + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method49() {
		try {
			this.anInt201 = 0;
			this.anInt202 = 0;
			this.anInt203 = 0;
			this.anInt204 = 0;
			this.anInt205 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("45199, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)I")
	public int method50(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt205 >= this.anInt201) {
				this.anInt204 = this.anIntArray12[this.anInt202++] << 15;
				if (this.anInt202 >= this.anInt197) {
					this.anInt202 = this.anInt197 - 1;
				}
				this.anInt201 = (int) ((double) this.anIntArray11[this.anInt202] / 65536.0D * (double) arg0);
				if (this.anInt201 > this.anInt205) {
					this.anInt203 = ((this.anIntArray12[this.anInt202] << 15) - this.anInt204) / (this.anInt201 - this.anInt205);
				}
			}
			this.anInt204 += this.anInt203;
			this.anInt205++;
			return this.anInt204 - this.anInt203 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("22885, " + arg0 + ", " + false + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
