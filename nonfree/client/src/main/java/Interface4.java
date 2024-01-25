import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public interface Interface4 {

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)I")
	int method7556();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Lclient!r;I)V")
	void method7557(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(B)Z")
	boolean method7558();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	void method7559();

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(Lclient!r;I)V")
	void method7560(@OriginalArg(0) Class45 arg0);

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)I")
	int method7561();

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)I")
	int method7562();
}
