import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public interface Interface12 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI)V")
	void method3814(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	int method3815();

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)J")
	long method3816();

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)I")
	int method3817();
}
