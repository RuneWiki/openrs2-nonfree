import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class Class69_Sub2 extends Class69 {

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
	private int anInt6162;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	private int anInt6169;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	private int anInt6170;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "I")
	private int anInt6175;

	@OriginalMember(owner = "client!lm", name = "t", descriptor = "I")
	private final int anInt6165;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "I")
	private final int anInt6173;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "I")
	private final int anInt6166;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
	private int anInt6163;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class69_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6165 = (int) (arg7 * 4096.0F);
		this.anInt6173 = (int) (arg6 * 4096.0F);
		this.anInt6163 = this.anInt6166 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4733() {
		this.anInt6162 >>= 0x4;
		this.anInt6163 = this.anInt6166;
		if (this.anInt6162 < 0) {
			this.anInt6162 = 0;
		} else if (this.anInt6162 > 255) {
			this.anInt6162 = 255;
		}
		this.method4741(this.anInt6169++, (byte) this.anInt6162);
		this.anInt6162 = 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4739() {
		this.anInt6162 = 0;
		this.anInt6169 = 0;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIB)V")
	protected void method4741(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray71[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt6170 = this.anInt6173 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt6170 = this.anInt6170 * this.anInt6170 >> 12;
			this.anInt6175 = 4096;
			this.anInt6162 = this.anInt6170;
			return;
		}
		this.anInt6175 = this.anInt6165 * this.anInt6170 >> 12;
		if (this.anInt6175 < 0) {
			this.anInt6175 = 0;
		} else if (this.anInt6175 > 4096) {
			this.anInt6175 = 4096;
		}
		this.anInt6170 = this.anInt6173 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt6170 = this.anInt6170 * this.anInt6170 >> 12;
		this.anInt6170 = this.anInt6170 * this.anInt6175 >> 12;
		this.anInt6162 += this.anInt6163 * this.anInt6170 >> 12;
		this.anInt6163 = this.anInt6163 * this.anInt6166 >> 12;
	}
}
