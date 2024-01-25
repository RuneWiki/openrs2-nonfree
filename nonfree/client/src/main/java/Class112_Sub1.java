import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class Class112_Sub1 extends Class112 {

	@OriginalMember(owner = "client!ffa", name = "E", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!ffa", name = "B", descriptor = "I")
	private int anInt8695;

	@OriginalMember(owner = "client!ffa", name = "o", descriptor = "I")
	private int anInt8700;

	@OriginalMember(owner = "client!ffa", name = "p", descriptor = "I")
	private int anInt8705;

	@OriginalMember(owner = "client!ffa", name = "C", descriptor = "I")
	private int anInt8706;

	@OriginalMember(owner = "client!ffa", name = "v", descriptor = "I")
	private final int anInt8696;

	@OriginalMember(owner = "client!ffa", name = "x", descriptor = "I")
	private final int anInt8701;

	@OriginalMember(owner = "client!ffa", name = "D", descriptor = "I")
	private final int anInt8697;

	@OriginalMember(owner = "client!ffa", name = "r", descriptor = "I")
	private int anInt8704;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class112_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8696 = (int) (arg6 * 4096.0F);
		this.anInt8701 = (int) (arg7 * 4096.0F);
		this.anInt8704 = this.anInt8697 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8625() {
		this.anInt8705 >>= 0x4;
		this.anInt8704 = this.anInt8697;
		if (this.anInt8705 < 0) {
			this.anInt8705 = 0;
		} else if (this.anInt8705 > 255) {
			this.anInt8705 = 255;
		}
		this.method7424((byte) this.anInt8705, this.anInt8695++);
		this.anInt8705 = 0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIB)V")
	protected void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray84[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8632() {
		this.anInt8705 = 0;
		this.anInt8695 = 0;
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8630(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8706 = this.anInt8696 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt8700 = 4096;
			this.anInt8706 = this.anInt8706 * this.anInt8706 >> 12;
			this.anInt8705 = this.anInt8706;
			return;
		}
		this.anInt8700 = this.anInt8701 * this.anInt8706 >> 12;
		this.anInt8706 = this.anInt8696 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt8700 < 0) {
			this.anInt8700 = 0;
		} else if (this.anInt8700 > 4096) {
			this.anInt8700 = 4096;
		}
		this.anInt8706 = this.anInt8706 * this.anInt8706 >> 12;
		this.anInt8706 = this.anInt8700 * this.anInt8706 >> 12;
		this.anInt8705 += this.anInt8704 * this.anInt8706 >> 12;
		this.anInt8704 = this.anInt8704 * this.anInt8697 >> 12;
	}
}
