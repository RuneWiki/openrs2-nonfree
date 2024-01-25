import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public abstract class Class76 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!ok;")
	protected final Class134_Sub2 aClass134_Sub2_43;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class76(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_43 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)Z")
	public abstract boolean method7606();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)V")
	public abstract void method7607(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IZI)V")
	public abstract void method7608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
	public abstract void method7610();

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!ip;I)V")
	public abstract void method7611(@OriginalArg(0) int arg0, @OriginalArg(1) Class40 arg1);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZB)V")
	public abstract void method7613(@OriginalArg(0) boolean arg0);
}
