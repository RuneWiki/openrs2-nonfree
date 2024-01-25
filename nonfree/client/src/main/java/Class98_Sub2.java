import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public class Class98_Sub2 extends Class98 {

	@OriginalMember(owner = "client!oj", name = "o", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
	private int anInt8120;

	@OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
	private int anInt8122;

	@OriginalMember(owner = "client!oj", name = "p", descriptor = "[I")
	private final int[] anIntArray509 = new int[this.anInt8118];

	@OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class98_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8118 > local15; local15++) {
			this.anIntArray509[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)V")
	@Override
	protected final void method7048() {
		this.anInt8120 = Math.abs(this.anInt8120);
		if (this.anInt8120 >= 4096) {
			this.anInt8120 = 4095;
		}
		this.method7055(this.anInt8122++, (byte) (this.anInt8120 >> 4));
		this.anInt8120 = 0;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8120 += arg0 * this.anIntArray509[arg1] >> 12;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IBI)V")
	protected void method7055(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray89[this.anInt8122++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7052() {
		this.anInt8122 = 0;
		this.anInt8120 = 0;
	}
}
