import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
	private final int anInt1009;

	@OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
	private final int anInt1010;

	@OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
	private final int anInt1000;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	private final int anInt1004;

	static {
		new Class159("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIII)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		super(arg4, arg5, arg6);
		this.anInt1009 = arg1;
		this.anInt1010 = arg2;
		this.anInt1000 = arg3;
		this.anInt1004 = arg0;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(III)V")
	@Override
	public void method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = this.anInt1004 * arg0 >> 12;
		@Pc(22) int local22 = arg0 * this.anInt1010 >> 12;
		@Pc(29) int local29 = arg1 * this.anInt1009 >> 12;
		@Pc(36) int local36 = arg1 * this.anInt1000 >> 12;
		Static118.method2492(local22, local36, local29, local10, super.anInt6410);
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)V")
	@Override
	public void method5412(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = arg1 * this.anInt1004 >> 12;
		@Pc(17) int local17 = arg1 * this.anInt1010 >> 12;
		@Pc(24) int local24 = this.anInt1009 * arg0 >> 12;
		@Pc(31) int local31 = arg0 * this.anInt1000 >> 12;
		Static311.method5119(super.anInt6415, local10, local31, super.anInt6412, super.anInt6410, local17, local24);
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)V")
	@Override
	public void method5411(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}
}
