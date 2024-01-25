import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public interface Interface12 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)I")
	int method7600();

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(BII[B)V")
	void method7601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(B)J")
	long method7602();

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)I")
	int method7603();
}
