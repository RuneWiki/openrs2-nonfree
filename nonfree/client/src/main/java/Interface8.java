import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public interface Interface8 {

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V")
	void method4616();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)I")
	int method4617();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IBLclient!za;)Lclient!e;")
	Class57 method4618(@OriginalArg(0) int arg0, @OriginalArg(2) Class34 arg1);

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)Z")
	boolean method4619();

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)I")
	int method4620();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILclient!za;)V")
	void method4621(@OriginalArg(1) Class34 arg0);

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(BLclient!za;)V")
	void method4622(@OriginalArg(1) Class34 arg0);

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(I)I")
	int method4623();
}
