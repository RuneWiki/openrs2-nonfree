import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public final class Class167 {

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
	public int anInt4515;

	@OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
	public int anInt4517;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "Lclient!ng;")
	public Class167 aClass167_2;

	@OriginalMember(owner = "client!ng", name = "i", descriptor = "I")
	public int anInt4522;

	@OriginalMember(owner = "client!ng", name = "l", descriptor = "I")
	public int anInt4525;

	@OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
	public int anInt4526;

	@OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
	public int anInt4527;

	@OriginalMember(owner = "client!ng", name = "p", descriptor = "I")
	public int anInt4528;

	@OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
	public int anInt4529;

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
	public int anInt4530;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
	public final int anInt4521;

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
	private final int anInt4516;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "B")
	public final byte aByte44;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	public final int anInt4520;

	@OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
	public final int anInt4523;

	static {
		new Class55("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
		new Class55("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIB)V")
	public Class167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4521 = arg3;
		this.anInt4516 = arg0;
		this.aByte44 = arg4;
		this.anInt4520 = arg2;
		this.anInt4523 = arg1;
	}

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!ng;I)V")
	public Class167(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1) {
		this.aClass167_2 = arg0;
		this.anInt4520 = arg1 + this.aClass167_2.anInt4520;
		this.anInt4516 = this.aClass167_2.anInt4516;
		this.anInt4523 = arg1 + this.aClass167_2.anInt4523;
		this.anInt4521 = this.aClass167_2.anInt4521 + arg1;
		this.aByte44 = this.aClass167_2.aByte44;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIII)Lclient!ng;")
	public Class167 method3587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class167(this.anInt4516, arg0, arg2, arg1, this.aByte44);
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)Lclient!dc;")
	public Class49 method3588() {
		return Static206.method2967(this.anInt4516);
	}
}
