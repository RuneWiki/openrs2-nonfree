import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
	private int anInt6453;

	@OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
	private int anInt6455;

	@OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
	private int anInt6456;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	private int anInt6457;

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	private final int anInt6458;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "I")
	private final int anInt6454;

	@OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
	private final int anInt6463;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
	private int anInt6461;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class38_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6458 = (int) (arg7 * 4096.0F);
		this.anInt6454 = (int) (arg6 * 4096.0F);
		this.anInt6461 = this.anInt6463 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5560() {
		this.anInt6455 = 0;
		this.anInt6453 = 0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIB)V")
	protected void method5561(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray80[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6457 = this.anInt6454 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6457 = this.anInt6457 * this.anInt6457 >> 12;
			this.anInt6456 = 4096;
			this.anInt6455 = this.anInt6457;
			return;
		}
		this.anInt6456 = this.anInt6458 * this.anInt6457 >> 12;
		if (this.anInt6456 < 0) {
			this.anInt6456 = 0;
		} else if (this.anInt6456 > 4096) {
			this.anInt6456 = 4096;
		}
		this.anInt6457 = this.anInt6454 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt6457 = this.anInt6457 * this.anInt6457 >> 12;
		this.anInt6457 = this.anInt6457 * this.anInt6456 >> 12;
		this.anInt6455 += this.anInt6457 * this.anInt6461 >> 12;
		this.anInt6461 = this.anInt6463 * this.anInt6461 >> 12;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5555() {
		this.anInt6455 >>= 0x4;
		this.anInt6461 = this.anInt6463;
		if (this.anInt6455 < 0) {
			this.anInt6455 = 0;
		} else if (this.anInt6455 > 255) {
			this.anInt6455 = 255;
		}
		this.method5561(this.anInt6453++, (byte) this.anInt6455);
		this.anInt6455 = 0;
	}
}
