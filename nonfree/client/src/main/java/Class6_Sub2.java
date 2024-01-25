import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class Class6_Sub2 extends Class6 {

	@OriginalMember(owner = "client!ur", name = "F", descriptor = "I")
	private int anInt6133;

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
	private int anInt6134;

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "I")
	private int anInt6138;

	@OriginalMember(owner = "client!ur", name = "M", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
	private int anInt6140;

	@OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
	private final int anInt6142;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "I")
	private final int anInt6135;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "I")
	private final int anInt6130;

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "I")
	private int anInt6136;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class6_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6142 = (int) (arg7 * 4096.0F);
		this.anInt6135 = (int) (arg6 * 4096.0F);
		this.anInt6136 = this.anInt6130 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BBI)V")
	protected void method5193(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray97[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6049() {
		this.anInt6134 = 0;
		this.anInt6133 = 0;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6140 = this.anInt6135 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6138 = 4096;
			this.anInt6140 = this.anInt6140 * this.anInt6140 >> 12;
			this.anInt6134 = this.anInt6140;
			return;
		}
		this.anInt6138 = this.anInt6142 * this.anInt6140 >> 12;
		if (this.anInt6138 < 0) {
			this.anInt6138 = 0;
		} else if (this.anInt6138 > 4096) {
			this.anInt6138 = 4096;
		}
		this.anInt6140 = this.anInt6135 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt6140 = this.anInt6140 * this.anInt6140 >> 12;
		this.anInt6140 = this.anInt6140 * this.anInt6138 >> 12;
		this.anInt6134 += this.anInt6136 * this.anInt6140 >> 12;
		this.anInt6136 = this.anInt6130 * this.anInt6136 >> 12;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6051() {
		this.anInt6136 = this.anInt6130;
		this.anInt6134 >>= 0x4;
		if (this.anInt6134 < 0) {
			this.anInt6134 = 0;
		} else if (this.anInt6134 > 255) {
			this.anInt6134 = 255;
		}
		this.method5193((byte) this.anInt6134, this.anInt6133++);
		this.anInt6134 = 0;
	}
}
