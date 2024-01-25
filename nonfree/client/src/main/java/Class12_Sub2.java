import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class Class12_Sub2 extends Class12 {

	@OriginalMember(owner = "client!ll", name = "s", descriptor = "[B")
	private byte[] aByteArray79;

	@OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
	private int anInt4654;

	@OriginalMember(owner = "client!ll", name = "F", descriptor = "I")
	private int anInt4661;

	@OriginalMember(owner = "client!ll", name = "H", descriptor = "I")
	private int anInt4663;

	@OriginalMember(owner = "client!ll", name = "L", descriptor = "I")
	private int anInt4667;

	@OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
	private final int anInt4652;

	@OriginalMember(owner = "client!ll", name = "I", descriptor = "I")
	private final int anInt4664;

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
	private final int anInt4655;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	private int anInt4668;

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class12_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4652 = (int) (arg6 * 4096.0F);
		this.anInt4664 = (int) (arg7 * 4096.0F);
		this.anInt4668 = this.anInt4655 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4109() {
		this.anInt4663 >>= 0x4;
		this.anInt4668 = this.anInt4655;
		if (this.anInt4663 < 0) {
			this.anInt4663 = 0;
		} else if (this.anInt4663 > 255) {
			this.anInt4663 = 255;
		}
		this.method4112(this.anInt4654++, (byte) this.anInt4663);
		this.anInt4663 = 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)V")
	protected void method4112(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray79[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4099() {
		this.anInt4654 = 0;
		this.anInt4663 = 0;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4661 = this.anInt4652 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt4661 = this.anInt4661 * this.anInt4661 >> 12;
			this.anInt4667 = 4096;
			this.anInt4663 = this.anInt4661;
			return;
		}
		this.anInt4667 = this.anInt4661 * this.anInt4664 >> 12;
		this.anInt4661 = this.anInt4652 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt4667 < 0) {
			this.anInt4667 = 0;
		} else if (this.anInt4667 > 4096) {
			this.anInt4667 = 4096;
		}
		this.anInt4661 = this.anInt4661 * this.anInt4661 >> 12;
		this.anInt4661 = this.anInt4667 * this.anInt4661 >> 12;
		this.anInt4663 += this.anInt4661 * this.anInt4668 >> 12;
		this.anInt4668 = this.anInt4655 * this.anInt4668 >> 12;
	}
}
