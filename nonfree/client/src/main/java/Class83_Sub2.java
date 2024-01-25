import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class Class83_Sub2 extends Class83 {

	@OriginalMember(owner = "client!uo", name = "y", descriptor = "I")
	private int anInt5266;

	@OriginalMember(owner = "client!uo", name = "C", descriptor = "I")
	private int anInt5270;

	@OriginalMember(owner = "client!uo", name = "D", descriptor = "I")
	private int anInt5271;

	@OriginalMember(owner = "client!uo", name = "E", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!uo", name = "G", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
	private final int anInt5277;

	@OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
	private final int anInt5274;

	@OriginalMember(owner = "client!uo", name = "z", descriptor = "I")
	private final int anInt5267;

	@OriginalMember(owner = "client!uo", name = "J", descriptor = "I")
	private int anInt5276;

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class83_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5277 = (int) (arg6 * 4096.0F);
		this.anInt5274 = (int) (arg7 * 4096.0F);
		this.anInt5276 = this.anInt5267 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5271 = this.anInt5277 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5272 = 4096;
			this.anInt5271 = this.anInt5271 * this.anInt5271 >> 12;
			this.anInt5266 = this.anInt5271;
			return;
		}
		this.anInt5272 = this.anInt5274 * this.anInt5271 >> 12;
		if (this.anInt5272 < 0) {
			this.anInt5272 = 0;
		} else if (this.anInt5272 > 4096) {
			this.anInt5272 = 4096;
		}
		this.anInt5271 = this.anInt5277 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt5271 = this.anInt5271 * this.anInt5271 >> 12;
		this.anInt5271 = this.anInt5271 * this.anInt5272 >> 12;
		this.anInt5266 += this.anInt5276 * this.anInt5271 >> 12;
		this.anInt5276 = this.anInt5267 * this.anInt5276 >> 12;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4784() {
		this.anInt5276 = this.anInt5267;
		this.anInt5266 >>= 0x4;
		if (this.anInt5266 < 0) {
			this.anInt5266 = 0;
		} else if (this.anInt5266 > 255) {
			this.anInt5266 = 255;
		}
		this.method4785(this.anInt5270++, (byte) this.anInt5266);
		this.anInt5266 = 0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	protected void method4785(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray85[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uo", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4783() {
		this.anInt5266 = 0;
		this.anInt5270 = 0;
	}
}
