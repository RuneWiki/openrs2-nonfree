import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public interface Interface10 {

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
	int method2309();

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)I")
	int method2310();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)J")
	long method2311();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[BIB)V")
	void method2312(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1);
}
