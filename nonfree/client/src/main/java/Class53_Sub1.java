import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class Class53_Sub1 extends Class53 {

	@OriginalMember(owner = "client!cl", name = "q", descriptor = "[B")
	private byte[] aByteArray125;

	@OriginalMember(owner = "client!cl", name = "r", descriptor = "I")
	private int anInt9062;

	@OriginalMember(owner = "client!cl", name = "s", descriptor = "I")
	private int anInt9063;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	private int anInt9068;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
	private int anInt9070;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "I")
	private final int anInt9071;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	private final int anInt9059;

	@OriginalMember(owner = "client!cl", name = "u", descriptor = "I")
	private final int anInt9065;

	@OriginalMember(owner = "client!cl", name = "v", descriptor = "I")
	private int anInt9066;

	@OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class53_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9071 = (int) (arg7 * 4096.0F);
		this.anInt9059 = (int) (arg6 * 4096.0F);
		this.anInt9066 = this.anInt9065 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IBI)V")
	protected void method7338(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray125[arg1] = arg0;
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7335() {
		this.anInt9070 = 0;
		this.anInt9063 = 0;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9068 = this.anInt9059 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt9068 = this.anInt9068 * this.anInt9068 >> 12;
			this.anInt9062 = 4096;
			this.anInt9070 = this.anInt9068;
			return;
		}
		this.anInt9062 = this.anInt9071 * this.anInt9068 >> 12;
		if (this.anInt9062 < 0) {
			this.anInt9062 = 0;
		} else if (this.anInt9062 > 4096) {
			this.anInt9062 = 4096;
		}
		this.anInt9068 = this.anInt9059 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt9068 = this.anInt9068 * this.anInt9068 >> 12;
		this.anInt9068 = this.anInt9062 * this.anInt9068 >> 12;
		this.anInt9070 += this.anInt9068 * this.anInt9066 >> 12;
		this.anInt9066 = this.anInt9065 * this.anInt9066 >> 12;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7333() {
		this.anInt9066 = this.anInt9065;
		this.anInt9070 >>= 0x4;
		if (this.anInt9070 < 0) {
			this.anInt9070 = 0;
		} else if (this.anInt9070 > 255) {
			this.anInt9070 = 255;
		}
		this.method7338((byte) this.anInt9070, this.anInt9063++);
		this.anInt9070 = 0;
	}
}
