import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface Interface14 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	void method7088();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!r;Z)V")
	void method7089(@OriginalArg(0) Class162 arg0);

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(BLclient!r;)V")
	void method7090(@OriginalArg(1) Class162 arg0);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)I")
	int method7091();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
	boolean method7092();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)I")
	int method7093();

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)I")
	int method7094();
}
