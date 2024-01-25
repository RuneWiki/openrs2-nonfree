import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class Class35_Sub2 extends Class35 {

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	private int anInt6560;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	private int anInt6564;

	@OriginalMember(owner = "client!im", name = "y", descriptor = "I")
	private int anInt6566;

	@OriginalMember(owner = "client!im", name = "C", descriptor = "I")
	private int anInt6570;

	@OriginalMember(owner = "client!im", name = "D", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "I")
	private final int anInt6561;

	@OriginalMember(owner = "client!im", name = "B", descriptor = "I")
	private final int anInt6569;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "I")
	private final int anInt6563;

	@OriginalMember(owner = "client!im", name = "A", descriptor = "I")
	private int anInt6568;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class35_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6561 = (int) (arg6 * 4096.0F);
		this.anInt6569 = (int) (arg7 * 4096.0F);
		this.anInt6568 = this.anInt6563 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5900() {
		this.anInt6564 >>= 0x4;
		this.anInt6568 = this.anInt6563;
		if (this.anInt6564 < 0) {
			this.anInt6564 = 0;
		} else if (this.anInt6564 > 255) {
			this.anInt6564 = 255;
		}
		this.method5907((byte) this.anInt6564, this.anInt6570++);
		this.anInt6564 = 0;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5902() {
		this.anInt6570 = 0;
		this.anInt6564 = 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BBI)V")
	protected void method5907(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray86[arg1] = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method5899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6566 = this.anInt6561 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt6566 = this.anInt6566 * this.anInt6566 >> 12;
			this.anInt6560 = 4096;
			this.anInt6564 = this.anInt6566;
			return;
		}
		this.anInt6560 = this.anInt6569 * this.anInt6566 >> 12;
		this.anInt6566 = this.anInt6561 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt6560 < 0) {
			this.anInt6560 = 0;
		} else if (this.anInt6560 > 4096) {
			this.anInt6560 = 4096;
		}
		this.anInt6566 = this.anInt6566 * this.anInt6566 >> 12;
		this.anInt6566 = this.anInt6566 * this.anInt6560 >> 12;
		this.anInt6564 += this.anInt6568 * this.anInt6566 >> 12;
		this.anInt6568 = this.anInt6563 * this.anInt6568 >> 12;
	}
}
