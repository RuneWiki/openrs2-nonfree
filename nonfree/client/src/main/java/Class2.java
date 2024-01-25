import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public abstract class Class2 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!bv;")
	protected final Class30_Sub1 aClass30_Sub1_42;

	static {
		new Class242("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class2(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)Z")
	public abstract boolean method5380();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILclient!kv;)V")
	public abstract void method5382(@OriginalArg(0) int arg0, @OriginalArg(2) Class1 arg1);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	public abstract void method5383(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
	public abstract void method5384();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V")
	public abstract void method5385(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(ZI)V")
	public abstract void method5386(@OriginalArg(0) boolean arg0);
}
