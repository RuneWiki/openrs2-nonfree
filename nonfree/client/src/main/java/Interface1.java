import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface Interface1 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)I")
	int method7111();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)J")
	long method7112();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I[BIB)V")
	void method7113(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)I")
	int method7114();
}
