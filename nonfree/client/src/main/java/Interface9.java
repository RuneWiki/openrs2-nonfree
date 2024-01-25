import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface Interface9 extends Interface2 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method2926();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Z)V")
	void method2921();

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(I)Z")
	boolean method2927();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
	void method2925(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Lclient!pj;")
	Class278 method2928();
}
