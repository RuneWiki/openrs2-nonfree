import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public interface Interface23 {

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(ZB)V")
	void method8326(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(I)V")
	void method8327();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(JI)Z")
	boolean method8328(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	void method8329();

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	int method8330();

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I")
	int method8331();
}
