import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public class Class32_Sub2 extends Class32 {

	@OriginalMember(owner = "client!un", name = "p", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	private int anInt6723;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private int anInt6724;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "[I")
	private final int[] anIntArray464 = new int[this.anInt8458];

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIF)V")
	protected Class32_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		for (@Pc(15) int local15 = 0; super.anInt8458 > local15; local15++) {
			this.anIntArray464[local15] = (short) (Math.pow((double) arg5, (double) local15) * 4096.0D);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	@Override
	protected final void method6960() {
		this.anInt6724 = Math.abs(this.anInt6724);
		if (this.anInt6724 >= 4096) {
			this.anInt6724 = 4095;
		}
		this.method5623(this.anInt6723++, (byte) (this.anInt6724 >> 4));
		this.anInt6724 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IBB)V")
	protected void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray88[this.anInt6723++] = (byte) ((arg1 >> 1 & 0x7F) + 127);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method6955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anInt6724 += arg1 * this.anIntArray464[arg0] >> 12;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6956() {
		this.anInt6724 = 0;
		this.anInt6723 = 0;
	}
}
