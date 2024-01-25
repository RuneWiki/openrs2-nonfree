import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public interface Interface5 {

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Z)Z")
	boolean method5726();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!ya;I)Lclient!t;")
	Class163 method5727(@OriginalArg(0) int arg0, @OriginalArg(1) Class51 arg1);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(BLclient!ya;)V")
	void method5728(@OriginalArg(1) Class51 arg0);

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)I")
	int method5729();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!ya;B)V")
	void method5730(@OriginalArg(0) Class51 arg0);

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)I")
	int method5731();

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)I")
	int method5732();

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(Z)V")
	void method5733();
}
