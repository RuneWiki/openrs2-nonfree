import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public interface Interface25 extends Interface16 {

	@OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)V")
	void method9037();

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBI)Z")
	boolean method9040(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(I)Z")
	boolean method9041();

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(BILclient!jaclib/memory/Source;I)Z")
	boolean method9042(@OriginalArg(1) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!wba", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method9043();
}
