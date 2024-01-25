import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public interface Interface27 {

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8325(@OriginalArg(0) Class87 arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)I")
	int method8326();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(BLclient!ha;)V")
	void method8327(@OriginalArg(1) Class87 arg0);

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(Z)I")
	int method8328();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)I")
	int method8329();

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Z")
	boolean method8330();

	@OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
	void method8331();
}
