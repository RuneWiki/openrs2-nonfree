import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public interface Interface3 {

	@OriginalMember(owner = "client!bia", name = "c", descriptor = "(I)V")
	void method7293();

	@OriginalMember(owner = "client!bia", name = "a", descriptor = "(Lclient!bba;I)V")
	void method7294(@OriginalArg(0) Class26 arg0);
}
