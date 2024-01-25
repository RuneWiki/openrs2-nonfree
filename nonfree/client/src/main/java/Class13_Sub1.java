import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public class Class13_Sub1 extends Class13 {

	@OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
	private int anInt3345;

	@OriginalMember(owner = "client!ufa", name = "w", descriptor = "I")
	private int anInt3351;

	@OriginalMember(owner = "client!ufa", name = "x", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!ufa", name = "z", descriptor = "[I")
	private final int[] anIntArray165 = new int[this.anInt8608];

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class13_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; super.anInt8608 > local13; local13++) {
			this.anIntArray165[local13] = (short) (int) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7327() {
		this.anInt3351 = 0;
		this.anInt3345 = 0;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7328() {
		this.anInt3351 = Math.abs(this.anInt3351);
		if (this.anInt3351 >= 4096) {
			this.anInt3351 = 4095;
		}
		this.method2933((byte) (this.anInt3351 >> 4), this.anInt3345++);
		this.anInt3351 = 0;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BIB)V")
	protected void method2933(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray25[this.anInt3345++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZI)V")
	@Override
	protected final void method7335(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt3351 += this.anIntArray165[arg0] * arg1 >> 12;
	}
}
