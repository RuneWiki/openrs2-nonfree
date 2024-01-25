import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class Class73_Sub1 extends Class73 {

	@OriginalMember(owner = "client!nh", name = "q", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
	private int anInt2494;

	@OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
	private int anInt2505;

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
	private int anInt2506;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	private final int anInt2504;

	@OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
	private final int anInt2500;

	@OriginalMember(owner = "client!nh", name = "H", descriptor = "I")
	private final int anInt2508;

	@OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
	private int anInt2498;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class73_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2504 = (int) (arg6 * 4096.0F);
		this.anInt2500 = (int) (arg7 * 4096.0F);
		this.anInt2498 = this.anInt2508 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7236() {
		this.anInt2505 = 0;
		this.anInt2494 = 0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIZ)V")
	@Override
	protected final void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt2506 = this.anInt2504 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt2506 = this.anInt2506 * this.anInt2506 >> 12;
			this.anInt2497 = 4096;
			this.anInt2494 = this.anInt2506;
			return;
		}
		this.anInt2497 = this.anInt2500 * this.anInt2506 >> 12;
		if (this.anInt2497 < 0) {
			this.anInt2497 = 0;
		} else if (this.anInt2497 > 4096) {
			this.anInt2497 = 4096;
		}
		this.anInt2506 = this.anInt2504 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt2506 = this.anInt2506 * this.anInt2506 >> 12;
		this.anInt2506 = this.anInt2497 * this.anInt2506 >> 12;
		this.anInt2494 += this.anInt2498 * this.anInt2506 >> 12;
		this.anInt2498 = this.anInt2508 * this.anInt2498 >> 12;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIB)V")
	protected void method2214(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray34[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7235() {
		this.anInt2498 = this.anInt2508;
		this.anInt2494 >>= 0x4;
		if (this.anInt2494 < 0) {
			this.anInt2494 = 0;
		} else if (this.anInt2494 > 255) {
			this.anInt2494 = 255;
		}
		this.method2214(this.anInt2505++, (byte) this.anInt2494);
		this.anInt2494 = 0;
	}
}
