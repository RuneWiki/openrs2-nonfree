import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public interface Interface5 {

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(Lclient!ga;)V")
	void method3931(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "()I")
	int method3932();

	@OriginalMember(owner = "client!ht", name = "b", descriptor = "(Lclient!ga;)V")
	void method3933(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "(Lclient!ga;)V")
	void method3934(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!ht", name = "d", descriptor = "(Lclient!ga;)V")
	void method3935(@OriginalArg(0) Class88 arg0);

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(I[BI)V")
	void method3936(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);
}
