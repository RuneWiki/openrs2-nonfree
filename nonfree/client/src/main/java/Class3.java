import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	private int anInt188;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt189;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt190;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt187 = -536;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method54(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt191 = arg0.method498();
			this.anInt189 = arg0.method503();
			this.anInt190 = arg0.method503();
			this.anInt188 = arg0.method498();
			this.anIntArray20 = new int[this.anInt188];
			this.anIntArray21 = new int[this.anInt188];
			for (@Pc(40) int local40 = 0; local40 < this.anInt188; local40++) {
				this.anIntArray20[local40] = arg0.method500();
				this.anIntArray21[local40] = arg0.method500();
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("49756, " + 9 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method55() {
		try {
			this.anInt192 = 0;
			this.anInt193 = 0;
			this.anInt194 = 0;
			this.anInt195 = 0;
			this.anInt196 = 0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("27215, " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method56(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt196 >= this.anInt192) {
				this.anInt195 = this.anIntArray21[this.anInt193++] << 15;
				if (this.anInt193 >= this.anInt188) {
					this.anInt193 = this.anInt188 - 1;
				}
				this.anInt192 = (int) ((double) this.anIntArray20[this.anInt193] / 65536.0D * (double) arg0);
				if (this.anInt192 > this.anInt196) {
					this.anInt194 = ((this.anIntArray21[this.anInt193] << 15) - this.anInt195) / (this.anInt192 - this.anInt196);
				}
			}
			this.anInt195 += this.anInt194;
			this.anInt196++;
			return this.anInt195 - this.anInt194 >> 15;
		} catch (@Pc(94) RuntimeException local94) {
			signlink.reporterror("89140, " + arg0 + ", " + -71 + ", " + local94.toString());
			throw new RuntimeException();
		}
	}
}
