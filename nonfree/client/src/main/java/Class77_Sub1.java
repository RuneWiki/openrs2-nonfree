import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class Class77_Sub1 extends Class77 {

	@OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
	private int anInt5890;

	@OriginalMember(owner = "client!fg", name = "s", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!fg", name = "u", descriptor = "I")
	private int anInt5892;

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "I")
	private int anInt5899;

	@OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
	private int anInt5903;

	@OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
	private final int anInt5897;

	@OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
	private final int anInt5895;

	@OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
	private final int anInt5902;

	@OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
	private int anInt5891;

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class77_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5897 = (int) (arg6 * 4096.0F);
		this.anInt5895 = (int) (arg7 * 4096.0F);
		this.anInt5891 = this.anInt5902 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5136() {
		this.anInt5891 = this.anInt5902;
		this.anInt5890 >>= 0x4;
		if (this.anInt5890 < 0) {
			this.anInt5890 = 0;
		} else if (this.anInt5890 > 255) {
			this.anInt5890 = 255;
		}
		this.method4690(this.anInt5899++, (byte) this.anInt5890);
		this.anInt5890 = 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5892 = this.anInt5897 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt5903 = 4096;
			this.anInt5892 = this.anInt5892 * this.anInt5892 >> 12;
			this.anInt5890 = this.anInt5892;
			return;
		}
		this.anInt5903 = this.anInt5892 * this.anInt5895 >> 12;
		if (this.anInt5903 < 0) {
			this.anInt5903 = 0;
		} else if (this.anInt5903 > 4096) {
			this.anInt5903 = 4096;
		}
		this.anInt5892 = this.anInt5897 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt5892 = this.anInt5892 * this.anInt5892 >> 12;
		this.anInt5892 = this.anInt5903 * this.anInt5892 >> 12;
		this.anInt5890 += this.anInt5892 * this.anInt5891 >> 12;
		this.anInt5891 = this.anInt5902 * this.anInt5891 >> 12;
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5140() {
		this.anInt5899 = 0;
		this.anInt5890 = 0;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZIB)V")
	protected void method4690(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray77[arg0] = arg1;
	}
}
