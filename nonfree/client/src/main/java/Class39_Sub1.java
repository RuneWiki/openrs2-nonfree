import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nfa")
public class Class39_Sub1 extends Class39 {

	@OriginalMember(owner = "client!nfa", name = "n", descriptor = "I")
	private int anInt4600;

	@OriginalMember(owner = "client!nfa", name = "o", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!nfa", name = "x", descriptor = "I")
	private int anInt4607;

	@OriginalMember(owner = "client!nfa", name = "t", descriptor = "[I")
	private final int[] anIntArray370 = new int[this.anInt7958];

	@OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class39_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt7958 > local15; local15++) {
			this.anIntArray370[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BII)V")
	protected void method4078(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray42[this.anInt4607++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!nfa", name = "c", descriptor = "(Z)V")
	@Override
	protected final void method6748() {
		this.anInt4600 = Math.abs(this.anInt4600);
		if (this.anInt4600 >= 4096) {
			this.anInt4600 = 4095;
		}
		this.method4078((byte) (this.anInt4600 >> 4), this.anInt4607++);
		this.anInt4600 = 0;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6743(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4600 += this.anIntArray370[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6742() {
		this.anInt4607 = 0;
		this.anInt4600 = 0;
	}
}
