import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vt")
public class Class65_Sub1 extends Class65 {

	@OriginalMember(owner = "client!vt", name = "A", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!vt", name = "D", descriptor = "I")
	private int anInt1826;

	@OriginalMember(owner = "client!vt", name = "F", descriptor = "I")
	private int anInt1828;

	@OriginalMember(owner = "client!vt", name = "I", descriptor = "I")
	private int anInt1831;

	@OriginalMember(owner = "client!vt", name = "K", descriptor = "I")
	private int anInt1832;

	@OriginalMember(owner = "client!vt", name = "C", descriptor = "I")
	private final int anInt1825;

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "I")
	private final int anInt1823;

	@OriginalMember(owner = "client!vt", name = "z", descriptor = "I")
	private final int anInt1824;

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class65_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1825 = (int) (arg6 * 4096.0F);
		this.anInt1823 = (int) (arg7 * 4096.0F);
		this.anInt1819 = this.anInt1824 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt1831 = this.anInt1825 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt1831 = this.anInt1831 * this.anInt1831 >> 12;
			this.anInt1832 = 4096;
			this.anInt1828 = this.anInt1831;
			return;
		}
		this.anInt1832 = this.anInt1831 * this.anInt1823 >> 12;
		this.anInt1831 = this.anInt1825 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt1832 < 0) {
			this.anInt1832 = 0;
		} else if (this.anInt1832 > 4096) {
			this.anInt1832 = 4096;
		}
		this.anInt1831 = this.anInt1831 * this.anInt1831 >> 12;
		this.anInt1831 = this.anInt1831 * this.anInt1832 >> 12;
		this.anInt1828 += this.anInt1831 * this.anInt1819 >> 12;
		this.anInt1819 = this.anInt1819 * this.anInt1824 >> 12;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3916() {
		this.anInt1819 = this.anInt1824;
		this.anInt1828 >>= 0x4;
		if (this.anInt1828 < 0) {
			this.anInt1828 = 0;
		} else if (this.anInt1828 > 255) {
			this.anInt1828 = 255;
		}
		this.method1591((byte) this.anInt1828, this.anInt1826++);
		this.anInt1828 = 0;
	}

	@OriginalMember(owner = "client!vt", name = "d", descriptor = "(I)V")
	@Override
	protected final void method3918() {
		this.anInt1826 = 0;
		this.anInt1828 = 0;
	}

	@OriginalMember(owner = "client!vt", name = "b", descriptor = "(BII)V")
	protected void method1591(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray18[arg1] = arg0;
	}
}
