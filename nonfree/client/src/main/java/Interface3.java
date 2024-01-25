import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public interface Interface3 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!qd;)V")
	void method5381(@OriginalArg(0) Class168 arg0);

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Lclient!qd;)V")
	void method5382(@OriginalArg(0) Class168 arg0);

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Lclient!qd;)V")
	void method5383(@OriginalArg(0) Class168 arg0);

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(Lclient!qd;)V")
	void method5384(@OriginalArg(0) Class168 arg0);

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "()I")
	int method5385();

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I[BI)V")
	void method5386(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
