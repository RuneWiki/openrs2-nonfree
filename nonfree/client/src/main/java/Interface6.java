import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public interface Interface6 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()I")
	int method5253();

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!kr;)V")
	void method3001(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Lclient!kr;)V")
	void method3002(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(Lclient!kr;)V")
	void method3003(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)V")
	void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(ILclient!kr;)V")
	void method3005(@OriginalArg(0) int arg0, @OriginalArg(1) Class117 arg1);
}
