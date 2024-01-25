import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public interface Interface9 {

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qa;)V")
	void method5121(@OriginalArg(1) Class128 arg0);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)I")
	int method5122();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	void method5123();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	int method5124();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	int method5125();

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!qa;B)V")
	void method5126(@OriginalArg(0) Class128 arg0);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!qa;I)Lclient!c;")
	Class33 method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1);

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Z")
	boolean method5128();
}
