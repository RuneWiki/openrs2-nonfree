import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public interface Interface4 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fp;Z)V")
	void method5920(@OriginalArg(0) Class63 arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fp;II)Lclient!bi;")
	Class3 method5921(@OriginalArg(0) Class63 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	int method5922();

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	void method5923();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)Z")
	boolean method5924();

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)I")
	int method5925();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!fp;I)V")
	void method5926(@OriginalArg(0) Class63 arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)I")
	int method5927();
}
