import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class Class53_Sub2 extends Class53 {

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	private int anInt5073;

	@OriginalMember(owner = "client!ki", name = "C", descriptor = "I")
	private int anInt5075;

	@OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
	private int anInt5079;

	@OriginalMember(owner = "client!ki", name = "H", descriptor = "[B")
	private byte[] aByteArray152;

	@OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
	private int anInt5085;

	@OriginalMember(owner = "client!ki", name = "N", descriptor = "I")
	private final int anInt5084;

	@OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
	private final int anInt5078;

	@OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
	private final int anInt5080;

	@OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
	private int anInt5081;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class53_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5084 = (int) (arg6 * 4096.0F);
		this.anInt5078 = (int) (arg7 * 4096.0F);
		this.anInt5081 = this.anInt5080 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4747() {
		this.anInt5081 = this.anInt5080;
		this.anInt5073 >>= 0x4;
		if (this.anInt5073 < 0) {
			this.anInt5073 = 0;
		} else if (this.anInt5073 > 255) {
			this.anInt5073 = 255;
		}
		this.method4555(this.anInt5079++, (byte) this.anInt5073);
		this.anInt5073 = 0;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4750() {
		this.anInt5073 = 0;
		this.anInt5079 = 0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
	protected void method4555(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray152[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method4758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt5085 = this.anInt5084 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt5075 = 4096;
			this.anInt5085 = this.anInt5085 * this.anInt5085 >> 12;
			this.anInt5073 = this.anInt5085;
			return;
		}
		this.anInt5075 = this.anInt5078 * this.anInt5085 >> 12;
		if (this.anInt5075 < 0) {
			this.anInt5075 = 0;
		} else if (this.anInt5075 > 4096) {
			this.anInt5075 = 4096;
		}
		this.anInt5085 = this.anInt5084 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt5085 = this.anInt5085 * this.anInt5085 >> 12;
		this.anInt5085 = this.anInt5075 * this.anInt5085 >> 12;
		this.anInt5073 += this.anInt5085 * this.anInt5081 >> 12;
		this.anInt5081 = this.anInt5081 * this.anInt5080 >> 12;
	}
}
