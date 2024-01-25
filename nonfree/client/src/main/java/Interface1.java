import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public interface Interface1 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)J")
	long method3253();

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)I")
	int method3254();

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(B)I")
	int method3255();

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[BII)V")
	void method3256(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);
}
