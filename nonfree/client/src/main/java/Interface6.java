import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public interface Interface6 {

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)Z")
	boolean method7550();

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)I")
	int method7551();

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILclient!oa;)V")
	void method7552(@OriginalArg(1) Class121 arg0);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
	int method7553();

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
	void method7554();

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)I")
	int method7555();

	@OriginalMember(owner = "client!dda", name = "b", descriptor = "(ILclient!oa;)V")
	void method7556(@OriginalArg(1) Class121 arg0);

	@OriginalMember(owner = "client!dda", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	Class22 method7557(@OriginalArg(0) int arg0, @OriginalArg(2) Class121 arg1);
}
