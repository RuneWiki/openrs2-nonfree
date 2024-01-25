import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public interface Interface24 extends Interface2 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Source arg2);

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)Z")
	boolean method4801();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(III)Z")
	boolean method4802(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method4803();

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(B)V")
	void method6939();
}
