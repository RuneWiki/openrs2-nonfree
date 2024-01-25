import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public interface Interface11 {

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
	int method7226();

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(I)I")
	int method7227();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J")
	long method7228();

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(III[B)V")
	void method7229(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);
}
