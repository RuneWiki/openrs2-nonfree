import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class Class80_Sub1 extends Class80 {

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "I")
	private int anInt8728;

	@OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
	private int anInt8731;

	@OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
	private int anInt8733;

	@OriginalMember(owner = "client!dq", name = "v", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
	private int anInt8740;

	@OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
	private final int anInt8732;

	@OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
	private final int anInt8739;

	@OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
	private final int anInt8735;

	@OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
	private int anInt8729;

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class80_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8732 = (int) (arg6 * 4096.0F);
		this.anInt8739 = (int) (arg7 * 4096.0F);
		this.anInt8729 = this.anInt8735 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8199() {
		this.anInt8728 = 0;
		this.anInt8740 = 0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8197() {
		this.anInt8728 >>= 0x4;
		this.anInt8729 = this.anInt8735;
		if (this.anInt8728 < 0) {
			this.anInt8728 = 0;
		} else if (this.anInt8728 > 255) {
			this.anInt8728 = 255;
		}
		this.method7314(this.anInt8740++, (byte) this.anInt8728);
		this.anInt8728 = 0;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIB)V")
	protected void method7314(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray87[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8733 = this.anInt8732 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt8731 = 4096;
			this.anInt8733 = this.anInt8733 * this.anInt8733 >> 12;
			this.anInt8728 = this.anInt8733;
			return;
		}
		this.anInt8731 = this.anInt8739 * this.anInt8733 >> 12;
		this.anInt8733 = this.anInt8732 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt8731 < 0) {
			this.anInt8731 = 0;
		} else if (this.anInt8731 > 4096) {
			this.anInt8731 = 4096;
		}
		this.anInt8733 = this.anInt8733 * this.anInt8733 >> 12;
		this.anInt8733 = this.anInt8731 * this.anInt8733 >> 12;
		this.anInt8728 += this.anInt8729 * this.anInt8733 >> 12;
		this.anInt8729 = this.anInt8735 * this.anInt8729 >> 12;
	}
}
