import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!aga", name = "x", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "I")
	private int anInt8642;

	@OriginalMember(owner = "client!aga", name = "A", descriptor = "I")
	private int anInt8644;

	@OriginalMember(owner = "client!aga", name = "G", descriptor = "I")
	private int anInt8649;

	@OriginalMember(owner = "client!aga", name = "Q", descriptor = "I")
	private int anInt8657;

	@OriginalMember(owner = "client!aga", name = "E", descriptor = "I")
	private final int anInt8647;

	@OriginalMember(owner = "client!aga", name = "D", descriptor = "I")
	private final int anInt8646;

	@OriginalMember(owner = "client!aga", name = "z", descriptor = "I")
	private final int anInt8643;

	@OriginalMember(owner = "client!aga", name = "J", descriptor = "I")
	private int anInt8652;

	@OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8647 = (int) (arg7 * 4096.0F);
		this.anInt8646 = (int) (arg6 * 4096.0F);
		this.anInt8652 = this.anInt8643 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method7633(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8642 = this.anInt8646 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt8642 = this.anInt8642 * this.anInt8642 >> 12;
			this.anInt8644 = 4096;
			this.anInt8657 = this.anInt8642;
			return;
		}
		this.anInt8644 = this.anInt8647 * this.anInt8642 >> 12;
		this.anInt8642 = this.anInt8646 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt8644 < 0) {
			this.anInt8644 = 0;
		} else if (this.anInt8644 > 4096) {
			this.anInt8644 = 4096;
		}
		this.anInt8642 = this.anInt8642 * this.anInt8642 >> 12;
		this.anInt8642 = this.anInt8644 * this.anInt8642 >> 12;
		this.anInt8657 += this.anInt8642 * this.anInt8652 >> 12;
		this.anInt8652 = this.anInt8643 * this.anInt8652 >> 12;
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7636() {
		this.anInt8649 = 0;
		this.anInt8657 = 0;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBB)V")
	protected void method7647(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray77[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7634() {
		this.anInt8657 >>= 0x4;
		this.anInt8652 = this.anInt8643;
		if (this.anInt8657 < 0) {
			this.anInt8657 = 0;
		} else if (this.anInt8657 > 255) {
			this.anInt8657 = 255;
		}
		this.method7647(this.anInt8649++, (byte) this.anInt8657);
		this.anInt8657 = 0;
	}
}
