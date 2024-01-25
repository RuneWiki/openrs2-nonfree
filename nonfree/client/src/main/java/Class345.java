import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public final class Class345 {

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "Lclient!fo;")
	public Class112 aClass112_12 = null;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "Lclient!la;")
	public Class37 aClass37_18 = null;

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!la;)V")
	public Class345(@OriginalArg(0) Class37 arg0) {
		this.aClass37_18 = arg0;
	}

	@OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(Lclient!la;Lclient!fo;)V")
	public Class345(@OriginalArg(0) Class37 arg0, @OriginalArg(1) Class112 arg1) {
		this.aClass37_18 = arg0;
		this.aClass112_12 = arg1;
	}
}
