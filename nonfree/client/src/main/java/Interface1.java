import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aia")
public interface Interface1 {

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(B)Z")
	boolean method8983();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(Z)I")
	int method8984();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(ILclient!ha;)V")
	void method8985(@OriginalArg(1) Class65 arg0);

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(I)I")
	int method8986();

	@OriginalMember(owner = "client!aia", name = "b", descriptor = "(B)I")
	int method8987();

	@OriginalMember(owner = "client!aia", name = "a", descriptor = "(BLclient!ha;)V")
	void method8988(@OriginalArg(1) Class65 arg0);

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "(B)V")
	void method8989();
}
