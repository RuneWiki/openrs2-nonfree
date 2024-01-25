import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public interface Interface8 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
	void method6512();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Z")
	boolean method6513();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
	void method6514();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	int method6515();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IZ)V")
	void method6516(@OriginalArg(1) boolean arg0);
}
