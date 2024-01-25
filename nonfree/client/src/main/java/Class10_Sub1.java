import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aea")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!aea", name = "x", descriptor = "[C")
	private static final char[] aCharArray6 = new char[64];

	@OriginalMember(owner = "client!aea", name = "n", descriptor = "I")
	private int anInt4497;

	@OriginalMember(owner = "client!aea", name = "r", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "client!aea", name = "u", descriptor = "I")
	private int anInt4504;

	@OriginalMember(owner = "client!aea", name = "w", descriptor = "I")
	private int anInt4506;

	@OriginalMember(owner = "client!aea", name = "y", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!aea", name = "B", descriptor = "I")
	private final int anInt4508;

	@OriginalMember(owner = "client!aea", name = "z", descriptor = "I")
	private final int anInt4507;

	@OriginalMember(owner = "client!aea", name = "v", descriptor = "I")
	private final int anInt4505;

	@OriginalMember(owner = "client!aea", name = "t", descriptor = "I")
	private int anInt4503;

	static {
		for (@Pc(4) int local4 = 0; local4 < 26; local4++) {
			aCharArray6[local4] = (char) (local4 + 65);
		}
		for (@Pc(20) int local20 = 26; local20 < 52; local20++) {
			aCharArray6[local20] = (char) (local20 + 97 - 26);
		}
		for (@Pc(38) int local38 = 52; local38 < 62; local38++) {
			aCharArray6[local38] = (char) (local38 - 4);
		}
		aCharArray6[62] = '*';
		aCharArray6[63] = '-';
	}

	@OriginalMember(owner = "client!aea", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4508 = (int) (arg7 * 4096.0F);
		this.anInt4507 = (int) (arg6 * 4096.0F);
		this.anInt4503 = this.anInt4505 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(BII)V")
	protected void method3915(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray82[arg1] = arg0;
	}

	@OriginalMember(owner = "client!aea", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3914() {
		this.anInt4497 >>= 0x4;
		this.anInt4503 = this.anInt4505;
		if (this.anInt4497 < 0) {
			this.anInt4497 = 0;
		} else if (this.anInt4497 > 255) {
			this.anInt4497 = 255;
		}
		this.method3915((byte) this.anInt4497, this.anInt4506++);
		this.anInt4497 = 0;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3910(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4504 = this.anInt4507 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4501 = 4096;
			this.anInt4504 = this.anInt4504 * this.anInt4504 >> 12;
			this.anInt4497 = this.anInt4504;
			return;
		}
		this.anInt4501 = this.anInt4508 * this.anInt4504 >> 12;
		if (this.anInt4501 < 0) {
			this.anInt4501 = 0;
		} else if (this.anInt4501 > 4096) {
			this.anInt4501 = 4096;
		}
		this.anInt4504 = this.anInt4507 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt4504 = this.anInt4504 * this.anInt4504 >> 12;
		this.anInt4504 = this.anInt4504 * this.anInt4501 >> 12;
		this.anInt4497 += this.anInt4503 * this.anInt4504 >> 12;
		this.anInt4503 = this.anInt4505 * this.anInt4503 >> 12;
	}

	@OriginalMember(owner = "client!aea", name = "a", descriptor = "(B)V")
	@Override
	protected final void method3908() {
		this.anInt4497 = 0;
		this.anInt4506 = 0;
	}
}
