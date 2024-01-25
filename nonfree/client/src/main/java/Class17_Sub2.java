import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!pba", name = "p", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!pba", name = "r", descriptor = "I")
	private int anInt6139;

	@OriginalMember(owner = "client!pba", name = "x", descriptor = "I")
	private int anInt6143;

	@OriginalMember(owner = "client!pba", name = "s", descriptor = "[I")
	private final int[] anIntArray448 = new int[this.anInt10112];

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class17_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt10112 > local15; local15++) {
			this.anIntArray448[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8419() {
		this.anInt6143 = Math.abs(this.anInt6143);
		if (this.anInt6143 >= 4096) {
			this.anInt6143 = 4095;
		}
		this.method5101(this.anInt6139++, (byte) (this.anInt6143 >> 4));
		this.anInt6143 = 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(B)V")
	@Override
	protected final void method8414() {
		this.anInt6143 = 0;
		this.anInt6139 = 0;
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)V")
	protected void method5101(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray71[this.anInt6139++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method8416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6143 += this.anIntArray448[arg0] * arg1 >> 12;
	}
}
