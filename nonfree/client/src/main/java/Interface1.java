import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public interface Interface1 {

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	void method8703();

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!td;I)V")
	void method8704(@OriginalArg(0) Class338 arg0);
}
