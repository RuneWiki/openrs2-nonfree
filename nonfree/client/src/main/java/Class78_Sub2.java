import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class Class78_Sub2 extends Class78 {

	@OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
	private int anInt6044;

	@OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
	private int anInt6047;

	@OriginalMember(owner = "client!gt", name = "w", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
	private int anInt6049;

	@OriginalMember(owner = "client!gt", name = "D", descriptor = "I")
	private int anInt6054;

	@OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
	private final int anInt6053;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	private final int anInt6043;

	@OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
	private final int anInt6055;

	@OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
	private int anInt6045;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class78_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6053 = (int) (arg7 * 4096.0F);
		this.anInt6043 = (int) (arg6 * 4096.0F);
		this.anInt6045 = this.anInt6055 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt6054 = this.anInt6043 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt6047 = 4096;
			this.anInt6054 = this.anInt6054 * this.anInt6054 >> 12;
			this.anInt6049 = this.anInt6054;
			return;
		}
		this.anInt6047 = this.anInt6053 * this.anInt6054 >> 12;
		if (this.anInt6047 < 0) {
			this.anInt6047 = 0;
		} else if (this.anInt6047 > 4096) {
			this.anInt6047 = 4096;
		}
		this.anInt6054 = this.anInt6043 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt6054 = this.anInt6054 * this.anInt6054 >> 12;
		this.anInt6054 = this.anInt6047 * this.anInt6054 >> 12;
		this.anInt6049 += this.anInt6045 * this.anInt6054 >> 12;
		this.anInt6045 = this.anInt6055 * this.anInt6045 >> 12;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7616() {
		this.anInt6049 >>= 0x4;
		this.anInt6045 = this.anInt6055;
		if (this.anInt6049 < 0) {
			this.anInt6049 = 0;
		} else if (this.anInt6049 > 255) {
			this.anInt6049 = 255;
		}
		this.method5044(this.anInt6044++, (byte) this.anInt6049);
		this.anInt6049 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7612() {
		this.anInt6044 = 0;
		this.anInt6049 = 0;
	}

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIB)V")
	protected void method5044(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray40[arg0] = arg1;
	}
}
