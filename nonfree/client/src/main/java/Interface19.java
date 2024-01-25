import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public interface Interface19 {

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(BLclient!r;)V")
	void method7824(@OriginalArg(1) Class44 arg0);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)I")
	int method7825();

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)Z")
	boolean method7826();

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)I")
	int method7827();

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I)V")
	void method7828();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)I")
	int method7829();

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILclient!r;)V")
	void method7830(@OriginalArg(1) Class44 arg0);
}
