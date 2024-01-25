import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class92 {

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "B")
	private byte aByte41;

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "I")
	public int anInt2727;

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public int anInt2729;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	public int anInt2731;

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "I")
	public int anInt2732;

	@OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
	public int anInt2733;

	static {
		new Class209("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
	public Class92() {
	}

	@OriginalMember(owner = "client!gf", name = "<init>", descriptor = "(Lclient!si;)V")
	public Class92(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aByte41 = arg0.method5484();
		this.anInt2727 = arg0.method5500();
		this.anInt2732 = arg0.method5508();
		this.anInt2733 = arg0.method5508();
		this.anInt2729 = arg0.method5508();
		this.anInt2731 = arg0.method5508();
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	public int method2165() {
		return (this.aByte41 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)I")
	public int method2167() {
		return this.aByte41 & 0x7;
	}
}
