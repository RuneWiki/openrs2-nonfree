import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public interface Interface2 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BI)V")
	void method2372(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!fh;)V")
	void method2373(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!fh;)V")
	void method2374(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	int method5135();

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Lclient!fh;)V")
	void method2376(@OriginalArg(0) Class75 arg0);

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(Lclient!fh;)V")
	void method2377(@OriginalArg(0) Class75 arg0);
}
