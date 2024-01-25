import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public interface Interface12 {

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	int method9026();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)Z")
	boolean method9027();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!ha;B)V")
	void method9028(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)I")
	int method9029();

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!ha;)V")
	void method9030(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	void method9031();

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(B)I")
	int method9032();
}
