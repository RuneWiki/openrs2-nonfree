import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public class Class127_Sub2 extends Class127 {

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "I")
	private int anInt9598;

	@OriginalMember(owner = "client!kba", name = "u", descriptor = "I")
	private int anInt9604;

	@OriginalMember(owner = "client!kba", name = "w", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!kba", name = "v", descriptor = "[I")
	private final int[] anIntArray699 = new int[this.anInt9588];

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class127_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt9588; local15++) {
			this.anIntArray699[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IBB)V")
	protected void method7980(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray103[this.anInt9598++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7977() {
		this.anInt9598 = 0;
		this.anInt9604 = 0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method7979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt9604 += arg1 * this.anIntArray699[arg0] >> 12;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7976() {
		this.anInt9604 = Math.abs(this.anInt9604);
		if (this.anInt9604 >= 4096) {
			this.anInt9604 = 4095;
		}
		this.method7980(this.anInt9598++, (byte) (this.anInt9604 >> 4));
		this.anInt9604 = 0;
	}
}
