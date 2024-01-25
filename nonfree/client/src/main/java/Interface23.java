import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public interface Interface23 {

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)I")
	int method7929(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)Z")
	boolean method7930();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZLclient!ha;)V")
	void method7931(@OriginalArg(1) Class75 arg0);

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)I")
	int method7932();

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(Z)V")
	void method7933();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)I")
	int method7934();

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILclient!ha;)V")
	void method7935(@OriginalArg(0) int arg0, @OriginalArg(1) Class75 arg1);
}
