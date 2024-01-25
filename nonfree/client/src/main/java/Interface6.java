import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public interface Interface6 extends Interface12 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)Lclient!qda;")
	Class273 method7934();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V")
	void method7925();

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
	void method7932(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7935();

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Z")
	boolean method7936();
}
