import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public abstract class Class39 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Lclient!rs;")
	protected final Class133_Sub3 aClass133_Sub3_42;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class39(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_42 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)V")
	public abstract void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)V")
	public abstract void method8862(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public abstract void method8863(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!nba;I)V")
	public abstract void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
	public abstract boolean method8865();

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
	public abstract void method8866();
}
