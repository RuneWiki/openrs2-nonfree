import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public interface Interface6 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	int method5149();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	void method5150();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ya;)V")
	void method5151(@OriginalArg(1) Class49 arg0);

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)Z")
	boolean method5152();

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(I)I")
	int method5153();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLclient!ya;I)Lclient!t;")
	Class91 method5154(@OriginalArg(1) Class49 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)I")
	int method5155();

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(ILclient!ya;)V")
	void method5156(@OriginalArg(1) Class49 arg0);
}
