import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public interface Interface17 extends Interface8 {

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8438();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)Z")
	boolean method8439();

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)Z")
	boolean method8440(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method8441(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Z)V")
	void method8431();
}
