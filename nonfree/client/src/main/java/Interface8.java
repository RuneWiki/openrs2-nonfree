import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public interface Interface8 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)I")
	int method6027();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oj;)V")
	void method6028(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!oj;B)Lclient!qh;")
	Class159 method6029(@OriginalArg(0) int arg0, @OriginalArg(1) Class48 arg1);

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
	void method6030();

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(B)I")
	int method6031();

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(ILclient!oj;)V")
	void method6032(@OriginalArg(1) Class48 arg0);

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(I)Z")
	boolean method6033();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)I")
	int method6034();
}
