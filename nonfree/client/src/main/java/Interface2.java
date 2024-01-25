import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public interface Interface2 {

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!vc;B)V")
	void method5648(@OriginalArg(0) Class63 arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!vc;)V")
	void method5649(@OriginalArg(1) Class63 arg0);

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)I")
	int method5650();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
	int method5651();

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BILclient!vc;)Lclient!n;")
	Class66 method5652(@OriginalArg(1) int arg0, @OriginalArg(2) Class63 arg1);

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	void method5653();

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)I")
	int method5654();

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)Z")
	boolean method5655();
}
