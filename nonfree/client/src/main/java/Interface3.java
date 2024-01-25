import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public interface Interface3 extends Interface12 {

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)V")
	void method7671();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(III)Z")
	boolean method7186(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)Z")
	boolean method7187();

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	boolean method7188(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7189();
}
