import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class Class61_Sub1 extends Class61 {

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private int anInt8676;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	private int anInt8680;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "[B")
	private byte[] aByteArray113;

	@OriginalMember(owner = "client!kk", name = "C", descriptor = "I")
	private int anInt8685;

	@OriginalMember(owner = "client!kk", name = "E", descriptor = "I")
	private int anInt8687;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
	private final int anInt8678;

	@OriginalMember(owner = "client!kk", name = "D", descriptor = "I")
	private final int anInt8686;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	private final int anInt8674;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	private int anInt8679;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class61_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8678 = (int) (arg7 * 4096.0F);
		this.anInt8686 = (int) (arg6 * 4096.0F);
		this.anInt8679 = this.anInt8674 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IBZ)V")
	protected void method7347(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray113[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7936(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8680 = this.anInt8686 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt8687 = 4096;
			this.anInt8680 = this.anInt8680 * this.anInt8680 >> 12;
			this.anInt8685 = this.anInt8680;
			return;
		}
		this.anInt8687 = this.anInt8680 * this.anInt8678 >> 12;
		this.anInt8680 = this.anInt8686 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt8687 < 0) {
			this.anInt8687 = 0;
		} else if (this.anInt8687 > 4096) {
			this.anInt8687 = 4096;
		}
		this.anInt8680 = this.anInt8680 * this.anInt8680 >> 12;
		this.anInt8680 = this.anInt8687 * this.anInt8680 >> 12;
		this.anInt8685 += this.anInt8679 * this.anInt8680 >> 12;
		this.anInt8679 = this.anInt8679 * this.anInt8674 >> 12;
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7937() {
		this.anInt8679 = this.anInt8674;
		this.anInt8685 >>= 0x4;
		if (this.anInt8685 < 0) {
			this.anInt8685 = 0;
		} else if (this.anInt8685 > 255) {
			this.anInt8685 = 255;
		}
		this.method7347(this.anInt8676++, (byte) this.anInt8685);
		this.anInt8685 = 0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7938() {
		this.anInt8676 = 0;
		this.anInt8685 = 0;
	}
}
