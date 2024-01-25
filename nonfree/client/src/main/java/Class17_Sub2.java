import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "I")
	private int anInt8182;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
	private int anInt8183;

	@OriginalMember(owner = "client!kq", name = "u", descriptor = "I")
	private int anInt8184;

	@OriginalMember(owner = "client!kq", name = "z", descriptor = "I")
	private int anInt8188;

	@OriginalMember(owner = "client!kq", name = "A", descriptor = "I")
	private final int anInt8189;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "I")
	private final int anInt8187;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	private final int anInt8180;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
	private int anInt8185;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8189 = (int) (arg7 * 4096.0F);
		this.anInt8187 = (int) (arg6 * 4096.0F);
		this.anInt8185 = this.anInt8180 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(ZIB)V")
	protected void method6657(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray102[arg0] = arg1;
	}

	@OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6655() {
		this.anInt8184 = 0;
		this.anInt8188 = 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method6652(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8183 = this.anInt8187 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt8182 = 4096;
			this.anInt8183 = this.anInt8183 * this.anInt8183 >> 12;
			this.anInt8184 = this.anInt8183;
			return;
		}
		this.anInt8182 = this.anInt8183 * this.anInt8189 >> 12;
		if (this.anInt8182 < 0) {
			this.anInt8182 = 0;
		} else if (this.anInt8182 > 4096) {
			this.anInt8182 = 4096;
		}
		this.anInt8183 = this.anInt8187 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt8183 = this.anInt8183 * this.anInt8183 >> 12;
		this.anInt8183 = this.anInt8183 * this.anInt8182 >> 12;
		this.anInt8184 += this.anInt8183 * this.anInt8185 >> 12;
		this.anInt8185 = this.anInt8180 * this.anInt8185 >> 12;
	}

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6654() {
		this.anInt8184 >>= 0x4;
		this.anInt8185 = this.anInt8180;
		if (this.anInt8184 < 0) {
			this.anInt8184 = 0;
		} else if (this.anInt8184 > 255) {
			this.anInt8184 = 255;
		}
		this.method6657(this.anInt8188++, (byte) this.anInt8184);
		this.anInt8184 = 0;
	}
}
