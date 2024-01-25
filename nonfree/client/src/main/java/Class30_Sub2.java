import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class Class30_Sub2 extends Class30 {

	@OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
	private int anInt5020;

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
	private int anInt5021;

	@OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
	private int anInt5023;

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
	private int anInt5027;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
	private final int anInt5031;

	@OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
	private final int anInt5028;

	@OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
	private final int anInt5032;

	@OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
	private int anInt5026;

	@OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class30_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt5031 = (int) (arg6 * 4096.0F);
		this.anInt5028 = (int) (arg7 * 4096.0F);
		this.anInt5026 = this.anInt5032 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4057(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt5020 = this.anInt5031 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt5020 = this.anInt5020 * this.anInt5020 >> 12;
			this.anInt5027 = 4096;
			this.anInt5021 = this.anInt5020;
			return;
		}
		this.anInt5027 = this.anInt5028 * this.anInt5020 >> 12;
		this.anInt5020 = this.anInt5031 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt5027 < 0) {
			this.anInt5027 = 0;
		} else if (this.anInt5027 > 4096) {
			this.anInt5027 = 4096;
		}
		this.anInt5020 = this.anInt5020 * this.anInt5020 >> 12;
		this.anInt5020 = this.anInt5020 * this.anInt5027 >> 12;
		this.anInt5021 += this.anInt5020 * this.anInt5026 >> 12;
		this.anInt5026 = this.anInt5032 * this.anInt5026 >> 12;
	}

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
	@Override
	protected final void method4058() {
		this.anInt5023 = 0;
		this.anInt5021 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V")
	@Override
	protected final void method4056() {
		this.anInt5021 >>= 0x4;
		this.anInt5026 = this.anInt5032;
		if (this.anInt5021 < 0) {
			this.anInt5021 = 0;
		} else if (this.anInt5021 > 255) {
			this.anInt5021 = 255;
		}
		this.method4070((byte) this.anInt5021, this.anInt5023++);
		this.anInt5021 = 0;
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(BII)V")
	protected void method4070(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		this.aByteArray64[arg1] = arg0;
	}
}
