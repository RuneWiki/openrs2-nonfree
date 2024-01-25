import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public interface Interface4 {

	@OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)I")
	int method5015();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)J")
	long method5016();

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(III[B)V")
	void method5017(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1);

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
	int method5018();
}
