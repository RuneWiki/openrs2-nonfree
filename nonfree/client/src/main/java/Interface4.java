import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public interface Interface4 {

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)I")
	int method5600();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ILclient!ya;)V")
	void method5601(@OriginalArg(1) Class135 arg0);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)Z")
	boolean method5602();

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)I")
	int method5603();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILclient!ya;)Lclient!t;")
	Class116 method5604(@OriginalArg(0) int arg0, @OriginalArg(2) Class135 arg1);

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(ILclient!ya;)V")
	void method5605(@OriginalArg(1) Class135 arg0);

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)I")
	int method5606();

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
	void method5607();
}
