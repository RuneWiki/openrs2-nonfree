import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public interface Interface5 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!ea;BI)Lclient!ts;")
	Class112 method5906(@OriginalArg(0) Class55 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	void method5907();

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)I")
	int method5908();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)Z")
	boolean method5909();

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)I")
	int method5910();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLclient!ea;)V")
	void method5911(@OriginalArg(1) Class55 arg0);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!ea;)V")
	void method5912(@OriginalArg(1) Class55 arg0);

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)I")
	int method5913();
}
