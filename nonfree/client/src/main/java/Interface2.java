import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public interface Interface2 extends Interface16 {

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
	void method7285();

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Lclient!mg;")
	Class204 method7290();

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Z")
	boolean method7291();

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI)V")
	void method7282(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7292();
}
