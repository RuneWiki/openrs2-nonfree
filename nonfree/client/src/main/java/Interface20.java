import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public interface Interface20 extends Interface1 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7387();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)V")
	void method7376(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)Lclient!ig;")
	Class155 method7388();

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
	void method7384();

	@OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)Z")
	boolean method7389();
}
