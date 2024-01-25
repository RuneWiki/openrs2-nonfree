import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public interface Interface3 {

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)I")
	int method5420();

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(I)V")
	void method5421();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!np;BI)Lclient!f;")
	Class75 method5422(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(I)I")
	int method5423();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!np;)V")
	void method5424(@OriginalArg(1) Class155 arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
	int method5425();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!np;I)V")
	void method5426(@OriginalArg(0) Class155 arg0);

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)Z")
	boolean method5427();
}
