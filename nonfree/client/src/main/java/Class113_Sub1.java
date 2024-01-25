import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "I")
	private int anInt3641;

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "I")
	private int anInt3643;

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "I")
	private int anInt3648;

	@OriginalMember(owner = "client!hw", name = "y", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!hw", name = "C", descriptor = "I")
	private int anInt3652;

	@OriginalMember(owner = "client!hw", name = "B", descriptor = "I")
	private final int anInt3651;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "I")
	private final int anInt3640;

	@OriginalMember(owner = "client!hw", name = "w", descriptor = "I")
	private final int anInt3647;

	@OriginalMember(owner = "client!hw", name = "z", descriptor = "I")
	private int anInt3649;

	static {
		new Class142("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class113_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3651 = (int) (arg7 * 4096.0F);
		this.anInt3640 = (int) (arg6 * 4096.0F);
		this.anInt3649 = this.anInt3647 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)V")
	@Override
	protected final void method4569() {
		this.anInt3652 = 0;
		this.anInt3643 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V")
	@Override
	protected final void method4568() {
		this.anInt3643 >>= 0x4;
		this.anInt3649 = this.anInt3647;
		if (this.anInt3643 < 0) {
			this.anInt3643 = 0;
		} else if (this.anInt3643 > 255) {
			this.anInt3643 = 255;
		}
		this.method2858(this.anInt3652++, (byte) this.anInt3643);
		this.anInt3643 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)V")
	@Override
	protected final void method4566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3641 = this.anInt3640 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt3641 = this.anInt3641 * this.anInt3641 >> 12;
			this.anInt3648 = 4096;
			this.anInt3643 = this.anInt3641;
			return;
		}
		this.anInt3648 = this.anInt3651 * this.anInt3641 >> 12;
		if (this.anInt3648 < 0) {
			this.anInt3648 = 0;
		} else if (this.anInt3648 > 4096) {
			this.anInt3648 = 4096;
		}
		this.anInt3641 = this.anInt3640 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt3641 = this.anInt3641 * this.anInt3641 >> 12;
		this.anInt3641 = this.anInt3648 * this.anInt3641 >> 12;
		this.anInt3643 += this.anInt3641 * this.anInt3649 >> 12;
		this.anInt3649 = this.anInt3647 * this.anInt3649 >> 12;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBB)V")
	protected void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		this.aByteArray36[arg0] = arg1;
	}
}
