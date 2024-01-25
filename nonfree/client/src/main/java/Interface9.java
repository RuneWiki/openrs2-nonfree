import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public interface Interface9 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	void method5899();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!qa;I)V")
	void method5900(@OriginalArg(0) Class26 arg0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	int method5901();

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	int method5902();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(ILclient!qa;)V")
	void method5903(@OriginalArg(1) Class26 arg0);

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)I")
	int method5904();

	@OriginalMember(owner = "client!np", name = "d", descriptor = "(I)Z")
	boolean method5905();

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BLclient!qa;I)Lclient!c;")
	Class32 method5906(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1);
}
