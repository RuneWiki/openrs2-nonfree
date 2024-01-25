import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class Class103_Sub2 extends Class103 {

	@OriginalMember(owner = "client!oha", name = "z", descriptor = "I")
	private int anInt9382;

	@OriginalMember(owner = "client!oha", name = "E", descriptor = "I")
	private int anInt9387;

	@OriginalMember(owner = "client!oha", name = "F", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!oha", name = "G", descriptor = "I")
	private int anInt9388;

	@OriginalMember(owner = "client!oha", name = "I", descriptor = "I")
	private int anInt9390;

	@OriginalMember(owner = "client!oha", name = "B", descriptor = "I")
	private final int anInt9384;

	@OriginalMember(owner = "client!oha", name = "C", descriptor = "I")
	private final int anInt9385;

	@OriginalMember(owner = "client!oha", name = "A", descriptor = "I")
	private final int anInt9383;

	@OriginalMember(owner = "client!oha", name = "s", descriptor = "I")
	private int anInt9376;

	@OriginalMember(owner = "client!oha", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class103_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9384 = (int) (arg7 * 4096.0F);
		this.anInt9385 = (int) (arg6 * 4096.0F);
		this.anInt9376 = this.anInt9383 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(BIB)V")
	protected void method7644(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray84[arg0] = arg1;
	}

	@OriginalMember(owner = "client!oha", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7637() {
		this.anInt9382 = 0;
		this.anInt9388 = 0;
	}

	@OriginalMember(owner = "client!oha", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7642() {
		this.anInt9388 >>= 0x4;
		this.anInt9376 = this.anInt9383;
		if (this.anInt9388 < 0) {
			this.anInt9388 = 0;
		} else if (this.anInt9388 > 255) {
			this.anInt9388 = 255;
		}
		this.method7644(this.anInt9382++, (byte) this.anInt9388);
		this.anInt9388 = 0;
	}

	@OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9390 = this.anInt9385 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt9390 = this.anInt9390 * this.anInt9390 >> 12;
			this.anInt9387 = 4096;
			this.anInt9388 = this.anInt9390;
			return;
		}
		this.anInt9387 = this.anInt9390 * this.anInt9384 >> 12;
		if (this.anInt9387 < 0) {
			this.anInt9387 = 0;
		} else if (this.anInt9387 > 4096) {
			this.anInt9387 = 4096;
		}
		this.anInt9390 = this.anInt9385 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt9390 = this.anInt9390 * this.anInt9390 >> 12;
		this.anInt9390 = this.anInt9387 * this.anInt9390 >> 12;
		this.anInt9388 += this.anInt9390 * this.anInt9376 >> 12;
		this.anInt9376 = this.anInt9376 * this.anInt9383 >> 12;
	}
}
