import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public interface Interface1 extends Interface23 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method7714();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z")
	boolean method7715(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	void method7716();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)Z")
	boolean method7717();

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!jaclib/memory/Source;II)Z")
	boolean method7718(@OriginalArg(0) int arg0, @OriginalArg(1) Source arg1, @OriginalArg(3) int arg2);
}
