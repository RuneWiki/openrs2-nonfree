import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public interface Interface10 extends Interface6 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method7895();

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method7896(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(III)Z")
	boolean method7897(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)V")
	void method7898();

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)Z")
	boolean method7899();
}
