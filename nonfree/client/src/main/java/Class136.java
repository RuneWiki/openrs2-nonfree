import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public abstract class Class136 {

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "Z")
	public boolean aBoolean495;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Z")
	protected boolean aBoolean499;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "Z")
	protected boolean aBoolean508;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
	public int anInt4439 = 2;

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
	public int anInt4442 = 127;

	@OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
	public int anInt4446 = 0;

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
	public int anInt4441 = 127;

	@OriginalMember(owner = "client!ko", name = "k", descriptor = "Z")
	public boolean aBoolean497 = false;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
	public int anInt4443 = 0;

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "Z")
	public boolean aBoolean496 = true;

	@OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
	public int anInt4445 = 0;

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "Z")
	public boolean aBoolean503 = true;

	@OriginalMember(owner = "client!ko", name = "w", descriptor = "Z")
	public boolean aBoolean504 = true;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Z")
	public boolean aBoolean500 = true;

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
	protected int anInt4447 = 0;

	@OriginalMember(owner = "client!ko", name = "x", descriptor = "Z")
	public boolean aBoolean505 = false;

	@OriginalMember(owner = "client!ko", name = "u", descriptor = "Z")
	protected boolean aBoolean502 = true;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "I")
	public int anInt4455 = 2;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
	public int anInt4440 = 0;

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "Z")
	public boolean aBoolean506 = true;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
	public int anInt4451 = 3;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "I")
	public int anInt4454 = 0;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "I")
	public int anInt4444 = 255;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "Z")
	public boolean aBoolean501 = true;

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
	public int anInt4450 = 1;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "I")
	public int anInt4457 = 0;

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
	protected int anInt4458 = 2;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "Z")
	public boolean aBoolean509 = true;

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "Z")
	public boolean aBoolean507 = true;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Z")
	public boolean aBoolean498 = true;

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "Z")
	public boolean aBoolean510 = true;

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
	public boolean aBoolean511 = false;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
	public int anInt4459 = 2;

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "Z")
	public boolean aBoolean512 = true;

	static {
		new Class119("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
	}

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V")
	protected Class136() {
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	public final int method3516(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.anInt4458 : this.anInt4447;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZB)V")
	public final void method3517(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.aBoolean508 = arg1;
		} else {
			this.aBoolean499 = arg1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIB)V")
	public final void method3518(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 1 || arg0 == 3) {
			this.anInt4458 = arg1;
		} else {
			this.anInt4447 = arg1;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(BI)Z")
	public final boolean method3519(@OriginalArg(1) int arg0) {
		return arg0 == 1 || arg0 == 3 ? this.aBoolean508 : this.aBoolean499;
	}
}
