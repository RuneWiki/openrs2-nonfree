import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aaa")
public interface Interface1 {

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(I)V")
	void method9231();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(B)Z")
	boolean method9232();

	@OriginalMember(owner = "client!aaa", name = "a", descriptor = "(BZ)V")
	void method9233();
}
