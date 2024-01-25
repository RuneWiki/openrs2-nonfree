import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public interface Interface20 {

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)I")
	int method8009();

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ILclient!ha;)V")
	void method8010(@OriginalArg(1) Class126 arg0);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZLclient!ha;)V")
	void method8011(@OriginalArg(1) Class126 arg0);

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I")
	int method8012();

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
	void method8013();

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)Z")
	boolean method8014();

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)I")
	int method8015();
}
