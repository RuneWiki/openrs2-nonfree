import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public class Class5_Sub1 extends Class5 {

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "I")
	private int anInt6255;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "I")
	private int anInt6260;

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "[I")
	private final int[] anIntArray505 = new int[this.anInt6243];

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class5_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt6243 > local15; local15++) {
			this.anIntArray505[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	@Override
	protected final void method5021() {
		this.anInt6260 = 0;
		this.anInt6255 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5029() {
		this.anInt6255 = Math.abs(this.anInt6255);
		if (this.anInt6255 >= 4096) {
			this.anInt6255 = 4095;
		}
		this.method5030(this.anInt6260++, (byte) (this.anInt6255 >> 4));
		this.anInt6255 = 0;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ZIB)V")
	protected void method5030(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray70[this.anInt6260++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6255 += this.anIntArray505[arg0] * arg1 >> 12;
	}
}
