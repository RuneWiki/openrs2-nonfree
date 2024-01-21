import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt189 = 2;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILclient!mb;)V")
	public void method54(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt193 = arg0.method498();
			this.anInt191 = arg0.method503();
			this.anInt192 = arg0.method503();
			this.anInt190 = arg0.method498();
			this.anIntArray20 = new int[this.anInt190];
			this.anIntArray21 = new int[this.anInt190];
			for (@Pc(34) int local34 = 0; local34 < this.anInt190; local34++) {
				this.anIntArray20[local34] = arg0.method500();
				this.anIntArray21[local34] = arg0.method500();
			}
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("24509, " + 891 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method55() {
		try {
			this.anInt194 = 0;
			this.anInt195 = 0;
			this.anInt196 = 0;
			this.anInt197 = 0;
			this.anInt198 = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("32820, " + -373 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)I")
	public int method56(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt198 >= this.anInt194) {
				this.anInt197 = this.anIntArray21[this.anInt195++] << 15;
				if (this.anInt195 >= this.anInt190) {
					this.anInt195 = this.anInt190 - 1;
				}
				this.anInt194 = (int) ((double) this.anIntArray20[this.anInt195] / 65536.0D * (double) arg0);
				if (this.anInt194 > this.anInt198) {
					this.anInt196 = ((this.anIntArray21[this.anInt195] << 15) - this.anInt197) / (this.anInt194 - this.anInt198);
				}
			}
			this.anInt197 += this.anInt196;
			this.anInt198++;
			return this.anInt197 - this.anInt196 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("39664, " + 9 + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
