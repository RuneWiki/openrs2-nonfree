import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class76 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "I")
	public int anInt1666;

	@OriginalMember(owner = "client!f", name = "b", descriptor = "I")
	public int anInt1667;

	@OriginalMember(owner = "client!f", name = "c", descriptor = "I")
	public int anInt1668;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!f", name = "f", descriptor = "I")
	public int anInt1670;

	@OriginalMember(owner = "client!f", name = "g", descriptor = "I")
	public int anInt1671;

	static {
		new Class169("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "()V")
	public Class76() {
	}

	@OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lclient!re;)V")
	public Class76(@OriginalArg(0) Class1_Sub33 arg0) {
		this.aByte19 = arg0.method5188();
		this.anInt1667 = arg0.method5177();
		this.anInt1670 = arg0.method5150();
		this.anInt1668 = arg0.method5150();
		this.anInt1666 = arg0.method5150();
		this.anInt1671 = arg0.method5150();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	public int method1357() {
		return (this.aByte19 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(B)I")
	public int method1358() {
		return this.aByte19 & 0x7;
	}
}
