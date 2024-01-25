import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public interface Interface14 {

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	void method7593();

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)I")
	int method7594();

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BZ)V")
	void method7595(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BJ)Z")
	boolean method7596(@OriginalArg(1) long arg0);

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
	int method7597();

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	void method7598();
}
