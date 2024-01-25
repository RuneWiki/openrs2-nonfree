import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public interface Interface8 {

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J")
	long method4283();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIB)V")
	void method4284(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)I")
	int method4285();

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)I")
	int method4286();
}
