import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class Class23_Sub2 extends Class23 {

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
	private int anInt3094;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	private int anInt3099;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
	private int anInt3101;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	private int anInt3102;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	private int anInt3106;

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
	private int anInt3093;

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	private int anInt3090;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	private int anInt3097;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class23_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3106 = (int) (arg6 * 4096.0F);
		this.anInt3093 = (int) (arg7 * 4096.0F);
		this.anInt3097 = this.anInt3090 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt3102 = this.anInt3106 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt3099 = 4096;
			this.anInt3102 = this.anInt3102 * this.anInt3102 >> 12;
			this.anInt3094 = this.anInt3102;
			return;
		}
		this.anInt3099 = this.anInt3102 * this.anInt3093 >> 12;
		this.anInt3102 = this.anInt3106 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt3102 = this.anInt3102 * this.anInt3102 >> 12;
		if (this.anInt3099 < 0) {
			this.anInt3099 = 0;
		} else if (this.anInt3099 > 4096) {
			this.anInt3099 = 4096;
		}
		this.anInt3102 = this.anInt3102 * this.anInt3099 >> 12;
		this.anInt3094 += this.anInt3097 * this.anInt3102 >> 12;
		this.anInt3097 = this.anInt3090 * this.anInt3097 >> 12;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2496() {
		this.anInt3094 >>= 0x4;
		this.anInt3097 = this.anInt3090;
		if (this.anInt3094 < 0) {
			this.anInt3094 = 0;
		} else if (this.anInt3094 > 255) {
			this.anInt3094 = 255;
		}
		this.method2505(this.anInt3101++, (byte) this.anInt3094);
		this.anInt3094 = 0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IB)V")
	protected void method2505(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray34[arg0] = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2492() {
		this.anInt3101 = 0;
		this.anInt3094 = 0;
	}
}
