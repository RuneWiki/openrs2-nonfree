import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public interface Interface19 extends Interface16 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!jaclib/memory/Source;III)Z")
	boolean method6489(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Z")
	boolean method6954();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)Lclient!jaclib/memory/Buffer;")
	Buffer method6952();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	void method6953();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIB)Z")
	boolean method6493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
