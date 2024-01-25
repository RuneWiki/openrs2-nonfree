import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kfa")
public class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!kfa", name = "q", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!kfa", name = "r", descriptor = "I")
	private int anInt4685;

	@OriginalMember(owner = "client!kfa", name = "u", descriptor = "I")
	private int anInt4687;

	@OriginalMember(owner = "client!kfa", name = "s", descriptor = "[I")
	private final int[] anIntArray267 = new int[this.anInt4683];

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class25_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt4683 > local15; local15++) {
			this.anIntArray267[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(BII)V")
	protected void method4067(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray54[this.anInt4687++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4685 += this.anIntArray267[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4058() {
		this.anInt4685 = Math.abs(this.anInt4685);
		if (this.anInt4685 >= 4096) {
			this.anInt4685 = 4095;
		}
		this.method4067((byte) (this.anInt4685 >> 4), this.anInt4687++);
		this.anInt4685 = 0;
	}

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4060() {
		this.anInt4685 = 0;
		this.anInt4687 = 0;
	}
}
