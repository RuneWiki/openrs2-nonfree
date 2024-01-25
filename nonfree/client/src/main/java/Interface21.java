import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public interface Interface21 {

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!r;B)V")
	void method7278(@OriginalArg(0) Class7 arg0);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILclient!r;)V")
	void method7279(@OriginalArg(1) Class7 arg0);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)I")
	int method7280();

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)I")
	int method7281();

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)Z")
	boolean method7282();

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
	int method7283();

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
	void method7284();
}
