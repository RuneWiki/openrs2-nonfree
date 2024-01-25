import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class84 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!od;")
	protected final Class128_Sub2 aClass128_Sub2_39;

	static {
		new Class151("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class84(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_39 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZI)V")
	public abstract void method5149(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(ZB)V")
	public abstract void method5150(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!jk;IB)V")
	public abstract void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Z)V")
	public abstract void method5153();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)V")
	public abstract void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(I)Z")
	public abstract boolean method5155();
}
