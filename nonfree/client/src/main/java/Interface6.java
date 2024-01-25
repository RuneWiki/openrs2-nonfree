import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public interface Interface6 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(Lclient!bb;)V")
	void method4302(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "()I")
	int method4362();

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ILclient!bb;)V")
	void method4303(@OriginalArg(0) int arg0, @OriginalArg(1) Class19 arg1);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[BI)V")
	void method4304(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(Lclient!bb;)V")
	void method4305(@OriginalArg(0) Class19 arg0);

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(Lclient!bb;)V")
	void method4306(@OriginalArg(0) Class19 arg0);
}
