import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ika")
public class Class8_Sub2 extends Class8 {

	@OriginalMember(owner = "client!ika", name = "o", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!ika", name = "x", descriptor = "I")
	private int anInt8678;

	@OriginalMember(owner = "client!ika", name = "n", descriptor = "I")
	private int anInt8680;

	@OriginalMember(owner = "client!ika", name = "t", descriptor = "I")
	private int anInt8685;

	@OriginalMember(owner = "client!ika", name = "y", descriptor = "I")
	private int anInt8690;

	@OriginalMember(owner = "client!ika", name = "m", descriptor = "I")
	private final int anInt8682;

	@OriginalMember(owner = "client!ika", name = "u", descriptor = "I")
	private final int anInt8689;

	@OriginalMember(owner = "client!ika", name = "p", descriptor = "I")
	private final int anInt8687;

	@OriginalMember(owner = "client!ika", name = "r", descriptor = "I")
	private int anInt8686;

	@OriginalMember(owner = "client!ika", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class8_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8682 = (int) (arg7 * 4096.0F);
		this.anInt8689 = (int) (arg6 * 4096.0F);
		this.anInt8686 = this.anInt8687 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(BII)V")
	protected void method7604(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray98[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7599(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8690 = this.anInt8689 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt8690 = this.anInt8690 * this.anInt8690 >> 12;
			this.anInt8680 = 4096;
			this.anInt8685 = this.anInt8690;
			return;
		}
		this.anInt8680 = this.anInt8682 * this.anInt8690 >> 12;
		if (this.anInt8680 < 0) {
			this.anInt8680 = 0;
		} else if (this.anInt8680 > 4096) {
			this.anInt8680 = 4096;
		}
		this.anInt8690 = this.anInt8689 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt8690 = this.anInt8690 * this.anInt8690 >> 12;
		this.anInt8690 = this.anInt8690 * this.anInt8680 >> 12;
		this.anInt8685 += this.anInt8690 * this.anInt8686 >> 12;
		this.anInt8686 = this.anInt8687 * this.anInt8686 >> 12;
	}

	@OriginalMember(owner = "client!ika", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7601() {
		this.anInt8686 = this.anInt8687;
		this.anInt8685 >>= 0x4;
		if (this.anInt8685 < 0) {
			this.anInt8685 = 0;
		} else if (this.anInt8685 > 255) {
			this.anInt8685 = 255;
		}
		this.method7604((byte) this.anInt8685, this.anInt8678++);
		this.anInt8685 = 0;
	}

	@OriginalMember(owner = "client!ika", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7597() {
		this.anInt8685 = 0;
		this.anInt8678 = 0;
	}
}
