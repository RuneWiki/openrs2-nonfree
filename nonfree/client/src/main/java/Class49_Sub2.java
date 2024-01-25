import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	private int anInt4700;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	private int anInt4702;

	@OriginalMember(owner = "client!un", name = "w", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "I")
	private int anInt4705;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	private int anInt4707;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "I")
	private final int anInt4706;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	private final int anInt4697;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "I")
	private final int anInt4710;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "I")
	private int anInt4709;

	static {
		new Class32("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class49_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt4706 = (int) (arg6 * 4096.0F);
		this.anInt4697 = (int) (arg7 * 4096.0F);
		this.anInt4709 = this.anInt4710 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
	@Override
	protected final void method4154() {
		this.anInt4702 = 0;
		this.anInt4707 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt4700 = this.anInt4706 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt4700 = this.anInt4700 * this.anInt4700 >> 12;
			this.anInt4705 = 4096;
			this.anInt4707 = this.anInt4700;
			return;
		}
		this.anInt4705 = this.anInt4697 * this.anInt4700 >> 12;
		if (this.anInt4705 < 0) {
			this.anInt4705 = 0;
		} else if (this.anInt4705 > 4096) {
			this.anInt4705 = 4096;
		}
		this.anInt4700 = this.anInt4706 - (arg1 < 0 ? -arg1 : arg1);
		this.anInt4700 = this.anInt4700 * this.anInt4700 >> 12;
		this.anInt4700 = this.anInt4700 * this.anInt4705 >> 12;
		this.anInt4707 += this.anInt4700 * this.anInt4709 >> 12;
		this.anInt4709 = this.anInt4709 * this.anInt4710 >> 12;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	@Override
	protected final void method4153() {
		this.anInt4707 >>= 0x4;
		this.anInt4709 = this.anInt4710;
		if (this.anInt4707 < 0) {
			this.anInt4707 = 0;
		} else if (this.anInt4707 > 255) {
			this.anInt4707 = 255;
		}
		this.method4160(this.anInt4702++, (byte) this.anInt4707);
		this.anInt4707 = 0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	protected void method4160(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray82[arg0] = arg1;
	}
}
