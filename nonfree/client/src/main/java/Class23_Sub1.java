import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
	private int anInt2368;

	@OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
	private int anInt2369;

	@OriginalMember(owner = "client!ch", name = "B", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!ch", name = "t", descriptor = "[I")
	private int[] anIntArray202 = new int[this.anInt3079];

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class23_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt3079; local15++) {
			this.anIntArray202[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V")
	@Override
	protected final void method2496() {
		this.anInt2368 = Math.abs(this.anInt2368);
		if (this.anInt2368 >= 4096) {
			this.anInt2368 = 4095;
		}
		this.method1935(this.anInt2369++, (byte) (this.anInt2368 >> 4));
		this.anInt2368 = 0;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)V")
	protected void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray27[this.anInt2369++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(III)V")
	@Override
	protected final void method2499(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt2368 += arg1 * this.anIntArray202[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
	@Override
	protected final void method2492() {
		this.anInt2368 = 0;
		this.anInt2369 = 0;
	}
}
