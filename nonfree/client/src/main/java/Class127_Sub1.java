import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!im", name = "q", descriptor = "I")
	private int anInt4930;

	@OriginalMember(owner = "client!im", name = "s", descriptor = "I")
	private int anInt4931;

	@OriginalMember(owner = "client!im", name = "t", descriptor = "[B")
	private byte[] aByteArray56;

	@OriginalMember(owner = "client!im", name = "u", descriptor = "I")
	private int anInt4932;

	@OriginalMember(owner = "client!im", name = "w", descriptor = "I")
	private int anInt4934;

	@OriginalMember(owner = "client!im", name = "C", descriptor = "I")
	private final int anInt4940;

	@OriginalMember(owner = "client!im", name = "z", descriptor = "I")
	private final int anInt4937;

	@OriginalMember(owner = "client!im", name = "E", descriptor = "I")
	private final int anInt4942;

	@OriginalMember(owner = "client!im", name = "A", descriptor = "I")
	private int anInt4938;

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class127_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4940 = (int) (arg7 * 4096.0F);
		this.anInt4937 = (int) (arg6 * 4096.0F);
		this.anInt4938 = this.anInt4942 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method7979(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4930 = this.anInt4937 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4931 = 4096;
			this.anInt4930 = this.anInt4930 * this.anInt4930 >> 12;
			this.anInt4934 = this.anInt4930;
			return;
		}
		this.anInt4931 = this.anInt4930 * this.anInt4940 >> 12;
		if (this.anInt4931 < 0) {
			this.anInt4931 = 0;
		} else if (this.anInt4931 > 4096) {
			this.anInt4931 = 4096;
		}
		this.anInt4930 = this.anInt4937 - (arg1 >= 0 ? arg1 : -arg1);
		this.anInt4930 = this.anInt4930 * this.anInt4930 >> 12;
		this.anInt4930 = this.anInt4930 * this.anInt4931 >> 12;
		this.anInt4934 += this.anInt4930 * this.anInt4938 >> 12;
		this.anInt4938 = this.anInt4942 * this.anInt4938 >> 12;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7976() {
		this.anInt4934 >>= 0x4;
		this.anInt4938 = this.anInt4942;
		if (this.anInt4934 < 0) {
			this.anInt4934 = 0;
		} else if (this.anInt4934 > 255) {
			this.anInt4934 = 255;
		}
		this.method4131((byte) this.anInt4934, this.anInt4932++);
		this.anInt4934 = 0;
	}

	@OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7977() {
		this.anInt4934 = 0;
		this.anInt4932 = 0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BIZ)V")
	protected void method4131(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray56[arg1] = arg0;
	}
}
