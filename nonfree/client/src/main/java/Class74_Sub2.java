import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public class Class74_Sub2 extends Class74 {

	@OriginalMember(owner = "client!ht", name = "r", descriptor = "I")
	private int anInt6221;

	@OriginalMember(owner = "client!ht", name = "x", descriptor = "I")
	private int anInt6226;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!ht", name = "q", descriptor = "[I")
	private final int[] anIntArray382 = new int[this.anInt6218];

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class74_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt6218 > local15; local15++) {
			this.anIntArray382[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method5124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6226 += this.anIntArray382[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V")
	@Override
	protected final void method5122() {
		this.anInt6226 = 0;
		this.anInt6221 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "e", descriptor = "(I)V")
	@Override
	protected final void method5123() {
		this.anInt6226 = Math.abs(this.anInt6226);
		if (this.anInt6226 >= 4096) {
			this.anInt6226 = 4095;
		}
		this.method5126(this.anInt6221++, (byte) (this.anInt6226 >> 4));
		this.anInt6226 = 0;
	}

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(IBI)V")
	protected void method5126(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray104[this.anInt6221++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
