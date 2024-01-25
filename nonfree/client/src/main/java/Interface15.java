import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public interface Interface15 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(I)V")
	void method7600();

	@OriginalMember(owner = "client!no", name = "b", descriptor = "(I)V")
	void method7601();

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZB)V")
	void method7602(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Z)I")
	int method7603();

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(B)I")
	int method7604();

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)Z")
	boolean method7605(@OriginalArg(1) long arg0);
}
