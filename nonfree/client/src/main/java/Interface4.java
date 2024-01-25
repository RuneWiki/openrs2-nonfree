import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public interface Interface4 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	int method5445();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BLclient!ii;)V")
	void method5446(@OriginalArg(1) Class105 arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!ii;I)V")
	void method5447(@OriginalArg(0) Class105 arg0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!ii;I)Lclient!dc;")
	Class40 method5448(@OriginalArg(0) int arg0, @OriginalArg(1) Class105 arg1);

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	int method5449();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	void method5450();

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)Z")
	boolean method5451();

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)I")
	int method5452();
}
