import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	private int[] anIntArray21;

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

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "Z")
	private boolean aBoolean29 = false;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method54(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt195 = arg0.method498();
			this.anInt193 = arg0.method503();
			this.anInt194 = arg0.method503();
			this.anInt192 = arg0.method498();
			this.anIntArray20 = new int[this.anInt192];
			this.anIntArray21 = new int[this.anInt192];
			for (@Pc(38) int local38 = 0; local38 < this.anInt192; local38++) {
				this.anIntArray20[local38] = arg0.method500();
				this.anIntArray21[local38] = arg0.method500();
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("50603, " + 0 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method55() {
		try {
			this.anInt196 = 0;
			this.anInt197 = 0;
			this.anInt198 = 0;
			this.anInt199 = 0;
			this.anInt200 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("83937, " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method56(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt200 >= this.anInt196) {
				this.anInt199 = this.anIntArray21[this.anInt197++] << 15;
				if (this.anInt197 >= this.anInt192) {
					this.anInt197 = this.anInt192 - 1;
				}
				this.anInt196 = (int) ((double) this.anIntArray20[this.anInt197] / 65536.0D * (double) arg0);
				if (this.anInt196 > this.anInt200) {
					this.anInt198 = ((this.anIntArray21[this.anInt197] << 15) - this.anInt199) / (this.anInt196 - this.anInt200);
				}
			}
			this.anInt199 += this.anInt198;
			this.anInt200++;
			return this.anInt199 - this.anInt198 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("63479, " + -406 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
