import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class Class43_Sub2 extends Class43 {

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	private int anInt3909;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
	private int anInt3914;

	@OriginalMember(owner = "client!qo", name = "z", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
	private int anInt3918;

	@OriginalMember(owner = "client!qo", name = "D", descriptor = "I")
	private int anInt3921;

	@OriginalMember(owner = "client!qo", name = "C", descriptor = "I")
	private final int anInt3920;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
	private final int anInt3912;

	@OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
	private final int anInt3911;

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
	private int anInt3908;

	static {
		new Class231("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIFFF)V")
	protected Class43_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3920 = (int) (arg6 * 4096.0F);
		this.anInt3912 = (int) (arg7 * 4096.0F);
		this.anInt3908 = this.anInt3911 = (int) (Math.pow(0.5D, (double) -arg5) * 4096.0D);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)V")
	protected void method3180(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		this.aByteArray52[arg0] = arg1;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V")
	@Override
	protected final void method3178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3918 = this.anInt3920 - (arg0 >= 0 ? arg0 : -arg0);
			this.anInt3918 = this.anInt3918 * this.anInt3918 >> 12;
			this.anInt3914 = 4096;
			this.anInt3921 = this.anInt3918;
			return;
		}
		this.anInt3914 = this.anInt3912 * this.anInt3918 >> 12;
		if (this.anInt3914 < 0) {
			this.anInt3914 = 0;
		} else if (this.anInt3914 > 4096) {
			this.anInt3914 = 4096;
		}
		this.anInt3918 = this.anInt3920 - (arg0 < 0 ? -arg0 : arg0);
		this.anInt3918 = this.anInt3918 * this.anInt3918 >> 12;
		this.anInt3918 = this.anInt3914 * this.anInt3918 >> 12;
		this.anInt3921 += this.anInt3918 * this.anInt3908 >> 12;
		this.anInt3908 = this.anInt3908 * this.anInt3911 >> 12;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)V")
	@Override
	protected final void method3177() {
		this.anInt3908 = this.anInt3911;
		this.anInt3921 >>= 0x4;
		if (this.anInt3921 < 0) {
			this.anInt3921 = 0;
		} else if (this.anInt3921 > 255) {
			this.anInt3921 = 255;
		}
		this.method3180(this.anInt3909++, (byte) this.anInt3921);
		this.anInt3921 = 0;
	}

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
	@Override
	protected final void method3176() {
		this.anInt3909 = 0;
		this.anInt3921 = 0;
	}
}
