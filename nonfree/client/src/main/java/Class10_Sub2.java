import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class Class10_Sub2 extends Class10 {

	@OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
	private int anInt9593;

	@OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
	private int anInt9598;

	@OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
	private int anInt9605;

	@OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
	private int anInt9606;

	@OriginalMember(owner = "client!dd", name = "G", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
	private final int anInt9597;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
	private final int anInt9594;

	@OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
	private final int anInt9601;

	@OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
	private int anInt9602;

	@OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class10_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9597 = (int) (arg6 * 4096.0F);
		this.anInt9594 = (int) (arg7 * 4096.0F);
		this.anInt9602 = this.anInt9601 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)V")
	protected void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray102[arg0] = arg1;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method7695() {
		this.anInt9598 = 0;
		this.anInt9593 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7700() {
		this.anInt9593 >>= 0x4;
		this.anInt9602 = this.anInt9601;
		if (this.anInt9593 < 0) {
			this.anInt9593 = 0;
		} else if (this.anInt9593 > 255) {
			this.anInt9593 = 255;
		}
		this.method7701(this.anInt9598++, (byte) this.anInt9593);
		this.anInt9593 = 0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt9605 = this.anInt9597 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt9605 = this.anInt9605 * this.anInt9605 >> 12;
			this.anInt9606 = 4096;
			this.anInt9593 = this.anInt9605;
			return;
		}
		this.anInt9606 = this.anInt9605 * this.anInt9594 >> 12;
		this.anInt9605 = this.anInt9597 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt9606 < 0) {
			this.anInt9606 = 0;
		} else if (this.anInt9606 > 4096) {
			this.anInt9606 = 4096;
		}
		this.anInt9605 = this.anInt9605 * this.anInt9605 >> 12;
		this.anInt9605 = this.anInt9605 * this.anInt9606 >> 12;
		this.anInt9593 += this.anInt9605 * this.anInt9602 >> 12;
		this.anInt9602 = this.anInt9602 * this.anInt9601 >> 12;
	}
}
