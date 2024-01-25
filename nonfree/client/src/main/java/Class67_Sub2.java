import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!gca", name = "u", descriptor = "I")
	private int anInt7556;

	@OriginalMember(owner = "client!gca", name = "s", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!gca", name = "w", descriptor = "I")
	private int anInt7562;

	@OriginalMember(owner = "client!gca", name = "r", descriptor = "I")
	private int anInt7563;

	@OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
	private int anInt7564;

	@OriginalMember(owner = "client!gca", name = "B", descriptor = "I")
	private final int anInt7560;

	@OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
	private final int anInt7565;

	@OriginalMember(owner = "client!gca", name = "y", descriptor = "I")
	private final int anInt7559;

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "I")
	private int anInt7558;

	@OriginalMember(owner = "client!gca", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class67_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7560 = (int) (arg6 * 4096.0F);
		this.anInt7565 = (int) (arg7 * 4096.0F);
		this.anInt7558 = this.anInt7559 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6694() {
		this.anInt7564 >>= 0x4;
		this.anInt7558 = this.anInt7559;
		if (this.anInt7564 < 0) {
			this.anInt7564 = 0;
		} else if (this.anInt7564 > 255) {
			this.anInt7564 = 255;
		}
		this.method6696((byte) this.anInt7564, this.anInt7556++);
		this.anInt7564 = 0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6693() {
		this.anInt7556 = 0;
		this.anInt7564 = 0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(BIZ)V")
	protected void method6696(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray81[arg1] = arg0;
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method6695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7562 = this.anInt7560 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt7562 = this.anInt7562 * this.anInt7562 >> 12;
			this.anInt7563 = 4096;
			this.anInt7564 = this.anInt7562;
			return;
		}
		this.anInt7563 = this.anInt7565 * this.anInt7562 >> 12;
		this.anInt7562 = this.anInt7560 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt7563 < 0) {
			this.anInt7563 = 0;
		} else if (this.anInt7563 > 4096) {
			this.anInt7563 = 4096;
		}
		this.anInt7562 = this.anInt7562 * this.anInt7562 >> 12;
		this.anInt7562 = this.anInt7563 * this.anInt7562 >> 12;
		this.anInt7564 += this.anInt7558 * this.anInt7562 >> 12;
		this.anInt7558 = this.anInt7558 * this.anInt7559 >> 12;
	}
}
