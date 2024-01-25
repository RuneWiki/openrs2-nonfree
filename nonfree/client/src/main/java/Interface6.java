import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public interface Interface6 {

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Lclient!qa;B)V")
	void method7682(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(B)V")
	void method7683();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)Z")
	boolean method7684();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(Z)I")
	int method7685();

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(Lclient!qa;B)V")
	void method7686(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)I")
	int method7687();

	@OriginalMember(owner = "client!ej", name = "c", descriptor = "(I)I")
	int method7688();

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(BILclient!qa;)Lclient!r;")
	Class63 method7689(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1);
}
