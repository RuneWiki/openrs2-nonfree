import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public interface Interface7 {

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	void method5587();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IILclient!vq;)Lclient!ni;")
	Class38 method5588(@OriginalArg(1) int arg0, @OriginalArg(2) Class47 arg1);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)I")
	int method5589();

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)I")
	int method5590();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!vq;)V")
	void method5591(@OriginalArg(1) Class47 arg0);

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)Z")
	boolean method5592();

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!vq;I)V")
	void method5593(@OriginalArg(0) Class47 arg0);

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)I")
	int method5594();
}
