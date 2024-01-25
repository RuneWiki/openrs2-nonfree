import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class Class67_Sub2 extends Class67 {

	@OriginalMember(owner = "client!ou", name = "r", descriptor = "[B")
	private byte[] aByteArray65;

	@OriginalMember(owner = "client!ou", name = "s", descriptor = "I")
	private int anInt5876;

	@OriginalMember(owner = "client!ou", name = "x", descriptor = "I")
	private int anInt5880;

	@OriginalMember(owner = "client!ou", name = "y", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "client!ou", name = "B", descriptor = "I")
	private int anInt5884;

	@OriginalMember(owner = "client!ou", name = "C", descriptor = "I")
	private final int anInt5885;

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "I")
	private final int anInt5879;

	@OriginalMember(owner = "client!ou", name = "A", descriptor = "I")
	private final int anInt5883;

	@OriginalMember(owner = "client!ou", name = "p", descriptor = "I")
	private int anInt5874;

	@OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class67_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5885 = (int) (arg7 * 4096.0F);
		this.anInt5879 = (int) (arg6 * 4096.0F);
		this.anInt5874 = this.anInt5883 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4682(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt5880 = this.anInt5879 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt5881 = 4096;
			this.anInt5880 = this.anInt5880 * this.anInt5880 >> 12;
			this.anInt5876 = this.anInt5880;
			return;
		}
		this.anInt5881 = this.anInt5885 * this.anInt5880 >> 12;
		if (this.anInt5881 < 0) {
			this.anInt5881 = 0;
		} else if (this.anInt5881 > 4096) {
			this.anInt5881 = 4096;
		}
		this.anInt5880 = this.anInt5879 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt5880 = this.anInt5880 * this.anInt5880 >> 12;
		this.anInt5880 = this.anInt5881 * this.anInt5880 >> 12;
		this.anInt5876 += this.anInt5880 * this.anInt5874 >> 12;
		this.anInt5874 = this.anInt5883 * this.anInt5874 >> 12;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4678() {
		this.anInt5884 = 0;
		this.anInt5876 = 0;
	}

	@OriginalMember(owner = "client!ou", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4684() {
		this.anInt5876 >>= 0x4;
		this.anInt5874 = this.anInt5883;
		if (this.anInt5876 < 0) {
			this.anInt5876 = 0;
		} else if (this.anInt5876 > 255) {
			this.anInt5876 = 255;
		}
		this.method4687((byte) this.anInt5876, this.anInt5884++);
		this.anInt5876 = 0;
	}

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(BII)V")
	protected void method4687(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray65[arg1] = arg0;
	}
}
