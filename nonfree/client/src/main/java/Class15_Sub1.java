import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!qha", name = "o", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!qha", name = "p", descriptor = "I")
	private int anInt3604;

	@OriginalMember(owner = "client!qha", name = "t", descriptor = "I")
	private int anInt3608;

	@OriginalMember(owner = "client!qha", name = "A", descriptor = "I")
	private int anInt3612;

	@OriginalMember(owner = "client!qha", name = "B", descriptor = "I")
	private int anInt3613;

	@OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
	private final int anInt3607;

	@OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
	private final int anInt3609;

	@OriginalMember(owner = "client!qha", name = "C", descriptor = "I")
	private final int anInt3614;

	@OriginalMember(owner = "client!qha", name = "r", descriptor = "I")
	private int anInt3606;

	@OriginalMember(owner = "client!qha", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class15_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3607 = (int) (arg6 * 4096.0F);
		this.anInt3609 = (int) (arg7 * 4096.0F);
		this.anInt3606 = this.anInt3614 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8196() {
		this.anInt3606 = this.anInt3614;
		this.anInt3613 >>= 0x4;
		if (this.anInt3613 < 0) {
			this.anInt3613 = 0;
		} else if (this.anInt3613 > 255) {
			this.anInt3613 = 255;
		}
		this.method3205((byte) this.anInt3613, this.anInt3612++);
		this.anInt3613 = 0;
	}

	@OriginalMember(owner = "client!qha", name = "b", descriptor = "(B)V")
	@Override
	protected final void method8202() {
		this.anInt3613 = 0;
		this.anInt3612 = 0;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8201(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3604 = this.anInt3607 - (arg0 < 0 ? -arg0 : arg0);
			this.anInt3608 = 4096;
			this.anInt3604 = this.anInt3604 * this.anInt3604 >> 12;
			this.anInt3613 = this.anInt3604;
			return;
		}
		this.anInt3608 = this.anInt3609 * this.anInt3604 >> 12;
		this.anInt3604 = this.anInt3607 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt3608 < 0) {
			this.anInt3608 = 0;
		} else if (this.anInt3608 > 4096) {
			this.anInt3608 = 4096;
		}
		this.anInt3604 = this.anInt3604 * this.anInt3604 >> 12;
		this.anInt3604 = this.anInt3604 * this.anInt3608 >> 12;
		this.anInt3613 += this.anInt3606 * this.anInt3604 >> 12;
		this.anInt3606 = this.anInt3614 * this.anInt3606 >> 12;
	}

	@OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBI)V")
	protected void method3205(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray30[arg1] = arg0;
	}
}
