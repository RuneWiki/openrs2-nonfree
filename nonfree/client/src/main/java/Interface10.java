import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public interface Interface10 {

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!za;Z)V")
	void method5699(@OriginalArg(0) Class50 arg0);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V")
	void method5700();

	@OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Z")
	boolean method5701();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Z)I")
	int method5702();

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILclient!za;I)Lclient!e;")
	Class63 method5703(@OriginalArg(1) Class50 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lclient!za;I)V")
	void method5704(@OriginalArg(0) Class50 arg0);

	@OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
	int method5705();

	@OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)I")
	int method5706();
}
