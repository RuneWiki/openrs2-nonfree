import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public interface Interface2 {

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Z)I")
	int method7823();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(I)I")
	int method7824();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ha;I)V")
	void method7825(@OriginalArg(0) Class16 arg0);

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "(I)V")
	void method7826();

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "(I)I")
	int method7827();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(B)Z")
	boolean method7828();

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!ha;B)V")
	void method7829(@OriginalArg(0) Class16 arg0);
}
