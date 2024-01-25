import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public interface Interface8 {

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(JI)Z")
	boolean method8056(@OriginalArg(0) long arg0);

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)I")
	int method8057();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)I")
	int method8058();

	@OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
	void method8059();

	@OriginalMember(owner = "client!fh", name = "c", descriptor = "(B)V")
	void method8060();

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZI)V")
	void method8061(@OriginalArg(0) boolean arg0);
}
