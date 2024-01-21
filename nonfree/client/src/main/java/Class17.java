import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JZEFIVMF")
public final class Class17 {

	@OriginalMember(owner = "client!JZEFIVMF", name = "b", descriptor = "I")
	private int anInt189;

	@OriginalMember(owner = "client!JZEFIVMF", name = "c", descriptor = "I")
	private int anInt190;

	@OriginalMember(owner = "client!JZEFIVMF", name = "d", descriptor = "[I")
	private int[] anIntArray28;

	@OriginalMember(owner = "client!JZEFIVMF", name = "e", descriptor = "[I")
	private int[] anIntArray29;

	@OriginalMember(owner = "client!JZEFIVMF", name = "f", descriptor = "I")
	public int anInt191;

	@OriginalMember(owner = "client!JZEFIVMF", name = "g", descriptor = "I")
	public int anInt192;

	@OriginalMember(owner = "client!JZEFIVMF", name = "h", descriptor = "I")
	public int anInt193;

	@OriginalMember(owner = "client!JZEFIVMF", name = "i", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!JZEFIVMF", name = "j", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!JZEFIVMF", name = "k", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!JZEFIVMF", name = "l", descriptor = "I")
	private int anInt197;

	@OriginalMember(owner = "client!JZEFIVMF", name = "m", descriptor = "I")
	private int anInt198;

	@OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(Lclient!FTMSICIZ;I)V")
	public void method216(@OriginalArg(0) Class4_Sub1_Sub3 arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt193 = arg0.method102();
			this.anInt191 = arg0.method107();
			this.anInt192 = arg0.method107();
			this.method217(arg0);
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70164, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(ZLclient!FTMSICIZ;)V")
	public void method217(@OriginalArg(1) Class4_Sub1_Sub3 arg0) {
		try {
			this.anInt190 = arg0.method102();
			this.anIntArray28 = new int[this.anInt190];
			this.anIntArray29 = new int[this.anInt190];
			for (@Pc(25) int local25 = 0; local25 < this.anInt190; local25++) {
				this.anIntArray28[local25] = arg0.method104();
				this.anIntArray29[local25] = arg0.method104();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("36403, " + false + ", " + arg0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(Z)V")
	public void method218() {
		try {
			this.anInt194 = 0;
			this.anInt195 = 0;
			this.anInt196 = 0;
			this.anInt197 = 0;
			this.anInt198 = 0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("9296, " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JZEFIVMF", name = "a", descriptor = "(II)I")
	public int method219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt198 >= this.anInt194) {
				this.anInt197 = this.anIntArray29[this.anInt195++] << 15;
				if (this.anInt195 >= this.anInt190) {
					this.anInt195 = this.anInt190 - 1;
				}
				this.anInt194 = (int) ((double) this.anIntArray28[this.anInt195] / 65536.0D * (double) arg0);
				if (this.anInt194 > this.anInt198) {
					this.anInt196 = ((this.anIntArray29[this.anInt195] << 15) - this.anInt197) / (this.anInt194 - this.anInt198);
				}
			}
			this.anInt197 += this.anInt196;
			if (arg1 == 0) {
				this.anInt198++;
				return this.anInt197 - this.anInt196 >> 15;
			} else {
				return this.anInt189;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("51178, " + arg0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
