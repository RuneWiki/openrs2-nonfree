import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!hg", name = "C", descriptor = "I")
	private int anInt157;

	@OriginalMember(owner = "client!hg", name = "D", descriptor = "I")
	private int anInt158;

	@OriginalMember(owner = "client!hg", name = "F", descriptor = "I")
	private int anInt160;

	@OriginalMember(owner = "client!hg", name = "K", descriptor = "I")
	private int anInt165;

	@OriginalMember(owner = "client!hg", name = "E", descriptor = "I")
	private int anInt159;

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "I")
	private int anInt166;

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
	private int anInt164;

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "I")
	private int anInt156;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class4_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt159 = (int) (arg7 * 4096.0F);
		this.anInt166 = (int) (arg6 * 4096.0F);
		this.anInt156 = this.anInt164 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
	@Override
	protected final void method280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt160 = 4096;
			this.anInt157 = this.anInt166 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt157 = this.anInt157 * this.anInt157 >> 12;
			this.anInt165 = this.anInt157;
			return;
		}
		this.anInt160 = this.anInt159 * this.anInt157 >> 12;
		this.anInt157 = this.anInt166 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt160 < 0) {
			this.anInt160 = 0;
		} else if (this.anInt160 > 4096) {
			this.anInt160 = 4096;
		}
		this.anInt157 = this.anInt157 * this.anInt157 >> 12;
		this.anInt157 = this.anInt157 * this.anInt160 >> 12;
		this.anInt165 += this.anInt156 * this.anInt157 >> 12;
		this.anInt156 = this.anInt164 * this.anInt156 >> 12;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IB)V")
	protected void method205(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray4[arg0] = arg1;
	}

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method285() {
		this.anInt156 = this.anInt164;
		this.anInt165 >>= 0x4;
		if (this.anInt165 < 0) {
			this.anInt165 = 0;
		} else if (this.anInt165 > 255) {
			this.anInt165 = 255;
		}
		this.method205(this.anInt158++, (byte) this.anInt165);
		this.anInt165 = 0;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	@Override
	protected final void method277() {
		this.anInt158 = 0;
		this.anInt165 = 0;
	}
}
