import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public interface Interface1 {

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "()V")
	void method3983();

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "()V")
	void method3984();

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	void method3985(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "()I")
	int method3986();
}
