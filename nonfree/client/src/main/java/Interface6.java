import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public interface Interface6 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IJ)Z")
	boolean method7222(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(BZ)V")
	void method7223(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V")
	void method7224();

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)I")
	int method7225();

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V")
	void method7226();

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)I")
	int method7227();
}
