import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ms", name = "n", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
	private int anInt2561;

	@OriginalMember(owner = "client!ms", name = "t", descriptor = "I")
	private int anInt2563;

	@OriginalMember(owner = "client!ms", name = "v", descriptor = "I")
	private int anInt2565;

	@OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
	private int anInt2568;

	@OriginalMember(owner = "client!ms", name = "w", descriptor = "I")
	private final int anInt2566;

	@OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
	private final int anInt2564;

	@OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
	private final int anInt2569;

	@OriginalMember(owner = "client!ms", name = "p", descriptor = "I")
	private int anInt2560;

	@OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2566 = (int) (arg7 * 4096.0F);
		this.anInt2564 = (int) (arg6 * 4096.0F);
		this.anInt2560 = this.anInt2569 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ms", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5801() {
		this.anInt2561 >>= 0x4;
		this.anInt2560 = this.anInt2569;
		if (this.anInt2561 < 0) {
			this.anInt2561 = 0;
		} else if (this.anInt2561 > 255) {
			this.anInt2561 = 255;
		}
		this.method2181(this.anInt2568++, (byte) this.anInt2561);
		this.anInt2561 = 0;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(IZB)V")
	protected void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray21[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt2565 = this.anInt2564 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt2565 = this.anInt2565 * this.anInt2565 >> 12;
			this.anInt2563 = 4096;
			this.anInt2561 = this.anInt2565;
			return;
		}
		this.anInt2563 = this.anInt2565 * this.anInt2566 >> 12;
		this.anInt2565 = this.anInt2564 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt2563 < 0) {
			this.anInt2563 = 0;
		} else if (this.anInt2563 > 4096) {
			this.anInt2563 = 4096;
		}
		this.anInt2565 = this.anInt2565 * this.anInt2565 >> 12;
		this.anInt2565 = this.anInt2563 * this.anInt2565 >> 12;
		this.anInt2561 += this.anInt2560 * this.anInt2565 >> 12;
		this.anInt2560 = this.anInt2560 * this.anInt2569 >> 12;
	}

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5800() {
		this.anInt2568 = 0;
		this.anInt2561 = 0;
	}
}
