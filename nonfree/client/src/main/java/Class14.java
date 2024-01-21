import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!HXORSAZH")
public final class Class14 {

	@OriginalMember(owner = "client!HXORSAZH", name = "b", descriptor = "I")
	private int anInt255;

	@OriginalMember(owner = "client!HXORSAZH", name = "c", descriptor = "[I")
	private int[] anIntArray67;

	@OriginalMember(owner = "client!HXORSAZH", name = "d", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!HXORSAZH", name = "e", descriptor = "I")
	public int anInt256;

	@OriginalMember(owner = "client!HXORSAZH", name = "f", descriptor = "I")
	public int anInt257;

	@OriginalMember(owner = "client!HXORSAZH", name = "g", descriptor = "I")
	public int anInt258;

	@OriginalMember(owner = "client!HXORSAZH", name = "h", descriptor = "I")
	private int anInt259;

	@OriginalMember(owner = "client!HXORSAZH", name = "i", descriptor = "I")
	private int anInt260;

	@OriginalMember(owner = "client!HXORSAZH", name = "j", descriptor = "I")
	private int anInt261;

	@OriginalMember(owner = "client!HXORSAZH", name = "k", descriptor = "I")
	private int anInt262;

	@OriginalMember(owner = "client!HXORSAZH", name = "l", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "Z")
	private boolean aBoolean53 = false;

	@OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(ILclient!TQYMAXSO;)V")
	public void method112(@OriginalArg(1) Class8_Sub1_Sub3 arg0) {
		try {
			this.anInt258 = arg0.method406();
			this.anInt256 = arg0.method411();
			this.anInt257 = arg0.method411();
			this.method113(arg0);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("46180, " + 3 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(Lclient!TQYMAXSO;I)V")
	public void method113(@OriginalArg(0) Class8_Sub1_Sub3 arg0) {
		try {
			this.anInt255 = arg0.method406();
			this.anIntArray67 = new int[this.anInt255];
			this.anIntArray68 = new int[this.anInt255];
			for (@Pc(19) int local19 = 0; local19 < this.anInt255; local19++) {
				this.anIntArray67[local19] = arg0.method408();
				this.anIntArray68[local19] = arg0.method408();
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("41724, " + arg0 + ", " + 36708 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(Z)V")
	public void method114() {
		try {
			this.anInt259 = 0;
			this.anInt260 = 0;
			this.anInt261 = 0;
			this.anInt262 = 0;
			this.anInt263 = 0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("41728, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HXORSAZH", name = "a", descriptor = "(IB)I")
	public int method115(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt263 >= this.anInt259) {
				this.anInt262 = this.anIntArray68[this.anInt260++] << 15;
				if (this.anInt260 >= this.anInt255) {
					this.anInt260 = this.anInt255 - 1;
				}
				this.anInt259 = (int) ((double) this.anIntArray67[this.anInt260] / 65536.0D * (double) arg0);
				if (this.anInt259 > this.anInt263) {
					this.anInt261 = ((this.anIntArray68[this.anInt260] << 15) - this.anInt262) / (this.anInt259 - this.anInt263);
				}
			}
			this.anInt262 += this.anInt261;
			this.anInt263++;
			return this.anInt262 - this.anInt261 >> 15;
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("73306, " + arg0 + ", " + -100 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}
}
