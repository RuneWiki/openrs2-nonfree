import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	private int anInt6126;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
	private int anInt6127;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "[I")
	private final int[] anIntArray414 = new int[this.anInt7964];

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt7964 > local15; local15++) {
			this.anIntArray414[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6628() {
		this.anInt6127 = Math.abs(this.anInt6127);
		if (this.anInt6127 >= 4096) {
			this.anInt6127 = 4095;
		}
		this.method5136((byte) (this.anInt6127 >> 4), this.anInt6126++);
		this.anInt6127 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6625() {
		this.anInt6126 = 0;
		this.anInt6127 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIZ)V")
	protected void method5136(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray68[this.anInt6126++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6127 += this.anIntArray414[arg1] * arg0 >> 12;
	}
}
