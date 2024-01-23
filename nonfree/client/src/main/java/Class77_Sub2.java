import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!wh", name = "y", descriptor = "[I")
	public static int[] anIntArray492 = new int[256];

	@OriginalMember(owner = "client!wh", name = "B", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!wh", name = "D", descriptor = "I")
	private int anInt5120;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	private int anInt5124;

	@OriginalMember(owner = "client!wh", name = "L", descriptor = "I")
	private int anInt5127;

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
	private int anInt5129;

	@OriginalMember(owner = "client!wh", name = "z", descriptor = "I")
	private int anInt5117;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "I")
	private int anInt5116;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	private int anInt5123;

	@OriginalMember(owner = "client!wh", name = "I", descriptor = "I")
	private int anInt5125;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(9) int local9 = local4;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray492[local4] = local9;
		}
	}

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class77_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5117 = (int) (arg7 * 4096.0F);
		this.anInt5116 = (int) (arg6 * 4096.0F);
		this.anInt5125 = this.anInt5123 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4704() {
		this.anInt5125 = this.anInt5123;
		this.anInt5120 >>= 0x4;
		if (this.anInt5120 < 0) {
			this.anInt5120 = 0;
		} else if (this.anInt5120 > 255) {
			this.anInt5120 = 255;
		}
		this.method4084(this.anInt5124++, (byte) this.anInt5120);
		this.anInt5120 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4703(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt5129 = 4096;
			this.anInt5127 = this.anInt5116 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5127 = this.anInt5127 * this.anInt5127 >> 12;
			this.anInt5120 = this.anInt5127;
			return;
		}
		this.anInt5129 = this.anInt5117 * this.anInt5127 >> 12;
		if (this.anInt5129 < 0) {
			this.anInt5129 = 0;
		} else if (this.anInt5129 > 4096) {
			this.anInt5129 = 4096;
		}
		this.anInt5127 = this.anInt5116 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt5127 = this.anInt5127 * this.anInt5127 >> 12;
		this.anInt5127 = this.anInt5127 * this.anInt5129 >> 12;
		this.anInt5120 += this.anInt5127 * this.anInt5125 >> 12;
		this.anInt5125 = this.anInt5123 * this.anInt5125 >> 12;
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4709() {
		this.anInt5124 = 0;
		this.anInt5120 = 0;
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IB)V")
	protected void method4084(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray53[arg0] = arg1;
	}
}
