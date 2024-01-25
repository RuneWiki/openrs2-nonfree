import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public interface Interface1 {

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "()V")
	void p();
}
