import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public interface Interface16 {

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	void method6298();

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V")
	void method6299();

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)I")
	int method6300();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)V")
	void method6301(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
	int method6302();

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJ)Z")
	boolean method6303(@OriginalArg(1) long arg0);
}
