import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class Class37_Sub2 extends Class37 {

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "I")
	private int anInt5651;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
	private int anInt5658;

	@OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
	private int anInt5659;

	@OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
	private int anInt5661;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	private int anInt5646;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	private int anInt5650;

	@OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
	private int anInt5647;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class37_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5646 = (int) (arg6 * 4096.0F);
		this.anInt5657 = (int) (arg7 * 4096.0F);
		this.anInt5647 = this.anInt5650 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4720() {
		this.anInt5651 = 0;
		this.anInt5659 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4718(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5661 = this.anInt5646 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt5661 = this.anInt5661 * this.anInt5661 >> 12;
			this.anInt5659 = this.anInt5661;
			this.anInt5658 = 4096;
			return;
		}
		this.anInt5658 = this.anInt5661 * this.anInt5657 >> 12;
		this.anInt5661 = this.anInt5646 - (arg0 >= 0 ? arg0 : -arg0);
		if (this.anInt5658 < 0) {
			this.anInt5658 = 0;
		} else if (this.anInt5658 > 4096) {
			this.anInt5658 = 4096;
		}
		this.anInt5661 = this.anInt5661 * this.anInt5661 >> 12;
		this.anInt5661 = this.anInt5658 * this.anInt5661 >> 12;
		this.anInt5659 += this.anInt5647 * this.anInt5661 >> 12;
		this.anInt5647 = this.anInt5647 * this.anInt5650 >> 12;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4714() {
		this.anInt5659 >>= 0x4;
		if (this.anInt5659 < 0) {
			this.anInt5659 = 0;
		} else if (this.anInt5659 > 255) {
			this.anInt5659 = 255;
		}
		this.anInt5647 = this.anInt5650;
		this.method4728(this.anInt5651++, (byte) this.anInt5659);
		this.anInt5659 = 0;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(IB)V")
	protected void method4728(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray74[arg0] = arg1;
	}
}
