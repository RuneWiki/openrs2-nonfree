import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public interface Interface5 {

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)I")
	int method5727();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!za;)V")
	void method5728(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(I)I")
	int method5729();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)I")
	int method5730();

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)Z")
	boolean method5731();

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!za;)V")
	void method5732(@OriginalArg(1) Class106 arg0);

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	Class17 method5733(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1);

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	void method5734();
}
