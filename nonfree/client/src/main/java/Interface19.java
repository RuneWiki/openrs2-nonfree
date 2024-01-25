import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public interface Interface19 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!ha;)V")
	void method9380(@OriginalArg(1) Class67 arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)I")
	int method9381();

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(BLclient!ha;)V")
	void method9382(@OriginalArg(1) Class67 arg0);

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)Z")
	boolean method9383();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)I")
	int method9384();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)I")
	int method9385();

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	void method9386();
}
