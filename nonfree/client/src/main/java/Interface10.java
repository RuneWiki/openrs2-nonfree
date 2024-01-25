import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public interface Interface10 extends Interface26 {

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	void method8446();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method8447(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)Z")
	boolean method8448();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method8449();

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)Z")
	boolean method8450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
