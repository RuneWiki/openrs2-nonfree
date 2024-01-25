import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
	private int anInt9595;

	@OriginalMember(owner = "client!rga", name = "A", descriptor = "I")
	private int anInt9602;

	@OriginalMember(owner = "client!rga", name = "C", descriptor = "I")
	private int anInt9603;

	@OriginalMember(owner = "client!rga", name = "D", descriptor = "I")
	private int anInt9604;

	@OriginalMember(owner = "client!rga", name = "J", descriptor = "[B")
	private byte[] aByteArray123;

	@OriginalMember(owner = "client!rga", name = "L", descriptor = "I")
	private final int anInt9609;

	@OriginalMember(owner = "client!rga", name = "r", descriptor = "I")
	private final int anInt9593;

	@OriginalMember(owner = "client!rga", name = "s", descriptor = "I")
	private final int anInt9594;

	@OriginalMember(owner = "client!rga", name = "y", descriptor = "I")
	private int anInt9600;

	@OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9609 = (int) (arg7 * 4096.0F);
		this.anInt9593 = (int) (arg6 * 4096.0F);
		this.anInt9600 = this.anInt9594 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IBB)V")
	protected void method7981(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray123[arg0] = arg1;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method9044() {
		this.anInt9602 = 0;
		this.anInt9604 = 0;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(III)V")
	@Override
	protected final void method9047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt9595 = this.anInt9593 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt9603 = 4096;
			this.anInt9595 = this.anInt9595 * this.anInt9595 >> 12;
			this.anInt9604 = this.anInt9595;
			return;
		}
		this.anInt9603 = this.anInt9595 * this.anInt9609 >> 12;
		if (this.anInt9603 < 0) {
			this.anInt9603 = 0;
		} else if (this.anInt9603 > 4096) {
			this.anInt9603 = 4096;
		}
		this.anInt9595 = this.anInt9593 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt9595 = this.anInt9595 * this.anInt9595 >> 12;
		this.anInt9595 = this.anInt9603 * this.anInt9595 >> 12;
		this.anInt9604 += this.anInt9595 * this.anInt9600 >> 12;
		this.anInt9600 = this.anInt9600 * this.anInt9594 >> 12;
	}

	@OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V")
	@Override
	protected final void method9042() {
		this.anInt9600 = this.anInt9594;
		this.anInt9604 >>= 0x4;
		if (this.anInt9604 < 0) {
			this.anInt9604 = 0;
		} else if (this.anInt9604 > 255) {
			this.anInt9604 = 255;
		}
		this.method7981(this.anInt9602++, (byte) this.anInt9604);
		this.anInt9604 = 0;
	}
}
