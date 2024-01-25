import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public interface Interface12 extends Interface11 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	void method8887();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8888();

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIZ)Z")
	boolean method8889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	boolean method8890(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)Z")
	boolean method8891();
}
