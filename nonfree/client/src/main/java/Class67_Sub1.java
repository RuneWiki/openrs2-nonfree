import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sja")
public class Class67_Sub1 extends Class67 {

	@OriginalMember(owner = "client!sja", name = "A", descriptor = "I")
	private int anInt4931;

	@OriginalMember(owner = "client!sja", name = "z", descriptor = "I")
	private int anInt4933;

	@OriginalMember(owner = "client!sja", name = "q", descriptor = "[B")
	private byte[] aByteArray58;

	@OriginalMember(owner = "client!sja", name = "t", descriptor = "[I")
	private final int[] anIntArray249 = new int[this.anInt7552];

	@OriginalMember(owner = "client!sja", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class67_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(13) int local13 = 0; local13 < super.anInt7552; local13++) {
			this.anIntArray249[local13] = (short) (int) (Math.pow((double) arg5, (double) local13) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!sja", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6694() {
		this.anInt4931 = Math.abs(this.anInt4931);
		if (this.anInt4931 >= 4096) {
			this.anInt4931 = 4095;
		}
		this.method4402(this.anInt4933++, (byte) (this.anInt4931 >> 4));
		this.anInt4931 = 0;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6693() {
		this.anInt4933 = 0;
		this.anInt4931 = 0;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IBI)V")
	@Override
	protected final void method6695(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt4931 += this.anIntArray249[arg1] * arg0 >> 12;
	}

	@OriginalMember(owner = "client!sja", name = "a", descriptor = "(IIB)V")
	protected void method4402(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray58[this.anInt4933++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}
}
