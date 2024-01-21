import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DNFIVRJB")
public final class Class10 {

	@OriginalMember(owner = "client!DNFIVRJB", name = "b", descriptor = "I")
	private int anInt217;

	@OriginalMember(owner = "client!DNFIVRJB", name = "c", descriptor = "[I")
	private int[] anIntArray32;

	@OriginalMember(owner = "client!DNFIVRJB", name = "d", descriptor = "[I")
	private int[] anIntArray33;

	@OriginalMember(owner = "client!DNFIVRJB", name = "e", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!DNFIVRJB", name = "f", descriptor = "I")
	public int anInt219;

	@OriginalMember(owner = "client!DNFIVRJB", name = "g", descriptor = "I")
	public int anInt220;

	@OriginalMember(owner = "client!DNFIVRJB", name = "h", descriptor = "I")
	private int anInt221;

	@OriginalMember(owner = "client!DNFIVRJB", name = "i", descriptor = "I")
	private int anInt222;

	@OriginalMember(owner = "client!DNFIVRJB", name = "j", descriptor = "I")
	private int anInt223;

	@OriginalMember(owner = "client!DNFIVRJB", name = "k", descriptor = "I")
	private int anInt224;

	@OriginalMember(owner = "client!DNFIVRJB", name = "l", descriptor = "I")
	private int anInt225;

	@OriginalMember(owner = "client!DNFIVRJB", name = "a", descriptor = "I")
	private int anInt216 = 22486;

	@OriginalMember(owner = "client!DNFIVRJB", name = "a", descriptor = "(Lclient!CFARFRSG;I)V")
	public void method173(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			this.anInt220 = arg0.method59();
			if (this.anInt216 != 22486) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			this.anInt218 = arg0.method64();
			this.anInt219 = arg0.method64();
			this.method174(arg0);
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("63694, " + arg0 + ", " + 22486 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNFIVRJB", name = "a", descriptor = "(ILclient!CFARFRSG;)V")
	public void method174(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			this.anInt217 = arg0.method59();
			this.anIntArray32 = new int[this.anInt217];
			this.anIntArray33 = new int[this.anInt217];
			for (@Pc(21) int local21 = 0; local21 < this.anInt217; local21++) {
				this.anIntArray32[local21] = arg0.method61();
				this.anIntArray33[local21] = arg0.method61();
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("2501, " + 29122 + ", " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNFIVRJB", name = "a", descriptor = "(I)V")
	public void method175(@OriginalArg(0) int arg0) {
		try {
			this.anInt221 = 0;
			this.anInt222 = 0;
			@Pc(9) boolean local9 = false;
			this.anInt223 = 0;
			this.anInt224 = 0;
			this.anInt225 = 0;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("59614, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DNFIVRJB", name = "a", descriptor = "(II)I")
	public int method176(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt225 >= this.anInt221) {
				this.anInt224 = this.anIntArray33[this.anInt222++] << 15;
				if (this.anInt222 >= this.anInt217) {
					this.anInt222 = this.anInt217 - 1;
				}
				this.anInt221 = (int) ((double) this.anIntArray32[this.anInt222] / 65536.0D * (double) arg0);
				if (this.anInt221 > this.anInt225) {
					this.anInt223 = ((this.anIntArray33[this.anInt222] << 15) - this.anInt224) / (this.anInt221 - this.anInt225);
				}
			}
			this.anInt224 += this.anInt223;
			this.anInt225++;
			return this.anInt224 - this.anInt223 >> 15;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("40107, " + -873 + ", " + arg0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}
}
