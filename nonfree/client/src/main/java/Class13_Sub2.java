import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class Class13_Sub2 extends Class13 {

	@OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
	private int anInt8613;

	@OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
	private int anInt8614;

	@OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
	private int anInt8616;

	@OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
	private int anInt8620;

	@OriginalMember(owner = "client!fs", name = "y", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	private final int anInt8615;

	@OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
	private final int anInt8621;

	@OriginalMember(owner = "client!fs", name = "D", descriptor = "I")
	private final int anInt8625;

	@OriginalMember(owner = "client!fs", name = "C", descriptor = "I")
	private int anInt8624;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class13_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8615 = (int) (arg6 * 4096.0F);
		this.anInt8621 = (int) (arg7 * 4096.0F);
		this.anInt8624 = this.anInt8625 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7327() {
		this.anInt8620 = 0;
		this.anInt8613 = 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IBI)V")
	protected void method7337(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray81[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method7335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8616 = this.anInt8615 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt8614 = 4096;
			this.anInt8616 = this.anInt8616 * this.anInt8616 >> 12;
			this.anInt8613 = this.anInt8616;
			return;
		}
		this.anInt8614 = this.anInt8621 * this.anInt8616 >> 12;
		this.anInt8616 = this.anInt8615 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt8614 < 0) {
			this.anInt8614 = 0;
		} else if (this.anInt8614 > 4096) {
			this.anInt8614 = 4096;
		}
		this.anInt8616 = this.anInt8616 * this.anInt8616 >> 12;
		this.anInt8616 = this.anInt8614 * this.anInt8616 >> 12;
		this.anInt8613 += this.anInt8616 * this.anInt8624 >> 12;
		this.anInt8624 = this.anInt8624 * this.anInt8625 >> 12;
	}

	@OriginalMember(owner = "client!fs", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7328() {
		this.anInt8624 = this.anInt8625;
		this.anInt8613 >>= 0x4;
		if (this.anInt8613 < 0) {
			this.anInt8613 = 0;
		} else if (this.anInt8613 > 255) {
			this.anInt8613 = 255;
		}
		this.method7337(this.anInt8620++, (byte) this.anInt8613);
		this.anInt8613 = 0;
	}
}
