import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public abstract class Class44 {

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "Lclient!no;")
	protected final Class66_Sub3 aClass66_Sub3_38;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class44(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_38 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)V")
	public abstract void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V")
	public abstract void method7477(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILclient!hf;)V")
	public abstract void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1);

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(BZ)V")
	public abstract void method7479(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
	public abstract void method7482();

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)Z")
	public abstract boolean method7484();
}
