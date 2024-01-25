import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class Class101_Sub2 extends Class101 {

	@OriginalMember(owner = "client!om", name = "r", descriptor = "I")
	private int anInt9150;

	@OriginalMember(owner = "client!om", name = "s", descriptor = "[B")
	private byte[] aByteArray107;

	@OriginalMember(owner = "client!om", name = "v", descriptor = "I")
	private int anInt9153;

	@OriginalMember(owner = "client!om", name = "x", descriptor = "I")
	private int anInt9155;

	@OriginalMember(owner = "client!om", name = "F", descriptor = "I")
	private int anInt9161;

	@OriginalMember(owner = "client!om", name = "C", descriptor = "I")
	private final int anInt9159;

	@OriginalMember(owner = "client!om", name = "w", descriptor = "I")
	private final int anInt9154;

	@OriginalMember(owner = "client!om", name = "y", descriptor = "I")
	private final int anInt9156;

	@OriginalMember(owner = "client!om", name = "q", descriptor = "I")
	private int anInt9149;

	@OriginalMember(owner = "client!om", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class101_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9159 = (int) (arg6 * 4096.0F);
		this.anInt9154 = (int) (arg7 * 4096.0F);
		this.anInt9149 = this.anInt9156 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7244() {
		this.anInt9161 = 0;
		this.anInt9150 = 0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9155 = this.anInt9159 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt9153 = 4096;
			this.anInt9155 = this.anInt9155 * this.anInt9155 >> 12;
			this.anInt9150 = this.anInt9155;
			return;
		}
		this.anInt9153 = this.anInt9155 * this.anInt9154 >> 12;
		this.anInt9155 = this.anInt9159 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt9153 < 0) {
			this.anInt9153 = 0;
		} else if (this.anInt9153 > 4096) {
			this.anInt9153 = 4096;
		}
		this.anInt9155 = this.anInt9155 * this.anInt9155 >> 12;
		this.anInt9155 = this.anInt9155 * this.anInt9153 >> 12;
		this.anInt9150 += this.anInt9155 * this.anInt9149 >> 12;
		this.anInt9149 = this.anInt9149 * this.anInt9156 >> 12;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BII)V")
	protected void method7251(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray107[arg1] = arg0;
	}

	@OriginalMember(owner = "client!om", name = "d", descriptor = "(B)V")
	@Override
	protected final void method7247() {
		this.anInt9150 >>= 0x4;
		this.anInt9149 = this.anInt9156;
		if (this.anInt9150 < 0) {
			this.anInt9150 = 0;
		} else if (this.anInt9150 > 255) {
			this.anInt9150 = 255;
		}
		this.method7251((byte) this.anInt9150, this.anInt9161++);
		this.anInt9150 = 0;
	}
}
