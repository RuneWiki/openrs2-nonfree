import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class Class16_Sub2 extends Class16 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
	private int anInt8281;

	@OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
	private int anInt8285;

	@OriginalMember(owner = "client!sm", name = "p", descriptor = "I")
	private int anInt8286;

	@OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
	private int anInt8292;

	@OriginalMember(owner = "client!sm", name = "y", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
	private final int anInt8291;

	@OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
	private final int anInt8282;

	@OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
	private final int anInt8283;

	@OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
	private int anInt8289;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class16_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8291 = (int) (arg7 * 4096.0F);
		this.anInt8282 = (int) (arg6 * 4096.0F);
		this.anInt8289 = this.anInt8283 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8286 = this.anInt8282 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt8281 = 4096;
			this.anInt8286 = this.anInt8286 * this.anInt8286 >> 12;
			this.anInt8285 = this.anInt8286;
			return;
		}
		this.anInt8281 = this.anInt8291 * this.anInt8286 >> 12;
		if (this.anInt8281 < 0) {
			this.anInt8281 = 0;
		} else if (this.anInt8281 > 4096) {
			this.anInt8281 = 4096;
		}
		this.anInt8286 = this.anInt8282 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt8286 = this.anInt8286 * this.anInt8286 >> 12;
		this.anInt8286 = this.anInt8281 * this.anInt8286 >> 12;
		this.anInt8285 += this.anInt8289 * this.anInt8286 >> 12;
		this.anInt8289 = this.anInt8283 * this.anInt8289 >> 12;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7181() {
		this.anInt8289 = this.anInt8283;
		this.anInt8285 >>= 0x4;
		if (this.anInt8285 < 0) {
			this.anInt8285 = 0;
		} else if (this.anInt8285 > 255) {
			this.anInt8285 = 255;
		}
		this.method7188(this.anInt8292++, (byte) this.anInt8285);
		this.anInt8285 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7186() {
		this.anInt8292 = 0;
		this.anInt8285 = 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIB)V")
	protected void method7188(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray75[arg0] = arg1;
	}
}
