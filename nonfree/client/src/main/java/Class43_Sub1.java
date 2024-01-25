import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class Class43_Sub1 extends Class43 {

	@OriginalMember(owner = "client!cga", name = "o", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
	private int anInt9895;

	@OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
	private int anInt9897;

	@OriginalMember(owner = "client!cga", name = "x", descriptor = "I")
	private int anInt9902;

	@OriginalMember(owner = "client!cga", name = "y", descriptor = "I")
	private int anInt9903;

	@OriginalMember(owner = "client!cga", name = "v", descriptor = "I")
	private final int anInt9900;

	@OriginalMember(owner = "client!cga", name = "z", descriptor = "I")
	private final int anInt9904;

	@OriginalMember(owner = "client!cga", name = "A", descriptor = "I")
	private final int anInt9905;

	@OriginalMember(owner = "client!cga", name = "E", descriptor = "I")
	private int anInt9909;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class43_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9900 = (int) (arg7 * 4096.0F);
		this.anInt9904 = (int) (arg6 * 4096.0F);
		this.anInt9909 = this.anInt9905 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9902 = this.anInt9904 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt9895 = 4096;
			this.anInt9902 = this.anInt9902 * this.anInt9902 >> 12;
			this.anInt9897 = this.anInt9902;
			return;
		}
		this.anInt9895 = this.anInt9902 * this.anInt9900 >> 12;
		this.anInt9902 = this.anInt9904 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt9895 < 0) {
			this.anInt9895 = 0;
		} else if (this.anInt9895 > 4096) {
			this.anInt9895 = 4096;
		}
		this.anInt9902 = this.anInt9902 * this.anInt9902 >> 12;
		this.anInt9902 = this.anInt9902 * this.anInt9895 >> 12;
		this.anInt9897 += this.anInt9902 * this.anInt9909 >> 12;
		this.anInt9909 = this.anInt9909 * this.anInt9905 >> 12;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIB)V")
	protected void method8133(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray100[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8276() {
		this.anInt9897 = 0;
		this.anInt9903 = 0;
	}

	@OriginalMember(owner = "client!cga", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8279() {
		this.anInt9909 = this.anInt9905;
		this.anInt9897 >>= 0x4;
		if (this.anInt9897 < 0) {
			this.anInt9897 = 0;
		} else if (this.anInt9897 > 255) {
			this.anInt9897 = 255;
		}
		this.method8133(this.anInt9903++, (byte) this.anInt9897);
		this.anInt9897 = 0;
	}
}
