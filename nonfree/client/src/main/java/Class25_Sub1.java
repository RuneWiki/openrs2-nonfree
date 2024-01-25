import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
	private int anInt4223;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "I")
	private int anInt4230;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "[I")
	private final int[] anIntArray394 = new int[this.anInt4221];

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4221 > local15; local15++) {
			this.anIntArray394[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3640() {
		this.anInt4230 = Math.abs(this.anInt4230);
		if (this.anInt4230 >= 4096) {
			this.anInt4230 = 4095;
		}
		this.method3650(this.anInt4223++, (byte) (this.anInt4230 >> 4));
		this.anInt4230 = 0;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3642() {
		this.anInt4230 = 0;
		this.anInt4223 = 0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IB)V")
	protected void method3650(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray47[this.anInt4223++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method3646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4230 += arg1 * this.anIntArray394[arg0] >> 12;
	}
}
