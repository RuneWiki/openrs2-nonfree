import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public interface Interface16 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)Z")
	boolean method9496();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ha;I)V")
	void method9497(@OriginalArg(0) Class144 arg0);

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(B)I")
	int method9498();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!ha;)V")
	void method9499(@OriginalArg(1) Class144 arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
	void method9500();

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(B)I")
	int method9501();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I")
	int method9502();
}
