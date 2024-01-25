import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public class Class10_Sub1 extends Class10 {

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
	private int anInt1623;

	@OriginalMember(owner = "client!pk", name = "s", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
	private int anInt1627;

	@OriginalMember(owner = "client!pk", name = "x", descriptor = "[I")
	private final int[] anIntArray146 = new int[this.anInt9583];

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class10_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt9583 > local15; local15++) {
			this.anIntArray146[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIB)V")
	protected void method1368(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray33[this.anInt1627++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method7695() {
		this.anInt1627 = 0;
		this.anInt1623 = 0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
	@Override
	protected final void method7700() {
		this.anInt1623 = Math.abs(this.anInt1623);
		if (this.anInt1623 >= 4096) {
			this.anInt1623 = 4095;
		}
		this.method1368(this.anInt1627++, (byte) (this.anInt1623 >> 4));
		this.anInt1623 = 0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1623 += this.anIntArray146[arg0] * arg1 >> 12;
	}
}
