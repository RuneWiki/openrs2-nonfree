import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	private int anInt5269;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	private int anInt5271;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "I")
	private int anInt5272;

	@OriginalMember(owner = "client!en", name = "A", descriptor = "I")
	private int anInt5273;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!en", name = "y", descriptor = "I")
	private final int anInt5274;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "I")
	private final int anInt5268;

	@OriginalMember(owner = "client!en", name = "C", descriptor = "I")
	private final int anInt5267;

	@OriginalMember(owner = "client!en", name = "u", descriptor = "I")
	private int anInt5266;

	@OriginalMember(owner = "client!en", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class105_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5274 = (int) (arg6 * 4096.0F);
		this.anInt5268 = (int) (arg7 * 4096.0F);
		this.anInt5266 = this.anInt5267 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8372() {
		this.anInt5266 = this.anInt5267;
		this.anInt5273 >>= 0x4;
		if (this.anInt5273 < 0) {
			this.anInt5273 = 0;
		} else if (this.anInt5273 > 255) {
			this.anInt5273 = 255;
		}
		this.method4735(this.anInt5271++, (byte) this.anInt5273);
		this.anInt5273 = 0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(IBI)V")
	protected void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray71[arg0] = arg1;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8370(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5272 = this.anInt5274 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt5269 = 4096;
			this.anInt5272 = this.anInt5272 * this.anInt5272 >> 12;
			this.anInt5273 = this.anInt5272;
			return;
		}
		this.anInt5269 = this.anInt5272 * this.anInt5268 >> 12;
		if (this.anInt5269 < 0) {
			this.anInt5269 = 0;
		} else if (this.anInt5269 > 4096) {
			this.anInt5269 = 4096;
		}
		this.anInt5272 = this.anInt5274 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt5272 = this.anInt5272 * this.anInt5272 >> 12;
		this.anInt5272 = this.anInt5272 * this.anInt5269 >> 12;
		this.anInt5273 += this.anInt5266 * this.anInt5272 >> 12;
		this.anInt5266 = this.anInt5267 * this.anInt5266 >> 12;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8371() {
		this.anInt5271 = 0;
		this.anInt5273 = 0;
	}
}
