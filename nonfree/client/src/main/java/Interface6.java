import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public interface Interface6 {

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BILclient!tq;)Lclient!ns;")
	Class22 method5244(@OriginalArg(1) int arg0, @OriginalArg(2) Class164 arg1);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!tq;I)V")
	void method5245(@OriginalArg(0) Class164 arg0);

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)I")
	int method5246();

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)Z")
	boolean method5247();

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!tq;)V")
	void method5248(@OriginalArg(1) Class164 arg0);

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(Z)V")
	void method5249();

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(Z)I")
	int method5250();

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)I")
	int method5251();
}
