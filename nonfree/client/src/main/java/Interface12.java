import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public interface Interface12 extends Interface11 {

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	void method8239(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method900();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
	void method8235();

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Lclient!ds;")
	Class89 method902();

	@OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)Z")
	boolean method903();
}
