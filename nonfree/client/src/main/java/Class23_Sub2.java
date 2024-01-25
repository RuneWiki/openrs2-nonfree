import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "I")
	private int anInt4762;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	private int anInt4767;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!dc", name = "H", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
	private int anInt4775;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	private final int anInt4769;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private final int anInt4768;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
	private final int anInt4771;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt4766;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4769 = (int) (arg6 * 4096.0F);
		this.anInt4768 = (int) (arg7 * 4096.0F);
		this.anInt4766 = this.anInt4771 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)V")
	protected void method4277(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray70[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4276(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4762 = this.anInt4769 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt4767 = 4096;
			this.anInt4762 = this.anInt4762 * this.anInt4762 >> 12;
			this.anInt4775 = this.anInt4762;
			return;
		}
		this.anInt4767 = this.anInt4768 * this.anInt4762 >> 12;
		this.anInt4762 = this.anInt4769 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt4767 < 0) {
			this.anInt4767 = 0;
		} else if (this.anInt4767 > 4096) {
			this.anInt4767 = 4096;
		}
		this.anInt4762 = this.anInt4762 * this.anInt4762 >> 12;
		this.anInt4762 = this.anInt4767 * this.anInt4762 >> 12;
		this.anInt4775 += this.anInt4766 * this.anInt4762 >> 12;
		this.anInt4766 = this.anInt4771 * this.anInt4766 >> 12;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4270() {
		this.anInt4770 = 0;
		this.anInt4775 = 0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4268() {
		this.anInt4766 = this.anInt4771;
		this.anInt4775 >>= 0x4;
		if (this.anInt4775 < 0) {
			this.anInt4775 = 0;
		} else if (this.anInt4775 > 255) {
			this.anInt4775 = 255;
		}
		this.method4277(this.anInt4770++, (byte) this.anInt4775);
		this.anInt4775 = 0;
	}
}
