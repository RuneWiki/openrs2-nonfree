import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!hi", name = "r", descriptor = "[I")
	public static final int[] anIntArray575 = new int[32];

	@OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
	private int anInt8831;

	@OriginalMember(owner = "client!hi", name = "w", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
	private int anInt8836;

	@OriginalMember(owner = "client!hi", name = "y", descriptor = "[I")
	private final int[] anIntArray576 = new int[this.anInt8823];

	static {
		@Pc(6) int local6 = 2;
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			anIntArray575[local8] = local6 - 1;
			local6 += local6;
		}
	}

	@OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class73_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt8823; local13++) {
			this.anIntArray576[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7236() {
		this.anInt8831 = 0;
		this.anInt8836 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZ)V")
	@Override
	protected final void method7239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8836 += arg0 * this.anIntArray576[arg1] >> 12;
	}

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7235() {
		this.anInt8836 = Math.abs(this.anInt8836);
		if (this.anInt8836 >= 4096) {
			this.anInt8836 = 4095;
		}
		this.method7243(this.anInt8831++, (byte) (this.anInt8836 >> 4));
		this.anInt8836 = 0;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IBZ)V")
	protected void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray100[this.anInt8831++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
