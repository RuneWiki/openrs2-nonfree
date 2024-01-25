import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public class Class39_Sub2 extends Class39 {

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
	private int anInt2856;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
	private int anInt2857;

	@OriginalMember(owner = "client!ij", name = "K", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ij", name = "J", descriptor = "[I")
	private final int[] anIntArray179 = new int[this.anInt3866];

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class39_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt3866; local15++) {
			this.anIntArray179[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method3558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2856 += arg1 * this.anIntArray179[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3560() {
		this.anInt2856 = Math.abs(this.anInt2856);
		if (this.anInt2856 >= 4096) {
			this.anInt2856 = 4095;
		}
		this.method2689(this.anInt2857++, (byte) (this.anInt2856 >> 4));
		this.anInt2856 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	protected final void method3556() {
		this.anInt2857 = 0;
		this.anInt2856 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	protected void method2689(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray28[this.anInt2857++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
