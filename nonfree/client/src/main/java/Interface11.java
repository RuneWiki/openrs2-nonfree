import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public interface Interface11 {

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)I")
	int method1890();

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II[BB)V")
	void method1891(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2);

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)J")
	long method1892();

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)I")
	int method1893();
}
