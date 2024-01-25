import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public interface Interface23 extends Interface17 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)Lclient!jr;")
	Class161 method4097();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	void method4092(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)V")
	void method4091();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	boolean method4094();

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4095();
}
