import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public interface Interface22 {

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(JI)Z")
	boolean method1803(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
	void method1804();

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)V")
	void method1805(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
	void method1806();

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)I")
	int method1807();

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "(I)I")
	int method1808();
}
