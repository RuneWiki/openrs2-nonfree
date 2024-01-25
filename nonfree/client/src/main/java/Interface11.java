import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public interface Interface11 {

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)Z")
	boolean method5740();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!qa;I)V")
	void method5741(@OriginalArg(0) Class121 arg0);

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)I")
	int method5742();

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lclient!qa;I)V")
	void method5743(@OriginalArg(0) Class121 arg0);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(B)I")
	int method5744();

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "(I)V")
	void method5745();

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IILclient!qa;)Lclient!c;")
	Class37 method5746(@OriginalArg(1) int arg0, @OriginalArg(2) Class121 arg1);

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)I")
	int method5747();
}
