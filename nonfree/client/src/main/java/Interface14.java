import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public interface Interface14 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II[BB)V")
	void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)I")
	int method4794();

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)I")
	int method4795();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)J")
	long method4796();
}
