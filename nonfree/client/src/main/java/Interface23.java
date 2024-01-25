import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public interface Interface23 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)I")
	int method7763();

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI[B)V")
	void method7764(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)I")
	int method7765();

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)J")
	long method7766();
}
