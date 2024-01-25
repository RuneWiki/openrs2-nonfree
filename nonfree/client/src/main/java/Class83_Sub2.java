import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public final class Class83_Sub2 extends Class83 implements Interface5 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	private int anInt6286;

	static {
		new Class134("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!pg;I[BI)V")
	public Class83_Sub2(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		super(arg0, arg2, arg3);
		this.anInt6286 = arg1;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)I")
	@Override
	public int method5173() {
		return 0;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)J")
	@Override
	public long method5174() {
		return super.aNativeBuffer3.a();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III[B)V")
	@Override
	public void method5172(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		this.method4904(arg1, arg0);
		this.anInt6286 = 5123;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
	@Override
	public int method5175() {
		return this.anInt6286;
	}
}
