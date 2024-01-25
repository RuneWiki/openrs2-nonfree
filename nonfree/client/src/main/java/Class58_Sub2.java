import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class Class58_Sub2 extends Class58 {

	@OriginalMember(owner = "client!se", name = "q", descriptor = "I")
	private int anInt4457;

	@OriginalMember(owner = "client!se", name = "r", descriptor = "I")
	private int anInt4458;

	@OriginalMember(owner = "client!se", name = "w", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	private int anInt4462;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "I")
	private int anInt4466;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "I")
	private final int anInt4468;

	@OriginalMember(owner = "client!se", name = "B", descriptor = "I")
	private final int anInt4465;

	@OriginalMember(owner = "client!se", name = "G", descriptor = "I")
	private final int anInt4469;

	@OriginalMember(owner = "client!se", name = "v", descriptor = "I")
	private int anInt4461;

	static {
		new Class34("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class58_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4468 = (int) (arg6 * 4096.0F);
		this.anInt4465 = (int) (arg7 * 4096.0F);
		this.anInt4461 = this.anInt4469 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	protected void method4003(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray73[arg0] = arg1;
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
	@Override
	protected final void method4002() {
		this.anInt4458 = 0;
		this.anInt4457 = 0;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method3995(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4462 = this.anInt4468 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt4466 = 4096;
			this.anInt4462 = this.anInt4462 * this.anInt4462 >> 12;
			this.anInt4457 = this.anInt4462;
			return;
		}
		this.anInt4466 = this.anInt4462 * this.anInt4465 >> 12;
		this.anInt4462 = this.anInt4468 - (arg0 < 0 ? -arg0 : arg0);
		if (this.anInt4466 < 0) {
			this.anInt4466 = 0;
		} else if (this.anInt4466 > 4096) {
			this.anInt4466 = 4096;
		}
		this.anInt4462 = this.anInt4462 * this.anInt4462 >> 12;
		this.anInt4462 = this.anInt4462 * this.anInt4466 >> 12;
		this.anInt4457 += this.anInt4461 * this.anInt4462 >> 12;
		this.anInt4461 = this.anInt4469 * this.anInt4461 >> 12;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4000() {
		this.anInt4457 >>= 0x4;
		this.anInt4461 = this.anInt4469;
		if (this.anInt4457 < 0) {
			this.anInt4457 = 0;
		} else if (this.anInt4457 > 255) {
			this.anInt4457 = 255;
		}
		this.method4003(this.anInt4458++, (byte) this.anInt4457);
		this.anInt4457 = 0;
	}
}
