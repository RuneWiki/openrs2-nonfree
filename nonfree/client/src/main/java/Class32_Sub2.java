import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "[B")
	private byte[] aByteArray16;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
	private int anInt1975;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "I")
	private int anInt1977;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "[I")
	private int[] anIntArray144 = new int[this.anInt1965];

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class32_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; local15 < this.anInt1965; local15++) {
			this.anIntArray144[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	@Override
	protected final void method1660() {
		this.anInt1975 = 0;
		this.anInt1977 = 0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V")
	@Override
	protected final void method1669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt1977 += arg1 * this.anIntArray144[arg0] >> 12;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)V")
	protected void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray16[this.anInt1975++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	@Override
	protected final void method1666() {
		this.anInt1977 = Math.abs(this.anInt1977);
		if (this.anInt1977 >= 4096) {
			this.anInt1977 = 4095;
		}
		this.method1674(this.anInt1975++, (byte) (this.anInt1977 >> 4));
		this.anInt1977 = 0;
	}
}
