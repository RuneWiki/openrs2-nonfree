import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
	private int anInt1983;

	@OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
	private int anInt1989;

	@OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
	private int anInt1990;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "I")
	private final int anInt1981;

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
	private final int anInt1977;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
	private final int anInt1982;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt1987;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1981 = (int) (arg6 * 4096.0F);
		this.anInt1977 = (int) (arg7 * 4096.0F);
		this.anInt1987 = this.anInt1982 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IB)V")
	protected void method1611(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray31[arg0] = arg1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5160() {
		this.anInt1975 = 0;
		this.anInt1983 = 0;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5164() {
		this.anInt1987 = this.anInt1982;
		this.anInt1975 >>= 0x4;
		if (this.anInt1975 < 0) {
			this.anInt1975 = 0;
		} else if (this.anInt1975 > 255) {
			this.anInt1975 = 255;
		}
		this.method1611(this.anInt1983++, (byte) this.anInt1975);
		this.anInt1975 = 0;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method5165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt1990 = this.anInt1981 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt1989 = 4096;
			this.anInt1990 = this.anInt1990 * this.anInt1990 >> 12;
			this.anInt1975 = this.anInt1990;
			return;
		}
		this.anInt1989 = this.anInt1990 * this.anInt1977 >> 12;
		this.anInt1990 = this.anInt1981 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt1989 < 0) {
			this.anInt1989 = 0;
		} else if (this.anInt1989 > 4096) {
			this.anInt1989 = 4096;
		}
		this.anInt1990 = this.anInt1990 * this.anInt1990 >> 12;
		this.anInt1990 = this.anInt1989 * this.anInt1990 >> 12;
		this.anInt1975 += this.anInt1987 * this.anInt1990 >> 12;
		this.anInt1987 = this.anInt1982 * this.anInt1987 >> 12;
	}
}
