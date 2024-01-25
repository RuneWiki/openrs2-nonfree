import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class Class27_Sub1 extends Class27 {

	@OriginalMember(owner = "client!uo", name = "o", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!uo", name = "s", descriptor = "I")
	private int anInt411;

	@OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
	private int anInt412;

	@OriginalMember(owner = "client!uo", name = "u", descriptor = "I")
	private int anInt413;

	@OriginalMember(owner = "client!uo", name = "B", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!uo", name = "v", descriptor = "I")
	private final int anInt414;

	@OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
	private final int anInt409;

	@OriginalMember(owner = "client!uo", name = "r", descriptor = "I")
	private final int anInt410;

	@OriginalMember(owner = "client!uo", name = "A", descriptor = "I")
	private int anInt418;

	static {
		new Class57("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
	}

	@OriginalMember(owner = "client!uo", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class27_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt414 = (int) (arg6 * 4096.0F);
		this.anInt409 = (int) (arg7 * 4096.0F);
		this.anInt418 = this.anInt410 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Z)V")
	@Override
	protected final void method4643() {
		this.anInt407 = 0;
		this.anInt411 = 0;
	}

	@OriginalMember(owner = "client!uo", name = "d", descriptor = "(I)V")
	@Override
	protected final void method4649() {
		this.anInt411 >>= 0x4;
		this.anInt418 = this.anInt410;
		if (this.anInt411 < 0) {
			this.anInt411 = 0;
		} else if (this.anInt411 > 255) {
			this.anInt411 = 255;
		}
		this.method365(this.anInt407++, (byte) this.anInt411);
		this.anInt411 = 0;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
	protected void method365(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray5[arg0] = arg1;
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V")
	@Override
	protected final void method4650(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0) {
			this.anInt413 = this.anInt414 - (arg1 < 0 ? -arg1 : arg1);
			this.anInt412 = 4096;
			this.anInt413 = this.anInt413 * this.anInt413 >> 12;
			this.anInt411 = this.anInt413;
			return;
		}
		this.anInt412 = this.anInt413 * this.anInt409 >> 12;
		this.anInt413 = this.anInt414 - (arg1 < 0 ? -arg1 : arg1);
		if (this.anInt412 < 0) {
			this.anInt412 = 0;
		} else if (this.anInt412 > 4096) {
			this.anInt412 = 4096;
		}
		this.anInt413 = this.anInt413 * this.anInt413 >> 12;
		this.anInt413 = this.anInt412 * this.anInt413 >> 12;
		this.anInt411 += this.anInt413 * this.anInt418 >> 12;
		this.anInt418 = this.anInt410 * this.anInt418 >> 12;
	}
}
