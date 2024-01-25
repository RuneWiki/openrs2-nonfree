import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class Class57_Sub1 extends Class57 {

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
	private int anInt4522;

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
	private int anInt4526;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	private int anInt4531;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
	private final int anInt4524;

	@OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
	private final int anInt4528;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	private final int anInt4521;

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
	private int anInt4529;

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class57_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4524 = (int) (arg6 * 4096.0F);
		this.anInt4528 = (int) (arg7 * 4096.0F);
		this.anInt4529 = this.anInt4521 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt4526 = this.anInt4524 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4522 = 4096;
			this.anInt4526 = this.anInt4526 * this.anInt4526 >> 12;
			this.anInt4520 = this.anInt4526;
			return;
		}
		this.anInt4522 = this.anInt4528 * this.anInt4526 >> 12;
		this.anInt4526 = this.anInt4524 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt4522 < 0) {
			this.anInt4522 = 0;
		} else if (this.anInt4522 > 4096) {
			this.anInt4522 = 4096;
		}
		this.anInt4526 = this.anInt4526 * this.anInt4526 >> 12;
		this.anInt4526 = this.anInt4526 * this.anInt4522 >> 12;
		this.anInt4520 += this.anInt4529 * this.anInt4526 >> 12;
		this.anInt4529 = this.anInt4521 * this.anInt4529 >> 12;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4475() {
		this.anInt4520 = 0;
		this.anInt4531 = 0;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BBI)V")
	protected void method3579(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray54[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4481() {
		this.anInt4529 = this.anInt4521;
		this.anInt4520 >>= 0x4;
		if (this.anInt4520 < 0) {
			this.anInt4520 = 0;
		} else if (this.anInt4520 > 255) {
			this.anInt4520 = 255;
		}
		this.method3579((byte) this.anInt4520, this.anInt4531++);
		this.anInt4520 = 0;
	}
}
