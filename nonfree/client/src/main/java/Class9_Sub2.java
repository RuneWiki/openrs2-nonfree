import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class Class9_Sub2 extends Class9 {

	@OriginalMember(owner = "client!pi", name = "p", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!pi", name = "s", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!pi", name = "t", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!pi", name = "z", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "I")
	private int anInt676;

	@OriginalMember(owner = "client!pi", name = "C", descriptor = "I")
	private final int anInt678;

	@OriginalMember(owner = "client!pi", name = "q", descriptor = "I")
	private final int anInt667;

	@OriginalMember(owner = "client!pi", name = "B", descriptor = "I")
	private final int anInt677;

	@OriginalMember(owner = "client!pi", name = "r", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class9_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt678 = (int) (arg7 * 4096.0F);
		this.anInt667 = (int) (arg6 * 4096.0F);
		this.anInt668 = this.anInt677 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	protected void method845(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray10[arg0] = arg1;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt666 = this.anInt667 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt666 = this.anInt666 * this.anInt666 >> 12;
			this.anInt676 = 4096;
			this.anInt669 = this.anInt666;
			return;
		}
		this.anInt676 = this.anInt666 * this.anInt678 >> 12;
		this.anInt666 = this.anInt667 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt676 < 0) {
			this.anInt676 = 0;
		} else if (this.anInt676 > 4096) {
			this.anInt676 = 4096;
		}
		this.anInt666 = this.anInt666 * this.anInt666 >> 12;
		this.anInt666 = this.anInt676 * this.anInt666 >> 12;
		this.anInt669 += this.anInt666 * this.anInt668 >> 12;
		this.anInt668 = this.anInt677 * this.anInt668 >> 12;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	@Override
	protected final void method838() {
		this.anInt675 = 0;
		this.anInt669 = 0;
	}

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(B)V")
	@Override
	protected final void method840() {
		this.anInt668 = this.anInt677;
		this.anInt669 >>= 0x4;
		if (this.anInt669 < 0) {
			this.anInt669 = 0;
		} else if (this.anInt669 > 255) {
			this.anInt669 = 255;
		}
		this.method845(this.anInt675++, (byte) this.anInt669);
		this.anInt669 = 0;
	}
}
