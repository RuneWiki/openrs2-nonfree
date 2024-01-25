import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public interface Interface9 {

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BII)V")
	void method6286(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
	int method6287();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J")
	long method6288();

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(Z)I")
	int method6289();
}
