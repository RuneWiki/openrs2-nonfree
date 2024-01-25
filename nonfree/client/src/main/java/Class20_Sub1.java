import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class Class20_Sub1 extends Class20 {

	@OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!fm", name = "C", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!fm", name = "F", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!fm", name = "J", descriptor = "I")
	private int anInt705;

	@OriginalMember(owner = "client!fm", name = "K", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!fm", name = "r", descriptor = "I")
	private final int anInt689;

	@OriginalMember(owner = "client!fm", name = "w", descriptor = "I")
	private final int anInt694;

	@OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
	private final int anInt704;

	@OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
	private int anInt697;

	@OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class20_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt689 = (int) (arg7 * 4096.0F);
		this.anInt694 = (int) (arg6 * 4096.0F);
		this.anInt697 = this.anInt704 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt702 = this.anInt694 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt688 = 4096;
			this.anInt702 = this.anInt702 * this.anInt702 >> 12;
			this.anInt705 = this.anInt702;
			return;
		}
		this.anInt688 = this.anInt702 * this.anInt689 >> 12;
		if (this.anInt688 < 0) {
			this.anInt688 = 0;
		} else if (this.anInt688 > 4096) {
			this.anInt688 = 4096;
		}
		this.anInt702 = this.anInt694 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt702 = this.anInt702 * this.anInt702 >> 12;
		this.anInt702 = this.anInt702 * this.anInt688 >> 12;
		this.anInt705 += this.anInt702 * this.anInt697 >> 12;
		this.anInt697 = this.anInt704 * this.anInt697 >> 12;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5498() {
		this.anInt705 >>= 0x4;
		this.anInt697 = this.anInt704;
		if (this.anInt705 < 0) {
			this.anInt705 = 0;
		} else if (this.anInt705 > 255) {
			this.anInt705 = 255;
		}
		this.method536(this.anInt699++, (byte) this.anInt705);
		this.anInt705 = 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5502() {
		this.anInt699 = 0;
		this.anInt705 = 0;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)V")
	protected void method536(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray9[arg0] = arg1;
	}
}
