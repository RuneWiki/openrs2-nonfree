import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public interface Interface5 {

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(III[B)V")
	void method8458(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)J")
	long method8459();

	@OriginalMember(owner = "client!bia", name = "b", descriptor = "(I)I")
	int method8460();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(B)I")
	int method8461();
}
