import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public interface Interface19 {

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)I")
	int method6483();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "([BIII)V")
	void method6484(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!rm", name = "b", descriptor = "(B)I")
	int method6485();

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)J")
	long method6486();
}
