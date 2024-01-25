import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public interface Interface6 extends Interface9 {

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(B)V")
	void method7866();

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method3120();

	@OriginalMember(owner = "client!fka", name = "b", descriptor = "(B)Z")
	boolean method3121();

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method3122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z")
	boolean method3123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
