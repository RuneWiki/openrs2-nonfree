import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public interface Interface4 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)I")
	int method3582();

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([BIII)V")
	void method3583(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)J")
	long method3584();

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
	int method3585();
}
