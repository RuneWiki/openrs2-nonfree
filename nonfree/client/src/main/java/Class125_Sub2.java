import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public final class Class125_Sub2 extends Class125 implements Interface20 {

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
	private int anInt7164;

	static {
		new Class45("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!mh;I[BIZ)V")
	public Class125_Sub2(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		super(arg0, 34963, arg2, arg3, arg4);
		this.anInt7164 = arg1;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(B)V")
	@Override
	protected void method6444() {
		super.aClass4_Sub3_36.method5292(this);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)J")
	@Override
	public long method8131() {
		return 0L;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)I")
	@Override
	public int method8128() {
		return super.anInt7157;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)I")
	@Override
	public int method8130() {
		return this.anInt7164;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II[BI)V")
	@Override
	public void method8129(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.method6443(arg0, arg1);
		this.anInt7164 = 5123;
	}
}
