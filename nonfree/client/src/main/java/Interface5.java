import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public interface Interface5 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	void method7067();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(BJ)Z")
	boolean method7068(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)I")
	int method7069();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)V")
	void method7070();

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "(I)I")
	int method7071();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZI)V")
	void method7072(@OriginalArg(0) boolean arg0);
}
