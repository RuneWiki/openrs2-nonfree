import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZLclient!mb;)V")
	public void method54(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt192 = arg0.method496();
			this.anInt190 = arg0.method501();
			this.anInt191 = arg0.method501();
			this.anInt189 = arg0.method496();
			this.anIntArray20 = new int[this.anInt189];
			this.anIntArray21 = new int[this.anInt189];
			for (@Pc(35) int local35 = 0; local35 < this.anInt189; local35++) {
				this.anIntArray20[local35] = arg0.method498();
				this.anIntArray21[local35] = arg0.method498();
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("74309, " + true + ", " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method55(@OriginalArg(0) byte arg0) {
		try {
			this.anInt193 = 0;
			this.anInt194 = 0;
			this.anInt195 = 0;
			if (arg0 != 5) {
				this.anInt188 = 466;
			}
			this.anInt196 = 0;
			this.anInt197 = 0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("60986, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method56(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt197 >= this.anInt193) {
				this.anInt196 = this.anIntArray21[this.anInt194++] << 15;
				if (this.anInt194 >= this.anInt189) {
					this.anInt194 = this.anInt189 - 1;
				}
				this.anInt193 = (int) ((double) this.anIntArray20[this.anInt194] / 65536.0D * (double) arg0);
				if (this.anInt193 > this.anInt197) {
					this.anInt195 = ((this.anIntArray21[this.anInt194] << 15) - this.anInt196) / (this.anInt193 - this.anInt197);
				}
			}
			this.anInt196 += this.anInt195;
			this.anInt197++;
			return this.anInt196 - this.anInt195 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("12428, " + 370 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
