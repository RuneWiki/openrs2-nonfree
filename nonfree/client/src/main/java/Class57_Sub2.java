import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public class Class57_Sub2 extends Class57 {

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "I")
	private int anInt5731;

	@OriginalMember(owner = "client!ov", name = "s", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!ov", name = "t", descriptor = "I")
	private int anInt5732;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "[I")
	private final int[] anIntArray383 = new int[this.anInt5722];

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class57_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt5722; local13++) {
			this.anIntArray383[local13] = (short) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4475() {
		this.anInt5732 = 0;
		this.anInt5731 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BII)V")
	protected void method4483(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray77[this.anInt5731++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ov", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4481() {
		this.anInt5732 = Math.abs(this.anInt5732);
		if (this.anInt5732 >= 4096) {
			this.anInt5732 = 4095;
		}
		this.method4483((byte) (this.anInt5732 >> 4), this.anInt5731++);
		this.anInt5732 = 0;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4476(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5732 += arg1 * this.anIntArray383[arg0] >> 12;
	}
}
