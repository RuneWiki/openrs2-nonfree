import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public interface Interface15 {

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
	boolean method7757();

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)I")
	int method7758();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLclient!oa;)V")
	void method7759(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	void method7760();

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "(I)I")
	int method7761();

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!oa;)V")
	void method7762(@OriginalArg(1) Class5 arg0);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IZLclient!oa;)Lclient!ba;")
	Class2 method7763(@OriginalArg(0) int arg0, @OriginalArg(2) Class5 arg1);

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)I")
	int method7764();
}
