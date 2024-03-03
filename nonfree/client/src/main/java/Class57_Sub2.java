import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
	public static int anInt3587 = 1;

	@OriginalMember(owner = "client!fp", name = "A", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_141 = new Class145(60, -1);

	@OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
	private int anInt3584;

	@OriginalMember(owner = "client!fp", name = "t", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
	private int anInt3589;

	@OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
	private int anInt3591;

	@OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
	private int anInt3595;

	@OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
	private final int anInt3596;

	@OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
	private final int anInt3592;

	@OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
	private final int anInt3585;

	@OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
	private int anInt3583;

	@OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIFFF)V", line = 60)
	protected Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3596 = (int) (arg7 * 4096.0F);
		this.anInt3592 = (int) (arg6 * 4096.0F);
		this.anInt3583 = this.anInt3585 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V", line = 26)
	@Override
	protected final void method6018() {
		this.anInt3595 >>= 0x4;
		this.anInt3583 = this.anInt3585;
		if (this.anInt3595 < 0) {
			this.anInt3595 = 0;
		} else if (this.anInt3595 > 255) {
			this.anInt3595 = 255;
		}
		this.method3538(this.anInt3591++, (byte) this.anInt3595);
		this.anInt3595 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 48)
	@Override
	protected final void method6016() {
		this.anInt3595 = 0;
		this.anInt3591 = 0;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V", line = 70)
	@Override
	protected final void method6012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt3584 = this.anInt3592 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt3584 = this.anInt3584 * this.anInt3584 >> 12;
			this.anInt3589 = 4096;
			this.anInt3595 = this.anInt3584;
			return;
		}
		this.anInt3589 = this.anInt3584 * this.anInt3596 >> 12;
		this.anInt3584 = this.anInt3592 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt3589 < 0) {
			this.anInt3589 = 0;
		} else if (this.anInt3589 > 4096) {
			this.anInt3589 = 4096;
		}
		this.anInt3584 = this.anInt3584 * this.anInt3584 >> 12;
		this.anInt3584 = this.anInt3589 * this.anInt3584 >> 12;
		this.anInt3595 += this.anInt3583 * this.anInt3584 >> 12;
		this.anInt3583 = this.anInt3583 * this.anInt3585 >> 12;
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V", line = 108)
	protected void method3538(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray36[arg0] = arg1;
	}
}
