import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class Class139_Sub2 extends Class139 {

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	private int anInt8409;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	private int anInt8412;

	@OriginalMember(owner = "client!tc", name = "y", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!tc", name = "B", descriptor = "I")
	private int anInt8417;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "I")
	private int anInt8418;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
	private final int anInt8416;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "I")
	private final int anInt8413;

	@OriginalMember(owner = "client!tc", name = "H", descriptor = "I")
	private final int anInt8422;

	@OriginalMember(owner = "client!tc", name = "I", descriptor = "I")
	private int anInt8423;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class139_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8416 = (int) (arg7 * 4096.0F);
		this.anInt8413 = (int) (arg6 * 4096.0F);
		this.anInt8423 = this.anInt8422 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(IIB)V")
	protected void method6521(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray81[arg0] = arg1;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method6513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt8412 = this.anInt8413 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt8418 = 4096;
			this.anInt8412 = this.anInt8412 * this.anInt8412 >> 12;
			this.anInt8409 = this.anInt8412;
			return;
		}
		this.anInt8418 = this.anInt8412 * this.anInt8416 >> 12;
		if (this.anInt8418 < 0) {
			this.anInt8418 = 0;
		} else if (this.anInt8418 > 4096) {
			this.anInt8418 = 4096;
		}
		this.anInt8412 = this.anInt8413 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt8412 = this.anInt8412 * this.anInt8412 >> 12;
		this.anInt8412 = this.anInt8418 * this.anInt8412 >> 12;
		this.anInt8409 += this.anInt8423 * this.anInt8412 >> 12;
		this.anInt8423 = this.anInt8423 * this.anInt8422 >> 12;
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6520() {
		this.anInt8409 = 0;
		this.anInt8417 = 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6514() {
		this.anInt8423 = this.anInt8422;
		this.anInt8409 >>= 0x4;
		if (this.anInt8409 < 0) {
			this.anInt8409 = 0;
		} else if (this.anInt8409 > 255) {
			this.anInt8409 = 255;
		}
		this.method6521(this.anInt8417++, (byte) this.anInt8409);
		this.anInt8409 = 0;
	}
}
