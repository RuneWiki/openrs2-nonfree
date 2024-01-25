import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public interface Interface23 extends Interface13 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)V")
	void method7567();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method7570(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)Z")
	boolean method7563();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method7569();

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(III)Z")
	boolean method7571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
