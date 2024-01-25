import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public interface Interface3 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!rs;)V")
	void method4545(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!rs;)V")
	void method4546(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I[BI)V")
	void method4547(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "()I")
	int method5710();

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(Lclient!rs;)V")
	void method4548(@OriginalArg(0) Class181 arg0);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILclient!rs;)V")
	void method4549(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1);
}
