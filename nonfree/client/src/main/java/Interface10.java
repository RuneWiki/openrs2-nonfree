import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public interface Interface10 extends Interface15 {

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(Z)V")
	void method7459();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(IZ)V")
	void method7382(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "(Z)Z")
	boolean method7384();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7385();

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)Lclient!kf;")
	Class189 method7386();
}
