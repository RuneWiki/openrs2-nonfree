import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!saa")
public class Class223_Sub1 extends Class223 {

	@OriginalMember(owner = "client!saa", name = "p", descriptor = "[B")
	private byte[] aByteArray81;

	@OriginalMember(owner = "client!saa", name = "u", descriptor = "I")
	private int anInt8014;

	@OriginalMember(owner = "client!saa", name = "v", descriptor = "I")
	private int anInt8015;

	@OriginalMember(owner = "client!saa", name = "t", descriptor = "[I")
	private final int[] anIntArray488 = new int[this.anInt8004];

	@OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class223_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt8004; local15++) {
			this.anIntArray488[local15] = (short) (int) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6920() {
		this.anInt8015 = 0;
		this.anInt8014 = 0;
	}

	@OriginalMember(owner = "client!saa", name = "b", descriptor = "(B)V")
	@Override
	protected final void method6922() {
		this.anInt8014 = Math.abs(this.anInt8014);
		if (this.anInt8014 >= 4096) {
			this.anInt8014 = 4095;
		}
		this.method6927((byte) (this.anInt8014 >> 4), this.anInt8015++);
		this.anInt8014 = 0;
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(BII)V")
	protected void method6927(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray81[this.anInt8015++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt8014 += arg1 * this.anIntArray488[arg0] >> 12;
	}
}
