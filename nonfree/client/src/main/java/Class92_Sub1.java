import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class92_Sub1 extends Class92 {

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
	private int anInt2580;

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	private int anInt2582;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
	private int anInt2583;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
	private int anInt2587;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int anInt2577;

	@OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
	private final int anInt2576;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
	private final int anInt2581;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
	private int anInt2574;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class92_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt2577 = (int) (arg6 * 4096.0F);
		this.anInt2576 = (int) (arg7 * 4096.0F);
		this.anInt2574 = this.anInt2581 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3783() {
		this.anInt2587 = 0;
		this.anInt2583 = 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3785(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2582 = this.anInt2577 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt2580 = 4096;
			this.anInt2582 = this.anInt2582 * this.anInt2582 >> 12;
			this.anInt2583 = this.anInt2582;
			return;
		}
		this.anInt2580 = this.anInt2576 * this.anInt2582 >> 12;
		this.anInt2582 = this.anInt2577 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt2580 < 0) {
			this.anInt2580 = 0;
		} else if (this.anInt2580 > 4096) {
			this.anInt2580 = 4096;
		}
		this.anInt2582 = this.anInt2582 * this.anInt2582 >> 12;
		this.anInt2582 = this.anInt2580 * this.anInt2582 >> 12;
		this.anInt2583 += this.anInt2582 * this.anInt2574 >> 12;
		this.anInt2574 = this.anInt2574 * this.anInt2581 >> 12;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIB)V")
	protected void method2064(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray33[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method3781() {
		this.anInt2583 >>= 0x4;
		this.anInt2574 = this.anInt2581;
		if (this.anInt2583 < 0) {
			this.anInt2583 = 0;
		} else if (this.anInt2583 > 255) {
			this.anInt2583 = 255;
		}
		this.method2064((byte) this.anInt2583, this.anInt2587++);
		this.anInt2583 = 0;
	}
}
