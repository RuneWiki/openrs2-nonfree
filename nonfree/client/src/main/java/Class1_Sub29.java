import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class1_Sub29 extends Class1 {

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "Lclient!sc;")
	public Class107 aClass107_1354;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!sc;I)V")
	public Class1_Sub29(@OriginalArg(0) Class107 arg0, @OriginalArg(1) int arg1) {
		this.aClass107_1354 = arg0;
	}
}
