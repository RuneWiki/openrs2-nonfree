import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public interface Interface26 extends Interface2 {

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)Z")
	boolean method8107();

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Z)V")
	void method8104();

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BIILclient!jaclib/memory/Source;)Z")
	boolean method8108(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(III)Z")
	boolean method8109(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method8110();
}
