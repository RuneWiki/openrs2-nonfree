import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public interface Interface2 extends Interface6 {

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6243();

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILclient!jaclib/memory/Source;I)Z")
	boolean method5803(@OriginalArg(0) int arg0, @OriginalArg(2) Source arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
	void method6239();

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BII)Z")
	boolean method5805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)Z")
	boolean method6241();
}
