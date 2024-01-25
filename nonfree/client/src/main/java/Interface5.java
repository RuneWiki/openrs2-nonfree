import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public interface Interface5 {

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I[BII)V")
	void method6870(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)J")
	long method6871();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(Z)I")
	int method6872();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)I")
	int method6873();
}
