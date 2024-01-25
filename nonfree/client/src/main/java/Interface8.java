import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public interface Interface8 {

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)Z")
	boolean method5497();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(BLclient!dr;)V")
	void method5498(@OriginalArg(1) Class37 arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!dr;IB)Lclient!wp;")
	Class49 method5499(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!dr;I)V")
	void method5500(@OriginalArg(0) Class37 arg0);

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)I")
	int method5501();

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Z)I")
	int method5502();

	@OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)I")
	int method5503();

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
	void method5504();
}
