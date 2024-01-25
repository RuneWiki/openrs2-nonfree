import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public interface Interface3 extends Interface11 {

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z")
	boolean method8243();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V")
	void method8235();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(III)Z")
	boolean method8244(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method8245();

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	boolean method8246(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);
}
