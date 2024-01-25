import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "I")
	private int anInt3503;

	@OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
	private int anInt3508;

	@OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
	private int anInt3509;

	@OriginalMember(owner = "client!sl", name = "A", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
	private int anInt3513;

	@OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
	private final int anInt3517;

	@OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
	private final int anInt3515;

	@OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
	private final int anInt3512;

	@OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
	private int anInt3507;

	@OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3517 = (int) (arg6 * 4096.0F);
		this.anInt3515 = (int) (arg7 * 4096.0F);
		this.anInt3507 = this.anInt3512 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method3646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt3503 = this.anInt3517 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt3513 = 4096;
			this.anInt3503 = this.anInt3503 * this.anInt3503 >> 12;
			this.anInt3508 = this.anInt3503;
			return;
		}
		this.anInt3513 = this.anInt3503 * this.anInt3515 >> 12;
		this.anInt3503 = this.anInt3517 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt3513 < 0) {
			this.anInt3513 = 0;
		} else if (this.anInt3513 > 4096) {
			this.anInt3513 = 4096;
		}
		this.anInt3503 = this.anInt3503 * this.anInt3503 >> 12;
		this.anInt3503 = this.anInt3503 * this.anInt3513 >> 12;
		this.anInt3508 += this.anInt3507 * this.anInt3503 >> 12;
		this.anInt3507 = this.anInt3512 * this.anInt3507 >> 12;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3642() {
		this.anInt3509 = 0;
		this.anInt3508 = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3640() {
		this.anInt3508 >>= 0x4;
		this.anInt3507 = this.anInt3512;
		if (this.anInt3508 < 0) {
			this.anInt3508 = 0;
		} else if (this.anInt3508 > 255) {
			this.anInt3508 = 255;
		}
		this.method2956(this.anInt3509++, (byte) this.anInt3508);
		this.anInt3508 = 0;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V")
	protected void method2956(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray42[arg0] = arg1;
	}
}
