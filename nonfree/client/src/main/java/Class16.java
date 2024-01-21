import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GTUIGVXS")
public final class Class16 {

	@OriginalMember(owner = "client!GTUIGVXS", name = "e", descriptor = "I")
	private int anInt252;

	@OriginalMember(owner = "client!GTUIGVXS", name = "f", descriptor = "[I")
	private int[] anIntArray78;

	@OriginalMember(owner = "client!GTUIGVXS", name = "g", descriptor = "[I")
	private int[] anIntArray79;

	@OriginalMember(owner = "client!GTUIGVXS", name = "h", descriptor = "I")
	public int anInt253;

	@OriginalMember(owner = "client!GTUIGVXS", name = "i", descriptor = "I")
	public int anInt254;

	@OriginalMember(owner = "client!GTUIGVXS", name = "j", descriptor = "I")
	public int anInt255;

	@OriginalMember(owner = "client!GTUIGVXS", name = "k", descriptor = "I")
	private int anInt256;

	@OriginalMember(owner = "client!GTUIGVXS", name = "l", descriptor = "I")
	private int anInt257;

	@OriginalMember(owner = "client!GTUIGVXS", name = "m", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!GTUIGVXS", name = "n", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!GTUIGVXS", name = "o", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "I")
	private int anInt251 = -967;

	@OriginalMember(owner = "client!GTUIGVXS", name = "b", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!GTUIGVXS", name = "c", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!GTUIGVXS", name = "d", descriptor = "B")
	private byte aByte15 = 0;

	@OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(Lclient!WBEWPIXO;I)V")
	public void method150(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			this.anInt255 = arg0.method468();
			this.anInt253 = arg0.method473();
			this.anInt254 = arg0.method473();
			this.method151(arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("9385, " + arg0 + ", " + 767 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GTUIGVXS", name = "b", descriptor = "(Lclient!WBEWPIXO;I)V")
	public void method151(@OriginalArg(0) Class3_Sub3_Sub4 arg0) {
		try {
			this.anInt252 = arg0.method468();
			this.anIntArray78 = new int[this.anInt252];
			this.anIntArray79 = new int[this.anInt252];
			for (@Pc(15) int local15 = 0; local15 < this.anInt252; local15++) {
				this.anIntArray78[local15] = arg0.method470();
				this.anIntArray79[local15] = arg0.method470();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("14623, " + arg0 + ", " + -895 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(B)V")
	public void method152() {
		try {
			this.anInt256 = 0;
			if (this.aByte15 != 0) {
				this.anInt251 = 376;
			}
			this.anInt257 = 0;
			this.anInt258 = 0;
			this.anInt259 = 0;
			this.anInt260 = 0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("40762, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GTUIGVXS", name = "a", descriptor = "(II)I")
	public int method153(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt260 >= this.anInt256) {
				this.anInt259 = this.anIntArray79[this.anInt257++] << 15;
				if (this.anInt257 >= this.anInt252) {
					this.anInt257 = this.anInt252 - 1;
				}
				this.anInt256 = (int) ((double) this.anIntArray78[this.anInt257] / 65536.0D * (double) arg0);
				if (this.anInt256 > this.anInt260) {
					this.anInt258 = ((this.anIntArray79[this.anInt257] << 15) - this.anInt259) / (this.anInt256 - this.anInt260);
				}
			}
			this.anInt259 += this.anInt258;
			this.anInt260++;
			return this.anInt259 - this.anInt258 >> 15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("5170, " + 18303 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}
}
