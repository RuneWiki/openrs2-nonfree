import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public interface Interface2 {

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!za;B)Lclient!e;")
	Class59 method5291(@OriginalArg(0) int arg0, @OriginalArg(1) Class163 arg1);

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(B)I")
	int method5292();

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!za;I)V")
	void method5293(@OriginalArg(0) Class163 arg0);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(Lclient!za;I)V")
	void method5294(@OriginalArg(0) Class163 arg0);

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(B)Z")
	boolean method5295();

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)I")
	int method5296();

	@OriginalMember(owner = "client!bn", name = "b", descriptor = "(I)V")
	void method5297();

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(B)I")
	int method5298();
}
