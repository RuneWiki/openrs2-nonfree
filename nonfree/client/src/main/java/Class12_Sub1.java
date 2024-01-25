import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "[I")
	public static final int[] anIntArray659 = new int[32];

	@OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
	private int anInt7494;

	@OriginalMember(owner = "client!ai", name = "v", descriptor = "I")
	private int anInt7497;

	@OriginalMember(owner = "client!ai", name = "x", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!ai", name = "z", descriptor = "I")
	private int anInt7499;

	@OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
	private int anInt7502;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	private final int anInt7491;

	@OriginalMember(owner = "client!ai", name = "t", descriptor = "I")
	private final int anInt7495;

	@OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
	private final int anInt7501;

	@OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
	private int anInt7503;

	static {
		@Pc(9) int local9 = 2;
		for (@Pc(11) int local11 = 0; local11 < 32; local11++) {
			anIntArray659[local11] = local9 - 1;
			local9 += local9;
		}
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt7491 = (int) (arg6 * 4096.0F);
		this.anInt7495 = (int) (arg7 * 4096.0F);
		this.anInt7503 = this.anInt7501 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIB)V")
	protected void method6180(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray88[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
	@Override
	protected final void method6176() {
		this.anInt7497 >>= 0x4;
		this.anInt7503 = this.anInt7501;
		if (this.anInt7497 < 0) {
			this.anInt7497 = 0;
		} else if (this.anInt7497 > 255) {
			this.anInt7497 = 255;
		}
		this.method6180(this.anInt7502++, (byte) this.anInt7497);
		this.anInt7497 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6172() {
		this.anInt7502 = 0;
		this.anInt7497 = 0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method6178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt7494 = this.anInt7491 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt7494 = this.anInt7494 * this.anInt7494 >> 12;
			this.anInt7499 = 4096;
			this.anInt7497 = this.anInt7494;
			return;
		}
		this.anInt7499 = this.anInt7495 * this.anInt7494 >> 12;
		if (this.anInt7499 < 0) {
			this.anInt7499 = 0;
		} else if (this.anInt7499 > 4096) {
			this.anInt7499 = 4096;
		}
		this.anInt7494 = this.anInt7491 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt7494 = this.anInt7494 * this.anInt7494 >> 12;
		this.anInt7494 = this.anInt7494 * this.anInt7499 >> 12;
		this.anInt7497 += this.anInt7494 * this.anInt7503 >> 12;
		this.anInt7503 = this.anInt7503 * this.anInt7501 >> 12;
	}
}
