import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public class Class103_Sub1 extends Class103 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private int anInt4189;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
	private int anInt4192;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	private final int[] anIntArray232 = new int[this.anInt9369];

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class103_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt9369 > local15; local15++) {
			this.anIntArray232[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIB)V")
	protected void method3428(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray29[this.anInt4192++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7637() {
		this.anInt4189 = 0;
		this.anInt4192 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	@Override
	protected final void method7642() {
		this.anInt4189 = Math.abs(this.anInt4189);
		if (this.anInt4189 >= 4096) {
			this.anInt4189 = 4095;
		}
		this.method3428(this.anInt4192++, (byte) (this.anInt4189 >> 4));
		this.anInt4189 = 0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7632(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4189 += this.anIntArray232[arg1] * arg0 >> 12;
	}
}
