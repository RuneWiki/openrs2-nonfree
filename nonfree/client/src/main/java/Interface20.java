import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public interface Interface20 extends Interface14 {

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(B)V")
	void method6520();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(IZ)Lclient!jaclib/memory/Buffer;")
	Buffer method6521();

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(Lclient!jaclib/memory/Source;IBI)Z")
	boolean method6522(@OriginalArg(0) Source arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(III)Z")
	boolean method6523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)Z")
	boolean method6524();
}
