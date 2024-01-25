import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!um", name = "u", descriptor = "I")
	private int anInt4149;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!um", name = "A", descriptor = "I")
	private int anInt4153;

	@OriginalMember(owner = "client!um", name = "B", descriptor = "I")
	private int anInt4154;

	@OriginalMember(owner = "client!um", name = "E", descriptor = "I")
	private int anInt4156;

	@OriginalMember(owner = "client!um", name = "F", descriptor = "I")
	private final int anInt4157;

	@OriginalMember(owner = "client!um", name = "K", descriptor = "I")
	private final int anInt4161;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "I")
	private final int anInt4152;

	@OriginalMember(owner = "client!um", name = "D", descriptor = "I")
	private int anInt4155;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class40_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4157 = (int) (arg6 * 4096.0F);
		this.anInt4161 = (int) (arg7 * 4096.0F);
		this.anInt4155 = this.anInt4152 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5287() {
		this.anInt4156 = 0;
		this.anInt4153 = 0;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
	protected void method3846(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray74[arg0] = arg1;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4154 = this.anInt4157 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt4149 = 4096;
			this.anInt4154 = this.anInt4154 * this.anInt4154 >> 12;
			this.anInt4156 = this.anInt4154;
			return;
		}
		this.anInt4149 = this.anInt4161 * this.anInt4154 >> 12;
		this.anInt4154 = this.anInt4157 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt4149 < 0) {
			this.anInt4149 = 0;
		} else if (this.anInt4149 > 4096) {
			this.anInt4149 = 4096;
		}
		this.anInt4154 = this.anInt4154 * this.anInt4154 >> 12;
		this.anInt4154 = this.anInt4149 * this.anInt4154 >> 12;
		this.anInt4156 += this.anInt4154 * this.anInt4155 >> 12;
		this.anInt4155 = this.anInt4152 * this.anInt4155 >> 12;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5280() {
		this.anInt4156 >>= 0x4;
		this.anInt4155 = this.anInt4152;
		if (this.anInt4156 < 0) {
			this.anInt4156 = 0;
		} else if (this.anInt4156 > 255) {
			this.anInt4156 = 255;
		}
		this.method3846(this.anInt4153++, (byte) this.anInt4156);
		this.anInt4156 = 0;
	}
}
