import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public interface Interface23 {

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)I")
	int method8167();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(IJ)Z")
	boolean method8168(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
	void method8169();

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)I")
	int method8170();

	@OriginalMember(owner = "client!vv", name = "d", descriptor = "(I)V")
	void method8171();

	@OriginalMember(owner = "client!vv", name = "a", descriptor = "(ZZ)V")
	void method8172(@OriginalArg(1) boolean arg0);
}
