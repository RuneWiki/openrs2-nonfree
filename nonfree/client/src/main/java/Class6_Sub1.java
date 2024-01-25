import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!ae", name = "u", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
	private int anInt6082;

	@OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
	private int anInt6084;

	@OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
	private final int[] anIntArray507 = new int[this.anInt6076];

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt6076; local15++) {
			this.anIntArray507[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V")
	protected void method5167(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray89[this.anInt6082++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
	@Override
	protected final void method5164() {
		this.anInt6084 = Math.abs(this.anInt6084);
		if (this.anInt6084 >= 4096) {
			this.anInt6084 = 4095;
		}
		this.method5167(this.anInt6082++, (byte) (this.anInt6084 >> 4));
		this.anInt6084 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5160() {
		this.anInt6084 = 0;
		this.anInt6082 = 0;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method5165(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6084 += this.anIntArray507[arg1] * arg0 >> 12;
	}
}
