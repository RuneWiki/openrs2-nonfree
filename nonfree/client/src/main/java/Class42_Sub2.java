import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public class Class42_Sub2 extends Class42 {

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!sf", name = "C", descriptor = "[B")
	private byte[] aByteArray41;

	@OriginalMember(owner = "client!sf", name = "D", descriptor = "I")
	private int anInt3534;

	@OriginalMember(owner = "client!sf", name = "r", descriptor = "[I")
	private final int[] anIntArray224 = new int[this.anInt3514];

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class42_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt3514 > local15; local15++) {
			this.anIntArray224[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	@Override
	protected final void method2851() {
		this.anInt3528 = 0;
		this.anInt3534 = 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method2852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3528 += arg1 * this.anIntArray224[arg0] >> 12;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)V")
	protected void method2860(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray41[this.anInt3534++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
	@Override
	protected final void method2853() {
		this.anInt3528 = Math.abs(this.anInt3528);
		if (this.anInt3528 >= 4096) {
			this.anInt3528 = 4095;
		}
		this.method2860((byte) (this.anInt3528 >> 4), this.anInt3534++);
		this.anInt3528 = 0;
	}
}
