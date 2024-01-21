import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!bc")
public final class Class3 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[I")
	private int[] anIntArray20;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "[I")
	private int[] anIntArray21;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public int anInt195;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt196;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	public int anInt197;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	private int anInt199;

	@OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
	private int anInt200;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
	private int anInt201;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt202;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!mb;B)V")
	public void method54(@OriginalArg(0) Class1_Sub1_Sub3 arg0) {
		try {
			this.anInt197 = arg0.method498();
			this.anInt195 = arg0.method503();
			this.anInt196 = arg0.method503();
			this.anInt194 = arg0.method498();
			this.anIntArray20 = new int[this.anInt194];
			this.anIntArray21 = new int[this.anInt194];
			for (@Pc(36) int local36 = 0; local36 < this.anInt194; local36++) {
				this.anIntArray20[local36] = arg0.method500();
				this.anIntArray21[local36] = arg0.method500();
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("95010, " + arg0 + ", " + 66 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public void method55(@OriginalArg(0) int arg0) {
		try {
			this.anInt198 = 0;
			this.anInt199 = 0;
			this.anInt200 = 0;
			while (arg0 >= 0) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
			this.anInt201 = 0;
			this.anInt202 = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("62288, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)I")
	public int method56(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt202 >= this.anInt198) {
				this.anInt201 = this.anIntArray21[this.anInt199++] << 15;
				if (this.anInt199 >= this.anInt194) {
					this.anInt199 = this.anInt194 - 1;
				}
				this.anInt198 = (int) ((double) this.anIntArray20[this.anInt199] / 65536.0D * (double) arg0);
				if (this.anInt198 > this.anInt202) {
					this.anInt200 = ((this.anIntArray21[this.anInt199] << 15) - this.anInt201) / (this.anInt198 - this.anInt202);
				}
			}
			this.anInt201 += this.anInt200;
			this.anInt202++;
			return this.anInt201 - this.anInt200 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("39581, " + false + ", " + arg0 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
