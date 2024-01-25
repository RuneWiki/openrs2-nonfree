import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public interface Interface10 {

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V")
	void method7049();

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!mv;I)V")
	void method7050(@OriginalArg(0) Class227 arg0);
}
