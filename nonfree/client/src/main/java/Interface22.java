import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public interface Interface22 {

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLclient!oa;)V")
	void method7170(@OriginalArg(1) Class90 arg0);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
	int method7171();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
	void method7172();

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
	boolean method7173();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(IILclient!oa;)Lclient!ba;")
	Class24 method7174(@OriginalArg(1) int arg0, @OriginalArg(2) Class90 arg1);

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)I")
	int method7175();

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)I")
	int method7176();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(BLclient!oa;)V")
	void method7177(@OriginalArg(1) Class90 arg0);
}
