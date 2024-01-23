import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class Class31_Sub1 extends Class31 {

	@OriginalMember(owner = "client!co", name = "t", descriptor = "I")
	private int anInt5477;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "I")
	private int anInt5482;

	@OriginalMember(owner = "client!co", name = "B", descriptor = "I")
	private int anInt5485;

	@OriginalMember(owner = "client!co", name = "F", descriptor = "[B")
	private byte[] aByteArray62;

	@OriginalMember(owner = "client!co", name = "I", descriptor = "I")
	private int anInt5491;

	@OriginalMember(owner = "client!co", name = "K", descriptor = "I")
	private int anInt5493;

	@OriginalMember(owner = "client!co", name = "A", descriptor = "I")
	private int anInt5484;

	@OriginalMember(owner = "client!co", name = "u", descriptor = "I")
	private int anInt5478;

	@OriginalMember(owner = "client!co", name = "q", descriptor = "I")
	private int anInt5475;

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class31_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5493 = (int) (arg7 * 4096.0F);
		this.anInt5484 = (int) (arg6 * 4096.0F);
		this.anInt5475 = this.anInt5478 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!co", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4125() {
		this.anInt5491 = 0;
		this.anInt5485 = 0;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5477 = this.anInt5484 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5482 = 4096;
			this.anInt5477 = this.anInt5477 * this.anInt5477 >> 12;
			this.anInt5485 = this.anInt5477;
			return;
		}
		this.anInt5482 = this.anInt5477 * this.anInt5493 >> 12;
		this.anInt5477 = this.anInt5484 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt5477 = this.anInt5477 * this.anInt5477 >> 12;
		if (this.anInt5482 < 0) {
			this.anInt5482 = 0;
		} else if (this.anInt5482 > 4096) {
			this.anInt5482 = 4096;
		}
		this.anInt5477 = this.anInt5477 * this.anInt5482 >> 12;
		this.anInt5485 += this.anInt5477 * this.anInt5475 >> 12;
		this.anInt5475 = this.anInt5478 * this.anInt5475 >> 12;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IB)V")
	protected void method4133(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray62[arg0] = arg1;
	}

	@OriginalMember(owner = "client!co", name = "d", descriptor = "(B)V")
	@Override
	protected final void method4126() {
		this.anInt5475 = this.anInt5478;
		this.anInt5485 >>= 0x4;
		if (this.anInt5485 < 0) {
			this.anInt5485 = 0;
		} else if (this.anInt5485 > 255) {
			this.anInt5485 = 255;
		}
		this.method4133(this.anInt5491++, (byte) this.anInt5485);
		this.anInt5485 = 0;
	}
}
