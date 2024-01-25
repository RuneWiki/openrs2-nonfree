import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public interface Interface5 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
	int method5169();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!ya;)V")
	void method5170(@OriginalArg(1) Class39 arg0);

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
	void method5171();

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)I")
	int method5172();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLclient!ya;)V")
	void method5173(@OriginalArg(1) Class39 arg0);

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lclient!ya;ZI)Lclient!t;")
	Class105 method5174(@OriginalArg(0) Class39 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)Z")
	boolean method5175();

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I")
	int method5176();
}
