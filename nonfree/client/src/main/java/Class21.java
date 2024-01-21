import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JDDBCSRY")
public final class Class21 {

	@OriginalMember(owner = "client!JDDBCSRY", name = "b", descriptor = "I")
	private int anInt293;

	@OriginalMember(owner = "client!JDDBCSRY", name = "c", descriptor = "[I")
	private int[] anIntArray59;

	@OriginalMember(owner = "client!JDDBCSRY", name = "d", descriptor = "[I")
	private int[] anIntArray60;

	@OriginalMember(owner = "client!JDDBCSRY", name = "e", descriptor = "I")
	public int anInt294;

	@OriginalMember(owner = "client!JDDBCSRY", name = "f", descriptor = "I")
	public int anInt295;

	@OriginalMember(owner = "client!JDDBCSRY", name = "g", descriptor = "I")
	public int anInt296;

	@OriginalMember(owner = "client!JDDBCSRY", name = "h", descriptor = "I")
	private int anInt297;

	@OriginalMember(owner = "client!JDDBCSRY", name = "i", descriptor = "I")
	private int anInt298;

	@OriginalMember(owner = "client!JDDBCSRY", name = "j", descriptor = "I")
	private int anInt299;

	@OriginalMember(owner = "client!JDDBCSRY", name = "k", descriptor = "I")
	private int anInt300;

	@OriginalMember(owner = "client!JDDBCSRY", name = "l", descriptor = "I")
	private int anInt301;

	@OriginalMember(owner = "client!JDDBCSRY", name = "a", descriptor = "I")
	private int anInt292 = 17642;

	@OriginalMember(owner = "client!JDDBCSRY", name = "a", descriptor = "(ZLclient!XGRGMPUQ;)V")
	public void method151(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub1_Sub4 arg1) {
		try {
			if (!arg0) {
				throw new NullPointerException();
			}
			this.anInt296 = arg1.method437();
			this.anInt294 = arg1.method442();
			this.anInt295 = arg1.method442();
			this.method152(arg1);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("30849, " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDDBCSRY", name = "a", descriptor = "(Lclient!XGRGMPUQ;I)V")
	public void method152(@OriginalArg(0) Class5_Sub1_Sub4 arg0) {
		try {
			this.anInt293 = arg0.method437();
			this.anIntArray59 = new int[this.anInt293];
			this.anIntArray60 = new int[this.anInt293];
			for (@Pc(19) int local19 = 0; local19 < this.anInt293; local19++) {
				this.anIntArray59[local19] = arg0.method439();
				this.anIntArray60[local19] = arg0.method439();
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("31595, " + arg0 + ", " + 43184 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDDBCSRY", name = "a", descriptor = "(I)V")
	public void method153() {
		try {
			this.anInt297 = 0;
			this.anInt298 = 0;
			this.anInt299 = 0;
			this.anInt300 = 0;
			this.anInt301 = 0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("30457, " + 7 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JDDBCSRY", name = "a", descriptor = "(BI)I")
	public int method154(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt301 >= this.anInt297) {
				this.anInt300 = this.anIntArray60[this.anInt298++] << 15;
				if (this.anInt298 >= this.anInt293) {
					this.anInt298 = this.anInt293 - 1;
				}
				this.anInt297 = (int) ((double) this.anIntArray59[this.anInt298] / 65536.0D * (double) arg1);
				if (this.anInt297 > this.anInt301) {
					this.anInt299 = ((this.anIntArray60[this.anInt298] << 15) - this.anInt300) / (this.anInt297 - this.anInt301);
				}
			}
			this.anInt300 += this.anInt299;
			@Pc(78) boolean local78 = false;
			this.anInt301++;
			return this.anInt300 - this.anInt299 >> 15;
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("33751, " + arg0 + ", " + arg1 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}
}
