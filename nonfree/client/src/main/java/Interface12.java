import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public interface Interface12 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(III[B)V")
	void method5507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)J")
	long method5508();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)I")
	int method5509();

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)I")
	int method5510();
}
