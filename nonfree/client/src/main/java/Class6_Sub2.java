import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!bj", name = "r", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!bj", name = "B", descriptor = "I")
	private int anInt8221;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "I")
	private int anInt8222;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "I")
	private int anInt8223;

	@OriginalMember(owner = "client!bj", name = "F", descriptor = "I")
	private int anInt8224;

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "I")
	private final int anInt8219;

	@OriginalMember(owner = "client!bj", name = "t", descriptor = "I")
	private final int anInt8215;

	@OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
	private final int anInt8210;

	@OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
	private int anInt8211;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8219 = (int) (arg7 * 4096.0F);
		this.anInt8215 = (int) (arg6 * 4096.0F);
		this.anInt8211 = this.anInt8210 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6637() {
		this.anInt8211 = this.anInt8210;
		this.anInt8221 >>= 0x4;
		if (this.anInt8221 < 0) {
			this.anInt8221 = 0;
		} else if (this.anInt8221 > 255) {
			this.anInt8221 = 255;
		}
		this.method6638(this.anInt8222++, (byte) this.anInt8221);
		this.anInt8221 = 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(BIB)V")
	protected void method6638(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray87[arg0] = arg1;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6632() {
		this.anInt8221 = 0;
		this.anInt8222 = 0;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZII)V")
	@Override
	protected final void method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8224 = this.anInt8215 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt8223 = 4096;
			this.anInt8224 = this.anInt8224 * this.anInt8224 >> 12;
			this.anInt8221 = this.anInt8224;
			return;
		}
		this.anInt8223 = this.anInt8219 * this.anInt8224 >> 12;
		this.anInt8224 = this.anInt8215 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt8223 < 0) {
			this.anInt8223 = 0;
		} else if (this.anInt8223 > 4096) {
			this.anInt8223 = 4096;
		}
		this.anInt8224 = this.anInt8224 * this.anInt8224 >> 12;
		this.anInt8224 = this.anInt8224 * this.anInt8223 >> 12;
		this.anInt8221 += this.anInt8224 * this.anInt8211 >> 12;
		this.anInt8211 = this.anInt8211 * this.anInt8210 >> 12;
	}
}
