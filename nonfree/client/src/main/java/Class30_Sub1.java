import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!fv", name = "p", descriptor = "I")
	private int anInt6018;

	@OriginalMember(owner = "client!fv", name = "v", descriptor = "I")
	private int anInt6023;

	@OriginalMember(owner = "client!fv", name = "x", descriptor = "I")
	private int anInt6025;

	@OriginalMember(owner = "client!fv", name = "B", descriptor = "I")
	private int anInt6029;

	@OriginalMember(owner = "client!fv", name = "C", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!fv", name = "s", descriptor = "I")
	private final int anInt6021;

	@OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
	private final int anInt6022;

	@OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
	private final int anInt6030;

	@OriginalMember(owner = "client!fv", name = "w", descriptor = "I")
	private int anInt6024;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class30_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt6021 = (int) (arg6 * 4096.0F);
		this.anInt6022 = (int) (arg7 * 4096.0F);
		this.anInt6024 = this.anInt6030 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	@Override
	protected final void method7987() {
		this.anInt6023 = 0;
		this.anInt6025 = 0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BII)V")
	protected void method5137(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray70[arg1] = arg0;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(III)V")
	@Override
	protected final void method7990(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt6018 = this.anInt6021 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt6029 = 4096;
			this.anInt6018 = this.anInt6018 * this.anInt6018 >> 12;
			this.anInt6025 = this.anInt6018;
			return;
		}
		this.anInt6029 = this.anInt6018 * this.anInt6022 >> 12;
		this.anInt6018 = this.anInt6021 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt6029 < 0) {
			this.anInt6029 = 0;
		} else if (this.anInt6029 > 4096) {
			this.anInt6029 = 4096;
		}
		this.anInt6018 = this.anInt6018 * this.anInt6018 >> 12;
		this.anInt6018 = this.anInt6018 * this.anInt6029 >> 12;
		this.anInt6025 += this.anInt6024 * this.anInt6018 >> 12;
		this.anInt6024 = this.anInt6024 * this.anInt6030 >> 12;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	@Override
	protected final void method7988() {
		this.anInt6024 = this.anInt6030;
		this.anInt6025 >>= 0x4;
		if (this.anInt6025 < 0) {
			this.anInt6025 = 0;
		} else if (this.anInt6025 > 255) {
			this.anInt6025 = 255;
		}
		this.method5137((byte) this.anInt6025, this.anInt6023++);
		this.anInt6025 = 0;
	}
}
