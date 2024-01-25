import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public interface Interface8 {

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!wi;)V")
	void method2113(@OriginalArg(0) Class217 arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(I[BI)V")
	void method2114(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "(Lclient!wi;)V")
	void method2115(@OriginalArg(0) Class217 arg0);

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "()I")
	int method4256();

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "(Lclient!wi;)V")
	void method2117(@OriginalArg(0) Class217 arg0);

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "(Lclient!wi;)V")
	void method2118(@OriginalArg(0) Class217 arg0);
}
