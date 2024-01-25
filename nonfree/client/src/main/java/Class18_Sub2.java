import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
	private int anInt8272;

	@OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
	private int anInt8274;

	@OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
	private int anInt8280;

	@OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
	private int anInt8283;

	@OriginalMember(owner = "client!tl", name = "E", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!tl", name = "w", descriptor = "I")
	private final int anInt8277;

	@OriginalMember(owner = "client!tl", name = "G", descriptor = "I")
	private final int anInt8285;

	@OriginalMember(owner = "client!tl", name = "z", descriptor = "I")
	private final int anInt8279;

	@OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
	private int anInt8287;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8277 = (int) (arg6 * 4096.0F);
		this.anInt8285 = (int) (arg7 * 4096.0F);
		this.anInt8287 = this.anInt8279 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8274 = this.anInt8277 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt8274 = this.anInt8274 * this.anInt8274 >> 12;
			this.anInt8280 = 4096;
			this.anInt8272 = this.anInt8274;
			return;
		}
		this.anInt8280 = this.anInt8274 * this.anInt8285 >> 12;
		this.anInt8274 = this.anInt8277 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt8280 < 0) {
			this.anInt8280 = 0;
		} else if (this.anInt8280 > 4096) {
			this.anInt8280 = 4096;
		}
		this.anInt8274 = this.anInt8274 * this.anInt8274 >> 12;
		this.anInt8274 = this.anInt8274 * this.anInt8280 >> 12;
		this.anInt8272 += this.anInt8287 * this.anInt8274 >> 12;
		this.anInt8287 = this.anInt8279 * this.anInt8287 >> 12;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIB)V")
	protected void method7250(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray89[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tl", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7246() {
		this.anInt8272 = 0;
		this.anInt8283 = 0;
	}

	@OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7242() {
		this.anInt8272 >>= 0x4;
		this.anInt8287 = this.anInt8279;
		if (this.anInt8272 < 0) {
			this.anInt8272 = 0;
		} else if (this.anInt8272 > 255) {
			this.anInt8272 = 255;
		}
		this.method7250(this.anInt8283++, (byte) this.anInt8272);
		this.anInt8272 = 0;
	}
}
