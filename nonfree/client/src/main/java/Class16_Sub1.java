import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public class Class16_Sub1 extends Class16 {

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
	private int anInt1926;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
	private int anInt1931;

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "[I")
	private final int[] anIntArray124 = new int[this.anInt8276];

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class16_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt8276; local15++) {
			this.anIntArray124[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBI)V")
	protected void method1889(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray26[this.anInt1926++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7186() {
		this.anInt1931 = 0;
		this.anInt1926 = 0;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7183(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1931 += arg1 * this.anIntArray124[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V")
	@Override
	protected final void method7181() {
		this.anInt1931 = Math.abs(this.anInt1931);
		if (this.anInt1931 >= 4096) {
			this.anInt1931 = 4095;
		}
		this.method1889((byte) (this.anInt1931 >> 4), this.anInt1926++);
		this.anInt1931 = 0;
	}
}
