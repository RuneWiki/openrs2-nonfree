import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public interface Interface6 {

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!q;)V")
	void method1919(@OriginalArg(0) Class160 arg0);

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Lclient!q;)V")
	void method1920(@OriginalArg(0) Class160 arg0);

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(Lclient!q;)V")
	void method1921(@OriginalArg(0) Class160 arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()I")
	int method4888();

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(Lclient!q;)V")
	void method1923(@OriginalArg(0) Class160 arg0);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[BI)V")
	void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
