import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public interface Interface22 {

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)I")
	int method8488();

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BLclient!ha;)V")
	void method8489(@OriginalArg(1) Class133 arg0);

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)I")
	int method8490();

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(B)Z")
	boolean method8491();

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "(I)V")
	void method8492();

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(B)I")
	int method8493();

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(Lclient!ha;Z)V")
	void method8494(@OriginalArg(0) Class133 arg0);
}
