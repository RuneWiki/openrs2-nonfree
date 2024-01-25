import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class Class32_Sub1 extends Class32 {

	@OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
	private int anInt8460;

	@OriginalMember(owner = "client!kt", name = "q", descriptor = "[B")
	private byte[] aByteArray106;

	@OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
	private int anInt8467;

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
	private int anInt8469;

	@OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
	private int anInt8471;

	@OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
	private final int anInt8465;

	@OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
	private final int anInt8466;

	@OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
	private final int anInt8464;

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
	private int anInt8461;

	static {
		new Class88("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
	}

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class32_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt8465 = (int) (arg6 * 4096.0F);
		this.anInt8466 = (int) (arg7 * 4096.0F);
		this.anInt8461 = this.anInt8464 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
	@Override
	protected final void method6960() {
		this.anInt8461 = this.anInt8464;
		this.anInt8460 >>= 0x4;
		if (this.anInt8460 < 0) {
			this.anInt8460 = 0;
		} else if (this.anInt8460 > 255) {
			this.anInt8460 = 255;
		}
		this.method6963((byte) this.anInt8460, this.anInt8469++);
		this.anInt8460 = 0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BIB)V")
	protected void method6963(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		this.aByteArray106[arg1] = arg0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
	@Override
	protected final void method6956() {
		this.anInt8469 = 0;
		this.anInt8460 = 0;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method6955(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt8471 = this.anInt8465 - (arg1 >= 0 ? arg1 : -arg1);
			this.anInt8471 = this.anInt8471 * this.anInt8471 >> 12;
			this.anInt8467 = 4096;
			this.anInt8460 = this.anInt8471;
			return;
		}
		this.anInt8467 = this.anInt8466 * this.anInt8471 >> 12;
		this.anInt8471 = this.anInt8465 - (arg1 >= 0 ? arg1 : -arg1);
		if (this.anInt8467 < 0) {
			this.anInt8467 = 0;
		} else if (this.anInt8467 > 4096) {
			this.anInt8467 = 4096;
		}
		this.anInt8471 = this.anInt8471 * this.anInt8471 >> 12;
		this.anInt8471 = this.anInt8471 * this.anInt8467 >> 12;
		this.anInt8460 += this.anInt8471 * this.anInt8461 >> 12;
		this.anInt8461 = this.anInt8461 * this.anInt8464 >> 12;
	}
}
