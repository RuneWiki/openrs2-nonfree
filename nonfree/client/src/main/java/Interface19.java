import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public interface Interface19 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)J")
	long method7393();

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)I")
	int method7394();

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II[BI)V")
	void method7395(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)I")
	int method7396();
}
