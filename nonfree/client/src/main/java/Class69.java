import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class Class69 {

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "Lclient!ih;")
	protected final Class117_Sub1 aClass117_Sub1_43;

	static {
		new Class142("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
	}

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class69(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_43 = arg0;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Z")
	public abstract boolean method5852();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V")
	public abstract void method5853();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)V")
	public abstract void method5857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZI)V")
	public abstract void method5861(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(ZI)V")
	public abstract void method5862(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sv;IB)V")
	public abstract void method5863(@OriginalArg(0) Class23 arg0, @OriginalArg(1) int arg1);
}
