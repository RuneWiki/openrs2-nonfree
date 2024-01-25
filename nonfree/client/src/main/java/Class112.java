import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class Class112 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "Lclient!gi;")
	protected final Class42_Sub3 aClass42_Sub3_39;

	@OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class112(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_39 = arg0;
	}

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLclient!mw;I)V")
	public abstract void method7304(@OriginalArg(1) Class79 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Z")
	public abstract boolean method7305();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(IZ)V")
	public abstract void method7306(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
	public abstract void method7308();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(BZ)V")
	public abstract void method7309(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(III)V")
	public abstract void method7311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
