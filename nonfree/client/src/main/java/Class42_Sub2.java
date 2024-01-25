import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	private int anInt4898;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "I")
	private int anInt4904;

	@OriginalMember(owner = "client!fr", name = "F", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "I")
	private int anInt4906;

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "I")
	private int anInt4908;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	private final int anInt4901;

	@OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
	private final int anInt4894;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	private final int anInt4896;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
	private int anInt4905;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class42_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4901 = (int) (arg6 * 4096.0F);
		this.anInt4894 = (int) (arg7 * 4096.0F);
		this.anInt4905 = this.anInt4896 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BIB)V")
	protected void method4154(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray63[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4147() {
		this.anInt4904 = 0;
		this.anInt4906 = 0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4898 = this.anInt4901 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt4908 = 4096;
			this.anInt4898 = this.anInt4898 * this.anInt4898 >> 12;
			this.anInt4906 = this.anInt4898;
			return;
		}
		this.anInt4908 = this.anInt4898 * this.anInt4894 >> 12;
		if (this.anInt4908 < 0) {
			this.anInt4908 = 0;
		} else if (this.anInt4908 > 4096) {
			this.anInt4908 = 4096;
		}
		this.anInt4898 = this.anInt4901 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt4898 = this.anInt4898 * this.anInt4898 >> 12;
		this.anInt4898 = this.anInt4908 * this.anInt4898 >> 12;
		this.anInt4906 += this.anInt4905 * this.anInt4898 >> 12;
		this.anInt4905 = this.anInt4896 * this.anInt4905 >> 12;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4151() {
		this.anInt4905 = this.anInt4896;
		this.anInt4906 >>= 0x4;
		if (this.anInt4906 < 0) {
			this.anInt4906 = 0;
		} else if (this.anInt4906 > 255) {
			this.anInt4906 = 255;
		}
		this.method4154(this.anInt4904++, (byte) this.anInt4906);
		this.anInt4906 = 0;
	}
}
