import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public interface Interface11 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)I")
	int method9216();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)I")
	int method9217();

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!ha;I)V")
	void method9218(@OriginalArg(0) Class13 arg0);

	@OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
	void method9219();

	@OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Z")
	boolean method9220();

	@OriginalMember(owner = "client!he", name = "e", descriptor = "(I)I")
	int method9221();

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(Lclient!ha;I)V")
	void method9222(@OriginalArg(0) Class13 arg0);
}
