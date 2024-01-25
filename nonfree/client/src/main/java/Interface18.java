import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public interface Interface18 {

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V")
	void method8412();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)I")
	int method8413();

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V")
	void method8414();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(JI)Z")
	boolean method8415(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I")
	int method8416();

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZI)V")
	void method8417(@OriginalArg(0) boolean arg0);
}
