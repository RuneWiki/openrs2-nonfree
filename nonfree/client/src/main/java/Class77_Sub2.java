import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nu")
public class Class77_Sub2 extends Class77 {

	@OriginalMember(owner = "client!nu", name = "p", descriptor = "I")
	private int anInt6549;

	@OriginalMember(owner = "client!nu", name = "t", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!nu", name = "u", descriptor = "I")
	private int anInt6552;

	@OriginalMember(owner = "client!nu", name = "z", descriptor = "[I")
	private final int[] anIntArray635 = new int[this.anInt6542];

	@OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class77_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6542; local15++) {
			this.anIntArray635[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIB)V")
	protected void method5144(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray84[this.anInt6552++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(III)V")
	@Override
	protected final void method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6549 += arg0 * this.anIntArray635[arg1] >> 12;
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V")
	@Override
	protected final void method5140() {
		this.anInt6549 = 0;
		this.anInt6552 = 0;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5136() {
		this.anInt6549 = Math.abs(this.anInt6549);
		if (this.anInt6549 >= 4096) {
			this.anInt6549 = 4095;
		}
		this.method5144(this.anInt6552++, (byte) (this.anInt6549 >> 4));
		this.anInt6549 = 0;
	}
}
