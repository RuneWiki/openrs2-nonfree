import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public interface Interface1 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "()I")
	int method4016();

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	void method4017(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "()V")
	void method4018();

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "()V")
	void method4019();
}
