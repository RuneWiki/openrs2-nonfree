import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public interface Interface3 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "()I")
	int method3103();

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!jt;)V")
	void method2568(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Lclient!jt;)V")
	void method2569(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(Lclient!jt;)V")
	void method2570(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(Lclient!jt;)V")
	void method2571(@OriginalArg(0) Class126 arg0);

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BI)V")
	void method2572(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
