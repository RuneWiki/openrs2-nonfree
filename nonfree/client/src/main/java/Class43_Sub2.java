import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	private int anInt10076;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "I")
	private int anInt10082;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "[I")
	private final int[] anIntArray610 = new int[this.anInt10074];

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt10074 > local15; local15++) {
			this.anIntArray610[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	protected final void method8276() {
		this.anInt10082 = 0;
		this.anInt10076 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
	protected void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray104[this.anInt10076++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	protected final void method8279() {
		this.anInt10082 = Math.abs(this.anInt10082);
		if (this.anInt10082 >= 4096) {
			this.anInt10082 = 4095;
		}
		this.method8284(this.anInt10076++, (byte) (this.anInt10082 >> 4));
		this.anInt10082 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	@Override
	protected final void method8283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10082 += arg0 * this.anIntArray610[arg1] >> 12;
	}
}
