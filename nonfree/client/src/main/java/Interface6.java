import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public interface Interface6 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ln;)V")
	void method1755(@OriginalArg(0) Class120 arg0);

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "(Lclient!ln;)V")
	void method1756(@OriginalArg(0) Class120 arg0);

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(Lclient!ln;)V")
	void method1757(@OriginalArg(0) Class120 arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(I[BI)V")
	void method1758(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sg", name = "d", descriptor = "(Lclient!ln;)V")
	void method1759(@OriginalArg(0) Class120 arg0);

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "()I")
	int method4262();
}
