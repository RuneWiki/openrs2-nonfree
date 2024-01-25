import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public class Class6_Sub1 extends Class6 {

	@OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
	private int anInt7229;

	@OriginalMember(owner = "client!rb", name = "K", descriptor = "I")
	private int anInt7233;

	@OriginalMember(owner = "client!rb", name = "L", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!rb", name = "H", descriptor = "[I")
	private final int[] anIntArray696 = new int[this.anInt7216];

	@OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class6_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < super.anInt7216; local15++) {
			this.anIntArray696[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method6051() {
		this.anInt7233 = Math.abs(this.anInt7233);
		if (this.anInt7233 >= 4096) {
			this.anInt7233 = 4095;
		}
		this.method6056((byte) (this.anInt7233 >> 4), this.anInt7229++);
		this.anInt7233 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(III)V")
	@Override
	protected final void method6052(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anInt7233 += arg0 * this.anIntArray696[arg1] >> 12;
	}

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V")
	@Override
	protected final void method6049() {
		this.anInt7233 = 0;
		this.anInt7229 = 0;
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(BIB)V")
	protected void method6056(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray103[this.anInt7229++] = (byte) ((arg0 >> 1 & 0x7F) + 127);
	}
}
