import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public interface Interface24 extends Interface12 {

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILclient!jaclib/memory/Source;IB)Z")
	boolean method6548(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
	void method7925();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)Z")
	boolean method6549(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method6550();

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z")
	boolean method6551();
}
