import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public interface Interface10 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I")
	int method5400();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)J")
	long method5401();

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([BIIZ)V")
	void method5402(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)I")
	int method5403();
}
