import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class Class18_Sub1 extends Class18 {

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
	private int anInt6730;

	@OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
	private int anInt6734;

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "I")
	private int anInt6737;

	@OriginalMember(owner = "client!vea", name = "F", descriptor = "I")
	private int anInt6742;

	@OriginalMember(owner = "client!vea", name = "I", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!vea", name = "B", descriptor = "I")
	private final int anInt6738;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "I")
	private final int anInt6736;

	@OriginalMember(owner = "client!vea", name = "u", descriptor = "I")
	private final int anInt6732;

	@OriginalMember(owner = "client!vea", name = "J", descriptor = "I")
	private int anInt6744;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class18_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6738 = (int) (arg6 * 4096.0F);
		this.anInt6736 = (int) (arg7 * 4096.0F);
		this.anInt6744 = this.anInt6732 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8417() {
		this.anInt6742 >>= 0x4;
		this.anInt6744 = this.anInt6732;
		if (this.anInt6742 < 0) {
			this.anInt6742 = 0;
		} else if (this.anInt6742 > 255) {
			this.anInt6742 = 255;
		}
		this.method5643((byte) this.anInt6742, this.anInt6734++);
		this.anInt6742 = 0;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIB)V")
	protected void method5643(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray58[arg1] = arg0;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt6730 = this.anInt6738 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt6737 = 4096;
			this.anInt6730 = this.anInt6730 * this.anInt6730 >> 12;
			this.anInt6742 = this.anInt6730;
			return;
		}
		this.anInt6737 = this.anInt6736 * this.anInt6730 >> 12;
		if (this.anInt6737 < 0) {
			this.anInt6737 = 0;
		} else if (this.anInt6737 > 4096) {
			this.anInt6737 = 4096;
		}
		this.anInt6730 = this.anInt6738 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt6730 = this.anInt6730 * this.anInt6730 >> 12;
		this.anInt6730 = this.anInt6737 * this.anInt6730 >> 12;
		this.anInt6742 += this.anInt6730 * this.anInt6744 >> 12;
		this.anInt6744 = this.anInt6744 * this.anInt6732 >> 12;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8415() {
		this.anInt6734 = 0;
		this.anInt6742 = 0;
	}
}
