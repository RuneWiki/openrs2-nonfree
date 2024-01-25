import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
	private int anInt137;

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!dj", name = "C", descriptor = "I")
	private int anInt149;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!dj", name = "G", descriptor = "I")
	private int anInt151;

	@OriginalMember(owner = "client!dj", name = "w", descriptor = "I")
	private final int anInt144;

	@OriginalMember(owner = "client!dj", name = "t", descriptor = "I")
	private final int anInt141;

	@OriginalMember(owner = "client!dj", name = "v", descriptor = "I")
	private final int anInt143;

	@OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
	private int anInt139;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt144 = (int) (arg6 * 4096.0F);
		this.anInt141 = (int) (arg7 * 4096.0F);
		this.anInt139 = this.anInt143 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4955() {
		this.anInt139 = this.anInt143;
		this.anInt149 >>= 0x4;
		if (this.anInt149 < 0) {
			this.anInt149 = 0;
		} else if (this.anInt149 > 255) {
			this.anInt149 = 255;
		}
		this.method117((byte) this.anInt149, this.anInt151++);
		this.anInt149 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4953(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt137 = this.anInt144 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt140 = 4096;
			this.anInt137 = this.anInt137 * this.anInt137 >> 12;
			this.anInt149 = this.anInt137;
			return;
		}
		this.anInt140 = this.anInt137 * this.anInt141 >> 12;
		this.anInt137 = this.anInt144 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt140 < 0) {
			this.anInt140 = 0;
		} else if (this.anInt140 > 4096) {
			this.anInt140 = 4096;
		}
		this.anInt137 = this.anInt137 * this.anInt137 >> 12;
		this.anInt137 = this.anInt137 * this.anInt140 >> 12;
		this.anInt149 += this.anInt139 * this.anInt137 >> 12;
		this.anInt139 = this.anInt143 * this.anInt139 >> 12;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4951() {
		this.anInt149 = 0;
		this.anInt151 = 0;
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(BII)V")
	protected void method117(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray2[arg1] = arg0;
	}
}
