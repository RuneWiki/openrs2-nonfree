import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
	private int anInt5885;

	@OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!nn", name = "E", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!nn", name = "G", descriptor = "I")
	private int anInt5895;

	@OriginalMember(owner = "client!nn", name = "J", descriptor = "I")
	private int anInt5897;

	@OriginalMember(owner = "client!nn", name = "F", descriptor = "I")
	private final int anInt5894;

	@OriginalMember(owner = "client!nn", name = "L", descriptor = "I")
	private final int anInt5899;

	@OriginalMember(owner = "client!nn", name = "K", descriptor = "I")
	private final int anInt5898;

	@OriginalMember(owner = "client!nn", name = "u", descriptor = "I")
	private int anInt5886;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class45_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5894 = (int) (arg6 * 4096.0F);
		this.anInt5899 = (int) (arg7 * 4096.0F);
		this.anInt5886 = this.anInt5898 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBI)V")
	protected void method5058(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray66[arg1] = arg0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7170() {
		this.anInt5886 = this.anInt5898;
		this.anInt5897 >>= 0x4;
		if (this.anInt5897 < 0) {
			this.anInt5897 = 0;
		} else if (this.anInt5897 > 255) {
			this.anInt5897 = 255;
		}
		this.method5058((byte) this.anInt5897, this.anInt5885++);
		this.anInt5897 = 0;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7179(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5892 = this.anInt5894 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5895 = 4096;
			this.anInt5892 = this.anInt5892 * this.anInt5892 >> 12;
			this.anInt5897 = this.anInt5892;
			return;
		}
		this.anInt5895 = this.anInt5892 * this.anInt5899 >> 12;
		if (this.anInt5895 < 0) {
			this.anInt5895 = 0;
		} else if (this.anInt5895 > 4096) {
			this.anInt5895 = 4096;
		}
		this.anInt5892 = this.anInt5894 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt5892 = this.anInt5892 * this.anInt5892 >> 12;
		this.anInt5892 = this.anInt5892 * this.anInt5895 >> 12;
		this.anInt5897 += this.anInt5892 * this.anInt5886 >> 12;
		this.anInt5886 = this.anInt5898 * this.anInt5886 >> 12;
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7173() {
		this.anInt5897 = 0;
		this.anInt5885 = 0;
	}
}
