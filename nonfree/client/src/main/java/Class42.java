import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!xb")
public final class Class42 {

	@OriginalMember(owner = "client!xb", name = "b", descriptor = "I")
	private int anInt834;

	@OriginalMember(owner = "client!xb", name = "c", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!xb", name = "d", descriptor = "[I")
	private int[] anIntArray228;

	@OriginalMember(owner = "client!xb", name = "e", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!xb", name = "f", descriptor = "I")
	public int anInt836;

	@OriginalMember(owner = "client!xb", name = "g", descriptor = "I")
	public int anInt837;

	@OriginalMember(owner = "client!xb", name = "h", descriptor = "I")
	private int anInt838;

	@OriginalMember(owner = "client!xb", name = "i", descriptor = "I")
	private int anInt839;

	@OriginalMember(owner = "client!xb", name = "j", descriptor = "I")
	private int anInt840;

	@OriginalMember(owner = "client!xb", name = "k", descriptor = "I")
	private int anInt841;

	@OriginalMember(owner = "client!xb", name = "l", descriptor = "I")
	private int anInt842;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "I")
	private int anInt833 = 363;

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Lclient!kb;I)V")
	public void method544(@OriginalArg(0) Class1_Sub3_Sub3 arg0) {
		try {
			this.anInt837 = arg0.method383();
			this.anInt835 = arg0.method388();
			this.anInt836 = arg0.method388();
			this.anInt834 = arg0.method383();
			this.anIntArray227 = new int[this.anInt834];
			this.anIntArray228 = new int[this.anInt834];
			for (@Pc(35) int local35 = 0; local35 < this.anInt834; local35++) {
				this.anIntArray227[local35] = arg0.method385();
				this.anIntArray228[local35] = arg0.method385();
			}
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("29336, " + arg0 + ", " + 0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(Z)V")
	public void method545(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt838 = 0;
			this.anInt839 = 0;
			if (arg0) {
				this.anInt833 = -412;
			}
			this.anInt840 = 0;
			this.anInt841 = 0;
			this.anInt842 = 0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("57252, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!xb", name = "a", descriptor = "(II)I")
	public int method546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt842 >= this.anInt838) {
				this.anInt841 = this.anIntArray228[this.anInt839++] << 15;
				if (this.anInt839 >= this.anInt834) {
					this.anInt839 = this.anInt834 - 1;
				}
				this.anInt838 = (int) ((double) this.anIntArray227[this.anInt839] / 65536.0D * (double) arg1);
				if (this.anInt838 > this.anInt842) {
					this.anInt840 = ((this.anIntArray228[this.anInt839] << 15) - this.anInt841) / (this.anInt838 - this.anInt842);
				}
			}
			this.anInt841 += this.anInt840;
			this.anInt842++;
			@Pc(83) boolean local83 = false;
			return this.anInt841 - this.anInt840 >> 15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("79874, " + arg0 + ", " + arg1 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}
}
