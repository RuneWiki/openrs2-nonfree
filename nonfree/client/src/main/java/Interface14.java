import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public interface Interface14 {

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
	void method6244();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)I")
	int method6245();

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
	int method6246();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZZ)V")
	void method6247(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)V")
	void method6248();

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(JI)Z")
	boolean method6249(@OriginalArg(0) long arg0);
}
