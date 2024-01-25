import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public interface Interface11 {

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([BIII)V")
	void method4363(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)J")
	long method4364();

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(B)I")
	int method4365();

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(B)I")
	int method4366();
}
