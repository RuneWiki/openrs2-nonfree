import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
	private byte[] aByteArray60;

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
	private int anInt4950;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "I")
	private int anInt4951;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
	private int anInt4955;

	@OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
	private int anInt4956;

	@OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
	private final int anInt4945;

	@OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
	private final int anInt4954;

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "I")
	private final int anInt4957;

	@OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
	private int anInt4946;

	@OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class60_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4945 = (int) (arg7 * 4096.0F);
		this.anInt4954 = (int) (arg6 * 4096.0F);
		this.anInt4946 = this.anInt4957 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4152() {
		this.anInt4951 >>= 0x4;
		this.anInt4946 = this.anInt4957;
		if (this.anInt4951 < 0) {
			this.anInt4951 = 0;
		} else if (this.anInt4951 > 255) {
			this.anInt4951 = 255;
		}
		this.method4165((byte) this.anInt4951, this.anInt4955++);
		this.anInt4951 = 0;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4158() {
		this.anInt4955 = 0;
		this.anInt4951 = 0;
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(III)V")
	@Override
	protected final void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 0) {
			this.anInt4956 = this.anInt4954 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4956 = this.anInt4956 * this.anInt4956 >> 12;
			this.anInt4950 = 4096;
			this.anInt4951 = this.anInt4956;
			return;
		}
		this.anInt4950 = this.anInt4945 * this.anInt4956 >> 12;
		this.anInt4956 = this.anInt4954 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt4950 < 0) {
			this.anInt4950 = 0;
		} else if (this.anInt4950 > 4096) {
			this.anInt4950 = 4096;
		}
		this.anInt4956 = this.anInt4956 * this.anInt4956 >> 12;
		this.anInt4956 = this.anInt4950 * this.anInt4956 >> 12;
		this.anInt4951 += this.anInt4946 * this.anInt4956 >> 12;
		this.anInt4946 = this.anInt4946 * this.anInt4957 >> 12;
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(BIZ)V")
	protected void method4165(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray60[arg1] = arg0;
	}
}
