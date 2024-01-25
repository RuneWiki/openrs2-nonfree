import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class Class107_Sub2 extends Class107 {

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "I")
	private int anInt3269;

	@OriginalMember(owner = "client!wu", name = "v", descriptor = "I")
	private int anInt3271;

	@OriginalMember(owner = "client!wu", name = "D", descriptor = "I")
	private int anInt3279;

	@OriginalMember(owner = "client!wu", name = "I", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
	private int anInt3283;

	@OriginalMember(owner = "client!wu", name = "A", descriptor = "I")
	private final int anInt3276;

	@OriginalMember(owner = "client!wu", name = "E", descriptor = "I")
	private final int anInt3280;

	@OriginalMember(owner = "client!wu", name = "B", descriptor = "I")
	private final int anInt3277;

	@OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
	private int anInt3285;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class107_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3276 = (int) (arg6 * 4096.0F);
		this.anInt3280 = (int) (arg7 * 4096.0F);
		this.anInt3285 = this.anInt3277 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(BBI)V")
	protected void method2828(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray33[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2824() {
		this.anInt3283 = 0;
		this.anInt3271 = 0;
	}

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method2827(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3269 = this.anInt3276 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt3279 = 4096;
			this.anInt3269 = this.anInt3269 * this.anInt3269 >> 12;
			this.anInt3283 = this.anInt3269;
			return;
		}
		this.anInt3279 = this.anInt3280 * this.anInt3269 >> 12;
		if (this.anInt3279 < 0) {
			this.anInt3279 = 0;
		} else if (this.anInt3279 > 4096) {
			this.anInt3279 = 4096;
		}
		this.anInt3269 = this.anInt3276 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt3269 = this.anInt3269 * this.anInt3269 >> 12;
		this.anInt3269 = this.anInt3269 * this.anInt3279 >> 12;
		this.anInt3283 += this.anInt3269 * this.anInt3285 >> 12;
		this.anInt3285 = this.anInt3285 * this.anInt3277 >> 12;
	}

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2822() {
		this.anInt3283 >>= 0x4;
		this.anInt3285 = this.anInt3277;
		if (this.anInt3283 < 0) {
			this.anInt3283 = 0;
		} else if (this.anInt3283 > 255) {
			this.anInt3283 = 255;
		}
		this.method2828((byte) this.anInt3283, this.anInt3271++);
		this.anInt3283 = 0;
	}
}
