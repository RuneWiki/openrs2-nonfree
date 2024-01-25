import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cia")
public class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!cia", name = "y", descriptor = "I")
	private int anInt6436;

	@OriginalMember(owner = "client!cia", name = "P", descriptor = "I")
	private int anInt6439;

	@OriginalMember(owner = "client!cia", name = "F", descriptor = "I")
	private int anInt6441;

	@OriginalMember(owner = "client!cia", name = "z", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!cia", name = "u", descriptor = "I")
	private int anInt6447;

	@OriginalMember(owner = "client!cia", name = "C", descriptor = "I")
	private final int anInt6438;

	@OriginalMember(owner = "client!cia", name = "D", descriptor = "I")
	private final int anInt6437;

	@OriginalMember(owner = "client!cia", name = "N", descriptor = "I")
	private final int anInt6445;

	@OriginalMember(owner = "client!cia", name = "v", descriptor = "I")
	private int anInt6435;

	@OriginalMember(owner = "client!cia", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class60_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6438 = (int) (arg6 * 4096.0F);
		this.anInt6437 = (int) (arg7 * 4096.0F);
		this.anInt6435 = this.anInt6445 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6439 = this.anInt6438 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt6439 = this.anInt6439 * this.anInt6439 >> 12;
			this.anInt6436 = 4096;
			this.anInt6447 = this.anInt6439;
			return;
		}
		this.anInt6436 = this.anInt6437 * this.anInt6439 >> 12;
		if (this.anInt6436 < 0) {
			this.anInt6436 = 0;
		} else if (this.anInt6436 > 4096) {
			this.anInt6436 = 4096;
		}
		this.anInt6439 = this.anInt6438 - (arg0 >= 0 ? arg0 : -arg0);
		this.anInt6439 = this.anInt6439 * this.anInt6439 >> 12;
		this.anInt6439 = this.anInt6436 * this.anInt6439 >> 12;
		this.anInt6447 += this.anInt6435 * this.anInt6439 >> 12;
		this.anInt6435 = this.anInt6445 * this.anInt6435 >> 12;
	}

	@OriginalMember(owner = "client!cia", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8968() {
		this.anInt6447 = 0;
		this.anInt6441 = 0;
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(IIB)V")
	protected void method5676(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray71[arg0] = arg1;
	}

	@OriginalMember(owner = "client!cia", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8966(@OriginalArg(0) int arg0) {
		this.anInt6435 = this.anInt6445;
		if (arg0 != -1815138708) {
			Static68.aCalendar3 = null;
		}
		this.anInt6447 >>= 0x4;
		if (this.anInt6447 < 0) {
			this.anInt6447 = 0;
		} else if (this.anInt6447 > 255) {
			this.anInt6447 = 255;
		}
		this.method5676(this.anInt6441++, (byte) this.anInt6447);
		this.anInt6447 = 0;
	}
}
