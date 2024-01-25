import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public interface Interface1 {

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
	void method7826();

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLclient!ej;)V")
	void method7827(@OriginalArg(1) Class82 arg0);
}
