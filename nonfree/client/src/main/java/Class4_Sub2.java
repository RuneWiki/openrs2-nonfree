import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!mm", name = "y", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
	private int anInt272;

	@OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
	private int anInt276;

	@OriginalMember(owner = "client!mm", name = "x", descriptor = "[I")
	private int[] anIntArray23 = new int[this.anInt254];

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt254; local15++) {
			this.anIntArray23[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V")
	@Override
	protected final void method280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt272 += arg0 * this.anIntArray23[arg1] >> 12;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)V")
	protected void method286(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray8[this.anInt276++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	protected final void method277() {
		this.anInt276 = 0;
		this.anInt272 = 0;
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method285() {
		this.anInt272 = Math.abs(this.anInt272);
		if (this.anInt272 >= 4096) {
			this.anInt272 = 4095;
		}
		this.method286(this.anInt276++, (byte) (this.anInt272 >> 4));
		this.anInt272 = 0;
	}
}
