import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public interface Interface11 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!km;I)V")
	void method5021(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)V")
	void method5022();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!km;II)Lclient!ab;")
	Class3 method5023(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)I")
	int method5024();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)I")
	int method5025();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)Z")
	boolean method5026();

	@OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)I")
	int method5027();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(Lclient!km;I)V")
	void method5028(@OriginalArg(0) Class82 arg0);
}
