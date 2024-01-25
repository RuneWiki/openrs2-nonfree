import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public final class Class25_Sub3_Sub1 extends Class25_Sub3 implements Interface6 {

	@OriginalMember(owner = "client!pt", name = "D", descriptor = "Lclient!go;")
	public Class25_Sub3 aClass25_Sub3_3;

	static {
		new Class169("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(IIIIILclient!go;)V")
	public Class25_Sub3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class25_Sub3 arg5) {
		super(arg2, arg3, arg4, 0, 0, 0, Static306.method4558(arg0, arg1));
		this.aClass25_Sub3_3 = arg5;
	}

	@OriginalMember(owner = "client!pt", name = "d", descriptor = "(B)I")
	@Override
	public int method4611() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "(Z)I")
	@Override
	public int method5250() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method5247() {
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILclient!tq;)V")
	@Override
	public void method5232(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!tq;I)V")
	@Override
	public void method5245(@OriginalArg(0) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Lclient!tq;I)Lclient!cj;")
	@Override
	public Class41_Sub1 method5229(@OriginalArg(0) Class164 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)I")
	@Override
	public int method5246() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BLclient!tq;)V")
	@Override
	public void method5248(@OriginalArg(1) Class164 arg0) {
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lclient!tq;III)Z")
	@Override
	public boolean method5234(@OriginalArg(0) Class164 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		return false;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V")
	@Override
	public void method5249() {
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)I")
	@Override
	public int method5251() {
		return 0;
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	@Override
	public Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1) {
		return null;
	}
}
