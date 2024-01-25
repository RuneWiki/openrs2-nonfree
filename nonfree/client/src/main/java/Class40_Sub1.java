import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public class Class40_Sub1 extends Class40 {

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
	private int anInt10273;

	@OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
	private int anInt10274;

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!bh", name = "w", descriptor = "[I")
	private final int[] anIntArray576 = new int[this.anInt10263];

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class40_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt10263 > local15; local15++) {
			this.anIntArray576[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method8832() {
		this.anInt10274 = 0;
		this.anInt10273 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIB)V")
	protected void method8837(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray103[this.anInt10273++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V")
	@Override
	protected final void method8833() {
		this.anInt10274 = Math.abs(this.anInt10274);
		if (this.anInt10274 >= 4096) {
			this.anInt10274 = 4095;
		}
		this.method8837(this.anInt10273++, (byte) (this.anInt10274 >> 4));
		this.anInt10274 = 0;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt10274 += this.anIntArray576[arg1] * arg0 >> 12;
	}
}
