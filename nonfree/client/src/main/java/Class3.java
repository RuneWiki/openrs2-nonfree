import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt194;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean23 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method48(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt195 = arg0.method468();
			this.anInt193 = arg0.method473();
			this.anInt194 = arg0.method473();
			this.anInt192 = arg0.method468();
			this.anIntArray11 = new int[this.anInt192];
			this.anIntArray12 = new int[this.anInt192];
			for (@Pc(35) int local35 = 0; local35 < this.anInt192; local35++) {
				this.anIntArray11[local35] = arg0.method470();
				this.anIntArray12[local35] = arg0.method470();
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("88368, " + 3251 + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method49() {
		try {
			this.anInt196 = 0;
			this.anInt197 = 0;
			this.anInt198 = 0;
			this.anInt199 = 0;
			this.anInt200 = 0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("91150, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method50(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt200 >= this.anInt196) {
				this.anInt199 = this.anIntArray12[this.anInt197++] << 15;
				if (this.anInt197 >= this.anInt192) {
					this.anInt197 = this.anInt192 - 1;
				}
				this.anInt196 = (int) ((double) this.anIntArray11[this.anInt197] / 65536.0D * (double) arg0);
				if (this.anInt196 > this.anInt200) {
					this.anInt198 = ((this.anIntArray12[this.anInt197] << 15) - this.anInt199) / (this.anInt196 - this.anInt200);
				}
			}
			this.anInt199 += this.anInt198;
			this.anInt200++;
			return this.anInt199 - this.anInt198 >> 15;
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("857, " + 0 + ", " + arg0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}
}
