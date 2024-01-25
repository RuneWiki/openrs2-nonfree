import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public interface Interface8 {

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!vl;)V")
	void method1360(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Lclient!vl;)V")
	void method1361(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(Lclient!vl;)V")
	void method1362(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BI)V")
	void method1363(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(Lclient!vl;)V")
	void method1364(@OriginalArg(0) Class203 arg0);

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()I")
	int method5663();
}
