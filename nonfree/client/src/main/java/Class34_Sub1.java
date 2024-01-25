import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
	private int anInt1342;

	@OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
	private int anInt1347;

	@OriginalMember(owner = "client!pq", name = "J", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!pq", name = "G", descriptor = "[I")
	private final int[] anIntArray61 = new int[this.anInt4688];

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt4688; local15++) {
			this.anIntArray61[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3798() {
		this.anInt1347 = 0;
		this.anInt1342 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3794(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1347 += arg1 * this.anIntArray61[arg0] >> 12;
	}

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(B)V")
	@Override
	protected final void method3793() {
		this.anInt1347 = Math.abs(this.anInt1347);
		if (this.anInt1347 >= 4096) {
			this.anInt1347 = 4095;
		}
		this.method984(this.anInt1342++, (byte) (this.anInt1347 >> 4));
		this.anInt1347 = 0;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZIB)V")
	protected void method984(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray32[this.anInt1342++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
