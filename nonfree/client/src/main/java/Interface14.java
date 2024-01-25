import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public interface Interface14 {

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	void method5118();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
	void method5119();

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)V")
	void method5120(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Z")
	boolean method5121();

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)I")
	int method5122();
}
