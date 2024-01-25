import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class Class221_Sub2 extends Class221 {

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	private int anInt8696;

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	private int anInt8697;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "I")
	private int anInt8700;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
	private int anInt8711;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private final int anInt8707;

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
	private final int anInt8705;

	@OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
	private final int anInt8710;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "I")
	private int anInt8699;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class221_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8707 = (int) (arg6 * 4096.0F);
		this.anInt8705 = (int) (arg7 * 4096.0F);
		this.anInt8699 = this.anInt8710 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIB)V")
	protected void method7474(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray81[arg1] = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7472() {
		this.anInt8711 >>= 0x4;
		this.anInt8699 = this.anInt8710;
		if (this.anInt8711 < 0) {
			this.anInt8711 = 0;
		} else if (this.anInt8711 > 255) {
			this.anInt8711 = 255;
		}
		this.method7474((byte) this.anInt8711, this.anInt8700++);
		this.anInt8711 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7467() {
		this.anInt8711 = 0;
		this.anInt8700 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7473(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8697 = this.anInt8707 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt8697 = this.anInt8697 * this.anInt8697 >> 12;
			this.anInt8696 = 4096;
			this.anInt8711 = this.anInt8697;
			return;
		}
		this.anInt8696 = this.anInt8697 * this.anInt8705 >> 12;
		if (this.anInt8696 < 0) {
			this.anInt8696 = 0;
		} else if (this.anInt8696 > 4096) {
			this.anInt8696 = 4096;
		}
		this.anInt8697 = this.anInt8707 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt8697 = this.anInt8697 * this.anInt8697 >> 12;
		this.anInt8697 = this.anInt8696 * this.anInt8697 >> 12;
		this.anInt8711 += this.anInt8697 * this.anInt8699 >> 12;
		this.anInt8699 = this.anInt8710 * this.anInt8699 >> 12;
	}
}
