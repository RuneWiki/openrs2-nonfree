import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public interface Interface17 {

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(I)I")
	int method7172();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(I)I")
	int method7173();

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BLclient!qa;)V")
	void method7174(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(B)Z")
	boolean method7175();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(B)I")
	int method7176();

	@OriginalMember(owner = "client!up", name = "b", descriptor = "(BLclient!qa;)V")
	void method7177(@OriginalArg(1) Class9 arg0);

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	Class19 method7178(@OriginalArg(1) int arg0, @OriginalArg(2) Class9 arg1);

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
	void method7179();
}
