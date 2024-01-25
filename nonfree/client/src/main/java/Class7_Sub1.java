import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!af", name = "s", descriptor = "I")
	private int anInt1969;

	@OriginalMember(owner = "client!af", name = "z", descriptor = "I")
	private int anInt1976;

	@OriginalMember(owner = "client!af", name = "B", descriptor = "I")
	private int anInt1978;

	@OriginalMember(owner = "client!af", name = "D", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!af", name = "L", descriptor = "I")
	private int anInt1984;

	@OriginalMember(owner = "client!af", name = "G", descriptor = "I")
	private final int anInt1981;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	private final int anInt1972;

	@OriginalMember(owner = "client!af", name = "y", descriptor = "I")
	private final int anInt1975;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	private int anInt1970;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class7_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1981 = (int) (arg7 * 4096.0F);
		this.anInt1972 = (int) (arg6 * 4096.0F);
		this.anInt1970 = this.anInt1975 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	@Override
	protected final void method2926() {
		this.anInt1978 = 0;
		this.anInt1969 = 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method2920(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt1984 = this.anInt1972 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt1984 = this.anInt1984 * this.anInt1984 >> 12;
			this.anInt1976 = 4096;
			this.anInt1969 = this.anInt1984;
			return;
		}
		this.anInt1976 = this.anInt1984 * this.anInt1981 >> 12;
		this.anInt1984 = this.anInt1972 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt1976 < 0) {
			this.anInt1976 = 0;
		} else if (this.anInt1976 > 4096) {
			this.anInt1976 = 4096;
		}
		this.anInt1984 = this.anInt1984 * this.anInt1984 >> 12;
		this.anInt1984 = this.anInt1976 * this.anInt1984 >> 12;
		this.anInt1969 += this.anInt1970 * this.anInt1984 >> 12;
		this.anInt1970 = this.anInt1975 * this.anInt1970 >> 12;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2921() {
		this.anInt1970 = this.anInt1975;
		this.anInt1969 >>= 0x4;
		if (this.anInt1969 < 0) {
			this.anInt1969 = 0;
		} else if (this.anInt1969 > 255) {
			this.anInt1969 = 255;
		}
		this.method1587(this.anInt1978++, (byte) this.anInt1969);
		this.anInt1969 = 0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)V")
	protected void method1587(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray28[arg0] = arg1;
	}
}
