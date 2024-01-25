import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public interface Interface13 {

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(JI)Z")
	boolean method5344(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ZB)V")
	void method5345(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(I)I")
	int method5346();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(B)I")
	int method5347();

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(B)V")
	void method5348();

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "(I)V")
	void method5349();
}
