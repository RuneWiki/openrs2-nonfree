import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public class Class18_Sub2 extends Class18 {

	@OriginalMember(owner = "client!ks", name = "x", descriptor = "[B")
	private byte[] aByteArray93;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
	private int anInt10323;

	@OriginalMember(owner = "client!ks", name = "C", descriptor = "I")
	private int anInt10326;

	@OriginalMember(owner = "client!ks", name = "t", descriptor = "[I")
	private final int[] anIntArray549 = new int[this.anInt10314];

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class18_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt10314; local15++) {
			this.anIntArray549[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10323 += arg1 * this.anIntArray549[arg0] >> 12;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ZIB)V")
	protected void method8422(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray93[this.anInt10326++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8415() {
		this.anInt10326 = 0;
		this.anInt10323 = 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8417() {
		this.anInt10323 = Math.abs(this.anInt10323);
		if (this.anInt10323 >= 4096) {
			this.anInt10323 = 4095;
		}
		this.method8422(this.anInt10326++, (byte) (this.anInt10323 >> 4));
		this.anInt10323 = 0;
	}
}
