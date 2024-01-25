import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public interface Interface13 {

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(B)I")
	int method7038();

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(ZB)V")
	void method7039(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)I")
	int method7040();

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(BJ)Z")
	boolean method7041(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V")
	void method7042();

	@OriginalMember(owner = "client!iw", name = "c", descriptor = "(I)V")
	void method7043();
}
