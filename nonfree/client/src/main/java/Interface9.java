import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public interface Interface9 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lclient!ha;I)V")
	void method8361(@OriginalArg(0) Class100 arg0);

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	void method8362();

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILclient!ha;)V")
	void method8363(@OriginalArg(1) Class100 arg0);

	@OriginalMember(owner = "client!dp", name = "c", descriptor = "(B)I")
	int method8364();

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(B)Z")
	boolean method8365();

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)I")
	int method8366();

	@OriginalMember(owner = "client!dp", name = "b", descriptor = "(B)I")
	int method8367();
}
