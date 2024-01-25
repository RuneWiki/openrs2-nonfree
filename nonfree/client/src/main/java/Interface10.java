import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public interface Interface10 {

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Z")
	boolean method5806();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)I")
	int method5807();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qq;ZI)Lclient!cd;")
	Class39 method5808(@OriginalArg(0) Class28 arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZLclient!qq;)V")
	void method5809(@OriginalArg(1) Class28 arg0);

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	void method5810();

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)I")
	int method5811();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)I")
	int method5812();

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qq;I)V")
	void method5813(@OriginalArg(0) Class28 arg0);
}
