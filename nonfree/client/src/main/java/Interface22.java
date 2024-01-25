import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public interface Interface22 extends Interface15 {

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IIB)Z")
	boolean method761(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)Z")
	boolean method762();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)Lclient!jaclib/memory/Buffer;")
	Buffer method763();

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IBI)Z")
	boolean method764(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
	void method6475();
}
