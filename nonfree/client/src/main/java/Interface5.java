import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public interface Interface5 {

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "()I")
	int method4312();

	@OriginalMember(owner = "client!oi", name = "b", descriptor = "()V")
	void method4313();

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V")
	void method4314(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oi", name = "c", descriptor = "()V")
	void method4315();
}
