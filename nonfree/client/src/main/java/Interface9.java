import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public interface Interface9 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)I")
	int method2080();

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)J")
	long method2081();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)I")
	int method2082();

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(III[B)V")
	void method2083(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2);
}
