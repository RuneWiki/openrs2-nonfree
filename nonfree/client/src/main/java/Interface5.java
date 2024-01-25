import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public interface Interface5 {

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BII[B)V")
	void method7484(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)I")
	int method7485();

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)I")
	int method7486();

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)J")
	long method7487();
}
