import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public interface Interface8 extends Interface1 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IBILclient!jaclib/memory/Source;)Z")
	boolean method6459(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
	boolean method6460();

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
	void method6461();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(BZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6462();

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIB)Z")
	boolean method6463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
