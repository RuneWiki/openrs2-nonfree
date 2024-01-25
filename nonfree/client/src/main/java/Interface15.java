import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public interface Interface15 {

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IJ)Z")
	boolean method7154(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Z)I")
	int method7155();

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(IZ)V")
	void method7156(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
	void method7157();

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "(I)V")
	void method7158();

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "(I)I")
	int method7159();
}
