import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public interface Interface2 {

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)J")
	long method7557();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(II[BB)V")
	void method7558(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)I")
	int method7559();

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)I")
	int method7560();
}
