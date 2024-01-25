import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public interface Interface6 {

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
	int method5347();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ya;I)V")
	void method5348(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLclient!ya;)V")
	void method5349(@OriginalArg(1) Class19 arg0);

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)I")
	int method5350();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(I)Z")
	boolean method5351();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(Lclient!ya;II)Lclient!t;")
	Class110 method5352(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(I)V")
	void method5353();

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)I")
	int method5354();
}
