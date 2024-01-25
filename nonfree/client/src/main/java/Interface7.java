import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public interface Interface7 {

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
	void method7273();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!r;B)V")
	void method7274(@OriginalArg(0) Class12 arg0);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Z")
	boolean method7275();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I")
	int method7276();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!r;I)V")
	void method7277(@OriginalArg(0) Class12 arg0);

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I")
	int method7278();

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)I")
	int method7279();
}
