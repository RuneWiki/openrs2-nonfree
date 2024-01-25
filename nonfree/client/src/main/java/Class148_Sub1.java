import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class Class148_Sub1 extends Class148 {

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "I")
	private int anInt6755;

	@OriginalMember(owner = "client!nu", name = "n", descriptor = "I")
	private int anInt6756;

	@OriginalMember(owner = "client!nu", name = "v", descriptor = "I")
	private int anInt6763;

	@OriginalMember(owner = "client!nu", name = "B", descriptor = "I")
	private int anInt6768;

	@OriginalMember(owner = "client!nu", name = "C", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
	private final int anInt6758;

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
	private final int anInt6762;

	@OriginalMember(owner = "client!nu", name = "r", descriptor = "I")
	private final int anInt6760;

	@OriginalMember(owner = "client!nu", name = "o", descriptor = "I")
	private int anInt6757;

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class148_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6758 = (int) (arg7 * 4096.0F);
		this.anInt6762 = (int) (arg6 * 4096.0F);
		this.anInt6757 = this.anInt6760 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt6756 = this.anInt6762 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt6756 = this.anInt6756 * this.anInt6756 >> 12;
			this.anInt6755 = 4096;
			this.anInt6768 = this.anInt6756;
			return;
		}
		this.anInt6755 = this.anInt6756 * this.anInt6758 >> 12;
		if (this.anInt6755 < 0) {
			this.anInt6755 = 0;
		} else if (this.anInt6755 > 4096) {
			this.anInt6755 = 4096;
		}
		this.anInt6756 = this.anInt6762 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt6756 = this.anInt6756 * this.anInt6756 >> 12;
		this.anInt6756 = this.anInt6756 * this.anInt6755 >> 12;
		this.anInt6768 += this.anInt6756 * this.anInt6757 >> 12;
		this.anInt6757 = this.anInt6757 * this.anInt6760 >> 12;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method7944() {
		this.anInt6768 = 0;
		this.anInt6763 = 0;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method7946() {
		this.anInt6768 >>= 0x4;
		this.anInt6757 = this.anInt6760;
		if (this.anInt6768 < 0) {
			this.anInt6768 = 0;
		} else if (this.anInt6768 > 255) {
			this.anInt6768 = 255;
		}
		this.method5651((byte) this.anInt6768, this.anInt6763++);
		this.anInt6768 = 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BII)V")
	protected void method5651(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray60[arg1] = arg0;
	}
}
