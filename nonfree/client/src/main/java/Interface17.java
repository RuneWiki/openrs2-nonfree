import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public interface Interface17 {

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)Z")
	boolean method6657();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	void method6658();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)I")
	int method6659();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lclient!ha;B)V")
	void method6660(@OriginalArg(0) Class95 arg0);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)I")
	int method6661();

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)I")
	int method6662();

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Lclient!ha;B)V")
	void method6663(@OriginalArg(0) Class95 arg0);
}
