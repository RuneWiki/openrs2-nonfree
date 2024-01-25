import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public interface Interface21 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
	int method8695();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)I")
	int method8696();

	@OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)J")
	long method8697();

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "([BIZI)V")
	void method8698(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);
}
