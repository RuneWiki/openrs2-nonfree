import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!ht", name = "t", descriptor = "I")
	private int anInt5872;

	@OriginalMember(owner = "client!ht", name = "C", descriptor = "I")
	private int anInt5879;

	@OriginalMember(owner = "client!ht", name = "G", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!ht", name = "B", descriptor = "[I")
	private final int[] anIntArray455 = new int[this.anInt5868];

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5868 > local15; local15++) {
			this.anIntArray455[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(B)V")
	@Override
	protected final void method5280() {
		this.anInt5872 = Math.abs(this.anInt5872);
		if (this.anInt5872 >= 4096) {
			this.anInt5872 = 4095;
		}
		this.method5293(this.anInt5879++, (byte) (this.anInt5872 >> 4));
		this.anInt5872 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method5287() {
		this.anInt5879 = 0;
		this.anInt5872 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt5872 += this.anIntArray455[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IB)V")
	protected void method5293(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray85[this.anInt5879++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
