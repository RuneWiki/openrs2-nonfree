import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public interface Interface8 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!aa;B)V")
	void method5694(@OriginalArg(0) Class2 arg0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!aa;IB)Lclient!hc;")
	Class78 method5695(@OriginalArg(0) Class2 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(Lclient!aa;B)V")
	void method5696(@OriginalArg(0) Class2 arg0);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)I")
	int method5697();

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
	void method5698();

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)I")
	int method5699();

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)Z")
	boolean method5700();

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "(I)I")
	int method5701();
}
