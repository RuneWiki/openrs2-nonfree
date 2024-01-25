import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bn", name = "t", descriptor = "I")
	private int anInt1951;

	@OriginalMember(owner = "client!bn", name = "u", descriptor = "I")
	private int anInt1952;

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "[I")
	private final int[] anIntArray172 = new int[this.anInt5014];

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt5014 > local15; local15++) {
			this.anIntArray172[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BBI)V")
	protected void method1644(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray32[this.anInt1951++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4058() {
		this.anInt1951 = 0;
		this.anInt1952 = 0;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1952 += this.anIntArray172[arg0] * arg1 >> 12;
	}

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4056() {
		this.anInt1952 = Math.abs(this.anInt1952);
		if (this.anInt1952 >= 4096) {
			this.anInt1952 = 4095;
		}
		this.method1644((byte) (this.anInt1952 >> 4), this.anInt1951++);
		this.anInt1952 = 0;
	}
}
