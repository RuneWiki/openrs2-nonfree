import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public interface Interface18 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
	void method8582();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(ILclient!ha;)V")
	void method8583(@OriginalArg(1) Class33 arg0);

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(B)Z")
	boolean method8584();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(Lclient!ha;B)V")
	void method8585(@OriginalArg(0) Class33 arg0);

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
	int method8586();

	@OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
	int method8587();

	@OriginalMember(owner = "client!op", name = "c", descriptor = "(I)I")
	int method8588();
}
