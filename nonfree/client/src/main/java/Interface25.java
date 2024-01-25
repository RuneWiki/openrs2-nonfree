import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public interface Interface25 {

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)I")
	int method8420();

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)I")
	int method8421();

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILclient!ha;)V")
	void method8422(@OriginalArg(1) Class95 arg0);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8423(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V")
	void method8424();

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)I")
	int method8425();

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Z)Z")
	boolean method8426();
}
