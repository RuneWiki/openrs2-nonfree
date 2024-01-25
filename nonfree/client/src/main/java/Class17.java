import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public final class Class17 {

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!au;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!ia;")
	public Class102 aClass102_1;

	@OriginalMember(owner = "client!au", name = "f", descriptor = "I")
	public int anInt427;

	@OriginalMember(owner = "client!au", name = "k", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "I")
	public int anInt431;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "I")
	public final int anInt424;

	@OriginalMember(owner = "client!au", name = "g", descriptor = "I")
	public final int anInt428;

	static {
		new Class256("Join your channel by clicking 'Join Chat' and typing: ", "Klick auf 'Betreten' und gib ein: ", "Pour rejoindre votre canal, cliquez sur « Participer » et entrez : ", "Para entrar no seu canal, clique em \"Acessar bate-papo\" e digite: ");
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(II)V")
	public Class17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt424 = arg0;
		this.anInt428 = arg1;
	}

	@OriginalMember(owner = "client!au", name = "<init>", descriptor = "(Lclient!au;I)V")
	public Class17(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1) {
		this.aClass17_1 = arg0;
		this.aClass102_1 = this.aClass17_1.aClass102_1;
		this.anInt424 = this.aClass17_1.anInt424;
		this.anInt428 = arg1 + this.aClass17_1.anInt428;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)Lclient!au;")
	public Class17 method269(@OriginalArg(0) int arg0) {
		return new Class17(this.anInt424, arg0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Lclient!bp;")
	public Class27 method270() {
		return Static9.method188(this.anInt424);
	}
}
