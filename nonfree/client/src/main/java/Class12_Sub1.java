import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public class Class12_Sub1 extends Class12 {

	@OriginalMember(owner = "client!aja", name = "u", descriptor = "I")
	private int anInt10681;

	@OriginalMember(owner = "client!aja", name = "B", descriptor = "I")
	private int anInt10682;

	@OriginalMember(owner = "client!aja", name = "D", descriptor = "I")
	private int anInt10686;

	@OriginalMember(owner = "client!aja", name = "y", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!aja", name = "r", descriptor = "I")
	private int anInt10688;

	@OriginalMember(owner = "client!aja", name = "s", descriptor = "I")
	private final int anInt10685;

	@OriginalMember(owner = "client!aja", name = "G", descriptor = "I")
	private final int anInt10677;

	@OriginalMember(owner = "client!aja", name = "v", descriptor = "I")
	private final int anInt10679;

	@OriginalMember(owner = "client!aja", name = "w", descriptor = "I")
	private int anInt10678;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt10685 = (int) (arg7 * 4096.0F);
		this.anInt10677 = (int) (arg6 * 4096.0F);
		this.anInt10678 = this.anInt10679 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!aja", name = "b", descriptor = "(IIB)V")
	protected void method8932(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray108[arg0] = arg1;
	}

	@OriginalMember(owner = "client!aja", name = "c", descriptor = "(B)V")
	@Override
	protected final void method8923() {
		this.anInt10678 = this.anInt10679;
		this.anInt10682 >>= 0x4;
		if (this.anInt10682 < 0) {
			this.anInt10682 = 0;
		} else if (this.anInt10682 > 255) {
			this.anInt10682 = 255;
		}
		this.method8932(this.anInt10686++, (byte) this.anInt10682);
		this.anInt10682 = 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(I)V")
	@Override
	protected final void method8922() {
		this.anInt10686 = 0;
		this.anInt10682 = 0;
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(IIB)V")
	@Override
	protected final void method8928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt10681 = this.anInt10677 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt10688 = 4096;
			this.anInt10681 = this.anInt10681 * this.anInt10681 >> 12;
			this.anInt10682 = this.anInt10681;
			return;
		}
		this.anInt10688 = this.anInt10685 * this.anInt10681 >> 12;
		this.anInt10681 = this.anInt10677 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt10688 < 0) {
			this.anInt10688 = 0;
		} else if (this.anInt10688 > 4096) {
			this.anInt10688 = 4096;
		}
		this.anInt10681 = this.anInt10681 * this.anInt10681 >> 12;
		this.anInt10681 = this.anInt10688 * this.anInt10681 >> 12;
		this.anInt10682 += this.anInt10678 * this.anInt10681 >> 12;
		this.anInt10678 = this.anInt10679 * this.anInt10678 >> 12;
	}
}
