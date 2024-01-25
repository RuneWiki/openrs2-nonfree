import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface19 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
	void method7914();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I")
	int method7915();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!qa;)V")
	void method7916(@OriginalArg(1) Class42 arg0);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(BLclient!qa;I)Lclient!r;")
	Class26 method7917(@OriginalArg(1) Class42 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(Z)I")
	int method7918();

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I")
	int method7919();

	@OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Z")
	boolean method7920();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!qa;)V")
	void method7921(@OriginalArg(1) Class42 arg0);
}
