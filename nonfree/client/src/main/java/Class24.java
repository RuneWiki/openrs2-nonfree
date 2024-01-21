import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LSSFLBMP")
public final class Class24 {

	@OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "I")
	private int anInt273;

	@OriginalMember(owner = "client!LSSFLBMP", name = "d", descriptor = "I")
	private int anInt274;

	@OriginalMember(owner = "client!LSSFLBMP", name = "e", descriptor = "[I")
	private int[] anIntArray56;

	@OriginalMember(owner = "client!LSSFLBMP", name = "f", descriptor = "[I")
	private int[] anIntArray57;

	@OriginalMember(owner = "client!LSSFLBMP", name = "g", descriptor = "I")
	public int anInt275;

	@OriginalMember(owner = "client!LSSFLBMP", name = "h", descriptor = "I")
	public int anInt276;

	@OriginalMember(owner = "client!LSSFLBMP", name = "i", descriptor = "I")
	public int anInt277;

	@OriginalMember(owner = "client!LSSFLBMP", name = "j", descriptor = "I")
	private int anInt278;

	@OriginalMember(owner = "client!LSSFLBMP", name = "k", descriptor = "I")
	private int anInt279;

	@OriginalMember(owner = "client!LSSFLBMP", name = "l", descriptor = "I")
	private int anInt280;

	@OriginalMember(owner = "client!LSSFLBMP", name = "m", descriptor = "I")
	private int anInt281;

	@OriginalMember(owner = "client!LSSFLBMP", name = "n", descriptor = "I")
	private int anInt282;

	@OriginalMember(owner = "client!LSSFLBMP", name = "b", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!LSSFLBMP", name = "c", descriptor = "Z")
	private boolean aBoolean80 = true;

	@OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(ILclient!WNCFPLWV;)V")
	public void method241(@OriginalArg(1) Class3_Sub1_Sub4 arg0) {
		try {
			this.anInt277 = arg0.method458();
			this.anInt275 = arg0.method463();
			this.anInt276 = arg0.method463();
			this.method242(arg0, this.aBoolean79);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("64922, " + -934 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(Lclient!WNCFPLWV;Z)V")
	public void method242(@OriginalArg(0) Class3_Sub1_Sub4 arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt274 = arg0.method458();
			this.anIntArray56 = new int[this.anInt274];
			this.anIntArray57 = new int[this.anInt274];
			for (@Pc(15) int local15 = 0; local15 < this.anInt274; local15++) {
				this.anIntArray56[local15] = arg0.method460();
				this.anIntArray57[local15] = arg0.method460();
			}
			if (!arg1) {
				this.anInt273 = 395;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("60035, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(Z)V")
	public void method243() {
		try {
			this.anInt278 = 0;
			this.anInt279 = 0;
			this.anInt280 = 0;
			this.anInt281 = 0;
			this.anInt282 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("735, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LSSFLBMP", name = "a", descriptor = "(IB)I")
	public int method244(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt282 >= this.anInt278) {
				this.anInt281 = this.anIntArray57[this.anInt279++] << 15;
				if (this.anInt279 >= this.anInt274) {
					this.anInt279 = this.anInt274 - 1;
				}
				this.anInt278 = (int) ((double) this.anIntArray56[this.anInt279] / 65536.0D * (double) arg0);
				if (this.anInt278 > this.anInt282) {
					this.anInt280 = ((this.anIntArray57[this.anInt279] << 15) - this.anInt281) / (this.anInt278 - this.anInt282);
				}
			}
			this.anInt281 += this.anInt280;
			this.anInt282++;
			return this.anInt281 - this.anInt280 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("19178, " + arg0 + ", " + -2 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
