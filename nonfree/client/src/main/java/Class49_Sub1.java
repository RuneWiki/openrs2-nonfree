import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	private int anInt1243;

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "I")
	private int anInt1251;

	@OriginalMember(owner = "client!ec", name = "y", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!ec", name = "p", descriptor = "[I")
	private final int[] anIntArray264 = new int[this.anInt4694];

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt4694; local15++) {
			this.anIntArray264[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	protected void method1029(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray18[this.anInt1251++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4154() {
		this.anInt1251 = 0;
		this.anInt1243 = 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1243 += this.anIntArray264[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4153() {
		this.anInt1243 = Math.abs(this.anInt1243);
		if (this.anInt1243 >= 4096) {
			this.anInt1243 = 4095;
		}
		this.method1029(this.anInt1251++, (byte) (this.anInt1243 >> 4));
		this.anInt1243 = 0;
	}
}
