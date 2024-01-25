import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
	private int anInt5927;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
	private int anInt5929;

	@OriginalMember(owner = "client!oj", name = "v", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
	private int anInt5931;

	@OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
	private int anInt5935;

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
	private final int anInt5925;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
	private final int anInt5926;

	@OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
	private final int anInt5933;

	@OriginalMember(owner = "client!oj", name = "m", descriptor = "I")
	private int anInt5923;

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5925 = (int) (arg6 * 4096.0F);
		this.anInt5926 = (int) (arg7 * 4096.0F);
		this.anInt5923 = this.anInt5933 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5024() {
		this.anInt5927 = 0;
		this.anInt5931 = 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5021(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt5935 = this.anInt5925 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt5929 = 4096;
			this.anInt5935 = this.anInt5935 * this.anInt5935 >> 12;
			this.anInt5927 = this.anInt5935;
			return;
		}
		this.anInt5929 = this.anInt5935 * this.anInt5926 >> 12;
		if (this.anInt5929 < 0) {
			this.anInt5929 = 0;
		} else if (this.anInt5929 > 4096) {
			this.anInt5929 = 4096;
		}
		this.anInt5935 = this.anInt5925 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt5935 = this.anInt5935 * this.anInt5935 >> 12;
		this.anInt5935 = this.anInt5929 * this.anInt5935 >> 12;
		this.anInt5927 += this.anInt5923 * this.anInt5935 >> 12;
		this.anInt5923 = this.anInt5933 * this.anInt5923 >> 12;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
	protected void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray88[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5018() {
		this.anInt5923 = this.anInt5933;
		this.anInt5927 >>= 0x4;
		if (this.anInt5927 < 0) {
			this.anInt5927 = 0;
		} else if (this.anInt5927 > 255) {
			this.anInt5927 = 255;
		}
		this.method5026(this.anInt5931++, (byte) this.anInt5927);
		this.anInt5927 = 0;
	}
}
