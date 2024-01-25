import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class Class44_Sub1 extends Class44 {

	@OriginalMember(owner = "client!st", name = "r", descriptor = "I")
	private int anInt5636;

	@OriginalMember(owner = "client!st", name = "s", descriptor = "I")
	private int anInt5637;

	@OriginalMember(owner = "client!st", name = "v", descriptor = "[B")
	private byte[] aByteArray142;

	@OriginalMember(owner = "client!st", name = "x", descriptor = "I")
	private int anInt5640;

	@OriginalMember(owner = "client!st", name = "B", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!st", name = "p", descriptor = "I")
	private final int anInt5634;

	@OriginalMember(owner = "client!st", name = "A", descriptor = "I")
	private final int anInt5643;

	@OriginalMember(owner = "client!st", name = "z", descriptor = "I")
	private final int anInt5642;

	@OriginalMember(owner = "client!st", name = "u", descriptor = "I")
	private int anInt5638;

	@OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class44_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5634 = (int) (arg7 * 4096.0F);
		this.anInt5643 = (int) (arg6 * 4096.0F);
		this.anInt5638 = this.anInt5642 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZBI)V")
	protected void method4577(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray142[arg1] = arg0;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(III)V")
	@Override
	protected final void method4571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5640 = this.anInt5643 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt5640 = this.anInt5640 * this.anInt5640 >> 12;
			this.anInt5637 = 4096;
			this.anInt5644 = this.anInt5640;
			return;
		}
		this.anInt5637 = this.anInt5634 * this.anInt5640 >> 12;
		if (this.anInt5637 < 0) {
			this.anInt5637 = 0;
		} else if (this.anInt5637 > 4096) {
			this.anInt5637 = 4096;
		}
		this.anInt5640 = this.anInt5643 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt5640 = this.anInt5640 * this.anInt5640 >> 12;
		this.anInt5640 = this.anInt5637 * this.anInt5640 >> 12;
		this.anInt5644 += this.anInt5638 * this.anInt5640 >> 12;
		this.anInt5638 = this.anInt5642 * this.anInt5638 >> 12;
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4574() {
		this.anInt5636 = 0;
		this.anInt5644 = 0;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4568() {
		this.anInt5644 >>= 0x4;
		this.anInt5638 = this.anInt5642;
		if (this.anInt5644 < 0) {
			this.anInt5644 = 0;
		} else if (this.anInt5644 > 255) {
			this.anInt5644 = 255;
		}
		this.method4577((byte) this.anInt5644, this.anInt5636++);
		this.anInt5644 = 0;
	}
}
