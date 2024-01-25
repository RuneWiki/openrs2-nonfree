import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public final class Class68 {

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "I")
	public int anInt1713;

	@OriginalMember(owner = "client!eo", name = "j", descriptor = "I")
	public int anInt1719;

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public int anInt1722;

	@OriginalMember(owner = "client!eo", name = "f", descriptor = "I")
	public int anInt1715 = 128;

	@OriginalMember(owner = "client!eo", name = "k", descriptor = "I")
	public int anInt1720 = 128;

	@OriginalMember(owner = "client!eo", name = "h", descriptor = "I")
	public int anInt1717;

	static {
		new Class151("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(I)V")
	public Class68(@OriginalArg(0) int arg0) {
		this.anInt1717 = arg0;
	}

	@OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(IIIIII)V")
	private Class68(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1720 = arg1;
		this.anInt1713 = arg3;
		this.anInt1719 = arg4;
		this.anInt1722 = arg5;
		this.anInt1717 = arg0;
		this.anInt1715 = arg2;
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)Lclient!eo;")
	public Class68 method1401() {
		return new Class68(this.anInt1717, this.anInt1720, this.anInt1715, this.anInt1713, this.anInt1719, this.anInt1722);
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILclient!eo;)V")
	public void method1404(@OriginalArg(1) Class68 arg0) {
		this.anInt1717 = arg0.anInt1717;
		this.anInt1715 = arg0.anInt1715;
		this.anInt1713 = arg0.anInt1713;
		this.anInt1719 = arg0.anInt1719;
		this.anInt1722 = arg0.anInt1722;
		this.anInt1720 = arg0.anInt1720;
	}
}
