import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vu")
public interface Interface23 {

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Z")
	boolean method9448();

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(ILclient!ha;)V")
	void method9449(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(ILclient!ha;)V")
	void method9450(@OriginalArg(1) Class101 arg0);

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)I")
	int method9451();

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I")
	int method9452();

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)V")
	void method9453();

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)I")
	int method9454();
}
