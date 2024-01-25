import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class Class11_Sub2 extends Class11 {

	@OriginalMember(owner = "client!ls", name = "p", descriptor = "I")
	private int anInt9557;

	@OriginalMember(owner = "client!ls", name = "r", descriptor = "I")
	private int anInt9559;

	@OriginalMember(owner = "client!ls", name = "x", descriptor = "I")
	private int anInt9564;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "[B")
	private byte[] aByteArray125;

	@OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
	private int anInt9570;

	@OriginalMember(owner = "client!ls", name = "E", descriptor = "I")
	private final int anInt9568;

	@OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
	private final int anInt9561;

	@OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
	private final int anInt9571;

	@OriginalMember(owner = "client!ls", name = "z", descriptor = "I")
	private int anInt9565;

	@OriginalMember(owner = "client!ls", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class11_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt9568 = (int) (arg7 * 4096.0F);
		this.anInt9561 = (int) (arg6 * 4096.0F);
		this.anInt9565 = this.anInt9571 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method7804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt9564 = this.anInt9561 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt9557 = 4096;
			this.anInt9564 = this.anInt9564 * this.anInt9564 >> 12;
			this.anInt9559 = this.anInt9564;
			return;
		}
		this.anInt9557 = this.anInt9564 * this.anInt9568 >> 12;
		if (this.anInt9557 < 0) {
			this.anInt9557 = 0;
		} else if (this.anInt9557 > 4096) {
			this.anInt9557 = 4096;
		}
		this.anInt9564 = this.anInt9561 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt9564 = this.anInt9564 * this.anInt9564 >> 12;
		this.anInt9564 = this.anInt9557 * this.anInt9564 >> 12;
		this.anInt9559 += this.anInt9565 * this.anInt9564 >> 12;
		this.anInt9565 = this.anInt9571 * this.anInt9565 >> 12;
	}

	@OriginalMember(owner = "client!ls", name = "e", descriptor = "(B)V")
	@Override
	protected final void method7807() {
		this.anInt9570 = 0;
		this.anInt9559 = 0;
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7801() {
		this.anInt9559 >>= 0x4;
		this.anInt9565 = this.anInt9571;
		if (this.anInt9559 < 0) {
			this.anInt9559 = 0;
		} else if (this.anInt9559 > 255) {
			this.anInt9559 = 255;
		}
		this.method7810(this.anInt9570++, (byte) this.anInt9559);
		this.anInt9559 = 0;
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(IBB)V")
	protected void method7810(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray125[arg0] = arg1;
	}
}
