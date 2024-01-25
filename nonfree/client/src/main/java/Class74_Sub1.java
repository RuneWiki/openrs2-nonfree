import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	private int anInt6158;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	private int anInt6160;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	private int anInt6162;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	private int anInt6167;

	@OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
	private final int anInt6157;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
	private final int anInt6166;

	@OriginalMember(owner = "client!fl", name = "E", descriptor = "I")
	private final int anInt6168;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "I")
	private int anInt6169;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6157 = (int) (arg6 * 4096.0F);
		this.anInt6166 = (int) (arg7 * 4096.0F);
		this.anInt6169 = this.anInt6168 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	@Override
	protected final void method5123() {
		this.anInt6162 >>= 0x4;
		this.anInt6169 = this.anInt6168;
		if (this.anInt6162 < 0) {
			this.anInt6162 = 0;
		} else if (this.anInt6162 > 255) {
			this.anInt6162 = 255;
		}
		this.method5070(this.anInt6167++, (byte) this.anInt6162);
		this.anInt6162 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5122() {
		this.anInt6167 = 0;
		this.anInt6162 = 0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt6158 = this.anInt6157 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt6160 = 4096;
			this.anInt6158 = this.anInt6158 * this.anInt6158 >> 12;
			this.anInt6162 = this.anInt6158;
			return;
		}
		this.anInt6160 = this.anInt6166 * this.anInt6158 >> 12;
		this.anInt6158 = this.anInt6157 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt6160 < 0) {
			this.anInt6160 = 0;
		} else if (this.anInt6160 > 4096) {
			this.anInt6160 = 4096;
		}
		this.anInt6158 = this.anInt6158 * this.anInt6158 >> 12;
		this.anInt6158 = this.anInt6160 * this.anInt6158 >> 12;
		this.anInt6162 += this.anInt6158 * this.anInt6169 >> 12;
		this.anInt6169 = this.anInt6169 * this.anInt6168 >> 12;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BIB)V")
	protected void method5070(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray101[arg0] = arg1;
	}
}
