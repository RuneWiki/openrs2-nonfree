import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public interface Interface22 extends Interface23 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
	void method7731();

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Z")
	boolean method7738();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7739();

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)V")
	void method7734(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)Lclient!so;")
	Class330 method7740();
}
