import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class Class63_Sub2 extends Class63 {

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
	private int anInt7113;

	@OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
	private int anInt7114;

	@OriginalMember(owner = "client!fn", name = "x", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!fn", name = "C", descriptor = "I")
	private int anInt7120;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
	private int anInt7121;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
	private final int anInt7106;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	private final int anInt7108;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
	private final int anInt7109;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "I")
	private int anInt7115;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class63_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7106 = (int) (arg7 * 4096.0F);
		this.anInt7108 = (int) (arg6 * 4096.0F);
		this.anInt7115 = this.anInt7109 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5902() {
		this.anInt7113 = 0;
		this.anInt7114 = 0;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method5905(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt7121 = this.anInt7108 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt7121 = this.anInt7121 * this.anInt7121 >> 12;
			this.anInt7120 = 4096;
			this.anInt7113 = this.anInt7121;
			return;
		}
		this.anInt7120 = this.anInt7106 * this.anInt7121 >> 12;
		this.anInt7121 = this.anInt7108 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt7120 < 0) {
			this.anInt7120 = 0;
		} else if (this.anInt7120 > 4096) {
			this.anInt7120 = 4096;
		}
		this.anInt7121 = this.anInt7121 * this.anInt7121 >> 12;
		this.anInt7121 = this.anInt7121 * this.anInt7120 >> 12;
		this.anInt7113 += this.anInt7115 * this.anInt7121 >> 12;
		this.anInt7115 = this.anInt7109 * this.anInt7115 >> 12;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIB)V")
	protected void method5910(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray94[arg0] = arg1;
	}

	@OriginalMember(owner = "client!fn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method5904() {
		this.anInt7115 = this.anInt7109;
		this.anInt7113 >>= 0x4;
		if (this.anInt7113 < 0) {
			this.anInt7113 = 0;
		} else if (this.anInt7113 > 255) {
			this.anInt7113 = 255;
		}
		this.method5910(this.anInt7114++, (byte) this.anInt7113);
		this.anInt7113 = 0;
	}
}
