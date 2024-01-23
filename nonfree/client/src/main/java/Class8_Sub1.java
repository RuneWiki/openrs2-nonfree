import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class Class8_Sub1 extends Class8 {

	@OriginalMember(owner = "client!fo", name = "u", descriptor = "I")
	private int anInt4425;

	@OriginalMember(owner = "client!fo", name = "v", descriptor = "I")
	private int anInt4426;

	@OriginalMember(owner = "client!fo", name = "x", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
	private int anInt4432;

	@OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
	private int anInt4440;

	@OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
	private int anInt4436;

	@OriginalMember(owner = "client!fo", name = "B", descriptor = "I")
	private int anInt4429;

	@OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
	private int anInt4435;

	@OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
	private int anInt4431;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class8_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4436 = (int) (arg6 * 4096.0F);
		this.anInt4429 = (int) (arg7 * 4096.0F);
		this.anInt4431 = this.anInt4435 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt4426 = this.anInt4436 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4426 = this.anInt4426 * this.anInt4426 >> 12;
			this.anInt4440 = 4096;
			this.anInt4425 = this.anInt4426;
			return;
		}
		this.anInt4440 = this.anInt4426 * this.anInt4429 >> 12;
		this.anInt4426 = this.anInt4436 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt4440 < 0) {
			this.anInt4440 = 0;
		} else if (this.anInt4440 > 4096) {
			this.anInt4440 = 4096;
		}
		this.anInt4426 = this.anInt4426 * this.anInt4426 >> 12;
		this.anInt4426 = this.anInt4440 * this.anInt4426 >> 12;
		this.anInt4425 += this.anInt4426 * this.anInt4431 >> 12;
		this.anInt4431 = this.anInt4431 * this.anInt4435 >> 12;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IB)V")
	protected void method3723(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray61[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4254() {
		this.anInt4425 = 0;
		this.anInt4432 = 0;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4251() {
		this.anInt4425 >>= 0x4;
		this.anInt4431 = this.anInt4435;
		if (this.anInt4425 < 0) {
			this.anInt4425 = 0;
		} else if (this.anInt4425 > 255) {
			this.anInt4425 = 255;
		}
		this.method3723(this.anInt4432++, (byte) this.anInt4425);
		this.anInt4425 = 0;
	}
}
