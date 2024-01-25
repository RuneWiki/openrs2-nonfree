import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class Class7 {

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!ag;")
	protected final Class12_Sub1 aClass12_Sub1_42;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class7(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZZ)V")
	public abstract void method7777(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)V")
	public abstract void method7780(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!vfa;B)V")
	public abstract void method7782(@OriginalArg(0) int arg0, @OriginalArg(1) Class52 arg1);

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
	public abstract void method7783(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)Z")
	public abstract boolean method7784();

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public abstract void method7785();
}
