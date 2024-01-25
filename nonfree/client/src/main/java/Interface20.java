import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public interface Interface20 extends Interface5 {

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Z")
	boolean method7826();

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)Lclient!ig;")
	Class152 method7827();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7828();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	void method8737();

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)V")
	void method8740(@OriginalArg(0) int arg0);
}
