import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public interface Interface15 {

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)I")
	int method8255();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BZ)V")
	void method8256(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(JB)Z")
	boolean method8257(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	void method8258();

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)I")
	int method8259();

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	void method8260();
}
