import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public interface Interface22 {

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	void method8395();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!oa;I)V")
	void method8396(@OriginalArg(0) Class15 arg0);

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(Lclient!oa;I)V")
	void method8397(@OriginalArg(0) Class15 arg0);

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)I")
	int method8398();

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "(B)I")
	int method8399();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!oa;II)Lclient!ba;")
	Class21 method8400(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)Z")
	boolean method8401();

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)I")
	int method8402();
}
