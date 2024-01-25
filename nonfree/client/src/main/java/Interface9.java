import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public interface Interface9 extends Interface20 {

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(ZZ)Lclient!jaclib/memory/Buffer;")
	Buffer method5100();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)Z")
	boolean method5101();

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIZ)Z")
	boolean method5102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IIILclient!jaclib/memory/Source;)Z")
	boolean method5103(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Source arg2);

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
	void method5230();
}
