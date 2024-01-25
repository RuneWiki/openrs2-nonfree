import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public interface Interface2 {

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
	int method7495();

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)I")
	int method7496();

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
	void method7497();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;B)V")
	void method7498(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)Z")
	boolean method7499();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)I")
	int method7500();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lclient!ha;Z)V")
	void method7501(@OriginalArg(0) Class82 arg0);
}
