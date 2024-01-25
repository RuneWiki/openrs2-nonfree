import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class Class42_Sub1 extends Class42 {

	@OriginalMember(owner = "client!cn", name = "t", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
	private int anInt4160;

	@OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
	private int anInt4163;

	@OriginalMember(owner = "client!cn", name = "A", descriptor = "I")
	private int anInt4164;

	@OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
	private int anInt4169;

	@OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
	private final int anInt4161;

	@OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
	private final int anInt4166;

	@OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
	private final int anInt4158;

	@OriginalMember(owner = "client!cn", name = "F", descriptor = "I")
	private int anInt4168;

	@OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class42_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4161 = (int) (arg7 * 4096.0F);
		this.anInt4166 = (int) (arg6 * 4096.0F);
		this.anInt4168 = this.anInt4158 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4169 = this.anInt4166 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt4164 = 4096;
			this.anInt4169 = this.anInt4169 * this.anInt4169 >> 12;
			this.anInt4163 = this.anInt4169;
			return;
		}
		this.anInt4164 = this.anInt4169 * this.anInt4161 >> 12;
		if (this.anInt4164 < 0) {
			this.anInt4164 = 0;
		} else if (this.anInt4164 > 4096) {
			this.anInt4164 = 4096;
		}
		this.anInt4169 = this.anInt4166 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt4169 = this.anInt4169 * this.anInt4169 >> 12;
		this.anInt4169 = this.anInt4164 * this.anInt4169 >> 12;
		this.anInt4163 += this.anInt4168 * this.anInt4169 >> 12;
		this.anInt4168 = this.anInt4158 * this.anInt4168 >> 12;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)V")
	protected void method3548(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray47[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cn", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3544() {
		this.anInt4163 >>= 0x4;
		this.anInt4168 = this.anInt4158;
		if (this.anInt4163 < 0) {
			this.anInt4163 = 0;
		} else if (this.anInt4163 > 255) {
			this.anInt4163 = 255;
		}
		this.method3548(this.anInt4160++, (byte) this.anInt4163);
		this.anInt4163 = 0;
	}

	@OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3536() {
		this.anInt4163 = 0;
		this.anInt4160 = 0;
	}
}
