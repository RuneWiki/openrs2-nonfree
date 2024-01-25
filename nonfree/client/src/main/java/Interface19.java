import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public interface Interface19 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;Z)V")
	void method7636(@OriginalArg(0) Class134 arg0);

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)I")
	int method7637();

	@OriginalMember(owner = "client!rda", name = "b", descriptor = "(I)I")
	int method7638();

	@OriginalMember(owner = "client!rda", name = "c", descriptor = "(I)V")
	void method7639();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Z)I")
	int method7640();

	@OriginalMember(owner = "client!rda", name = "d", descriptor = "(I)Z")
	boolean method7641();

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(Lclient!r;I)V")
	void method7642(@OriginalArg(0) Class134 arg0);
}
