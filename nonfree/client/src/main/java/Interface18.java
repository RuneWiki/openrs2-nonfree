import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public interface Interface18 extends Interface6 {

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)Z")
	boolean method7899();

	@OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lclient!ge;")
	Class114 method7540();

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7895();

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)V")
	void method7529(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V")
	void method7898();
}
